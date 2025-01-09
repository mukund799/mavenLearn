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
   <br>
 ApplicationContext - It is a implemention of IoC. it manages all the beans creation,deletion and dependency etc.