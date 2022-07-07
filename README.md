Hello Everybody:

## Fisrt of all
To install or run any part of this code you have to install JAVA 1.8 

## Building it

Clone the repo and move to the folder where the project is

build it using:

mvn clean
mvn install

if you dont have mvn as part of your sistem you can install it using:
brew install maven

or open the project using eclipse or Intellij IDEA and build it from the IDE


## Running the service

As user you can run the microservices using any of the following methods:

java -jar <project directory>/target/uplightapi-1.0.jar

If you prefer to run using docker, please run the followings commands:

docker build --tag=uplight:latest .

docker run -d --name uplight -p 8081:8081 uplight:latest

if you don't have Dockers installed you can install it from:
https://docs.docker.com/desktop/mac/install/


## Generate Token

To generate the token and the message:

HTTP POST
http://localhost:8081/generate-token?message="prueba de jwt"


## Validate Token

To validate any token:

HTTP POST

http://localhost:8081/validate-token?token=eyJhbGciOiJIUzI1NiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWyiwuVrJSKi3IyUzPKFHSUcpMLFGyMjQzNTcysjQxNtNRSq0ogAuYgwRyU4uLE9NTgboKikpTkxIVUlIVsspLlGoBFUlwy00AAAA.dgHiAJl3wqSEmyy2ZCFbhPGLw4fW-QuVs63uuCjsJ8c



## Properties
If you want to change any of the parameters used to generate and sign the token you can do it in:
<project directory>/src/resources/application.properties