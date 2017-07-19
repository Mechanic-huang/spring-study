package org.hgz.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 15:38
 */
public class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    count(method);
  }
}