package lists;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class Statistics {
    private List<Integer> elements;
    private int getMax(){
        int max = elements.get(0);
        for (int e : elements)    {
            if(e > max) {
                max = e;
            }
        }
        return max;
    }
    private int getMin(){
        int min = elements.get(0);
        for (int e : elements)    {
            if(e < min) {
                min = e;
            }
        }
        return min;
    }
    private int getMostFrequentElement(){
        return 0;
    }
    // metoda obliczająca średnią arytmetyczną z elementów listy
    private double getAvg(){
        if(elements.size() == 0){
            return 0;
        }
        int cumSum = 0;
        for (int element : elements) {
            cumSum += element;
        }
        return (double)cumSum/elements.size();
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics(new ArrayList<>(Arrays.asList(1,1,2,3,-4,1,3,2)));
        System.out.printf("AVG: %.2f\n", statistics.getAvg());
        System.out.printf("MIN: %d\nMAX: %d\n", statistics.getMin(), statistics.getMax());

    }

}
