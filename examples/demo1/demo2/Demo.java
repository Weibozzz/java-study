//package examples.demo1.demo2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Demo {
    public static void main(String[] args) {
        // 计算字符串中每个字符出现的次数 返回 a(2)b(3)...
        String str = "nadjada-sas ddjf";
        String result = method(str);
        System.out.println(result);
    }

    public static String method(String str) {
//        1. 转化为字符串数组
        char[] strArr = str.toCharArray();
//        2. 转化为map
        Map<Character, Integer> tm = new TreeMap<Character, Integer>();
        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i] >= 'a' && strArr[i] <= 'z' || strArr[i] >= 'A' && strArr[i] <= 'Z')) {
                continue;
            }
            Integer value = tm.get(strArr[i]);
            tm.put(strArr[i], value == null ? 1 : ++value);
        }
        return mapToString(tm);
    }

    public static String mapToString(Map<Character, Integer> tm) {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = tm.keySet().iterator();
        while (it.hasNext()) {
            Character key = it.next();
            Integer value = tm.get(key);
            sb.append(key + "(" + value + ")");
        }
        return sb.toString();
    }
}
