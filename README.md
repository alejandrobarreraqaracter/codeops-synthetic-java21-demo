# CodeOps Synthetic Java 21 Demo

Synthetic Spring Boot service created for Qaracter CodeOps demos.

This repository intentionally mimics a legacy Java 8 / Spring Boot 2.1 service with common migration blockers:

- Spring Boot 2.1.6 and Spring Cloud Greenwich
- Springfox Swagger 2.x annotations
- Spring Cloud Sleuth
- Apache HttpClient 4.x imports
- JAXB `javax.xml.bind` imports
- Apache Axis 1.4 declared as a conditional risk
- Vulnerable dependencies commonly reported by SCA tools

No Allianz source code or business logic is included. All names, endpoints and payloads are synthetic.

Demo flow:

1. Connect this repo from Qaracter CodeOps.
2. Create a working branch such as `codeops/java21-migration-demo`.
3. Let the migration agent generate the Java 21 / Spring Boot 3 proposal.
4. Human reviewer approves or rejects blocks.
5. CodeOps commits to the working branch and opens a PR/MR.
