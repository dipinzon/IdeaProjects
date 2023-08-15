# Documentation

The following was discovered as part of building this project:
* Specifications : JDk 8, Springboot 2.6.7

## Reference Documentation
### Folder Structure

- src/
  - |-- main/
    - |   |-- java/
    - |   |   |-- com/
    - |   |       |-- bns.api/
    - |   |           |-- tradeprocessor/
      - |   |               |-- TradeProcessorApplication.java (Spring Boot application main class)
      - |   |               |-- config/
        - |   |               |   |-- AppConfig.java
        - |   |               |   |-- SecurityId.java
      - |   |               |
      - |   |               |-- controller/       (Add your REST controllers here if needed)
      - |   |               |
      - |   |               |-- model/
        - |   |               |   |-- TradeMessage.java
        - |   |               |   |-- TradeProcessor.java
        - |   |               |   |-- Message.java
      - |   |               |
      - |   |               |-- processor/
        - |   |               |   |-- TradeProcessor.java
      - |   |               |-- service/
        - |   |               |   |-- TradeStreamService.java
      - |   |               |
      - |   |               |-- utils/
        - |   |                   |-- KafkaTemplate.java   (Custom implementation of KafkaTemplate)
      - |   |
      - |   |-- resources/
        - |       |-- application.properties   (Spring Boot application configuration)
      - |
    - |-- test/   (Add your tests here)
    - |
    - |-- build.gradle   (or pom.xml for Maven)

## Business Logic

### Class TradeProcessor

### Mock Test 



