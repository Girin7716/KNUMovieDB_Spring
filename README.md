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

## 2021-03-04일 진행상황 및 알아간 점

### 알아간 점

### `@RequestMapping` 과 `@GetMapping`의 차이점

- 
    ```java
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Mapping
    public @interface RequestMapping {
        /**
        * The HTTP request methods to map to, narrowing the primary mapping:
        * GET, POST, HEAD, OPTIONS, PUT, PATCH, DELETE, TRACE.
        * <p><b>Supported at the type level as well as at the method level!</b>
        * When used at the type level, all method-level mappings inherit this
        * HTTP method restriction.
        */
        RequestMethod[] method() default {};
    }
    ```
- 
    ```java
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @RequestMapping(method = RequestMethod.GET)
    public @interface GetMapping {
    }
    ```
- 위의 인터페이스들을 보면, `@RequestMapping`의 method를 default로 사용할 경우, GET, POST, HEAD, OPTIONS, PUT, PATCH, DELETE, TRACE를 같이 상속한다.
- 반면 `@GetMapping`의 경우 @RequestMapping(method = RequestMethod.GET)을 가져오는것을 확인할 수 있다.

### Spring에서 css, js 적용하는 방법

https://www.themezy.com/free-website-templates/10-movie-reviews-responsive-template 여기서 가져온 template을 기준으로 설명.

application.yml
```yml
spring:
  thymeleaf:
    prefix: classpath:/templates/
    suffix: .html
```

아래와 같이 static에는 css, jss, dummy 등을 넣어주고 templates에는 html 파일들을 넣어준다.

```
.
├── application.yml
├── static
│   ├── __MACOSX
│   │   ├── dummy
│   │   ├── fonts
│   │   ├── images
│   │   ├── js
│   │   │   ├── ie-support
│   │   │   └── min
│   │   └── sass
│   │       ├── layout
│   │       └── libs
│   │           └── bootstrap-grid
│   ├── dummy
│   │   ├── background.jpg
│   │   ├── background@2x.jpg
│   │   ├── figure.jpg
│   │   ├── figure@2x.jpg
│   │   ├── person-1.jpg
│   │   ├── person-1@2x.jpg
│   │   ├── person-2.jpg
│   │   ├── person-2@2x.jpg
│   │   ├── person-3.jpg
│   │   ├── person-3@2x.jpg
│   │   ├── person-4.jpg
│   │   ├── person-4@2x.jpg
│   │   ├── single-image.jpg
│   │   ├── single-image@2x.jpg
│   │   ├── slide-1.jpg
│   │   ├── slide-1@2x.jpg
│   │   ├── slide-2.jpg
│   │   ├── slide-2@2x.jpg
│   │   ├── slide-3.jpg
│   │   ├── slide-3@2x.jpg
│   │   ├── thumb-1.jpg
│   │   ├── thumb-1@2x.jpg
│   │   ├── thumb-2.jpg
│   │   ├── thumb-2@2x.jpg
│   │   ├── thumb-3.jpg
│   │   ├── thumb-3@2x.jpg
│   │   ├── thumb-4.jpg
│   │   ├── thumb-4@2x.jpg
│   │   ├── thumb-5.jpg
│   │   ├── thumb-5@2x.jpg
│   │   ├── thumb-6.jpg
│   │   ├── thumb-6@2x.jpg
│   │   ├── thumb-7.jpg
│   │   ├── thumb-7@2x.jpg
│   │   ├── thumb-8.jpg
│   │   └── thumb-8@2x.jpg
│   ├── fonts
│   │   ├── FontAwesome.otf
│   │   ├── font-awesome.min.css
│   │   ├── fontawesome-webfont.eot
│   │   ├── fontawesome-webfont.svg
│   │   ├── fontawesome-webfont.ttf
│   │   └── fontawesome-webfont.woff
│   ├── images
│   │   ├── arrow-gray.png
│   │   ├── arrow-gray@2x.png
│   │   ├── arrow.png
│   │   ├── arrow@2x.png
│   │   ├── icon-contact-envelope.png
│   │   ├── icon-contact-envelope@2x.png
│   │   ├── icon-contact-globe.png
│   │   ├── icon-contact-globe@2x.png
│   │   ├── icon-contact-map.png
│   │   ├── icon-contact-map@2x.png
│   │   ├── icon-contact-message.png
│   │   ├── icon-contact-message@2x.png
│   │   ├── icon-contact-pencil.png
│   │   ├── icon-contact-pencil@2x.png
│   │   ├── icon-contact-phone.png
│   │   ├── icon-contact-phone@2x.png
│   │   ├── icon-contact-user.png
│   │   ├── icon-contact-user@2x.png
│   │   ├── logo.png
│   │   ├── logo@2x.png
│   │   ├── select.png
│   │   └── select@2x.png
│   ├── js
│   │   ├── app.js
│   │   ├── ie-support
│   │   │   ├── html5.js
│   │   │   ├── pie.htc
│   │   │   └── respond.js
│   │   ├── jquery-1.11.1.min.js
│   │   ├── jquery-1.11.1.min.map
│   │   ├── min
│   │   │   ├── app-min.js
│   │   │   └── plugins-min.js
│   │   └── plugins.js
│   ├── sass
│   │   ├── layout
│   │   │   ├── _content.scss
│   │   │   ├── _footer.scss
│   │   │   └── _header.scss
│   │   ├── libs
│   │   │   ├── _components.scss
│   │   │   ├── _global.scss
│   │   │   ├── _mixins.scss
│   │   │   ├── _normalize.scss
│   │   │   ├── _settings.scss
│   │   │   └── bootstrap-grid
│   │   │       ├── _grid.scss
│   │   │       ├── _mixins.scss
│   │   │       └── _settings.scss
│   │   ├── pages
│   │   └── style.scss
│   └── style.css
└── templates
    ├── about.html
    ├── contact.html
    ├── index.html
    ├── joinus.html
    ├── review.html
    └── single.html

```

### 진행상황

`HomeController`를 만들어서 메뉴바에서 page 이동을 구현함. 이를 위해서 html 코드들의 주소들을 Mapping받는 value들로 변경해줌.


## 2021-03-05일 진행상황 및 알아간 점

### 알아간 점

`@Column(name = ~~~)` 할 경우, 빨간줄이 뜨면 아래와 같이 설정하기.

```
Preferences > Editor > Inspections > JPA의 Unresolved database references in annotations 체크 해제 후 OK
```




### 진행상황

https://happyer16.tistory.com/entry/Spring-JPA-%EB%8B%A4%EB%8C%80%EB%8B%A4-%EC%84%A4%EC%A0%95-%EB%B0%8F-%EC%A3%BC%EC%9D%98-Many-To-Many
참고