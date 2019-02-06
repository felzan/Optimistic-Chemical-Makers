# MapFood

Map food is a project developed during the _AcceleraDev_ program, which is powered by _Code Nation_.

#### Deployment

To deploy this application in your machine open your console and use the following command:

    mvn spring-boot:run
    
After a successful deployment, you're gonna be able to access the the application entering the follow URL in your preferred browser:

    http://localhost8080

#### Database Management

Just for the sake of simplicity we are temporarily using the H2 database engine on this project. Note that H2 is a in-memory database (IMDB) and, as so, it will primarily rely on computer memory to store data. 

You can easily access your database console in you browser after deploying this project by typing the following url in any preferred browser: 

    http://localhost8080/h2console
    
Note: In the login page, be sure the _JDBC URL_ field is filled with _jdbc:h2:mem:testdb_.

#### Opening this project with IntelliJ IDE

To open and edit this project using IntelliJ IDE you should follow this steps: 

1. Open IntelliJ IDE as you usually do
2. Access the _file_ menu on your toolbar
3. On the file menu choose _New_ and then click on _Project from Existing Sources_
4. Navigating through your file system, find and select the project directory
5. On the _Import Project_ window, select the option _Import project from external model_ 
6. Still on the _Import Project_ window select _maven_ and click _next_
7. Click _next_ until the project had been successfully imported
