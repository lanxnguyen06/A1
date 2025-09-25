import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// TODO: Implement Potion. Add useful variables, methods, getters, setters (if needed), and constructor(s)
public class Potion {
    public static int count = 1; 
    public static ArrayList<String> cookingPot = new ArrayList<>(); // empty array list that will be filled when user inputs ingredients
    public static double calculateStrength = 0;
    public static String question;
    /*
     * Hint: A potion should have a strength and quality,
     * (optional: an indicator of whether it has been ruined)
     * Ingredients do not need to be stored within the Potion class!
     */

    public static void addIngredient(){
        Scanner reader = new Scanner(System.in);
        System.out.println("List of ingredients: Dragon blood, Unicorn hooves, Fairy breath, Mermaid scales, Elf hair, Mushrooms");
        String[] ingredients ={Ingredient.getdragonBlood(), Ingredient.getunicornHooves(), Ingredient.getfairyBreath(), Ingredient.getmermaidScales(), Ingredient.getelfHair(), Ingredient.getmushrooms()};

        while (count < 3){
            System.out.println("Add an ingredient");
            String pick = reader.nextLine();

            boolean check = false; 
            for (String iterate : ingredients){ // searches through all of the contents of the array
                if (pick.equalsIgnoreCase(iterate)){
                    check = true;
                    break; // if user input = content in array break the loop 
                }
            }

            if (!check){ // if user input != content in array keep looping until user puts in valid input
                System.out.println("This is not an ingredient... Try again");
                continue; // to be honest i didn't know how to loop back without my code being too convoluted so i had to look this part up
            }
            
            count++;
            cookingPot.add(pick.toLowerCase()); //adds ingredient to empty array cookingPot & toLowerCase so it. um idk it 2 am i sleep now

            if (count == 3){
                System.out.println("Add an ingredient");
                pick = reader.nextLine();

                for (String iterate : ingredients){
                    if (pick.equalsIgnoreCase(iterate)){
                        check = true;
                        break;
                    }
                }

                if (!check){
                    System.out.println("This is not an ingredient... Try again");
                    continue;
                }

                cookingPot.add(pick.toLowerCase());
                count++;

                System.out.println("Would you like to add more ingredients? Reply with yes or no");
                question = reader.nextLine();

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
    if(question.equalsIgnoreCase("yes")){
    System.out.println("The pot contains " + cookingPot);
    }

}//ends addIngredient

    public static void stirPotion(){
        Random stir = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times would you like to stir it?");
        int countStirs = reader.nextInt();
        //int howManyStirs = stir.nextInt(6); // selects a random stir amount between the range of 0-5
        //if (howManyStirs == 0){ // stirs again if stirred 0 times
            //howManyStirs = stir.nextInt(6);
        //}

        //System.out.println("Your magical pet owl took over the pot and stirred it for you " + howManyStirs + " times!");

        for (String iterateStrength : cookingPot){ // checks the whole array to see what strength to add to the potion depending on what the user picked for ingredients
        if (iterateStrength.equalsIgnoreCase("Dragon blood")){
            calculateStrength += Ingredient.getdragonBloodStrength();
        }
        else if (iterateStrength.equalsIgnoreCase("Unicorn hooves")){
            calculateStrength += Ingredient.getunicornHoovesStrength();
        }
        else if (iterateStrength.equalsIgnoreCase("Fairy breath")){
            calculateStrength += Ingredient.getfairyBreathStrength();
        }
        else if (iterateStrength.equalsIgnoreCase("Mermaid scales")){
            calculateStrength += Ingredient.getmermaidScalesStrength();
        }
        else if (iterateStrength.equalsIgnoreCase("Elf hair")){
            calculateStrength += Ingredient.getelfHairStrength();
        }
        else if (iterateStrength.equalsIgnoreCase("Mushrooms")){
            calculateStrength += Ingredient.getmushroomStrength();
        }
    }
        for (int i = 1; i <= countStirs; i++){
            int stirStrength = stir.nextInt(6);
            if (stirStrength == 0){
                stirStrength = stir.nextInt(6);
                calculateStrength = calculateStrength + (stirStrength * i); 
                System.out.println("Stir " + i + "'s effect on strength:" + calculateStrength);
            }
            else{
                calculateStrength = calculateStrength + (stirStrength * i); 
                System.out.println("Stir " + i + "'s effect on strength: " + calculateStrength);
            }
        }
        reader.close();
        //for (int i = 1; i <= howManyStirs; i++){ 
        //System.out.println("Stir " + i + ": " + (calculateStrength + ((0.5 * i)))); // original potion strength will be added an extra strength by 0.5 multiplier depending on how many stirs 
        //}

        //System.out.println("Your potion's strength is " + (calculateStrength + (0.5 * howManyStirs)));
        } // ends stirPotion

    public void heatPotion(){

    }

    public void evalutatePotion(){

    }

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
