# A simple demo for Spring cloud eureka

Steps:
1. Update hosts file, with mapping both localserver1 and localserver2 to 127.0.0.1
2. Run server.EurekaServer1 and server.EurekaServer2 to setup a clustered Eureka registy servers. The ports are 1001 and 1002.
3. Run provider.EurekaProvider1 and provider.EurekaProvider1 to setup a clustered provider services. The ports are 1201 and 1202.
4. Run consumer.ConsumerApplication to start the consumer. The port number is 9000
5. Go to http://localhost:1002/, check the Eureka servers running status.
6. Go to http://localhost:9000/consumer, you will got "Hello World" respone from the EurekaProvider. Eureka server will forward request to EurekaProvider1 or EurekaProvider2 intervally.
