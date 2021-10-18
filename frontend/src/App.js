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
      <Route exact path = '/user_add' component={UserAdd}/>
      <Route exact path = '/user_detail' component={UserDetail}/>
      <Route exact path = '/user_list' component={UserList}/>
      <Route exact path = '/user_login' component={UserLogin}/>
      <Route exact path = '/user_modify' component={UserModify}/>
      <Route exact path = '/user_remove' component={UserRemove}/>
    </Switch></>
  )}
