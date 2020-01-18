求斐波那契数列的第N项
    public static int fib(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

汉诺塔问题
    public static void hnoi(int num, char a,char b ,char c) {
        if(num == 1) {
            System.out.println("num = " + num + " " + a + "-->" +  c);
            sum++;
            return;
        }
        hnoi(num - 1,a,c,b);
        System.out.println("num = " + num + " " + a + "-->" + c);
        hnoi(num - 1,b,a,c);
        sum++;
    }

青蛙跳台阶问题
    public static int jump(int num){
        if(num == 1){
            return 1;
        }else if (num == 2){
            return 2;
        }
        return jump(num - 1) + jump(num - 2);
    }
 