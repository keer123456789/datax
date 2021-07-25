package com.alibaba.datax.core;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author keer
 * @title: Test
 * @projectName datax-all
 * @description: TODO
 * @date 2020/10/2622:11
 */
public class Test {
    public static void main(String[] args) {
        System.setProperty("datax.home", "D:\\DataxRun");
        System.setProperty("now", LocalTime.now().toString());
        String[] datxArgs = {"-job",  "D:\\DataxRun\\job\\3.json", "-mode", "standalone", "-jobid", "-1"};
        try {
//            Map dataxResult=  Engine.mockEntry(datxArgs);
//            System.out.println(dataxResult.toString());
            Engine.entry(datxArgs);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("12321");
    }
}
