
import React,{useState, useEffect, useCallback } from 'react'
import { Link, useHistory } from 'react-router-dom'

export default function UserDetail(){

    const history = useHistory()
    const [ detail, setDetail ] = useState({})
    
    const fetchOne = () => {
        const sessionUser = JSON.parse(localStorage.getItem('sessionUser')); 
        userFatchOne(sessionUser)
        .then(res => {
            setDetail(res.data)
        })
        .catch(err => {
            alert(`Detail 오류!! : ${err}`)
        })
    }
    useEffect(() => {
        fetchOne()
    }, [])

    const logout = e => {
        e.preventdefault()
        localStorage.setItem('sessionUser','')
        history.push('/')
    }

  
  return(
    <div>
    <h1>회원 정보</h1>
   <ul>
   <li>
           <label>
               <span>회원번호 : {detail.userId}</span>
           </label>
       </li>
       <li>
           <label>
               <span>아이디 : {detail.username}</span>
           </label>
       </li>
       <li>
           <label>
               <span> 이메일 : {detail.email}</span>
           </label>
       </li>
       <li>
           <label>
               <span>비밀번호 : ****** </span>
           </label>
       </li>
       <li>
           <label>
                <span>이름 : {detail.name}</span>
           </label>
       </li>
      
       <li>
           <input type="button" value="회원정보 수정" onClick={() => history.push('/users/modify')}/>
       </li>
       
       <li>
           <input type="button" value="로그아웃"  onClick={logout}/>
       </li>

   </ul>
    </div>
  )}
    
