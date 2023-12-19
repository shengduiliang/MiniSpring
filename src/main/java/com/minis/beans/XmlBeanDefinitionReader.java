package com.minis.beans;

import com.minis.resource.Resource;
import org.dom4j.Element;

// 负责读取xml的beanDefinition，然后通过beanFactory注册beanDefinition
public class XmlBeanDefinitionReader {
    BeanFactory beanFactory;

    public XmlBeanDefinitionReader(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void loadBeanDefinition(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String beanID = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(beanID, beanClassName);
            beanFactory.registerBeanDefinition(beanDefinition);
        }
    }
}
