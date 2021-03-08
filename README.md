# KNUMovieDB_Spring

## ��ǥ

2020�� 2�б� �����ͺ��̽� `jsp`+`OracleSQL`�� ������� ��������Ʈ�� ������ [KNUMovieDB](https://github.com/Girin7716/KNUMovieDB)�� �����ϸ鼭 ���� �����Ե��� ������.

�������, `jsp`�� �����ϴٺ��� ����Ʈ����� �鿣���� ������ ���� ������ �ڵ���� ���� �ϳ��� `jsp`���Ͽ� ��� ������ ����־� �������� ��������. ����, ���� ¥���� �ڵ带 �ؼ��ϱ⿡�� ���׹������� �������־� ���� �Ұ��ɿ� ������. �̷��� ���� �ᱹ ���������� �������ٴ� ���� �̾�����.

�׸��Ͽ�, �̷��� ����Ʈ�� �鿣���� ���о��� �����ϴ� ���� �ƴ� ������ ������ ������ �� �ִ� ����� ã�ƺ��� Spring Web MVC�� �˰ԵǾ���.

�׷��� �߰������� `Spring Boot`�� ���Ͽ� `JPA`,`thymeleaf`�� ������ �� ������Ʈ ���踦 ������� �̷��� �����Ե��� �����ϰ����Ѵ�.

## Spring initializr

Project : Gradle
- ���� ������ Maven�� Gradle�� �־�����, �ֱٿ� Gradle�� ���� ����ϴ� �߼��̱⵵�ϰ�, Maven���� ������ �� ���� ������ ���ٰ� �Ͽ� Gradle�� ����غ���� �ߴ�.

Language : JAVA

Spring Boot : 2.4.3
- 2021-03-04���� ���� �������� �����̸鼭 �ֽ� ������ 2.4.3�� ������.

Dependencies
- Lombok
  - `Model`�̳� `Entity` Ŭ������ ���Ǵ� �����ڵ�� �����ϰ� �ݺ��Ǵ� �ڵ带 �ۿ� �ڵ��� �������� ���� ���Ǽ��� ���̱� ���� ���.
- Spring Boot DevTools
  - Spring ������ ���� �ʰ� ������ϱ� ���ؼ� ����ϰ��� ��.
- Spring Web
  - Web Application�� �����ϱ� ���� ������.
- H2 Database
  - �ϴ� �����ϰ� �����ϱ� ���� H2 DB�� ����ϰ� ����, `MySQL`�� �����ϰ��� ��.
- Spring Data JPA
  - JPA�� �����ϰ��� ���.
- Validation
  - �������� ��ȿ���� �ֱ� ���� ���.
- Thymeleaf
  - ����Ʈ����

## Bootstrap template

https://www.themezy.com/free-website-templates/10-movie-reviews-responsive-template

�̰� �����.

## 2021-03-04�� �����Ȳ �� �˾ư� ��

### �˾ư� ��

### `@RequestMapping` �� `@GetMapping`�� ������

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
- ���� �������̽����� ����, `@RequestMapping`�� method�� default�� ����� ���, GET, POST, HEAD, OPTIONS, PUT, PATCH, DELETE, TRACE�� ���� ����Ѵ�.
- �ݸ� `@GetMapping`�� ��� @RequestMapping(method = RequestMethod.GET)�� �������°��� Ȯ���� �� �ִ�.

### Spring���� css, js �����ϴ� ���

https://www.themezy.com/free-website-templates/10-movie-reviews-responsive-template ���⼭ ������ template�� �������� ����.

application.yml
```yml
spring:
  thymeleaf:
    prefix: classpath:/templates/
    suffix: .html
```

�Ʒ��� ���� static���� css, jss, dummy ���� �־��ְ� templates���� html ���ϵ��� �־��ش�.

```
.
������ application.yml
������ static
��   ������ __MACOSX
��   ��   ������ dummy
��   ��   ������ fonts
��   ��   ������ images
��   ��   ������ js
��   ��   ��   ������ ie-support
��   ��   ��   ������ min
��   ��   ������ sass
��   ��       ������ layout
��   ��       ������ libs
��   ��           ������ bootstrap-grid
��   ������ dummy
��   ��   ������ background.jpg
��   ��   ������ background@2x.jpg
��   ��   ������ figure.jpg
��   ��   ������ figure@2x.jpg
��   ��   ������ person-1.jpg
��   ��   ������ person-1@2x.jpg
��   ��   ������ person-2.jpg
��   ��   ������ person-2@2x.jpg
��   ��   ������ person-3.jpg
��   ��   ������ person-3@2x.jpg
��   ��   ������ person-4.jpg
��   ��   ������ person-4@2x.jpg
��   ��   ������ single-image.jpg
��   ��   ������ single-image@2x.jpg
��   ��   ������ slide-1.jpg
��   ��   ������ slide-1@2x.jpg
��   ��   ������ slide-2.jpg
��   ��   ������ slide-2@2x.jpg
��   ��   ������ slide-3.jpg
��   ��   ������ slide-3@2x.jpg
��   ��   ������ thumb-1.jpg
��   ��   ������ thumb-1@2x.jpg
��   ��   ������ thumb-2.jpg
��   ��   ������ thumb-2@2x.jpg
��   ��   ������ thumb-3.jpg
��   ��   ������ thumb-3@2x.jpg
��   ��   ������ thumb-4.jpg
��   ��   ������ thumb-4@2x.jpg
��   ��   ������ thumb-5.jpg
��   ��   ������ thumb-5@2x.jpg
��   ��   ������ thumb-6.jpg
��   ��   ������ thumb-6@2x.jpg
��   ��   ������ thumb-7.jpg
��   ��   ������ thumb-7@2x.jpg
��   ��   ������ thumb-8.jpg
��   ��   ������ thumb-8@2x.jpg
��   ������ fonts
��   ��   ������ FontAwesome.otf
��   ��   ������ font-awesome.min.css
��   ��   ������ fontawesome-webfont.eot
��   ��   ������ fontawesome-webfont.svg
��   ��   ������ fontawesome-webfont.ttf
��   ��   ������ fontawesome-webfont.woff
��   ������ images
��   ��   ������ arrow-gray.png
��   ��   ������ arrow-gray@2x.png
��   ��   ������ arrow.png
��   ��   ������ arrow@2x.png
��   ��   ������ icon-contact-envelope.png
��   ��   ������ icon-contact-envelope@2x.png
��   ��   ������ icon-contact-globe.png
��   ��   ������ icon-contact-globe@2x.png
��   ��   ������ icon-contact-map.png
��   ��   ������ icon-contact-map@2x.png
��   ��   ������ icon-contact-message.png
��   ��   ������ icon-contact-message@2x.png
��   ��   ������ icon-contact-pencil.png
��   ��   ������ icon-contact-pencil@2x.png
��   ��   ������ icon-contact-phone.png
��   ��   ������ icon-contact-phone@2x.png
��   ��   ������ icon-contact-user.png
��   ��   ������ icon-contact-user@2x.png
��   ��   ������ logo.png
��   ��   ������ logo@2x.png
��   ��   ������ select.png
��   ��   ������ select@2x.png
��   ������ js
��   ��   ������ app.js
��   ��   ������ ie-support
��   ��   ��   ������ html5.js
��   ��   ��   ������ pie.htc
��   ��   ��   ������ respond.js
��   ��   ������ jquery-1.11.1.min.js
��   ��   ������ jquery-1.11.1.min.map
��   ��   ������ min
��   ��   ��   ������ app-min.js
��   ��   ��   ������ plugins-min.js
��   ��   ������ plugins.js
��   ������ sass
��   ��   ������ layout
��   ��   ��   ������ _content.scss
��   ��   ��   ������ _footer.scss
��   ��   ��   ������ _header.scss
��   ��   ������ libs
��   ��   ��   ������ _components.scss
��   ��   ��   ������ _global.scss
��   ��   ��   ������ _mixins.scss
��   ��   ��   ������ _normalize.scss
��   ��   ��   ������ _settings.scss
��   ��   ��   ������ bootstrap-grid
��   ��   ��       ������ _grid.scss
��   ��   ��       ������ _mixins.scss
��   ��   ��       ������ _settings.scss
��   ��   ������ pages
��   ��   ������ style.scss
��   ������ style.css
������ templates
    ������ about.html
    ������ contact.html
    ������ index.html
    ������ joinus.html
    ������ review.html
    ������ single.html

```

### �����Ȳ

`HomeController`�� ���� �޴��ٿ��� page �̵��� ������. �̸� ���ؼ� html �ڵ���� �ּҵ��� Mapping�޴� value��� ��������.


## 2021-03-05�� �����Ȳ �� �˾ư� ��

### �˾ư� ��

`@Column(name = ~~~)` �� ���, �������� �߸� �Ʒ��� ���� �����ϱ�.

```
Preferences > Editor > Inspections > JPA�� Unresolved database references in annotations üũ ���� �� OK
```




### �����Ȳ

https://happyer16.tistory.com/entry/Spring-JPA-%EB%8B%A4%EB%8C%80%EB%8B%A4-%EC%84%A4%EC%A0%95-%EB%B0%8F-%EC%A3%BC%EC%9D%98-Many-To-Many
����