# selenium_framework

This repository contains the details of generic automation files that can be used to setup the automation framework

## Java

#### Explicit Wait: (WaitTypes.java)
In some cases we may need to implement explicit wait for the script to run without any issues. 
Example: The page may not load slowly due to network issues and the script would fail with the error that element was not found or visible

With this script we can define different classes like wait till the button or link is visible, click only when the button is enabled..etc

#### Logging:
It is a good practice to have a method to log details in the script, so that we can track down any issues or errors that occured.
For this we can the log4j2

1. Log4j has the ability to log at different levels like INFO, TRACE, DEBUG, WARN, ERROR and FATAL
2. It has the ability to wite logs in different output formats (files,consoles, database) - Appenders
3. Logging information can be formatted in different styles

There could be different ways to implementing log4j. In here we will use log4j2.xml file
log4j2 can be downloaded from the following website:
https://logging.apache.org/log4j/2.0/download.html

Another option is to get the files from the maven repository:
https://mvnrepository.com/

Mainly for selenium we need only the following 2 files:
1. log4j-api-2.11.0.jar
2. log4j-core-2.11.0.jar

Download these files and add them to the build path of the project, if using maven, add the dependeny details for these in the pom.xml
Create a log4j2.xml file (usually under the resources folder within your project)
We need to make sure that the script has to pick up these details for logging, so we need to add the source of the log4j2.xml file folder under the Java Build Path

After this we can add logging to any class in the project. See sample script below ( refer to log4j2.xml under code section)

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testngclass1 {
  private static final Logger log = LogManager.getLogger(testngclass1.class.getName());
    
  @Test
  public void login_test() throws Exception {
    log.info("Login test in Progress");
    //if test is failed
    log.error("Login test failed");
  }
  
  @BeforeTest
  public void beforeTest() {
    log.info("Before Test");
  }
```


