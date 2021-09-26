import React from 'react';
import {Route, Redirect} from 'react-router-dom'
import * as userService from "./services/userService"

export class LoginRoute extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            isAuthed: false,
            hasAuthed: false,
            userInfo:{}
        };
    }

    checkAuth = (data) => {
        console.log(data);
        if (data.status === 200) {
            this.setState({isAuthed: true, hasAuthed: true, userInfo:{name:"wxp"}});
        } else {
            localStorage.removeItem('user');
            this.setState({isAuthed: false, hasAuthed: true});
        }
    };

    componentDidMount() {
        userService.checkSession(this.checkAuth);
    }

    render() {
        const {component: Component, path="/",exact=false,strict=false} = this.props;
        console.log(this.state.isAuthed);

        if (!this.state.hasAuthed) {
            return null;
        }

        return <Route path={path} exact={exact} strict={strict} render={props => (
            this.state.isAuthed ? (
                <Redirect to={{
                    pathname: '/',
                    state: {from: props.location, name: this.state.userInfo}
                }}/>
            ) : (
                <Component {...props}/>
            )
        )}/>
    }
}

export default LoginRoute