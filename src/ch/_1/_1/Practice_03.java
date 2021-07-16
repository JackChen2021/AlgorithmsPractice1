package ch._1._1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author JackChern @create 2021-07-14 16:53
 */
public class Practice_03 {
    public static void main(String[] args) {
       int a = StdIn.readInt();
       int b = StdIn.readInt();
       int c = StdIn.readInt();
       if (a == b && b==c){
           StdOut.println("equal");
       }else {
           StdOut.println("not equal");
       }

    }
}
