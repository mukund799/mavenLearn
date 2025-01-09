1.SpringDataJPA

 - in Repository file we have some default predefined function which help us to get the data from database. Like findById, findAllById, findAll etc.
 Now we can have some custom query as well so for that we have to define the function only and JPA will convert that function into Query and give us the required Data. \n
 Ex. 1.public List<User> findByName(String name);
     2.public List<user> findByNameStartingWith(String prefix)
