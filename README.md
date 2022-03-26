# Search Directions to Dublin using Google Maps - Test using Selenium and JUnit

This objective of this project is to test some Google Maps scenarios based on this requirements:

QA Engineer - Technical Challenge:

Selenium Tech Test:
Write a short automated test of the following using Selenium and NUnit/JUnit in an
OO language (e.g. C#/Java/Python).

1. Go to https://www.google.com/maps
2. Enter Dublin in the search box
3. Search
4. Verify left panel has "Dublin" as a headline text
5. Click Directions icon
6. Verify destination field is "Dublin"

Use element locator methods as necessary. Implement as many assertions as you deem applicable

## Dependencies:

[Java SDK](https://www.oracle.com/java/technologies/downloads/)

[Maven](https://maven.apache.org/download.cgi)

[Docker desktop](https://www.docker.com/products/docker-desktop/) 

[Docker Image selenium/standalone-chrome](https://hub.docker.com/r/selenium/standalone-chrome)

## Before run tests:

 - Open the Terminal on project path and run  <code> docker run -d -p 4444:4444 --shm-size=2g selenium/standalone-chrome </code>

 - After Docker start successfully, open the URL  <code> http://localhost:4444/ui/index.html#/ </code> to verify the Selenium Grid (you can find the image status on Docker Desktop, if you prefer)

 - Run <code> mvn install </code> on Terminal


### To run the tests execute:

Run <code> mvn test </code> on Terminal




