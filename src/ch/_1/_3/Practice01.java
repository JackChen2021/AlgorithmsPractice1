package ch._1._3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author JackChern @create 2021-07-15 11:26
 */
public class Practice01 {
    static class FixedCapacityStackOfStrings{
        private String[] strings;
        private int N;

        public FixedCapacityStackOfStrings(int max) {
            strings = new String[max];
        }

        void push(String s){
            if (ifFull()){
               throw new RuntimeException("stack is full!");
            }
            strings[N++] = s;
        }

        boolean ifFull(){
            return strings.length == N;
        }
        boolean ifEmpty(){
            return N == 0;
        }

        String pop(){
            if (ifEmpty()){
                throw new RuntimeException("stack is empty");
            }
            String s = strings[--N];
            strings[N] = null;
            return s;
        }

//        @Override
//        public String toString() {
//            return "FixedCapacityStackOfStrings{" +
//                    "strings=" + Arrays.toString(strings) +
//                    '}';
//        }

public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("=== Top ===\n");
    int i = N;
    while(--i >= 0)
        sb.append(strings[i] + "\n");
    sb.append("=== Bottom ===");
    return sb.toString();
}


        public static void main(String[] args) {
            FixedCapacityStackOfStrings fixedCapacityStackOfStrings
                    = new FixedCapacityStackOfStrings(10);
            for (int i = 0;i < 10;i++){
                fixedCapacityStackOfStrings.push(Integer.toString(i));
            }
            StdOut.println(fixedCapacityStackOfStrings);
        }

    }


}
