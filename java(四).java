�ݹ���N�Ľ��
    public static int factor(int num){
        if(num == 1){
            return 1;
        }
        return num * factor(num - 1);
    }

�ݹ�ʵ��1 + 2 + 3 + ... + 10
    public static int add(int num){
        if(num == 1){
            return 1;
        }
        return num + add(num - 1);
}

����˳���ӡһ�����ֵ�ÿһλ
    public static void print(int num){
        if(num > 9){
            print(num / 10);
        }
        System.out.print(num % 10 + " ");
    }


����һ���Ǹ����������������������֮��
    public static int retNum(int num){
        if(num < 10){
            return num;
        }
        return retNum(num / 10) + num % 10;
    }
