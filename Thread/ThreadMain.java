package Thread;

public class ThreadMain {
    public static void main(String[] args) {
        //generate thread objects
        Thread baby1 = new Thread(new ThreadBaby("Alice"));
        Thread baby2 = new Thread(new ThreadBaby("Bob"));
        Thread baby3 = new Thread(new ThreadBaby("charlie"));
        Thread baby4 = new Thread(new ThreadBaby("dave"));

        //start the threads
        baby1.start();
        baby2.start();
        baby3.start();
        baby4.start();
    }
}
