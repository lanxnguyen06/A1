import java.util.Scanner;

public class Ingredient {
    private static String[] addIngredients;

    public static void ingredient(){
        Scanner reader = new Scanner(System.in);
        System.out.println("List of ingredients: Dragon blood, Unicorn hooves, Fairy breath, Mermaid scales, Elf hair, Mushrooms");
        String[] ingredients = {"Dragon blood", "Unicorn hooves", "Fairy breath", "Mermaid scales", "Elf hair", "Mushrooms"};
        while (count < 3){
            System.out.println("Add an ingredient");
            reader.nextLine();
            count++;
            if (count == 3){
                System.out.println("Add an ingredient");
                reader.nextLine();
                count++;
                System.out.println("Would you like to add more ingredients?");
                String question = reader.nextLine();
                if (question.equalsIgnoreCase("yes")){
                    System.out.println("Add an ingredient");
                    reader.nextLine();
                    System.out.println("You can only add 3 ingredients to a potion! Your lab exploded!!");
                }//ends yes
                else if(question.equalsIgnoreCase("no"))
                    System.out.println("Next, you need to stir and mix your potion!");
                else
                System.out.println("You need to respond with yes or no.");

        }
    }
}
}
    // TODO: Implement Ingredient. Add useful variables, methods, getters, setters (if needed), and constructor(s)
    // Hint: An ingredient has a name and an effect (should be max. 10) on the potion's strength

