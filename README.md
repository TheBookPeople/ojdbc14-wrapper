ojdbc14-wrapper
===============

A simple JDBC wrapper to allow "newer" (1.6+) Java / JDBC versions to connect to historic Oracle databases (8i).

Problem
-------

* ojdbc6.jar doesn't work with Oracle 8i (https://stackoverflow.com/questions/34557455/error-when-connecting-via-jdbc-to-oracle-8i-database-using-ojdbc6-driver)
* ojdbc14.jar doesn't implement full JDBC in Java 1.6.

Trying to use ojdbc14.jar with some Java 8 software is giving:

    Caused by: java.lang.AbstractMethodError: oracle.jdbc.driver.T4CConnection.isValid(I)Z

Building
--------

Running

    mvn clean package

Will create a target/ojdbc14-wrapper.jar

Usage
-----

Leave ojdbc14.jar on the classpath, and don't change the connection string.
Set the driver class to be uk.co.tbp.jdbc.oracle.Driver.

