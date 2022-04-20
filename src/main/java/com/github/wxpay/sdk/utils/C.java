package com.github.wxpay.sdk.utils;

/**
 * @author Derek-huang
 */
public class C {

  private static final Long BATCH_COUNT = 10_0_0_0L;

  public static void main(String[] args) {
    Long requestId = 10L;
    Long requestId1 = 10L;
    System.out.println(requestId.compareTo(requestId1));
    System.out.println(BATCH_COUNT);


  }

}
