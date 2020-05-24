# sleuth-zipkin-demo
The aim of this project is to show in a simple way how Sleuth and Zipkin can work into a Spring project. 

## Subprojects
It is composed by four different subprojects.

### demo-dto
DTO project to include the description of the JSON that will be used as message between projects.

```javascript
{"id":1, "name":"Name"}
```

### project1
Main project, exposed in port __8080__.

### project2
Secondary project, exposed in port __8081__.

### project3
Secondary project, exposed in port __8082__.

## Quickstart
1. Compile _demo-dto_ maven project
1. Compile _project1_ maven project and run it: _java -jar target/project1-0.0.2-SNAPSHOT.jar_
1. Compile _project2_ maven project and run it: _java -jar target/project2-0.0.2-SNAPSHOT.jar_
1. Compile _project3_ maven project and run it: _java -jar target/project3-0.0.2-SNAPSHOT.jar_
1. Run zipkin server: _docker run -d -p 9411:9411 openzipkin/zipkin_

### Using as demo
1. Send a POST message to _http://localhost:8080/method1_ with a body similar to: _{"id":1, "name":"Name"}_
1. Open a browser and go to _http://localhost:9411/zipkin/_

![alt text](https://github.com/restalion/sleuth-zipkin-demo/blob/master/img/ZipkinFlow.png "Zipkin Flow")
