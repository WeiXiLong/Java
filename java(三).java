����1-100֮������˶�������9
        // for(int i = 1; i <= 100; ++i){
        //     if(i / 10 == 9){
        //         System.out.println(i + " ");
        //         continue;
        //     }
        //     if(i % 10 == 9){
        //         System.out.println(i + " ");
        //     }
        // }



���0-999֮�������ˮ�ɻ��� �����  ��ˮ�ɻ���ָһ����λ�����������ֵ������͵��ڸ����ֱ���
        // for(int i = 150; i < 1000; ++i){
        //     if( Math.pow(i / 100, 3) + Math.pow(i / 10 % 10, 3) + Math.pow(i % 10, 3)  == (double)i){
        //         System.out.println(i +" ");
        //     }
        // }
        


ģ�������������룬������ȷ��ʾ""��½�ɹ�"������ȷ��ʾ��������󡰣�ֻ�����λ���
        // Scanner scanner = new Scanner(System.in);
        // String passWord = "nihao123";
        // for(int i = 1; i <= 3; ++i){
        //     System.out.println("����������: ");
        //     String key = scanner.nextLine();
        //    if(key.equals(passWord)){
        //         System.out.println("��½�ɹ�");
        //         break;
        //    }else {
        //        System.out.println("��½ʧ�ܣ������µ�¼");
        //    }
        // }
        // scanner.close();


дһ���������ز�����������1�ĸ���
        // Scanner scanner = new Scanner(System.in);
        // int count = 0;
        // System.out.println("������һ�����֣�");
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


��ȡһ�����������������е�ż��λ������λ���ֱ��������������
        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();
        // System.out.println("����λ��");
        // for(int i = 31; i >= 0 ; i = i - 2){
        //     System.out.print( (num >>> i) & 1);
        // }
        // System.out.println();
        // System.out.println("ż��λ��");
        // for(int i = 30; i >= 0 ; i = i - 2){
        //     System.out.print( (num >>> i) & 1);
        // }

        // scanner.close();


���һ��������ÿһ��λ
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("������һ������");
        // int num = scanner.nextInt();
        // for(int i = 31; i >= 0 ; --i){
        //     System.out.print( ( (num >> i) & 1) + " ");
        // }
        // scanner.close();

��������Ϸ
    //     Random random = new Random();
    //     Scanner scanner = new Scanner(System.in);
    //     int toGuess = random.nextInt(100) + 1;

    //     while(true){
    //         System.out.println("���������ֽ��в²�");
    //     int num = scanner.nextInt();
    //     if(num == toGuess){
    //         System.out.println("������ȷ");
    //         break;
    //     }else if (num < toGuess){
    //         System.out.println("�������С��");
    //     }else {
    //         System.out.println("������󣬴���");
    //     }
    // }
    // scanner.close();

    }
}