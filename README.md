# jdbc-session-demo
Session management using Spring boot and jdbc

This is a demonstration of how to use jdbc to  store and retrieve HttpSession data using Spring Session

- run using mvn spring-boot:run
- in Postman "localhost:8080/send?message=yourmessage" to send a message
- localhost:8080/read to recieve the message from HttpSession
