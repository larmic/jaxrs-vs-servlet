# jaxrs-vs-servlet

Simple performance measurement to compare JAX-RS and plain servlet PUT and GET. 

```java
@PUT
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public String put() {
    System.out.println("simple REST endpoint PUT called");
    return "simple REST endpoint PUT called";
}
```

```java
@Override
protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("simple servlet PUT called");
    final PrintWriter writer = response.getWriter();
    writer.write("simple servlet PUT called");
}
```

Comparing this plain text should measure JAX-RS overhead.

# Getting started

```
mvn clean package tomcat7:run
```

or 

```
mvn clean package wildfly-swarm:run
```

and open http://localhost:8080/restvsservlet/
