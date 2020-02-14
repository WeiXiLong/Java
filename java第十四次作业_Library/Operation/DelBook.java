package Library.Operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

public class DelBook implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("删除书籍信息");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除书籍的id号码：");
        String id = scanner.next();
        int  i = 0;
        for(; i < bookList.getSize(); ++i){
            Book book = bookList.getBooks(i);
            if(book.getId().equals(id)){
               bookList.setBooks(i,bookList.getBooks(bookList.getSize() - 1));
               bookList.setSize(bookList.getSize() - 1);
                System.out.println("删除成功");
                break;
            }
        }
        if(i >= bookList.getSize()){
            System.out.println("没有找到该书籍");
        }
    }
}
