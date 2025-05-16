
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = Text.text;

        System.out.println("  _________                        .___ ___________             .__                 ___________              __   
 /   _____/_____   ____   ____   __| _/ \__    ___/__.__.______ |__| ____    ____   \__    ___/___   _______/  |_ 
 \_____  \\____ \_/ __ \_/ __ \ / __ |    |    | <   |  |\____ \|  |/    \  / ___\    |    |_/ __ \ /  ___/\   __\
 /        \  |_> >  ___/\  ___// /_/ |    |    |  \___  ||  |_> >  |   |  \/ /_/  >   |    |\  ___/ \___ \  |  |  
/_______  /   __/ \___  >\___  >____ |    |____|  / ____||   __/|__|___|  /\___  /    |____| \___  >____  > |__|  
        \/|__|        \/     \/     \/            \/     |__|           \//_____/                \/     \/        ");
        System.out.println("Get ready!");
        try {
            Thread.sleep(2000);
            System.out.println("Starting");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SpeedTypingTest speedTypingTest = new SpeedTypingTest(text);
        speedTypingTest.startTest();
        
    }
}