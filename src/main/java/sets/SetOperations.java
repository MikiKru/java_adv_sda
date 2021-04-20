package sets;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class SetOperations {
    private Set<Integer> set1;
    private Set<Integer> set2;

    public Set<Integer> add(){
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }
    public Set<Integer> sub(){
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.removeAll(set2);
        return resultSet;
    }
    public Set<Integer> retain(){
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
    public Set<Integer> symetricSub(){
        Set<Integer> resultSet = new HashSet<>(add());
        resultSet.removeAll(retain());
        return resultSet;
    }

    public static void main(String[] args) {
        SetOperations setOperations = new SetOperations(
                new HashSet<>(Arrays.asList(1,2,3,4,6,7,8,5,5,5)),
                new HashSet<>(Arrays.asList(1,4,6,7)));
        System.out.println(setOperations.add());
        System.out.println(setOperations.sub());
        System.out.println(setOperations.retain());
        System.out.println(setOperations.symetricSub());
    }
}
