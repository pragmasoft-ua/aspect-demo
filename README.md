sample spring boot application, showing usage of aspectj compile time weaving

mvn clean spring-boot:run

to enable load time weaving, uncomment 

```java
//@EnableLoadTimeWeaving
public class AspectDemoApplication {
...
```

and start jar with 

```
-javaagent:${m2_home}/org/springframework/spring-instrument/4.3.5.RELEASE/spring-instrument-4.3.5.RELEASE.jar
```

