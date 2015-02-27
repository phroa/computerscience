import java.util.UUID;

public class MagazineArticle implements Authored, TextBasedThing {

    String author;
    String name;
    UUID id;
    int pageCount;

    public MagazineArticle(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.id = UUID.randomUUID();
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getName() {
        return name;
    }

    public UUID getID() {
        return id;
    }

    @Override
    public int getPageCount() {
        return pageCount;
    }
}
