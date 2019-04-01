package com.hzj;

public class Test1 {

    public static void main(String[] args) {

       /* String s = "15797179969";
        String s1 = "[1][35789]\\d{9}";
        boolean b = s.matches(s1);
        System.out.println(b);*/

       /* String s = "吃饭饭，睡觉觉，要抱抱，转圈圈，吹泡泡！";
        String s1 = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s1);*/









       /* String s = "张三说：我.....我..我...我....喜喜..喜喜喜..欢欢...欢欢.编.编编..编程..程..程程！";
        s = s.replaceAll("\\.", "");
        s = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s);*/

        /*String email = "asd1234@qq.com";
        String s = "\\w{6,12}@(\\d{2,6}|[a-zA-Z]{2,6})(\\.[a-zA-Z]{2,3}){1,3}";
        boolean b = email.matches(s);
        System.out.println(b);*/


     /*   String strs = "131.123.23,123.15.56,234.123.12,24.123.15,124.13.12,28.13.12";
        strs = strs.replaceAll("(\\d{1,3})", "00$1");
        strs = strs.replaceAll("0+(\\d{3})", "$1");
        String[] split = strs.split("\\,");
        TreeSet<String> set = new TreeSet<>();
        for (String s : split) {
            set.add(s);
        }
        List<String> list = new ArrayList<>();
        for (String s : set) {
            String all = s.replaceAll("0*(\\d{1,3})", "$1");
            list.add(all);
        }
       list.forEach(temp->{
           System.out.println(temp);
       });*/
    }

}
