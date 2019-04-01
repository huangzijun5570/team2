package com.hzj;

public class Test {
    public static void main(String[] args) {
       /* String s = "张三说：我.....我..我...我....喜喜..喜喜喜..欢欢...欢欢.编.编编..编程..程..程程！";
         s = s.replaceAll("\\.", "");
        s = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s);*/
        String email = "asd12as@qq.com.cn";

        boolean b = email.matches("\\w{6,12}@(\\d{2,6}|[a-zA-Z]{2,6})(\\.[a-zA-Z]{2,3}){1,3}");
        System.out.println(b);

    }
}
