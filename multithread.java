
import java.util.Random; 
class SquareNumber extends Thread 
{ 
    int x; 
    SquareNumber(int n)     { 
        x = n; 
    } 
    public void run() 
    { 
        int sqr = x * x; 
        System.out.println("Square of " + x + " = " + sqr ); 
    } 
} 
 
class CubeNumber extends Thread 
{ 
    int x; 
    CubeNumber(int n) 
    { 
        x = n; 
    } 
    public void run() 
    { 
        int cub = x * x * x; 
        System.out.println("Cube of " + x + " = " + cub ); 
    } 
} 
 
class Number extends Thread { 
    public void run() 
    { 
        Random random = new Random();       
        for(int i =0; i<10; i++) 
        { 
            int randomInteger = random.nextInt(100); 
            System.out.println("Random Integer generated = " + randomInteger); 
            SquareNumber s = new SquareNumber(randomInteger); 
            s.start(); 
            CubeNumber c = new CubeNumber(randomInteger); 
            c.start(); 
            try { 
                Thread.sleep(1000); 
 
            } catch (InterruptedException ex) { 
                 System.out.println(ex);             
} 
        } 
    } 
} 
 
public class multithread { 
    public static void main(String args[]) 
    {         Number n = new Number(); 
        n.start(); 
    } 
} 