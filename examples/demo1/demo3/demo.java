//package examples.demo1.demo3;

import java.util.HashMap;
import java.util.Map;

class Demo {
    public static void main(String[] args){
//       1. 实现星期的对应关系 输入星期一 显示mon
        String week = "星期一";
        String result = method2(week);
        System.out.println(result);
    }

    public static String method2(String week) {
        Map<String,String> mp = new HashMap<String, String>();
        mp.put("星期一","mon");
        mp.put("星期二","tue");
        return mp.get(week);
    }
}
