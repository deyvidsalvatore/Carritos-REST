# CHALLENGE WEEK IV - Spring Boot - Back-End Journey | AWS
## Cars API

Challenge
Develop two endpoints one GET and one POST according to the rules below.
Use Java 11,Maven(to manage dependencies), and MySQL with Root user and Root password

### Maven Dependencies:
- Spring Web
- Lombok
- Spring Validation
- Spring Data JPA
- MySQL Connector

Endpoints:
* #### GET `/cars/get/{idChassi}`
* #### POST `/cars/post`

Usage of example JSON post:
```json
"idChassi": 123,
"name": "New fiesta",
"brand" : "Ford",
"color": "blue",
"fabricationYear": "2014/2015"
```

### Starting
- `git clone https://github.com/deyvidsalvatore/compasscars.git`
- `docker run --name MySQL_Deyvid -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:latest` (Must have Docker to do this)
- `cd compasscars`
- `./mvnw spring-boot:run`

**Attention:** You don't need to create the database, application.yml have this on his configuration to automatically create if not exist.
```yaml
url: jdbc:mysql://localhost:3306/compass_deyvid?createDatabaseIfNotExist=true
```

In case of issues, please contact me on <a href="mailto:deyvidsantosdatascience@gmail.com">my email</a>.
