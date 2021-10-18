import React from 'react'

export default function UserDetail(){
  
  return(
    <div>
    <figure>
        <figcaption>오늘은 남은인생이 시작되는 첫째날</figcaption>
    </figure>
    <h1>hyemin Lee</h1>
    <p>email : </p>
    <h2>Who am I?</h2>
    <p>와왕와왕</p>
    <h2>Github</h2>
    <ul>
        <li>
            <a href="#">Github</a>
        </li>
    </ul>
    <h2>Skils</h2>
    <ul>
        <li>사용언어
            <ul>
                <li><mark>HTML</mark></li>
                <li><mark>CSS</mark></li>
                <li>JAVA</li>
            </ul>
        </li>
        <li>사용툴
            <ul>
                <li>IntelliJ</li>
                <li>Spring Boot</li>
                <li>sql Developer</li>
                <li><b>Visual Studio</b></li>
            </ul>
        </li>
    </ul>

    <h2>Academic</h2>
    <table border="1">
        <caption>학력사항</caption>
        <thead>
            <tr>
                <th>출신학교</th>
                <th>전공</th>
                <th>기간</th>
                <th>졸업구분</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <td>oo고등학교</td>
                <td>...</td>
                <td>12</td>
                <td>졸업</td>
            </tr>
            <tr>
                <td>ㅇㅇ대학교</td>
                <td>ㅁㅁㅁㅁ</td>
                <td>33</td>
                <td>졸업</td>
            </tr>
        </tfoot>
    </table>
    </div>)}
    
