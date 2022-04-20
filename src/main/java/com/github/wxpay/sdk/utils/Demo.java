package com.github.wxpay.sdk.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Derek-huang
 */
public class Demo {

  public static void main(String[] args) {
    B b = new B();
    System.out.println(b.getName());

    List<String> lineIdList = new ArrayList<>(8);
    lineIdList.add("s0001-1");
    lineIdList.add("s0001-2");
    for (String s : removeLineIdEnd(lineIdList)) {
      System.out.println(s);
    }
  }
  private static List<String> removeLineIdEnd(List<String> lineIdList) {
    List<String> result = new ArrayList<>(lineIdList.size());

    for (String lineId : lineIdList) {
      if (lineId.endsWith("-1") || lineId.endsWith("-2")) {
        lineId = lineId.substring(0, lineId.length() - 2);
      }
      result.add(lineId);
    }
    return result;
  }
}
