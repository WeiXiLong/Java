package Library.Operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class Addbook implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("增加书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入id号码：");
        String id = scanner.next();
        System.out.println("请输入书籍价格：");
        int price = scanner.nextInt();
        System.out.println("请输入书籍类型：");
        String type = scanner.next();
        Book book = new Book(name,author,id,price,type,false);
        bookList.setBooks(bookList.getSize(),book);
        bookList.setSize(bookList.getSize() + 1);
    }
}
