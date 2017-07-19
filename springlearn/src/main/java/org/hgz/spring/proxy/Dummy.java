package org.hgz.spring.proxy;

/**
 * @author huang_guozhong
 * @Description 被代理对象实现
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 9:28
 */
public class Dummy implements DummyInterface{

  public Dummy() {
  }

  @Override
  public void fun1() {
    System.out.println("fun1 start");
    fun2();
    System.out.println("fun1 end");
  }

  @Override
  public void fun2() {
    System.out.println("fun2 start");
    System.out.println("fun2 end");
  }
}