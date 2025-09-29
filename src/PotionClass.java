public class PotionClass {
    
    //private static Scanner scanner = ...;

    // TODO: Add new ingredients
    /* Possible ingredients (you may make up your own, too):
     * ("Bicorn Horn", 5)
     * ("Dragon Blood", 7)
     * ("Armadillo Bile", 10)
     * ("Wormwood Essence", 4)
     * ("Moonstone", 3)
     * ("Fries", 4)
     */

    public static void main(String[] args) {
        Potion create = new Potion(); // potion object creates a new potion based on the 3 ingredients the user inputs that gets stored in array list cookingPot
        Potion.addIngredient();
        if (Potion.question.equalsIgnoreCase("yes")){
            System.exit(0); // had to look this up cause i didn't know how to make the program stop if user inputs >3 ingredients
        }
        else{
            Potion.stirPotion();
            Potion.heatPotion();
            CauldronEvent.triggerEvent();
                if (CauldronEvent.event == 0){
                    System.exit(0);
                }
                else{
                    Potion.evaluatePotion();
                }
            }
        }

        // TODO: Create a new potion

        // TODO: Prompt the user about ingredient options

        // TODO: Prompt the user to stir and heat the potion

        // TODO: Evaluate the potion and print the result

        // TODO: uncomment
        // scanner.close();

    // TODO: Add separate methods to read user input

    // TODO: Implement selectIngredients(...)
    // Allow the user to choose ingredients
    // Prompt the user again for invalid choices -- I combined this with addIngredient... if that's OK.

    // TODO: Implement stirPotion(...)
    // to prompt the user on how often they would like to stir the potion
    // Then stir the potion as many times

    // TODO: Implememt heatPotion(...)
    // That prompts the user to input the heat level of the potion
}
