package com.demo.library1;

import com.demo.library2.HelloLibrary2Util;

public class HelloLibrary1Util {

  public static String message(String name) {
    return "HelloLibrary1Util + " + name;
  }


  public static String messageFromLibrary2(String name) {
    return HelloLibrary2Util.message(name);
  }
}
