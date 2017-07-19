package org.hgz.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 9:42
 */
public class JavaProxy implements InvocationHandler {

  private Object target;

  public JavaProxy(Object target) {
    super();
    this.target = target;
  }

  public static void main(String[] args) {
    JavaProxy handler = new JavaProxy(new Dummy());
    DummyInterface proxy = (DummyInterface) handler.getProxy();//获得代理对象
    proxy.fun1();
    System.out.println("------");
    proxy.fun2();
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result = null;
    System.out.println("pre-" + method.getName());
    result = method.invoke(target, args);
    System.out.println("post-" + method.getName());
    return result;
  }

  public Object getProxy() {
    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
        target.getClass().getInterfaces(), this);
  }
}