package Thread;

import java.util.Random;

//implements Runnable for a thread
public class ThreadBaby implements Runnable {
    String name;
    int sleeptime;
    Random random = new Random();

    public ThreadBaby(String name){
        this.name = name;
        //generate a number between 0 and 999 (inclusive)
        sleeptime = random.nextInt(1000);
    }

    //whenever a thread call start(), it calls the run()
    @Override
    public void run() {
        System.out.println(name + " is going to sleep for " + sleeptime);
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is done. He/She gets up now");
    }
    
}
