# Spring Boot HTMX Starter Project

This is starter project for Spring Boot applications with Thymeleaf and HTMX.
WebJars are used for providing HTMX library.

DataFaker dependency is added for test data.

For development run:

```
mvn spring-boot:run
mvn frontend:npm@npm-install frontend:npm@npm-build-dev
```

This will compile and run spring boot application first, and then 
it will start Tailwind CLI with `--watch` flag enabled.

When you will make changes in your html files, they will be reloaded automatically thanks to spring-boot-devtools.

## Reference

[Spring Boot](https://spring.io/projects/spring-boot)

[HTMX](https://htmx.org/)

[Thymeleaf](https://www.thymeleaf.org/)
