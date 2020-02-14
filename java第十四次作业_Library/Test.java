package Library;

import Library.book.BookList;
import Library.user.Student;
import Library.user.Teacher;
import Library.user.User;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        User user = login();

        while(true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        System.out.println("请选择您的角色： (1. 普通用户   2. 管理员)");
        int role = scanner.nextInt();
        if(role == 1){
            return new Student(name);
        }
        return new Teacher(name);
    }
}
