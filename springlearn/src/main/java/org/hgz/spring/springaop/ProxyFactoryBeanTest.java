package org.hgz.spring.springaop;

import org.hgz.spring.IHelleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 19:21
 */
public class ProxyFactoryBeanTest {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
        "E:\\workspace\\spring-study\\springlearn\\src\\main\\resources\\application-aop.xml");
    TestAbcInterface bean = applicationContext.getBean(TestAbcInterface.class);

    bean.sayHello();
  }
}