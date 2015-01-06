import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by js on 10/7/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        System.out.print("> ");

        final String sender = in.nextLine().trim().replaceAll("[,\\.]", "");
        System.out.println();

        System.out.println("What's your street address?");
        System.out.print("> ");
        final String fromAddr = in.nextLine().trim();
        System.out.println();

        System.out.println("What's your city?");
        System.out.print("> ");
        final String fromCity = in.nextLine().trim().replaceAll("[,\\.]", "");
        System.out.println();

        System.out.println("What's your state and zipcode?");
        System.out.print("> ");
        final String fromState = in.nextLine().trim().replaceAll("[,\\.]", "");
        System.out.println();

        System.out.println("Who are you sending it to?");
        System.out.print("> ");

        final String receiver = in.nextLine().trim().replaceAll("[,\\.]", "");
        System.out.println();

        System.out.println("What's their street address?");
        System.out.print("> ");
        final String toAddr = in.nextLine().trim();
        System.out.println();

        System.out.println("What's their city?");
        System.out.print("> ");
        final String toCity = in.nextLine().trim().replaceAll("[,\\.]", "");
        System.out.println();

        System.out.println("What's their state and zipcode?");
        System.out.print("> ");
        final String toState = in.nextLine().trim().replaceAll("[,\\.]", "");
        System.out.println();

        HashMap senderData = new HashMap() {{
            put("name", sender);
            put("streetNumber", fromAddr.split(" ")[0]);
            put("streetName", fromAddr.replaceFirst("\\d+ ", ""));
            put("city", fromCity);
            put("state", fromState.split(" ")[0]);
            put("zipCode", fromState.split(" ")[1]);
        }};

        HashMap receiverData = new HashMap() {{
            put("name", receiver);
            put("streetNumber", toAddr.split(" ")[0]);
            put("streetName", toAddr.replaceFirst("\\d+ ", ""));
            put("city", toCity);
            put("state", toState.split(" ")[0]);
            put("zipCode", toState.split(" ")[1]);
        }};

        System.out.print('+');
        for (int i = 0; i < 60; i++) {
            System.out.print('-');
        }
        System.out.print('+');
        System.out.println();

        System.out.print("|  ");
        System.out.print(senderData.get("name"));
        for (int i = 0; i < 56 - senderData.get("name").toString().length(); i++) {
            System.out.print(' ');
        }
        System.out.print("  |\n");

        System.out.print("|  ");
        System.out.print(senderData.get("streetNumber") + " " + senderData.get("streetName"));
        for (int i = 0; i < 56 - (senderData.get("streetNumber") + " " + senderData.get("streetName")).length(); i++) {
            System.out.print(' ');
        }
        System.out.print("  |\n");

        System.out.print("|  ");
        System.out.print(senderData.get("city") + ", " + senderData.get("state") + ", " + senderData.get("zipCode"));
        for (int i = 0; i < 56 - (senderData.get("city") + ", " + senderData.get("state") + ", " + senderData.get("zipCode")).length(); i++) {
            System.out.print(' ');
        }
        System.out.print("  |\n");

        for (int i = 0; i < 4; i++) {
            System.out.print('|');
            for (int j = 0; j < 60; j++) {
                System.out.print(' ');
            }
            System.out.print("|\n");
        }

        System.out.print("|          ");
        System.out.print(receiverData.get("name"));
        for (int i = 0; i < 48 - receiverData.get("name").toString().length(); i++) {
            System.out.print(' ');
        }
        System.out.print("  |\n");

        System.out.print("|          ");
        System.out.print(receiverData.get("streetNumber") + " " + receiverData.get("streetName"));
        for (int i = 0; i < 48 - (receiverData.get("streetNumber") + " " + receiverData.get("streetName")).length(); i++) {
            System.out.print(' ');
        }
        System.out.print("  |\n");

        System.out.print("|          ");
        System.out.print(receiverData.get("city") + ", " + receiverData.get("state") + ", " + receiverData.get("zipCode"));
        for (int i = 0; i < 48 - (receiverData.get("city") + ", " + receiverData.get("state") + ", " + receiverData.get("zipCode")).length(); i++) {
            System.out.print(' ');
        }
        System.out.print("  |\n");

        for (int i = 0; i < 2; i++) {
            System.out.print('|');
            for (int j = 0; j < 60; j++) {
                System.out.print(' ');
            }
            System.out.print("|\n");
        }

        System.out.print('+');
        for (int i = 0; i < 60; i++) {
            System.out.print('-');
        }
        System.out.print('+');
    }
}
