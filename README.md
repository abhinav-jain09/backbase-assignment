# Backbase Assignment

Backbase assignment in spring boot 


## Build

`$ mvn clean package`

## Run

Start the API:

`$ java -jar target/backbase-assignment-1.0-SNAPSHOT.jar`

Documentation 

Swagger documentation .
http://localhost:8080/swagger-ui.html


### IDE

Just run or debug:

`src/main/java/com.backbase.assignment/Application.java`


Via Jar

Java -jar backbase-assignment-1.0-SNAPSHOT.jar

Open browser to [http://localhost:5000](http://localhost:5000)

## Development

Make sure lombok is installed to make your IDE happy!

- In intelliJ install the lombok plugin and enable annotation processing.
- In Eclipse open up the lombok jar found in your maven repository under
  org.projectlombok. This will ask for your eclipse dir to install the
  lombok agent.
  
 ## URLs to access application

http://localhost:8080/home OR / : Home page.
/login : Login page
username : user , 
password : password
/atm : to list all the atm around the Netherlands 

Docker

Build:

$ sudo docker build -t backbase/assignment:SNAPSHOT .

Run:

$ sudo docker run -it -d -p 8080:8080 backbase/assignment:SNAPSHOT


