import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Thing[] things = {
            new Book("Book Author", "Publishing Co.", 451, "This Book's Name"),
            new Movie("A Movie", 168, "Action"),
            new MusicCD(82, "Pop", "Top 10 Hits"),
            new Magazine("Computer Science Weekly", "Magazine Publishing Co.", new HashSet<MagazineArticle>() {{
                add(new MagazineArticle("Awesome Article", "An Author", 5));
                add(new MagazineArticle("Neat Article", "An Author", 3));
                add(new MagazineArticle("Bleh", "Nobody", 6));
            }})
        };

        for (Thing t : things) {
            if (t instanceof TextBasedThing) {
                TextBasedThing thing = ((TextBasedThing) t);

                System.out.printf("\"%s\" (ID %s)%n", thing.getName(), thing.getID());
                if (thing instanceof Authored)
                    System.out.printf("by %s%n", ((Authored) thing).getAuthor());

                if (thing instanceof Published)
                    System.out.printf("Published by %s%n", ((Published) thing).getPublisher());

                if (thing instanceof Magazine) {
                    System.out.println("Magazine Articles:");

                    for (MagazineArticle article : ((Magazine) thing).getArticles()) {
                        System.out.printf("-> \"%s\" (by %s) [%d pages]%n", article.getName(), article.getAuthor(), article.getPageCount());
                    }
                }

                System.out.printf("%d pages total%n", thing.getPageCount());

                System.out.println();

            }
            if (t instanceof MediaThing) {
                MediaThing thing = (MediaThing) t;

                System.out.printf("\"%s\" (ID %s)%n", thing.getName(), thing.getID());
                System.out.println(thing.getGenre());
                System.out.printf("%dm%n%n", thing.getRunLength());

            }
        }

    }
}
