package Library.Operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class ReturnBook implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还书籍的id号码：");
        String id  = scanner.next();
        for(int i = 0; i < bookList.getSize(); ++i){
            Book book = bookList.getBooks(i);
            if(!book.getId().equals(id)){
             continue;
            }
            if(!book.isBorrowed()){
                System.out.println("这本书已经被归还");
                break;
            }
            book.setBorrowed(false);
        }
    }
}
