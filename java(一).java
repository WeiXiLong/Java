��������int����������������ֵ
��ʽһ�����û������������������Ӽ��˳�
������г����֣�������
        int a = 10;
        int b = 20;
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(a);
        System.out.println(b);


        int g = 10;
        int h = 20;
        g = g * h;
        h = g / h;
        g = g / h;
        System.out.println(g);
        System.out.println(h);


��ʽ�������õ���������
        int c = 10;
        int d = 20;
        int tem = c;
        c = d;
        d = tem;
        System.out.println(c);
        System.out.println(d);





Java�и�������int�����������ֵ����Сֵ������
��Ŀ������ķ�ʽ��
        int   a = 20;
        int   b = 100;
        int   c = 45;
        int   max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;
        int   min = (a <= b) ? a : b;
        min = (min <= c) ? min : c;
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);
if  else ��ʽ��
        int a = 15;
        int b = 40;
        int c = 20;
        int max = 0;
        int min = 0;
        if(a >= b && a >= c){
            max = a;
        }else if(b >= a && b >= c){
            max = b;
        }else if(c >= a && c >= b){
            max = c;
        }
 
        if(a <= b && a <=  c ){
            min = a;
        }else if (b <= a && b <= c){
            min = b;
        }else if (c <= a && c <= b){
            min = c;
        }
 
        System.out.println("max is :" + max);
        System.out.println("min is :" + min);
