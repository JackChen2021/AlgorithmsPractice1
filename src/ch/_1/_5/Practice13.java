package ch._1._5;

import java.util.Arrays;

/**
 * @author JackChern @create 2021-07-16 14:52
 */
public class Practice13 implements Comparable
{
    @Override
    public int compareTo(Object o) {
        return 1;
    }

}
 class WeightedQU{
    int[] id;
    int count;
    int[] size;

     public WeightedQU(int size) {
          id = new int[size];
          this.size = new int[size];
          count = size;
          for (int i = 0;i < size;i++){
              id[i] = i;
          }
         for (int i = 0;i < size;i++){
             this.size[i] = 1;
         }
     }

     public int find(int p){
         while (id[p] != p){
             p = id[p];
         }
         return p;
     }

     public void union(int p,int q){
         if (id[p] != id[q]){
             if (size[p] <= size[q]){
                 id[p] = find(q);
                 size[q] += size[p];
             }else {
                 id[q] = find(p);
             }
             count--;
         }
     }



     @Override
     public String toString() {
         return "WeightedQU{" +
                 "id=" + Arrays.toString(id) +
                 ", count=" + count +
                 ", size=" + Arrays.toString(size) +
                 '}';
     }

     public static void main(String[] args) {
         WeightedQU weightedQU = new WeightedQU(10);
         weightedQU.union(0,1);
         weightedQU.union(2,1);
         weightedQU.union(5,4);
         weightedQU.union(1,9);
         weightedQU.union(2,4);
         weightedQU.union(2,3);
         weightedQU.union(3,5);
         System.out.println(weightedQU);
     }
 }

