1.��дһ����Calculator,���������ԣ������Բ����ڶ����ʱ���ʼ�������ʵ�ּӼ��˳�����
public class Calculate {
    private int num1;
    private int num2;

    public  Calculate(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        return  this.num1 + this.num2;
    }

    public int des(){
        return  this.num1 - this.num2;
    }

    public int mul(){
        return this.num1 * this.num2;
    }

    public double del() {
        return (double) this.num1 / this.num2;
    }
}

2.���һ������������캯������
public class Cons {
    private String name;
    private int age;
    private int id;
    private String sex;

    public Cons(String name){
        this.name = name;
    }

    public Cons(String name, int age, int id, String sex) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
    }

    public Cons(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                '}';
    }
}

3.ʵ�ֽ�������������ֵ
public class Swap {
    private int[] a1 ;
    private int[] a2 ;

    public  Swap(int[] arr1,int[] arr2){
        this.a1  = arr1;
        this.a2  = arr2;
    }

    public void swap(){
       for(int i = 0; i < this.a1.length; ++i){
           int tem = this.a1[i];
           this.a1[i] = this.a2[i];
           this.a2[i] = tem;
       }
    }
}

