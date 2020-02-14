package Library.Operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class BorrowBook implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入借阅数据id号码: ");
        String id = scanner.next();
        for(int i = 0; i < bookList.getSize(); ++i){
            Book book = bookList.getBooks(i);
            if(!book.getId().equals(id)){
                continue;
            }
            if(book.isBorrowed()){
                System.out.println("这本书已经被借走");
                break;
            }
            System.out.println("借阅成功");
            book.setBorrowed(true);
        }
    }

}
