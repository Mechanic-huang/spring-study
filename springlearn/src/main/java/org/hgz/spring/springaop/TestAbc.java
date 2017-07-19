package org.hgz.spring.springaop;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 19:15
 */
public class TestAbc implements TestAbcInterface {

  @Override
  public void sayHello() {
    System.out.println("先生");
  }
}