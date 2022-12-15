# :pushpin: WMS_Project
>WMS 창고 물류관리 시스템 <br>
><br>
><h4><b>프로젝트 자료</b></h4>
><a href="https://www.youtube.com/watch?v=gVzC5DC1zgE&t=420s" style="margin-top : 10px;"><img src="https://user-images.githubusercontent.com/106065178/207799552-27c7f9ec-3320-492a-b69d-23fe1783d32a.jpg" width="80" height="35"></a>
><a href="https://diagnostic-raven-02c.notion.site/1-e754e62847224d21805c4a1de271887b" class="sbox" ><img class="profile" style="width: 45px;  margin-bottom: 3px; margin-left: 25px;" src="https://user-images.githubusercontent.com/106065178/207617352-af4e6185-95a8-449e-80f2-b17e711e7347.png"></a>

</br>

## 1. 제작 기간 & 참여 인원
- 22.10.24 ~ 22.11.24 (4주)
- 팀프로젝트(8명)

</br>

## 2. 사용 기술
  - Java 11
  - Spring
  - Gradle
  - AWS EC2, AWS RDS , Jenkins, Github-Webhook, Oracle Cloud, Ngrok 
  - Oracle
  - Jsp
  - Tomcat
  - Html, Css, Javascript, Jquery, Bootstrap
  - RestAPI
  - Generic
  - WebSoket
  - Cookies
  - Service

</br>

## 3. ERD 설계
![WMS_ERD 최종](https://user-images.githubusercontent.com/106065178/207878543-8710d855-3ee9-4ab2-8f19-0ec27a03972a.png)

## 3.1 시퀀스 다이어그램
<p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207877593-da4c6804-65c1-489b-ba0e-fc4d6f4894d5.png" width="500" height="600">
  </p>
  <br>


## 4. 핵심 기능
이 서비스의 핵심 기능은 창고재고관리 및 채팅입니다.  
사용자는 이 서비스를 이용하기 위해 기초 정보를 등록하고 그 등록한 정보를 토대로 재고를 발주,수주,이동을 통하여 재고관리를 할 수 있습니다.

<details>
<summary><b>핵심 기능 설명 펼치기</b></summary>
<div markdown="1">

### 4.1. AWS-Jenkins-Github_Webhook
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207881230-a1f44baf-5716-4a31-8a0d-ecfadc7248e0.png">
  </p>
  <br>

- 이전 프로젝트에서는 **Spring에서 War 파일을 추출하여 FileZilla로 프로젝트를 배포**하였으나 이렇게 진행할 시 <br>
**관리자는 매번 프로젝트를 다시 올려야하고 사용자는 관리자가 배포하는 기간동안 이용할 수 없는 번거럽고 치명적인 문제점 발생**

- 이것을 해결하기 위해 AWS EC2에 Jenkins를 설치하여 사용자는 서버1을 사용하고 있다가 관리자가 Github에 Push할 때마다 Github_Webhook로 신호를 보내주고 그 신호를 받은 Jenkins가 서버2에 자동적으로 배포를 하고 배포가 완료됨과 동시 사용자는 서버2를 사용하게 되는 것입니다.
- 이로 인해 관리자는 지속적인 배포의 번거로움을 없애고 사용자는 끊김없는 서버를 사용할 수 있게 됩니다.
<br>
  
### 4.2. 비밀번호 암호화
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207795103-2fa3b5da-4615-4288-a59b-51cea4fc987e.png" width="400" height="50">
  </p>
  <br>

- Spring Security를 활용하여 BCryptPasswordEncoder 라는 암호화를 사용하여 비밀번호를 암호화 저장하였습니다.
<br>
  
### 4.3. 휴대폰 & 이메일 인증
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207797115-25ba4819-8617-477e-a81c-8a6c186fe43d.png" width="700" height="300">
  </p>
  <br>
  
- Twilio API 와 Naver Mail API를 활용하여 인증 체계를 구성하였습니다.

  <br>
  
### 4.4. 사용자 편의 지도 검색
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207798202-ab4f3936-397a-46c9-94f9-42c44a7e823d.png" width="500" height="400">
  </p>
  <br>

- 카카오맵 API를 통한 사용자 편의 검색 기능 제공을 하였습니다.
  
<br>
  
### 4.5. 채팅 기능
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207815703-37ceb3e3-afe4-4f77-add7-617eb4c2071b.png" width="650" height="300">
  </p>
  <br>

- Json 과 Ajax를 통한 채팅을 제공하여 판매자와 구매자 사이의 편의성과 신뢰성을 주었습니다.
<br> 
  
 ### 4.6. 카카오 결제 API
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207840399-a151a287-1cae-4b61-8aa2-075c4bb682b1.png" width="650" height="300">
  </p>
  <br>

- 카카오 결제 API 를 통한 사용자 편의 시스템을 사용하였습니다.
  
<br>
  
   ### 4.7. 카카오 결제 API
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207845517-2305d2d9-e18e-4edd-927d-c2ffc45bc106.png" width="300" height="300">
  </p>
  <br>

- 카카오톡 API 를 활용해 상담사와 빠른 상담을 할 수 있는 사용자 편의 시스템을 사용하였습니다.

</div>
</details>

</br>

## 5. 시연 영상
 <p align="center"><img src="https://user-images.githubusercontent.com/106065178/207879068-86cee319-dd15-4d5b-afe7-e88f7d0210be.gif" width="600" height="350">
<br><a href="https://www.youtube.com/watch?v=gVzC5DC1zgE&t=420s">[&nbsp;Youtube&nbsp;]</a><br><br>
</p>



## 6. 핵심 트러블 슈팅
### 6.1. literal does not match format string [데이터 타입이 맞지 않다는 의미]
- 모든 프로젝트를 마무리하고 로컬에서의 테스트를 문제없이 진행하고 AWS에 배포를 하여 테스트를 하는데 <br>
  배포할 때만 발생하는 문제를 발견하게 됐습니다.

- AWS의 EC2의 Unbuntu Lang은 UTF-8 형식을 사용하여 프로젝트에서 사용하는 ko_KR 형식과 달라 날짜 형식을 읽지 못하여 발생하는 문제였습니다.

- 이를 해결하기 위해 EC2에 맞는 형식으로 프로젝트의 sql문을 수정하였습니다.

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">
	
~~~java
 <select id="GetAllReservationOnlyDates" resultType="reservation.model.ReservationBean">
		select start_date,end_date
		from reservation 
		where product_no = #{pno}
 </select>
  
  <br>
  <insert id="InsertReservation">
	insert into reservation values(reservation_seq.nextval,#{product_no},#{buyer_no},#{start_date},#{end_date},0,sysdate,'1',#{amount},null)
  </insert>
~~~
	
</div>
</details>

<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">

~~~java

  <select id="GetAllReservationOnlyDates" resultType="reservation.model.ReservationBean">
		select TO_CHAR(start_date, 'YYYY-MM-DD') as start_date, TO_CHAR(end_date, 'YYYY-MM-DD') as end_date
		from reservation 
		where product_no = #{pno}
  </select>

  <insert id="InsertReservation">
	insert into reservation values(reservation_seq.nextval,#{product_no},#{buyer_no},to_date(#{start_date},'YY-MM-DD'),to_date(#{end_date},'YY-MM-DD'),0,sysdate,'1',#{amount},null)
  </insert>
~~~

</div>
</details>

</br>

## 7. 그 외 트러블 슈팅
<details>
<summary>git push/pull 시 한글 깨짐</summary>
<div markdown="1">

- Spring 설정에 UTF-8 설정이 안되어 있어서 한글이 깨지는 현상
- <a href="https://chanho-park.tistory.com/entry/Spring-github-pushpull-%EC%8B%9C-%ED%95%9C%EA%B8%80%EA%B9%A8%EC%A7%90-%ED%98%84%EC%83%81">[&nbsp;해결 방법&nbsp;]</a>

</div>
</details>

<details>
<summary>Github 사용 시 문제</summary>
<div markdown="1">
  
  - <a href="https://github.com/vuejs/vue-devtools/issues/190](https://github.com/vuejs/vue-devtools/issues/190">[&nbsp;해결 방법&nbsp;]</a>
  
</div>
</details>

<details>
<summary>AWS 재배포 시 이미지 삭제 문제</summary>
<div markdown="1">
  
  - 이미 업로드한 이미지들이 배포를 다시 하게 되면은 사라지는 현상이 발생
  - <a href="https://diagnostic-raven-02c.notion.site/remove-a0d4d336e6344f16b06d22425135e023">[&nbsp;해결 방법&nbsp;]</a>
  
</div>
</details>

<details>
<summary> MyBatis sql 부등호 인식 문제 </summary>
<div markdown="1">
  
  - XML 파일에 sql 문을 작성하게 되는데 < 부등호를 TAG로 인식하기 때문에 <br>
  **"The content of elements must consist of well-formed character data or markup."** 라는 에러가 발생
 -  <a href="https://dlgkstjq623.tistory.com/389">[&nbsp;해결 방법&nbsp;]</a>
  
</div>
</details>
    
<details>
<summary> Controller에서 RequestParam 사용시 주의할 점 </summary>
<div markdown="1">
  
 - Controller에서 RequestParam을 사용하여 변수를 받을 때 받아오는 변수가 존재하지 않으면 에러 발생
 
 - 받아오는 변수가 없을 때도 Controller가 작동되게 해야하기 때문에 아래와 같은 코드를 입력해주면 됩니다.
~~~java
	required = false  
~~~
	
   
</div>
</details>    

<details>
<summary> Redirect 에 변수를 보낼 시 한글 깨짐 현상 </summary>
<div markdown="1">
  
 - Controller에서 다음 Controller로 변수를 담아 Redirect 를 하게 되면 한글이 깨지는 현상 발생
 
 - UTF-8 형식으로 Encoder 한 다음에 보내주면 됩니다.
~~~java
	keyword = URLEncoder.encode(keyword, "UTF-8"); 
~~~
	
   
</div>
</details>  


    
</br>

## 8. 회고 / 느낀점
>프로젝트 개발 회고 :

- 이 프로젝트를 진행하면서 배포를 하게 됐었는데 배포를 마지막 구현을 다 한 뒤에 하루를 남긴 상태에서 진행하게 되느라 급하게 진행되어 여러 방법을 사용하지 못했던 게 아쉽습니다.
- Spring 버전이 낮아 WebSoket을 활용한 채팅을 활용하지 못한 점이 아쉬워 다음 프로젝트에서는 WebSoket 을 활용하여 채팅을 진행하게 되었습니다.
- 구현 전에 모든 방법과 상황을 파악하고 할 수 있는 기능, 기술 등을 계획을 정확하게 짠 후 진행하는 것이 프로젝트 진행하기에 문제가 없을 것 같다고 깨달았습니다.
