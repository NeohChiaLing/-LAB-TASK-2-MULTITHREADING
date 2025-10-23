public class LabTask2_Multithreading {

    public static void main(String[] args) {
        // Create 5 threads
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
        }
    }
}

// Runnable class that defines what each thread does
class NumberPrinter implements Runnable {
    private int threadNumber;

    public NumberPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread " + threadNumber + " is printing number: " + i + " from the list");
                Thread.sleep(1000); // pause for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}