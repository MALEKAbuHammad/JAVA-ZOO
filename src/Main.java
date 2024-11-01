import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tiger tigerObject = new Tiger();  // Create Tiger object
        Dolphin dolphinObject = new Dolphin();  // Create Dolphin object
        Penguin penguinObject = new Penguin();  // Create Penguin object

        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop;

        do {
            int choice = animalChoiceMenu(keyboard); // Get user choice
            int menuChoice;

            switch (choice) {
                case 1: // For Tiger
                    System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());
                    do {
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject); // Display Tiger menu
                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.println("Enter age:");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height:");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter number of stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter sound level of roar:");
                                tigerObject.setSoundLevel(keyboard.nextInt());
                                break;

                            case 2: // Display properties
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Number of Stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Sound Level of Roar: " + tigerObject.getSoundLevel());
                                break;

                            case 3: // Display movement
                                tigerObject.walking();
                                break;

                            case 4: // Display eating
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }

                        // Ask if the user wants to continue with this animal
                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueOuterLoop = keyboard.nextInt();
                    } while (continueOuterLoop == 1);
                    break;

                case 2: // For Dolphin
                    System.out.println("The animal which is chosen is: " + dolphinObject.getNameOfAnimal());
                    do {
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject); // Display Dolphin menu
                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.println("Enter age:");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height:");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter swimming speed:");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                System.out.println("Enter color:");
                                dolphinObject.setColor(keyboard.next());
                                break;

                            case 2: // Display properties
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Color: " + dolphinObject.getColor());
                                System.out.println("Swimming Speed: " + dolphinObject.getSwimmingSpeed());
                                break;

                            case 3: // Display movement
                                dolphinObject.swimming();
                                break;

                            case 4: // Display eating
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }

                        // Ask if the user wants to continue with this animal
                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueOuterLoop = keyboard.nextInt();
                    } while (continueOuterLoop == 1);
                    break;

                case 3: // For Penguin
                    System.out.println("The animal which is chosen is: " + penguinObject.getNameOfAnimal());
                    do {
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject); // Display Penguin menu
                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.println("Enter age:");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter weight:");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height:");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter walking speed:");
                                penguinObject.setWalkSpeed(keyboard.nextDouble());
                                System.out.println("Enter swimming speed:");
                                penguinObject.setSwimSpeed(keyboard.nextDouble());
                                break;

                            case 2: // Display properties
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Walking Speed: " + penguinObject.getWalkSpeed());
                                System.out.println("Swimming Speed: " + penguinObject.getSwimSpeed());
                                break;

                            case 3: // Display movement
                                penguinObject.walking();
                                penguinObject.swimming();
                                break;

                            case 4: // Display eating
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }

                        // Ask if the user wants to continue with this animal
                        System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                        continueOuterLoop = keyboard.nextInt();
                    } while (continueOuterLoop == 1);
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
            }

            // Ask if the user wants to continue with another animal
            System.out.println("Would you like to choose another animal? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();
        } while (continueOuterLoop == 1);

        System.out.println("Thank you for using the animal information system.");
        keyboard.close();
    }

    // Method to display animal choice menu
    public static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("Choose an animal:");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.print("Enter your choice: ");
        return keyboard.nextInt();
    }

    // Method to display animal details manipulation menu
    public static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("\nChoose an action:");
        System.out.println("1. Set Properties");
        System.out.println("2. Display Properties");
        System.out.println("3. Move");
        System.out.println("4. Eat");
        System.out.print("Enter your choice: ");
        return keyboard.nextInt();
    }
}
