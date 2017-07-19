package org.hgz.spring;

/**
 * @author huang_guozhong
 * @Description 日志记录AOP
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 10:08
 */
public class LogInterceptor {

  public void before() {
    System.out.println("method before");
  }
}