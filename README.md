# Hackathon
Repo for the hackathon concept

This is the Concept project to demonstrate Real time logging and alerting system

The basic idea is to read the logs from different input systems and post the log messages on to a Kafka messageing system which was capable of processing thousands and thousands of messages per sec. Once the messages were consumed they can be processed by using Apache Strom which streams and inturn produces the alerts based on the key wors provided.

Kafka brokers can be easily scalable and Strom Spouts will be able to process and can be scalable horizontally.

