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
        - |   |               |   |-- TradeProcessorController.java
        - |   |               |
      - |   |               |-- model/
        - |   |               |   |-- TradeMessage.java
        - |   |               |   |-- Message.java
      - |   |               |
      - |   |               |-- processor/
        - |   |               |   |-- TradeProcessor.java
      - |   |               |
      - |   |               |-- utils/
        - |   |                   |-- KafkaTemplate.java   (Custom implementation of KafkaTemplate)
      - |   |
      - |   |-- resources/
        - |       |-- application.properties   (Spring Boot application configuration)
      - |
    - |-- test/   (Add your tests here)
      - |   |               |   |-- TradeProcessorTest.java
    - |
    - |-- build.gradle   (or pom.xml for Maven)

## Service EndPoint
### http://localhost:8080/process/fix-message
### Request FIX  Message Example
17=EXEC123|48=AAPL|22=1|1=ACC123|32=100|6=150.25|8=BUY

### Class TradeProcessor

The class has two instance variables injected through the constructor: KafkaTemplate<String, TradeMessage> and RestTemplate.

The onMessage method is responsible for handling incoming FIX messages. It calls the convertToTradeMessage method to transform the FIX message into a TradeMessage and then sends it to the Kafka topic using the kafkaTemplate.

The convertToTradeMessage method takes a FIX Message as input and converts it to a TradeMessage. It fetches security details using the RestTemplate.exchange method, which makes an HTTP POST request to the security master endpoint. The response containing security details is then used to populate the TradeMessage fields, including ISIN, SEDOL, CUSIP, etc.

The convertToTradeMessage method returns the created TradeMessage.

### Mock Test TradeProcessorTest
In this JUnit test, we're mocking the KafkaTemplate and RestTemplate dependencies using Mockito's @Mock annotation. The setUp method initializes the mocks before each test.

The testOnMessage method simulates an incoming FIX message, mocks the behavior of the RestTemplate to return a mock response from the security master endpoint, and then verifies that the kafkaTemplate.sendDefault method is called exactly once.


