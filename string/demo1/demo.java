class Demo {
    public static void main(String[] args) {
        // 例子1：{"nba","abc","cba","zz","qq","haha"} 按照字典排序
        String[] arr = {"nba", "abc", "cba", "zz", "qq", "haha"};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
    }

    public static void printArr(String[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("}");
    }

    public static void sortArr(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}