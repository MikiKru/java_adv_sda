package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionsTrigger {
    List<Integer> elements = new ArrayList<>(Arrays.asList(1,2,3,4));

    public Integer getElementByIndex(int index){
        try {                                  // jeśli w try wystąpi wyjątek to przejdź do catch
                                               // jeżeli nie to wykonaj kod w try i przejdź do kolejnych instrukcji za catch
            if(index == 0){                    // dla określonego przypadku syntetycznie zgłoś wyjątek NullPointerException
                throw new NullPointerException();
            }
            int element = elements.get(index); // identyfikacja miejsca wystąpienia wyjątku
            return element;
        } catch (IndexOutOfBoundsException ex){// obsługa wyjątku typu IndexOutOfBoundException
            ex.printStackTrace();
//            return null;
        } catch (NullPointerException ex){
            ex.printStackTrace();
//            return null;
        } catch (Exception ex){                // obsługa wyjątku typu Exception - każdego wyjątku
            ex.printStackTrace();
//            return null;
        }
        return null;
    }
    public static void main(String[] args) {
        ExceptionsTrigger et = new ExceptionsTrigger();
        System.out.println(et.getElementByIndex(20));
        System.out.println(et.getElementByIndex(0));
        System.out.println(et.getElementByIndex(1));
    }
}
