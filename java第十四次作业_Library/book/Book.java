package Library.book;

public class Book {
    private String name;
    private String author;
    private String id ;
    private int price;
    private String type;
    private boolean isBorrowed;

    public Book(String name, String author, String id, int price, String type, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
