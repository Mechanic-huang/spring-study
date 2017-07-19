package org.hgz.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 15:41
 */
public class CountingAfterAdvice extends MethodCounter implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
      throws Throwable {

    count(method.getName());

  }
}