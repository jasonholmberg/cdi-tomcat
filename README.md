# cdi-tomcat
sample application that is tooled to use CDI on a servlet engine like Tomcat

To build:

```
gradle war
```

Copy the resulting war: `./build/libs/cdi-tomcat/war` to your Tomcat install.

I encountered using Java 8 and Tomcat version less that 8.  This was tested on the following:

* version 7.0.29 - Java 8 problem
* version 7.0.34 - Java 8 problem
* version 8.0.18 - worked just fine

Once deployed the following URI are available:

* http://localhost:8080/cdi-tomcat
* http://localhost:8080/cdi-tomcat/demo - This servlet uses CDI to inject a service that injects a POJO.  The injected service is @RequestScoped and will display a new date value with each request.
