package com.rwj.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static boolean validate(String str){
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        char[] arr = str.toCharArray();
        for (int i=0;i<arr.length-1;i++) {
            char iValue = arr[i];
            for (int j=0;j<arr.length;j++) {
                if (arr[j] == map.get(iValue)) {//碰到闭合元素
                    if ( (i+j)/2 ==0 ) {//和值等于0
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "([{})]";//()[{}]
        boolean flag = validate(s);
        System.out.println(flag);
    }

}
