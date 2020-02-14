package Library.user;

import Library.Operation.*;

import java.util.Scanner;

public class Student extends User {
    public Student(String name) {
        super(name);
        operations = new IOperation[]{
                new ExitOperation(),
                new FindBook(),
                new BorrowBook(),
                new ReturnBook()
        };
    }




    @Override
    public int menu(){
        System.out.println("===========");
        System.out.println("Hello " + name);
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出登陆");
        System.out.println("===========");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
