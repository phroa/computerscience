public abstract class MediaThing implements Thing {
    private int runLength;
    private String genre;

    public MediaThing(int runLength, String genre) {
        this.runLength = runLength;
        this.genre = genre;
    }

    public int getRunLength() {
        return runLength;
    }

    public String getGenre() {
        return genre;
    }
}
