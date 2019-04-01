package com.hzj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class test2 {
    public static void main(String[] args) {
        test6();
        //test5();
        //test1();
        //test3();
        //test4();
    }

    private static void test6() {
        String s = "123.2.23,234.21.4,123.23.4,12.34.56";
       s = s.replaceAll("(\\d{1,3})", "00$1");
        s = s.replaceAll("0+(\\d{3})", "$1");

        String[] ips = s.split("\\,");
        TreeSet<String> set = new TreeSet<>();
        for (String ip : ips) {
            set.add(ip);
        }
        List<String> list = new ArrayList<>();
        for (String ip : set) {
            String temp = ip.replaceAll("0*([1-9]{1,3})", "$1");
            list.add(temp);
        }
        list.forEach(temp-> System.out.println(temp));

    }

    private static void test5() {
        List<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.forEach(temp -> {System.out.println(temp);});

        HashMap<Object, Object> map = new HashMap<>();
        map.put("id", 101);
        map.put("name", "赵恢生");
        map.put("age", "23");

        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }

    private static void test4() {
/**
 * 拔高：不要求全部掌握
 * 对ip地址归类: A.B.C.D  A-D的区间范围在：1~255之间
 * 102.254.38.12
 * 11.12.122.25
 * 123.123.45.12
 */

        String ips = "102.254.38.12,11.12.122.25,23.123.45.12";

        ips = ips.replaceAll("(\\d{1,3})", "00$1");
        ips = ips.replaceAll("0+(\\d{3})", "$1");

        TreeSet<String> set = new TreeSet<>();
        String[] s = ips.split("\\,");
        for (String s1 : s) {
            set.add(s1);
        }
        List<String> list = new ArrayList<>();
        for (String s1 : set) {
            String temp = s1.replaceAll("0*([1-9]{1,3})", "$1");
            list.add(temp);
        }
        for (String l : list)
            System.out.println(l);

    }

    private static void test3() {
        String email = "asd12as@qq.com.cn";
        //String regex = "\\w{3,12}@([a-zA-Z]{2,6}|\\d{2,6})(\\.[a-zA-Z]{2,3}){1,3}";
        String s = "\\w{6,12}@(\\d{2,6}|[a-zA-Z]{2,6})(\\.[a-zA-Z]{2,3}){1,3}";
        boolean b = email.matches(s);
        System.out.println(b);
    }

    private static void test1() {
        String strs = "131.123.23,123.345.56,234.123.12";
        strs = strs.replaceAll("(\\d{1,3})", "00$1");
        strs = strs.replaceAll("0+(\\d{3})", "$1");
        String[] split = strs.split("\\,");
        TreeSet<String> set = new TreeSet<>();
        for (String s : split) {
            set.add(s);
        }
        List<String> list = new ArrayList<>();

        for (String s : set) {
            String temp = s.replaceAll("0*([1-9]{1,3})", "$1");
            list.add(temp);
        }
        for (String s : list) {
            System.out.println(s);
        }

    }

}
