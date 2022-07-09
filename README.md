# Log4j for springboot applications
### Overview 
Log4j 2 provides a significant improvement in performance compared to its predecessor. It contains asynchronous loggers and supports multiple APIs including SLF4J, commons logging, and java.util.loggging.

The idea is to build a simple Spring Boot application from scratch and demonstrate how to go about integrating and configuring Log4j 2 in the app
### Development note
1. adding dependencies
```
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-jul</artifactId>
			<version>2.1</version>
		</dependency>
```
2. you need to set up configuration for logging and create ``log4j2.xml`` file
``        <Property name="basePath">c:\\logs\\myapplicationlog.log</Property>`` you set up where your logs will be saved in the next step you will configure how logging format should be
``    <PatternLayout>
                  <pattern>[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n</pattern>
              </PatternLayout>``