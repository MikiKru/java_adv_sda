package threads.ex3;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {

    public static int [] bubbleSort(int [] array){
       // 1,3,4,5,3,2       ASC - porównuje sąsiednie elementy i zmienia kolejność
       //                   gdy pierwszy jest większy niż drugi
       // 1,3,4,3,2,5   ETAP I
       // 1,3,3,2,4,5   ETAP II
       // 1,3,2,3,4,5   ETAP III
       // 1,2,3,3,4,5   ETAP IV
        for(int i = 0; i < array.length - 1; i++){          // etapy
            for(int j = 0; j < array.length - 1; j++){      // swap
                if(array[j] > array[j+1]){
                    int element = array[j];
                    array[j] = array[j+1];
                    array[j+1] = element;
                }
            }
        }
        return array;
    }
    public static int [] streamAPISorting(int [] array){
        return Arrays.stream(array).sorted().toArray();
    }

}
