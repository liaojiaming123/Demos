/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import com.example.test.FileUtilTest;
import com.example.test.OkhttpTest;
import com.example.test.RetrofitTest;
import com.example.test.RxjavaTest;

import java.io.File;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!您好";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        FileUtilTest test = new FileUtilTest();
        OkhttpTest test1 = new OkhttpTest();
        test1.getImg();
        test1.getReq();
        try {
            test.saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
