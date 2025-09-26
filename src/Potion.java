import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// TODO: Implement Potion. Add useful variables, methods, getters, setters (if needed), and constructor(s)
public class Potion {
    private static int count = 1; 
    private static ArrayList<String> cookingPot = new ArrayList<>(); // empty array list that will be filled when user inputs ingredients
    private static int calculateStrength = 0;
    private static int calculateHeat = 0;
    public static String question;
    /*
     * Hint: A potion should have a strength and quality,
     * (optional: an indicator of whether it has been ruined)
     * Ingredients do not need to be stored within the Potion class!
     */

    public static void addIngredient(){
        Scanner reader = new Scanner(System.in);
        System.out.println("List of ingredients: Dragon blood, Unicorn hooves, Fairy breath, Mermaid scales, Elf hair, Mushrooms");
        String[] ingredients = {Ingredient.getdragonBlood(), Ingredient.getunicornHooves(), Ingredient.getfairyBreath(), Ingredient.getmermaidScales(), Ingredient.getelfHair(), Ingredient.getmushrooms()};

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
                continue; // i didn't know how to loop back without my code being too convoluted so i had to look this part up but now i know this is used to go back to the loop ^_^
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

                boolean yesOrNo = false;
                while (!yesOrNo){ // while yesOrNo is false loop until yesOrNo is true (when user inputs "yes" or "no")
                    System.out.println("Would you like to add more ingredients? Reply with yes or no");
                    question = reader.nextLine();
                    check = false;

                    if (question.equalsIgnoreCase("yes")){
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
                        else{
                            System.out.println("You can only add 3 ingredients to a potion! Your potion exploded!!");
                            yesOrNo = true;
                        }
                    }
                    else if(question.equalsIgnoreCase("no")){
                        System.out.println("Next, you need to stir and mix your potion!");
                        System.out.println("The pot contains " + cookingPot);
                        yesOrNo = true;
                    }
                    else
                    System.out.println("You need to respond with yes or no.");
                }
            }
        }
    }//ends addIngredient

    public static void stirPotion(){
        Random stir = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times would you like to stir it? (1-3)");
        int countStirs = reader.nextInt();
        boolean check2 = false;

        while (check2 == false){
            if (countStirs < 1 || countStirs > 3){
                System.out.println("You need to stir it 1-3 times");
                countStirs = reader.nextInt();
            }
            else if (countStirs >= 1 && countStirs <= 3){
                check2 = true; // breaks while loop
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
                for (int s = 1; s <= countStirs; s++){
                    int stirStrength = stir.nextInt(6);
                    if (stirStrength == 0){
                        stirStrength = stir.nextInt(6);
                        calculateStrength = calculateStrength + (stirStrength * 2); // stirStrength randomly adds a strength value to calculateStrength multiplied by 2
                        System.out.println("Stir " + s + "'s effect on strength: " + calculateStrength);
                    }
                    else{
                        calculateStrength = calculateStrength + (stirStrength * s); 
                        System.out.println("Stir " + s + "'s effect on strength: " + calculateStrength);
                    }
                }
            } // ends else if statement
        } // ends while check2 loop
    } // ends stirPotion

    public static void heatPotion(){
        Random heat = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.println("By how much would you like to heat your potion? (1-3)");
        System.out.println("Be careful, it may explode!");
        int countHeat = reader.nextInt();
        boolean check3 = false;
        while (check3 == false){
            if (countHeat < 1 || countHeat > 3){
                System.out.println("You need to heat it 1-3 times");
                countHeat = reader.nextInt();
            }
            else if (countHeat >= 1 && countHeat <= 3){
                check3 = true;
                int h = 1;
                for (int hq = 1; hq <= countHeat; hq++){
                    int heatQuality = heat.nextInt(8);
                    calculateHeat = calculateHeat + heatQuality;
                    System.out.println("Potion heated " + h + " times. Effect on potion's quality: " + calculateHeat);
                    h++;
                }
            }//ends elseif for countHeat
        } // ends while loop for check3
    }//ends heatPotion

    public static void evaluatePotion(){
        CauldronEvent.triggerEvent();
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
