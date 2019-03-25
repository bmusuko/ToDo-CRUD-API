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
3. import the project in eclipse
4. run the project using eclipse
5. open postman and enter request url : http://localhost:8080/ToDo/rest/ToDos


## Feature
1. To use GET, you need to input request url = http://localhost:8080/ToDo/rest/ToDos and click send
2. To use POST, you need to input request url = http://localhost:8080/ToDo/rest/ToDos and fill the body with the input you want to Create,
   for body type use raw - JSON(application/json)
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
3. To use PUT, you need to input request url = http://localhost:8080/ToDo/rest/ToDos/{toDoID} (without "{}") with toDoID you wish to update and fill the body with the input you want to Update
   for body type use raw - JSON(application/json)
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
4. To use Delete, you need to input request url = http://localhost:8080/ToDo/rest/ToDos/{toDoID} (without "{}") with toDoID you wish to delete and click send



