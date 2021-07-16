package ch._1._5;

import edu.princeton.cs.algs4.Count;

import java.util.Arrays;

/**
 * @author JackChern @create 2021-07-15 16:53
 */
public class Practice12 {
    static class QuickUnion{
        int[] id;
        int count;

        public QuickUnion(int size) {
           id = new int[size];
           count = size;
           for (int i = 0;i < size;i++){
               id[i] = i;
            }
        }

        public int find(int p){
            while (p != id[p]){
                p = id[p];
            }
            return p;
        }

        public void union(int p , int q){
            if (id[p] != id[q]){
                id[p] = find(q);
                count--;
            }
        }

        @Override
        public String toString() {
            return "QuickUnion{" +
                    "id=" + Arrays.toString(id) +
                    '}';
        }
    }

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(5);
        quickUnion.union(2,4);
        quickUnion.union(1,3);
        quickUnion.union(0,2);
//        quickUnion.union(6,5);
        System.out.println(quickUnion);
        System.out.println(quickUnion.count);
    }
}
