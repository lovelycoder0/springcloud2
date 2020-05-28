# springcloud2
1、整合spring cloud bus
体现在config-server，config-client中。

2、整合spring cloud断路保护、spring cloud负载均衡
体现在eureka_client中。

3、spring cloud REST客户端Feign

声明式：要做一件事， 需要知道三个要素，where, what, how。即在哪里（ where）用什么办法（how）做什么（what）。什么时候做（when）我们纳入how的范畴。

Feign是一个声明式的WebService客户端。使用Feign能让编写WebService客户端更加简单。
它的使用方法是定义一个接口，然后在接口上添加注解，同时也支持JAX-RS标准的注解。
Feign也支持可插拔式的编码器和解码器。SpringCloud对Feign进行了封装，使其支持SpringMVC标准注解和HttpMessageConverters。
Feign可以与Eureka和Ribbon组合使用以支持负载均衡。

