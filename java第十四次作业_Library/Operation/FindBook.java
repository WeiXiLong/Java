package Library.Operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class FindBook implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想要查阅书籍名称：");
        String name = scanner.next();
        int count = 0;
        for(int i = 0; i < bookList.getSize(); ++i){
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.println(book);
                count++;
            }
        }
        if(count == 0){
            System.out.println("未找到该书");
        }else {
            System.out.println("找到 " + count + "本书" );
        }
    }

}
