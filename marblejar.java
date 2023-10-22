import java.util.Scanner;

public class marblejar {
    private int marbles;
    private boolean isJarOpen;

    public marblejar() {
        marbles = 0;
        isJarOpen = false;
    }

    public void openjar() {
        isJarOpen = true;
        System.out.println("The jar is now open.");
    }

    public void closejar() {
        isJarOpen = false;
        System.out.println("The jar is now closed.");
    }

    public void addMarbles(int numMarbles) {
        if (isJarOpen) {
            if (marbles + numMarbles <= 10) {
                marbles += numMarbles;
                System.out.println(numMarbles + " marble(s) added to the jar.");
            } else {
                System.out.println("The jar is full. Cannot add more marbles.");
            }
        } else {
            System.out.println("The jar is closed. Open the jar to add marbles.");
        }
    }

    public int getMarbleCount() {
        return marbles;
    }

    public static void main(String[] args) {
        marblejar jar = new marblejar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Marble Jar");

        while (true) {
            System.out.println("What do you want to do with Marble Jar: ");
            System.out.println("1. Open jar");
            System.out.println("2. Close jar");
            System.out.println("3. Add Marbles");
            System.out.println("4. Check Marble Count");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    jar.openjar();
                    break;
                case 2:
                    jar.closejar();
                    break;
                case 3:
                    System.out.print("Enter the number of marbles to add: ");
                    int marblesToAdd = scanner.nextInt();
                    jar.addMarbles(marblesToAdd);
                    break;
                case 4:
                    System.out.println("Marbles in the jar: " + jar.getMarbleCount());
                    break;
                case 5:
                    System.out.println("Bye");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
