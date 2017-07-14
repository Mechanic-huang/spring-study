package org.hgz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
        "E:\\workspace\\spring-study\\springlearn\\src\\main\\resources\\application.xml");
    BeanB bean = applicationContext.getBean(BeanB.class);

    bean.sayA();

  }
}
