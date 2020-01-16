计算1-100之间出现了多少数字9
        // for(int i = 1; i <= 100; ++i){
        //     if(i / 10 == 9){
        //         System.out.println(i + " ");
        //         continue;
        //     }
        //     if(i % 10 == 9){
        //         System.out.println(i + " ");
        //     }
        // }



求出0-999之间的所有水仙花数 并输出  （水仙花数指一个三位数。各个数字的立方和等于该数字本身）
        // for(int i = 150; i < 1000; ++i){
        //     if( Math.pow(i / 100, 3) + Math.pow(i / 10 % 10, 3) + Math.pow(i % 10, 3)  == (double)i){
        //         System.out.println(i +" ");
        //     }
        // }
        


模拟输入三次密码，密码正确显示""登陆成功"，不正确显示”密码错误“；只有三次机会
        // Scanner scanner = new Scanner(System.in);
        // String passWord = "nihao123";
        // for(int i = 1; i <= 3; ++i){
        //     System.out.println("请输入密码: ");
        //     String key = scanner.nextLine();
        //    if(key.equals(passWord)){
        //         System.out.println("登陆成功");
        //         break;
        //    }else {
        //        System.out.println("登陆失败，请重新登录");
        //    }
        // }
        // scanner.close();


写一个函数返回参数二进制中1的个数
        // Scanner scanner = new Scanner(System.in);
        // int count = 0;
        // System.out.println("请输入一个数字：");
        // int num = scanner.nextInt();
        // if( (num & 1) == 1){
        //     count++;
        // }
        // for(int i = 1 ; i < 32; ++i){
        //     if( ( (num = (num >>> 1) ) & 1 ) == 1 ){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // scanner.close();


获取一个二进制序列中所有的偶数位和奇数位，分别输出二进制序列
        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();
        // System.out.println("奇数位：");
        // for(int i = 31; i >= 0 ; i = i - 2){
        //     System.out.print( (num >>> i) & 1);
        // }
        // System.out.println();
        // System.out.println("偶数位：");
        // for(int i = 30; i >= 0 ; i = i - 2){
        //     System.out.print( (num >>> i) & 1);
        // }

        // scanner.close();


输出一个整数的每一个位
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入一个整数");
        // int num = scanner.nextInt();
        // for(int i = 31; i >= 0 ; --i){
        //     System.out.print( ( (num >> i) & 1) + " ");
        // }
        // scanner.close();

猜数字游戏
    //     Random random = new Random();
    //     Scanner scanner = new Scanner(System.in);
    //     int toGuess = random.nextInt(100) + 1;

    //     while(true){
    //         System.out.println("请输入数字进行猜测");
    //     int num = scanner.nextInt();
    //     if(num == toGuess){
    //         System.out.println("输入正确");
    //         break;
    //     }else if (num < toGuess){
    //         System.out.println("输入错误，小了");
    //     }else {
    //         System.out.println("输入错误，大了");
    //     }
    // }
    // scanner.close();

    }
}