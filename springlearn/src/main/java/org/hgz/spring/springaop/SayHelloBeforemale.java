package org.hgz.spring.springaop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 19:16
 */
public class SayHelloBeforemale implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.print("hello  ");
  }
}