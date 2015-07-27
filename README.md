# springboot-jersey-example
Example REST Service using Spring Boot with Jersey. Including
  * DB-Access with Spring Data JPA
  * Unit Tests with JUnit 4
  * Protected API with custom authentication provider using Spring Security
  * Externalized YAML-Config

# Requirements
  * Java 8
  * Maven 3

# How to run

  * Build: `mvn clean install`
  * Run: `java -jar ./target/springboot-jersey-example-*.jar`

# Example REST calls

## Check credentials

  * 200 OK:
    * Required Request-Header: `Content-Type: application/json`
    * REST Call: `POST http://localhost:8080/users/authentication`
    * Request-Body: `{ "username":"admin", "password":"password" }`
  * 200 OK:
    * Required Request-Header: `Content-Type: application/json`
    * REST Call: `POST http://localhost:8080/users/authentication`
    * Request-Body: `{ "username":"kkleber", "password":"kkleber-pwd" }`
  * 401 Unauthorized:
    * Required Request-Header: `Content-Type: application/json`
    * REST Call: `POST http://localhost:8080/users/authentication`
    * Request-Body: `{ "username":"foo", "password":"bar" }`

## Fetch user by username

  * 200 OK:
    * Required Request-Header: `Content-Type: application/json`
    * Required Basic-Auth:
      * Username: `admin`
      * Password: `password`
    * REST Call: `GET http://localhost:8080/users/kkleber`
  * 404 Not Found:
    * Required Request-Header: `Content-Type: application/json`
    * Required Basic-Auth:
      * Username: `admin`
      * Password: `password`
    * REST Call: `GET http://localhost:8080/users/kkleberxx`

## Fetch all users

  * 200 OK:
    * Required Request-Header: `Content-Type: application/json`
    * Required Basic-Auth:
      * Username: `admin`
      * Password: `password`
    * REST Call: `GET http://localhost:8080/users`

## Fetch users by hair color

  * 200 OK:
    * Required Request-Header: `Content-Type: application/json`
    * Required Basic-Auth:
      * Username: `admin`
      * Password: `password`
    * REST Call: `GET http://localhost:8080/users/haircolor/blond`
  * 400 Bad Request:
    * Required Request-Header: `Content-Type: application/json`
    * Required Basic-Auth:
      * Username: `admin`
      * Password: `password`
    * REST Call: `GET http://localhost:8080/users/haircolor/grey`
