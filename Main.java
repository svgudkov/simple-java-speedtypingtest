
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = Text.text;

        System.out.println("Hello to speed typing test,");
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