# CodeOps Demo Notes

Expected migration proposal for the demo agent:

1. Upgrade Spring Boot parent from `2.1.6.RELEASE` to a Java 21 compatible Spring Boot 3.x line.
2. Replace Springfox 2.x with `springdoc-openapi-starter-webmvc-ui`.
3. Replace Spring Cloud Sleuth with Micrometer Tracing.
4. Replace Apache HttpClient 4.x imports with HttpClient 5.x imports.
5. Replace `javax.xml.bind` with `jakarta.xml.bind`.
6. Treat Axis 1.4 as conditional risk:
   - if unused, remove the dependency and validate build;
   - if used, escalate a SOAP rewrite.

This repo is intentionally small so the E2E flow can end in a real PR/MR.
