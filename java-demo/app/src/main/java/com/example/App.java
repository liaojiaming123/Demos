/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import com.example.test.OkhttpTest;
import com.example.test.RetrofitTest;
import com.example.test.RxjavaTest;

public class App {
    public String getGreeting() {
        return "Hello World!您好";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
//        OkhttpTest test = new OkhttpTest();
//        RetrofitTest test = new RetrofitTest();
        RxjavaTest test1 = new RxjavaTest();
        test1.start();
//        test.getReq();
    }
}
