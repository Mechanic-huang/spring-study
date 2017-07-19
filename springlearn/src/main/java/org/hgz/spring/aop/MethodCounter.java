package org.hgz.spring.aop;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/19 15:31
 */
public class MethodCounter implements Serializable {
  private HashMap<String, Integer> map = new HashMap<>();

  private int allCount ;

  protected void count(Method method){
    count(method.getName());
  }

  protected void count(String methodName) {
    Integer i = map.get(methodName);
    i = (i != null ? new Integer(i.intValue() + 1): new Integer(1));
    ++ allCount;
  }

  public int getCalls(String methodName) {
    Integer i = map.get(methodName);
    return (i != null ? i.intValue(): 0);
  }

  public int getCalls() {
    return allCount;
  }

}