递归求N的结成
    public static int factor(int num){
        if(num == 1){
            return 1;
        }
        return num * factor(num - 1);
    }

递归实现1 + 2 + 3 + ... + 10
    public static int add(int num){
        if(num == 1){
            return 1;
        }
        return num + add(num - 1);
}

按照顺序打印一个数字的每一位
    public static void print(int num){
        if(num > 9){
            print(num / 10);
        }
        System.out.print(num % 10 + " ");
    }


输入一个非负整数，返回组成他的数字之和
    public static int retNum(int num){
        if(num < 10){
            return num;
        }
        return retNum(num / 10) + num % 10;
    }
