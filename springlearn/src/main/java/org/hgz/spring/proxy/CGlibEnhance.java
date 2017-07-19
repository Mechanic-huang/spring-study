package org.hgz.spring.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 9:30
 */
public class CGlibEnhance implements MethodInterceptor {

  public static void main(String[] args) {
    CGlibEnhance ce = new CGlibEnhance();
    Dummy dummy = (Dummy) ce.getProxy(Dummy.class);
    dummy.fun1();
    System.out.println("------------");

    dummy.fun2();
  }

  public Object getProxy(Class<Dummy> clazz) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(clazz);
    enhancer.setCallback(this);
    return enhancer.create();
  }

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {
    System.out.println("pre - "+ method.getName());
    Object result = proxy.invokeSuper(obj, args);
    System.out.println("post - " + method.getName());
    return result;
  }
}