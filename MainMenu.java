import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;

public class MainMenu {
	// here we are going to create  a main menu for our program in the main method.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // while loop is used here because  without loop the program will exit after single execution.
            System.out.println("---→Main Menu (Assignment-2)---");
            System.out.println("1 – Question-1");
            System.out.println("2 – Question-2");
            System.out.println("3 – Question-3");
            System.out.println("4 – Question-4");
            System.out.println("5 – Question-5");
            System.out.println("Press option (1-5) to execute the program and Press 0 to Exit");

            System.out.print("Enter your option: ");
            int option = scanner.nextInt();
// switch statement is used for selecting case which we want.
            switch (option) {
                case 1:
                    executeQuestion1();
                    break;
                case 2:
                    executeQuestion2();
                    break;
                case 3:
                    executeQuestion3();
                    break;
                case 4:
                    executeQuestion4();
                    break;
                case 5:
                    executeQuestion5();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option (1-5) or 0 to exit.");
            }
        }
    }

    public static void executeQuestion1() {
        // Add code for Question-1 execution here
        System.out.println("---→Executing Question – 1---");
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a SSN
        System.out.print("Enter a SSN (in the format DDD-DD-DDDD): ");
        String ssn = scanner.nextLine();

        // Use a regular expression to validate the SSN format
        if (Pattern.matches("\\d{3}-\\d{2}-\\d{4}", ssn))  {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }

        // Offer the user the option to repeat or go back to the main menu
        System.out.print("Do you want to execute more questions(press 'y') or want to exit the program (press '0): ");
        char option = scanner.next().charAt(0);
        if (option == '0') {
            System.exit(0);
        }
    }

    public static void executeQuestion2() {
        // Add code for Question-2 execution here
        System.out.println("---→Executing Question – 2---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character (M for Mathematics, C for Computer Science, I for Information Technology): ");
        char majorChar = scanner.next().charAt(0);

        System.out.print("Enter the second character (1 for freshman, 2 for sophomore, 3 for junior, 4 for senior): ");
        char statusChar = scanner.next().charAt(0);

        String major = "";
        String status = "";

        switch (majorChar) {
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Technology";
                break;
            default:
                major = "Unknown Major";
                break;
        }

        switch (statusChar) {
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                status = "Unknown Status";
                break;
        }

        System.out.println("Major: " + major);
        System.out.println("Status: " + status);

        // Offer the user the option to repeat or go back to the main menu
        System.out.print("press 'y' to go to the main menu or press '0' to exit the program: ");
        char option = scanner.next().charAt(0);
        if (option == '0') {
            System.exit(0);
        }
    }

    public static void executeQuestion3() {
        // Add code for Question-3 execution here
        System.out.println("---→Executing Question – 3---");

        // Generate a random vehicle plate number
        Random random = new Random();
        StringBuilder plateNumber = new StringBuilder();
        
        // Generate three random uppercase letters
        for (int i = 0; i < 3; i++) {
            char letter = (char) (random.nextInt(26) + 'A');
            plateNumber.append(letter);
        }
        
        // Generate four random digits
        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            plateNumber.append(digit);
        }

        System.out.println("Generated Vehicle Plate Number: " + plateNumber.toString());

        // Offer the user the option to repeat or go back to the main menu
        Scanner scanner = new Scanner(System.in);
        System.out.print("press 'y' to go to the main menu or press '0' to exit the program: ");
        char option = scanner.next().charAt(0);
        if (option == '0') {
            System.exit(0);
        }
    }

    public static void executeQuestion4() {
        System.out.println("---→Executing Question – 4---");
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimalNumber = scanner.nextInt();

        // Check if the entered number is negative
        boolean isNegative = false;
        if (decimalNumber < 0) {
            isNegative = true;
            decimalNumber = -decimalNumber; // Make it positive for binary conversion
        }

        // Convert the decimal number to binary
        StringBuilder binaryValue = new StringBuilder();
        do {
            int remainder = decimalNumber % 2;
            binaryValue.insert(0, remainder);
            decimalNumber /= 2;
        } while (decimalNumber > 0);

        if (isNegative) {
            binaryValue.insert(0, "-"); // Add a minus sign for negative numbers
        }

        System.out.println("Binary representation: " + binaryValue);

        // Offer the user the option to repeat or go back to the main menu
        System.out.print("press 'y' to go to the main menu or press '0' to exit the program: ");
        char option = scanner.next().charAt(0);
        if (option == '0') {
            System.exit(0);
        }
    }

    public static void executeQuestion5() {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Global Warming Quiz:");

        // Question 1
        System.out.println("1. What is the primary greenhouse gas responsible for global warming according to mainstream scientific consensus?");
        System.out.println("1. Methane");
        System.out.println("2. Carbon Dioxide (CO2)");
        System.out.println("3. Oxygen");
        System.out.println("4. Nitrogen");
        System.out.print("Your choice (1-4): ");
        int userAnswer1 = input.nextInt();
        if (userAnswer1 == 2) {
            score++;
        }

        // Question 2
        System.out.println("2. According to climate skeptics, what is a significant factor in natural climate variability?");
        System.out.println("1. Solar activity");
        System.out.println("2. Deforestation");
        System.out.println("3. Industrial pollution");
        System.out.println("4. Volcanic eruptions");
        System.out.print("Your choice (1-4): ");
        int userAnswer2 = input.nextInt();
        if (userAnswer2 == 1) {
            score++;
        }

        // Question 3
        System.out.println("3. In 'An Inconvenient Truth,' Al Gore emphasized the role of melting ice caps in rising sea levels. What do climate skeptics argue about this phenomenon?");
        System.out.println("1. It's not happening.");
        System.out.println("2. It's primarily due to human activities.");
        System.out.println("3. It's a natural cycle.");
        System.out.println("4. It's a temporary trend.");
        System.out.print("Your choice (1-4): ");
        int userAnswer3 = input.nextInt();
        if (userAnswer3 == 3) {
            score++;
        }

        // Question 4
        System.out.println("4. The 'hockey stick' graph is often cited as evidence of anthropogenic global warming. What is its main feature?");
        System.out.println("1. A constant, unchanging temperature trend");
        System.out.println("2. A sudden drop in global temperatures");
        System.out.println("3. A sharp increase in temperatures in recent years");
        System.out.println("4. Consistently increasing temperatures over time");
        System.out.print("Your choice (1-4): ");
        int userAnswer4 = input.nextInt();
        if (userAnswer4 == 4) {
            score++;
        }

        // Question 5
        System.out.println("5. Climate change mitigation policies often involve reducing CO2 emissions. What is a common argument made by climate skeptics regarding these policies?");
        System.out.println("1. They are essential for saving the planet.");
        System.out.println("2. They are too costly and ineffective.");
        System.out.println("3. They don't go far enough in reducing emissions.");
        System.out.println("4. They lead to economic growth.");
        System.out.print("Your choice (1-4): ");
        int userAnswer5 = input.nextInt();
        if (userAnswer5 == 2) {
            score++;
        }

        System.out.println("\nQuiz Results:");
        if (score == 5) {
            System.out.println("Excellent");
        } else if (score == 4) {
            System.out.println("Very good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming");
        }

        System.out.println("\nWebsites for Further Research:");
        System.out.println("- Intergovernmental Panel on Climate Change (IPCC): www.ipcc.ch");
        System.out.println("- Climate Skeptic Website (e.g., ClimateRealists.com)");
        System.out.println("- National Aeronautics and Space Administration (NASA): climate.nasa.gov");
        System.out.println("- Environmental Defense Fund: www.edf.org/climate");
    }
}

    



