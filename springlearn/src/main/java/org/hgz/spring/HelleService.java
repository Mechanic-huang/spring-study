package org.hgz.spring;

/**
 * @author huang_guozhong
 * @Description
 * @Copyright 2015 © anzhi.com
 * @Created 2017/7/3 16:00
 */
public class HelleService {

  public static void main(String[] args) {
    char c = 'A' ;
    int num = 10 ;
    switch(c) {
      case 'B' :
        num ++ ;
      case 'A' :
        num ++ ;
      case 'Y' :
        num ++ ;
        break ;
      default :
        num -- ;
    }
    System.out.println(num) ;
  }

  public void sayHello(){
    System.out.println("hello,word");
  }
}