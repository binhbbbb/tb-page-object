# A simple Page Object usage example with Vaadin TestBench

An example application that uses tb-tools to automatically assign sane identifiers for components and Page Object pattern using PageFactory to make test cases as readable and maintainable as possible.

The app is Java EE project, so deploy to Java EE 6 compatible server for testing, or just issue "mvn install" that executes the example test case against Wildfly.

The app itself has just a simple PhoneBook implementation using an in memory backend.
