package cf.phroa;
/*
 * Created by Jack Stratton, Sam Subbukumar, and Andre Sachs
 * 9/16
 *
 */
public class proj3 {
    public static void main(String[] args) {
        swallow("fly"); // each of these methods swallows that specific animal.
        idunno();
        swallow(1, "spider", "That wriggled and iggled and jiggled inside her.");
        swallow(2, "bird", "How absurd to swallow a bird.");
        swallow(3, "cat", "Imagine that, to swallow a cat.");
        swallow(4, "dog", "What a hog to swallow a dog.");
        horse();
    }

    public static void horse() {
        swallow("horse", "She died of course."); // end of the program!
    }

    public static void swallow(String thing) {
        System.out.println("There was an old lady who swallowed a " + thing + ","); // print the first line
    }

    public static void swallow(String thing, String str) { //swallow a thing
        swallow(thing); // first line, calls the other swallow() method.
        System.out.println(str); // here's the second line being printed
    }

    public static void swallow(int index, String thing, String str) {
        swallow(thing, str);
        switch(index) { // when given a number (e.x. `chain(2);`) will print the case with that number and all the ones below it.
            case 4:
                System.out.println("She swallowed the dog to catch the cat,");
            case 3:
                System.out.println("She swallowed the cat to catch the bird,");
            case 2:
                System.out.println("She swallowed the bird to catch the spider,");
            case 1:
                System.out.println("She swallowed the spider to catch the fly,");
                idunno(); // always print the last two lines.
        }
    }

    public static void idunno() { // these two lines are always printed, except for the horse.
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.\n");
    }
}
