package Library.Operation;

import Library.book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("Good Bye!");
        System.exit(0);
    }
}
