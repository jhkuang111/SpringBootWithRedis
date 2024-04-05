# Spring Boot with Redis

### Download template project code from Spring Initializer
1. Go to [spring initializr](https://start.spring.io/)
2. Choose **Maven**, **Java**, **3.2.4** (by default), **Jar**, and **17**
3. Go to Dependencies, add **Spring Web**, **Spring Data Redis**
4. Click **Generate**, unzip and then the load the project from Intellij and run to make sure server is running

### Set up Redis configuration
```
spring.redis.host=localhost
spring.redis.port=6379
```