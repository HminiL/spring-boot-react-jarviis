import React from 'react'
import {Link} from 'react-router-dom'
import styled from 'styled-components'

export default function Navigation(){
    
    return(<Nav>
<NavList>
    <NavtItem><Link to="/home">Home</Link></NavtItem>
    <NavtItem><Link to="/user_add">UserAdd</Link></NavtItem>
    <NavtItem><Link to="/user_login">UserLogin</Link></NavtItem>
    <NavtItem><Link to="/user_detail">UserDetail</Link></NavtItem>
    <NavtItem><Link to="/user_list">UserList</Link></NavtItem>
    <NavtItem><Link to="/user_modify">UserModify</Link></NavtItem>
    <NavtItem><Link to="/user_remove">UserRemove</Link></NavtItem>
</NavList>
</Nav>
)}

const Nav = styled.div`
    width:100%;
    height:30px;
    border-bottom: 1px solid #d1d8e4;
    `

const NavList = styled.ul`
    width:1080px;
    display: flex;
    margin: 0 auto;
`

const NavtItem = styled.li`
    width: 70px auto;
    margin-left: 18px;
    margin-top: 5px;
    display: flex;
`