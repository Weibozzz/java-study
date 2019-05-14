class Demo {
    public static void main(String[] args) {
        // 一个字符串在整数中出现的次数
        String str = "nbaqwqwkqwnbajnbadskksnba";
        findNba(str, "nba");
    }

    public static int findNba(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key)) != -1) {
            str = str.substring(index + key.length());
            count++;
        }
        System.out.println(count);
        return count;
    }
}