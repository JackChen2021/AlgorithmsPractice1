package ch._1._5;

import edu.princeton.cs.algs4.Quick;

import java.util.Arrays;

/**
 * @author JackChern @create 2021-07-15 21:31
 */
public class Practice12_2 {
    static class QuickUnion{
        int[] id;
        int count;

        public QuickUnion(int size) {
            count = size;
           id =new int[size];
           for (int i =0; i < size ;i++){
               id[i] = i;
           }
        }

        public int find(int p){
            while (p != id[p]){
                p = id[p];
            }
            return p;
        }

        public void union(int p,int q){
            if (id[p] != id[q]){
                id[p] = find(q);
                count--;
            }
        }

        @Override
        public String toString() {
            return "QuickUnion{" +
                    "id=" + Arrays.toString(id) +
                    ", count=" + count +
                    '}';
        }
    }

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(3,6);
        quickUnion.union(2,7);
        quickUnion.union(7,5);
        quickUnion.union(6,2);
        System.out.println(quickUnion);
    }

}
