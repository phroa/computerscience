/**
 * Created by Jack Stratton on 9/11/14.
 */
public class Letters {

    /**
     * Program's main method
     * </p>
     *
     * Sends a message, in this case, to my brother, sister, and pen pal.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        email(new Brother("Garrett")); // send an email to these fellows
        email(new Sister("Kate"));
        email(new PenPal("Evan"));
    }

    /**
     * Fills in a message with the {@link Letters.MessageRecipient}'s fields
     *
     * @param target Person to send the email to
     */
    public static void email(MessageRecipient target) {
        System.out.println("# Message to my " + target.getClass().getSimpleName().toLowerCase() + ":"); // who the recipient is
        blankLine(); // spacing
        System.out.println(target.greeting()); // greet them
        blankLine();
        System.out.println(target.messageContent()); // what the message is about
        blankLine();
        System.out.println(boilerplate()); // standard fun text
        blankLine();
        System.out.println(target.signature()); // sign the message. - Jack
    }

    /**
     * Prints a blank line to console
     */
    private static void blankLine() {
        System.out.println();
    }

    /**
     * Returns text that every email has
     *
     * @return Boilerplate text to go in every email
     */
    public static String boilerplate() {
        return "In other news, I got in to the computer science class at highschool which is pretty awesome, looking " +
                "forward to writin' some code. I'm also looking forward to a possible vacation we might take in " +
                "October which could be cool.\nWhat are you up to?";
    }

    /**
     * Interface with standard message components
     */
    public interface MessageRecipient { // people to send the message to will implement this
        String greeting(); // how to greet them

        String messageContent(); // the main message

        String signature(); // signature
    }

    /**
     * My brother
     */
    public static class Brother implements MessageRecipient {
        final String name;

        public Brother(String name) {
            this.name = name;
        }

        @Override
        public String greeting() {
            return "Hey " + this.name;
        }

        @Override
        public String messageContent() {
            return "So I got your voicemail about your new idea for an iOS app, sounded pretty good.\n" +
                    "Perhaps you could write that up into an email or google doc and share that around? " +
                    "Also wondering if you've heard of Faster Than Light because it sounds like a pretty " +
                    "similar game (in a good way).\nWhen do you think you'll be up from Portland to visit?";
        }

        @Override
        public String signature() {
            return "\t-Jack";
        }
    }

    /**
     * My pen pal
     */
    public static class PenPal implements MessageRecipient {
        final String name;

        public PenPal(String name) {
            this.name = name;
        }

        @Override
        public String greeting() {
            return "Hey man,";
        }

        @Override
        public String messageContent() {
            return "So how are things over in NJ? I heard you have 9 classes per day in school which sounds " +
                    "pretty awful... they must be like 30 minutes each :(\n" +
                    "I heard about your recent project on IRC, pretty neat stuff.";
        }

        @Override
        public String signature() {
            return "\t-proxy";
        }
    }

    /**
     * My sister
     */
    public static class Sister implements MessageRecipient {
        final String name;

        public Sister(String name) {
            this.name = name;
        }

        @Override
        public String greeting() {
            return "Hi " + this.name;
        }

        @Override
        public String messageContent() {
            return "Just got your email, and yeah I'd love to do something with you and Matt.\n" +
                    "Anything in particular?";
        }

        @Override
        public String signature() {
            return "\t-J";
        }
    }

}
