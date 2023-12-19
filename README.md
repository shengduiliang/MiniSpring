# 手把手写一个MiniSpring

课程地址：https://time.geekbang.org/column/intro/100536701

## 原始IoC：如何通过BeanFactory实现原始版本的IoC容器？

- 入口文件：[Test.java](src%2Fmain%2Fjava%2Fcom%2Fminis%2Ftest%2FTest.java)

### 涉及到的类简介

- com.minis.context.ClassPathXmlApplicationContext： 负责读取beans.xml，生成bean
- com.minis.resource.ClassPathXmlResource：负责解析beans.xml的结构
- com.minis.beans.SimpleBeanFactory：负责生成bean
- com.minis.beans.XmlBeanDefinitionReader： 负责将ClassPathXmlResource解析的bean生成beanDefinition，并且将beanDefinition放到SimpleBeanFactory里面