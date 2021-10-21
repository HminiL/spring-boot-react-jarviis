import React from 'react';
import { Navigation, Home } from "features/common";
import { Route,Switch, Redirect } from 'react-router-dom'
import { UserAdd, UserDetail,UserList, UserLogin, UserModify, UserRemove } from 'features/user';

export default function App(){
  
  return(<>
    < Navigation />
    <Switch>
      <Route exact path = '/' component = {Home}/>
      <Redirect from='/home' to= { '/' }/>
      <Route exact path = '/users/add' component={UserAdd}/>
      <Route exact path = '/users/detail' component={UserDetail}/>
      <Route exact path = '/users/list' component={UserList}/>
      <Route exact path = '/users/login' component={UserLogin}/>
      <Route exact path = '/users/modify' component={UserModify}/>
      <Route exact path = '/users/remove' component={UserRemove}/>
    </Switch></>
  )}
