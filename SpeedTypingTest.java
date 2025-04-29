import java.util.Scanner;

public class SpeedTypingTest {
    private String text;
    private int accuracy;
    private int TypingSpeed;


    public SpeedTypingTest(String text) {
        this.text = text;
    }

    public void startTest() {
        TypingTest();
    }

    private void TypingTest() {
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("Type the following text:\n");

    long timeBefore = System.currentTimeMillis();

    System.out.println(text+"\n");

    String input;

    if(sc.hasNextLine()){
        input = sc.nextLine();
    }else{
        System.out.println("No input here");
        sc.close();
        return;
    }

    long timeAfter = System.currentTimeMillis();
    long elapsedTime = (timeAfter - timeBefore) / 1000;

    int correct = 0;

    for (int i = 0; i < text.length(); i++) {
        if (i < input.length() && input.charAt(i) == text.charAt(i)) {
            correct++;
        }
    }
     accuracy = (int) ((double) correct / input.length() * 100);
     TypingSpeed = (int) ((double) correct / elapsedTime);
    sc.close();
    displayResult();
    }
   
    private void displayResult() {
        System.out.println("Your speed is: "+TypingSpeed+" characters per second");
        System.out.println("Your accuracy:"+accuracy+"%");
    }
    class TimerThread extends Thread {
        @Override
        public void run() {
            try {
                sleep(60000);
                System.out.println("\n\nTime is up!\n");

            } catch (InterruptedException e) {
            }

        }
    }
}