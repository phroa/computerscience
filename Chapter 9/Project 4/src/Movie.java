import java.util.UUID;

public class Movie extends MediaThing {

    String name;
    UUID id;

    public Movie(String name, int runLength, String genre) {
        super(runLength, genre);
        this.name = name;
        this.id = UUID.randomUUID();
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
