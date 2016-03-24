# dubbo-demo

参考[【Dubbo实战】 Dubbo+Zookeeper+Spring整合应用篇-Dubbo基于Zookeeper实现分布式服务（二）](http://blog.csdn.net/hejingyuan6/article/details/47403299)

```
git clone https://github.com/howiefh/dubbo-demo.git
cd dubbo-demo/dubbo-provider
mvn install tomcat7:run -Dmaven.tomcat.port=8080
cd ../dubbo-customer
mvn tomcat7:run -Dmaven.tomcat.port=8070
```

浏览器中打开
http://localhost:8070/customer/sendMoney/createCustomer/?name=world
