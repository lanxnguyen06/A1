public class PotionClass {

    public static void main(String[] args) {
        Potion create = new Potion(); // potion object creates a new potion based on the 3 ingredients the user inputs that gets stored in array list cookingPot
        create.addIngredient(); // i combined selectIngredients with addIngredients
        if (create.question.equalsIgnoreCase("yes")){ // if user says yes to adding > 3 ingredients program stops bc potion explodes
            System.exit(0); // had to look this up cause i didn't know how to make the program stop if user inputs >3 ingredients
        }
        else{
            create.stirPotion();
            create.heatPotion();
            CauldronEvent.triggerEvent();
                if (CauldronEvent.event == 0){
                    System.exit(0);
                }
                else{
                    create.evaluatePotion();
                }
        }
    }
}
