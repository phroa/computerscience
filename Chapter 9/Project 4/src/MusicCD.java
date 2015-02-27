import java.util.UUID;

public class MusicCD extends MediaThing {

    UUID id;
    String name;

    public MusicCD(int runLength, String genre, String name) {
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
