import java.util.Random;

public class CauldronEvent {
    public static int event;
    public static boolean triggerEvent() {
        Random random = new Random();
        event = random.nextInt(4);

        if (event == 0) {
            System.out.println("Oh no! Your potion exploded and is useless!");
            return true;
        } else if (event == 1){
            System.out.println("Yinz, that potion needs fixed!");
        }
        return false;
    }
}
