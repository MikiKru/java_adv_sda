package lists;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class Statistics {
    private List<Integer> elements;


//        int[] amount = new int[elements.size()];
//        for (int i = 0; i < elements.size(); i++) {
//            for (int j = 0; j < elements.size(); j++) {
//                if(elements.get(j).equals(elements.get(i))){
//                    amount[i] ++;
//                }
//            }
//        }
//        int maxindex = 0;
//        for (int i = 1; i < amount.length; i++) {
//            if(amount[i] > amount[maxindex]){
//                maxindex = i;
//            }
//        }
//        return elements.get(maxindex);


    // metoda obliczająca średnią arytmetyczną z elementów listy
    private double getAvg() {
        if (elements.size() == 0) {
            return 0;
        }
        int cumSum = 0;
        for (int element : elements) {
            cumSum += element;
        }
        return (double) cumSum / elements.size();
    }

    private int getMax() {
        int max = elements.get(0);
        for (int e : elements) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }

    private int getMin() {
        int min = elements.get(0);
        for (int e : elements) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }
    private int getMostFrequentElement() {
        int frequent_element = elements.get(0);
        int frequency = 0;
        while (!elements.isEmpty()) {
            int element = elements.get(0);
            int before = elements.size();
            elements.removeAll(new ArrayList<>(Arrays.asList(element)));
            if ((before - elements.size()) > frequency) {
                frequency = before - elements.size();
                frequent_element = element;
            }
        }
        return frequent_element;
    }
    public static void main(String[] args) {
        Statistics statistics = new Statistics(new ArrayList<>(Arrays.asList(6, 1, 1, 2, 3, -4, 1, 3, 2)));
        System.out.printf("AVG: %.2f\n", statistics.getAvg());
        System.out.printf("MIN: %d\nMAX: %d\n", statistics.getMin(), statistics.getMax());
        System.out.printf("FREQUENT ELEMENT %d\n", statistics.getMostFrequentElement());

    }

}
