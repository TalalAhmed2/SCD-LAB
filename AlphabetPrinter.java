package s;


	import java.util.Random;

	public class AlphabetPrinter extends Thread {
	    @Override
	    public void run() {
	        try {
	            Random random = new Random();
	            for (int i = 0; i < 26; i++) {
	                // Generate a random uppercase letter
	                char randomLetter = (char) ('A' + random.nextInt(26));
	                System.out.print(randomLetter + " ");
	                
	                // Sleep for a random duration (100-500 ms) for fluctuating visualization
	                Thread.sleep(100 + random.nextInt(401));
	            }
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("Starting AlphabetPrinter Thread...");
	        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
	        alphabetPrinter.start();
	        try {
	            alphabetPrinter.join(); // Wait for the thread to finish
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted: " + e.getMessage());
	        }
	        System.out.println("\nAlphabet printing completed!");
	    }
	}


