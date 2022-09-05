// Java Program to Illustrate Monitor in Java Concurrency
 
// Importing input output classes
import java.io.*;
 
// Class 1
// Helepr class
class SharedDataPrinter {
 
    // Monitor implementation is caried on by
    // Using synchronous method
 
    // Method (synchronised)
    synchronized public void display(String str)
    {
 
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
 
            // Try-catch bloc kfor exceptions as we are
            // using sleep() method
            try {
 
                // Making thread to sleep for very
                // nanoseconds as passed in the arguments
                Thread.sleep(100);
            }
            catch (Exception e) {
            }
        }
    }
}
 
// Class 2
// Helper class extending the Thread class
class Thread1 extends Thread {
 
    SharedDataPrinter p;
 
    // Thread
    public Thread1(SharedDataPrinter p)
    {
 
        // This keyword refers to current instance itself
        this.p = p;
    }
 
    // run() method for this thread invoked as
    // start() method is called in the main() method
    public void run()
    {
 
        // Print statement
        p.display("Hello");
    }
}
 
// Class 2 (similar to class 1)
// Helper class extending the Thread class
class Thread2 extends Thread {
 
    SharedDataPrinter p;
 
    public Thread2(SharedDataPrinter p) { this.p = p; }
 
    public void run()
    {
        // Print statement
        p.display(" World");
    }
}
 
// Class 3
// Main class
class MonitorExample {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Instance of a shared resource used to print
        // strings (single character at a time)
        SharedDataPrinter printer = new SharedDataPrinter();
 
        // Thread objects sharing data printer
        Thread1 t1 = new Thread1(printer);
        Thread2 t2 = new Thread2(printer);
 
        // Calling start methods for both threads
        // using the start() method
        t1.start();
        t2.start();
    }
}
