public class PotionClass {

    public static void main(String[] args) {
        Potion create = new Potion(); // potion object creates a new potion based on the 3 ingredients the user inputs that gets stored in array list cookingPot
        Potion.addIngredient(); // i combined selectIngredients with addIngredients
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
}
