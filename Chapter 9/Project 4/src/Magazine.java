import java.util.Set;
import java.util.UUID;

public class Magazine implements Published, TextBasedThing {

    int pageCount;
    UUID id;
    String name;
    String publisher;
    Set<MagazineArticle> articles;

    public Magazine(String name, String publisher, Set<MagazineArticle> articles) {
        this.name = name;
        this.publisher = publisher;
        this.id = UUID.randomUUID();

        articles.forEach(
                article -> this.pageCount += article.pageCount
        );

        this.articles = articles;

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

    @Override
    public String getPublisher() {
        return publisher;
    }

    public Set<MagazineArticle> getArticles() {
        return articles;
    }
}
