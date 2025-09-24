import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// TODO: Implement Potion. Add useful variables, methods, getters, setters (if needed), and constructor(s)
public class Potion {
    public static int count = 1;
    /*
     * Hint: A potion should have a strength and quality,
     * (optional: an indicator of whether it has been ruined)
     * Ingredients do not need to be stored within the Potion class!
     */

    public static void addIngredient(){
        Scanner reader = new Scanner(System.in);
        System.out.println("List of ingredients: Dragon blood, Unicorn hooves, Fairy breath, Mermaid scales, Elf hair, Mushrooms");
        ArrayList<String> cookingPot = new ArrayList<>();
        String[] list = {"Dragon blood", "Unicorn hooves", "Fairy breath", "Mermaid scales", "Elf hair", "Mushrooms"};

        while (count < 3){
            System.out.println("Add an ingredient");
            String pick = reader.nextLine();
            count++;
            cookingPot.add(pick);//adds ingredient to empty array cookingPot

            if (count == 3){
                System.out.println("Add an ingredient");
                pick = reader.nextLine();
                cookingPot.add(pick);
                count++;
                System.out.println("Would you like to add more ingredients?");
                String question = reader.nextLine();

                if (question.equalsIgnoreCase("yes")){
                    System.out.println("Add an ingredient");
                    reader.nextLine();
                    System.out.println("You can only add 3 ingredients to a potion! Your lab exploded!!");
                }

                else if(question.equalsIgnoreCase("no"))
                    System.out.println("Next, you need to stir and mix your potion!");

                else
                System.out.println("You need to respond with yes or no.");

        }
    }
    System.out.println(cookingPot);
    reader.close();
}//ends addIngredient
    // TODO: Implement addIngredient(...)
    // The ingredient's effect should be added to the potion's strength

    // TODO: Implement stirPotion(...)
    // Stir the potion with a random effect: add a random value between 1 and 5 to its strength

    // TODO: Implement heatPotion(...)
    // Heat the potion with a random effect: add a random value between 0 and 7 to its quality

    // TODO: Implement evaluatePotion(...)
    /*
     * Decide the potion's final outcome:
     * Criteria:
     * 1. Trigger CauldronEvent — if it explodes, the potion is ruined.
     * 2. Otherwise, check its strength & quality:
     *    If the strength is greater than 15 and the quality is greater than 3, it is brewed perfectly
     *    If the potion is not ruined and its strength is less than 15 but greater than
     *      10 and the quality is greater than 3, the potion is a bit unstable but ok
     *    Otherwise, the potion is ruined.
     * 
     *  Optional: Feel free to add creative messages or extra effects!
     */
}
