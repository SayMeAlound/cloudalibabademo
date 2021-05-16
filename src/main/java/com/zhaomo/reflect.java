package com.zhaomo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Auther: zhaomo
 * @Date: 2021/05/15 22:45
 * @Description:
 */
public class reflect {
    public static void main(String[] args) throws Exception{
        ArrayList list = new ArrayList();
        list.add(666);
        Class clazz = list.getClass();
        Scanner sc = new Scanner(System.in);
        Method m = clazz.getMethod(sc.nextLine(),Object.class);
        m.invoke(list,"adc");
        m.invoke(list,12.34);
        m.invoke(list,true);
        ArrayList list1 = new ArrayList();
        list1.add(666);
        list1.add(777);
        list1.add(888);
        m.invoke(list,list1);

        System.out.println(list);


    }
}
