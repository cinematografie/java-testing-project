

# Java with Junit5 & RestAssured


## About the repo
The repo is written in Java. It uses Gradle as a build tool, Junit5 for unit tests, and RestAssured for API tests.

We can use Junit5 to help us with test-driven development (TDD) and to improve test code coverage*.

Note: for coverage checking, depending on your team's goals, it is a good idea to follow the steps in "Running Tests" section and test with coverage. This will allow you to refactor with confidence. At the time of writing, the tests in this repo offer 100% line coverage on the code.


### Technical tools Used in this Repo

◦	Java JDK v17

◦	Junit v5.9.x

◦	Gradle v8.1.1

◦   RestAssured v5.3.x

### Running Tests

◦ You can run tests within your IDE (I use IntelliJ) using the GUI/Runner, or you can run 
``./gradlew clean test``

◦ Gradle will give you an HTML report in build/reports which you can view in your browser

◦ Some of the tests are written in different ways to each other to show a variety of methodologies in how certain things could be done. The repo has some unused methods as a result of this, but they are available for reference.




