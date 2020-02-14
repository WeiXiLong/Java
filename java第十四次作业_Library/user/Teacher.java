package Library.user;

import Library.Operation.*;

import java.util.Scanner;

public class Teacher extends User {
    public Teacher(String name) {
        super(name);
        operations = new IOperation[]{
                new ExitOperation(),
                new FindBook(),
                new Addbook(),
                new DelBook(),
                new PrintAllBook()
        };

    }


    @Override
    public int menu() {
        System.out.println("===========");
        System.out.println("Hello " + name);
        System.out.println("1. 查阅书籍");
        System.out.println("2. 增加书籍");
        System.out.println("3. 删除书籍");
        System.out.println("4. 打印所有书籍");
        System.out.println("0. 退出登陆");
        System.out.println("===========");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
