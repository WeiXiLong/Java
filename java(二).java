打印当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56以上）
        // Scanner scanner = new Scanner(System.in);
        
        //     System.out.println("请输入年龄:");
        //     int age = scanner.nextInt();
        //     if(age <= 18 && age >= 1){
        //         System.out.println("少年");
        //     }else if (age <= 28 && age > 18){
        //         System.out.println("青年");
        //     }else if (age <= 55 && age > 28 ) {
        //         System.out.println("中年");
        //     }else if (age < 120 && age > 55 ){
        //         System.out.println("老年");
        //     }else {
        //         System.out.println("输入错误");
        //     }

        // scanner.close();



判定一个数字是否是素数
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入一个数字进行判断");
        // int num = scanner.nextInt();
        // int i = 2;
        // for(; i < num; ++i){
        //     if(num % i == 0){
        //         System.out.println("该数字不是素数");
        //         break;
        //     }
        // }
        // if(i == num){
        //     System.out.println("该数字是素数");
        // }
        // scanner.close();
        


打印1-100之间的所有素数
        // for(int i = 1; i <= 100; ++i){
        //     int j = 2;
        //     for(; j < i; ++j){
        //         if(i % j == 0){
        //             break;
        //         }
        //     }
        //     if(j == i){
        //         System.out.println(i + " ");
        //     }
        // }


输出1000-2000之间的闰年
        // for(int year = 1000; year <= 2000; ++year){
        //     if(year % 4 == 0){
        //         if(year % 100 != 0){
        //             System.out.println(year + "该年是闰年");
        //         }else if (year % 400 == 0){
        //             System.out.println(year + "该年是闰年");
        //         }
        //     }
        // }



输出乘法口诀表
        // for(int i = 1; i <= 9; ++i){
        //     for(int j = 1; j <= i; ++j){
        //         System.out.println(i + " * " + j + " = " + (i*j));
        //     }
        // }


求两个正数的最大公约数
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入一个数字:");
        // int a = scanner.nextInt();
        // System.out.println("请再次输入一个数字:");
        // int b = scanner.nextInt();
        // int con = 1;
        // int minNum = a;
        // int maxNum = a;
        // minNum = (b < a) ? b : a;
        // maxNum = (b > a) ? b : a;
        // for(int i = 1 ; i <= minNum; ++i){
        //     if(maxNum % i == 0 && minNum % i == 0){
        //         con = i;
        //     }
        // }
        // System.out.println("最大公约数:" + con);

        

计算1/1 - 1/2 + 1/3 - 1/4 + ..... + 1/99 - 1/100的值
        // double sum = 0;
        // for(double i = 1; i <= 100; ++i){
        //     sum += Math.pow(-1, i + 1) *  (1 / i);
        // }
        // System.out.println(sum);

        
      