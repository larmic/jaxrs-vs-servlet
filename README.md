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
