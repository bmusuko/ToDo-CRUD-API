# ToDo CRUD using JAVA

<p>Welcome to ToDo CRUD API using JAVA</p>
<p>This application can Create, Read, Update, Delete ToDo</p>

## Requirements

1. Java 1.8
2. JAVA IDE (eclipse)
3. Apache Tomcat
4. Jersey (RESTful Web Services in)
5. Postman (API development environment)


## Instruction

1. Clone the github into your computer
2. Install all the requirements
3. Import the project in eclipse
4. Right click on ToDo Project and go to properties
5. In Java Compiler select Compiler Compliance level 1.8
6. In Project Facets select Java version 1.8 and in runtime column mark Apache Tomcat
7. In Java Build Path click on JRE System Library and Maven Dependencies
8. Select Run Configuration and fill Base directory with your project and Goals with "tomcat<tomcatVersion>"run"
9. open postman and enter request url : http://localhost:8080/ToDo/rest/ToDos


## Feature
1. To use GET, you need to input request url = http://localhost:8080/ToDo/rest/ToDos and click send, we can also use GET to obtain one      spesific information using input request url =  http://localhost:8080/ToDo/rest/ToDos/{toDoID} (without "{}") fill toDoId with ID        which you want to get the information and click send.
2. To use POST, you need to input request url = http://localhost:8080/ToDo/rest/ToDos and fill the body with the input you want to Create,
   for input body's type use raw - JSON(application/json)
   <pre>
	input example :
	{
		"toDoID": "05",
		"deadline": "23/03/2019",
		"finished": "false",
		"description": "Mengerjakan Take Home Test"
	}
	</pre>
	lastly click send
3. To use PUT, you need to input request url = http://localhost:8080/ToDo/rest/ToDos/{toDoID} (without "{}") fill toDoId with ID which      you want to update and fill the body with the input you want to Update
   for input body's type use raw - JSON(application/json)
   <pre>
	input example :
	{
		"toDoID": "05",
		"deadline": "23/03/2019",
		"finished": "false",
		"description": "Mengerjakan Take Home Test"
	}
	</pre>
	lastly click send
4. To use Delete, you need to input request url = http://localhost:8080/ToDo/rest/ToDos/{toDoID} (without "{}") fill toDoId with ID        which you want to delete and click send



