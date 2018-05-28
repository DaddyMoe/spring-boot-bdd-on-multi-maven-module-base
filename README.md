# My App

Example Spring boot application in a multi maven module. Hosting
- The `my-app` maven child module
- The "my-app" `acceptance` maven child module.  This is a spring app glued with Cucumber for BDD tests
against the `my-app` application running ideally externally. 

# Run it

## Acceptance test on CI Server

    mvn -P verify clean test

## Development test

    mvn clean test
      
## Build it

    mvn clean package

## Example command for Scenario 3

    java -jar console/target/my-app-1.0-SNAPSHOT.jar
