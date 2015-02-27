import java.util.UUID;

public class Book implements Authored, Published, TextBasedThing {

    String author;
    String publisher;
    int pageCount;
    UUID id;
    String name;

    public Book(String author, String publisher, int pageCount, String name) {
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.name = name;
        this.id = UUID.randomUUID();
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public UUID getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
