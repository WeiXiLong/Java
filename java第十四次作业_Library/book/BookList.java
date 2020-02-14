package Library.book;

public class BookList {
    private Book[] books = new Book[100];
    private int size;
    public BookList() {
        books[0] = new Book("三国演义","罗贯中","001",100,"古典小说",false);
        books[1] = new Book("水浒传","施耐庵","002",100,"古典小说",false);
        books[2] = new Book("西游记", "吴承恩", "003", 100, "古典小说", false);
        size = 3;
    }

    public int getSize(){
        return size;
    }

    public Book getBooks(int index) {
        return books[index];
    }

    public void setBooks(int index,Book book) {
        books[index] = book;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
