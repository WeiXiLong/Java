package Library.user;

import Library.Operation.IOperation;

import Library.book.BookList;

abstract public class User {
    protected String name;

    public User(String name){
        this.name = name;
    }

    protected IOperation[] operations;

    public abstract int menu();

    public void doOperation(int choice , BookList bookList) {
        operations[choice].work(bookList);
    }
}
