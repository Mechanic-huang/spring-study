package org.hgz.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/14 10:00
 */
public class BeanB {
  @Autowired
  private BeanA beanA;

  public void sayA(){
    beanA.sayHi();
  }
}