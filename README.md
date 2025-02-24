MAVEN(https://www.learncodewithdurgesh.com/blogs/maven-tutorial)
 - Maven is a build automation tool primarily used for Java projects. It addresses two main 
   aspects of building software: dependency management and project build lifecycle management.<br>
 - It simplifies the build process by managing dependencies, compiling source code, packaging it 
   into a deliverable (such as a JAR file), and deploying it to a repository.<br>
 - Maven is based on the concept of a Project Object Model (POM), which is a central piece of 
   information that manages a project’s build, reporting, and documentation.<br><br>

 - All dependency gets downloaded from central repo and gets stored in .m2 folder locally.
   <br> So when you works on different project in same system and you need any dependency then 1st it goes to your .m2 and check that dependency is there available or not. If it is available to your local then it provides to your project and if not available in your local then it downloads and stored to your .m2 folder and then provides to your required project.



SPRING
  1. Dependency Injection - Like in simple java application we can create object for a class and use it somewhere or in other class. So this become a tightly coupled. Beacuse we have to manage all the things.<br>
  Now we have Spring, So this object creation and deletion will managed by spring itself. Spring will create the object at compile time.<br>

  2. Spring IOC container - So all this object creation and managed right goes to spring which is take cared by spring Ioc container. so overall it manages object lifecycle<br>

1.SpringDataJPA

 - in Repository file we have some default predefined function which help us to get the data from database. Like findById, findAllById, findAll etc.<br>
 Now we can have some custom query as well so for that we have to define the function only and JPA will convert that function into Query and give us the required Data. <br>
 Ex. 1.public List<User> findByName(String name);
     2.public List<user> findByNameStartingWith(String prefix)
<br>
     https://docs.spring.io/spring-data/jpa/reference/repositories/query-keywords-reference.html





2. Bean
 - it is nothing but a simple java Object.<br>
   There are two Ways to convert a plain old java object(POJO) into spring Bean<br>
   1. by using annotation @component<br>
   2. by using annotation @Configuration & @Bean. @Configuration at class level and in that class for function we use @Bean.
 ApplicationContext - It is a implemention of IoC. it manages all the beans creation,deletion and dependency etc.

 3. Actuator
  - Spring Boot Actuator is a powerful feature that provides built-in monitoring, metrics, health checks, and environment info for your application.
  - By default, only the /actuator/health and /actuator/info endpoints are enabled. 
  - Actuator provides real-time monitoring
  - Exposes health, metrics, and environment info