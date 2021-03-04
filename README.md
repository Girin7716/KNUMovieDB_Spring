# KNUMovieDB_Spring

## 목표

2020년 2학기 데이터베이스 `jsp`+`OracleSQL`를 기반으로 텀프로젝트로 진행한 [KNUMovieDB](https://github.com/Girin7716/KNUMovieDB)를 개발하면서 많은 불편함들을 느꼈다.

예를들면, `jsp`로 진행하다보니 프론트엔드와 백엔드의 구분이 없어 개발한 코드들을 보면 하나의 `jsp`파일에 모든 로직에 담겨있어 가독성이 떨어진다. 또한, 남이 짜놓은 코드를 해석하기에는 뒤죽박죽으로 합쳐져있어 거의 불가능에 가깝다. 이러한 점은 결국 유지보수가 떨어진다는 점과 이어진다.

그리하여, 이러한 프론트와 백엔드의 구분없이 개발하는 것이 아닌 각자의 목적에 집중할 수 있는 방법을 찾아보니 Spring Web MVC를 알게되었다.

그래서 추가적으로 `Spring Boot`와 더하여 `JPA`,`thymeleaf`를 가지고 위 프로젝트 설계를 기반으로 이러한 불편함들을 개선하고자한다.

## Spring initializr

Project : Gradle
- 빌드 도구로 Maven과 Gradle이 있었지만, 최근에 Gradle을 많이 사용하는 추세이기도하고, Maven보다 빠르고 더 좋은 장점이 많다고 하여 Gradle을 사용해보기로 했다.

Language : JAVA

Spring Boot : 2.4.3
- 2021-03-04기준 가장 안정적인 버전이면서 최신 버전인 2.4.3을 선택함.

Dependencies
- Lombok
  - `Model`이나 `Entity` 클래스에 사용되는 생성자등등 복잡하고 반복되는 코드를 줆여 코드의 가독성과 개발 편의성을 높이기 위해 사용.
- Spring Boot DevTools
  - Spring 서버를 끄지 않고도 재시작하기 위해서 사용하고자 함.
- Spring Web
  - Web Application을 개발하기 위해 가져옴.
- H2 Database
  - 일단 간편하게 개발하기 위해 H2 DB를 사용하고 추후, `MySQL`로 변경하고자 함.
- Spring Data JPA
  - JPA를 연습하고자 사용.
- Validation
  - 변수들의 유효성을 주기 위해 사용.
- Thymeleaf
  - 프론트엔드

## Bootstrap template

https://www.themezy.com/free-website-templates/10-movie-reviews-responsive-template

이걸 사용함.

