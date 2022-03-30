package sa.id.simple.domain;

import java.util.HashMap;
import java.util.Map;

public class IntegerDictionary {
    Map<Integer, Integer> intDict = new HashMap<>();
    public void FindDuplicateInArray(int[] input) {
        for(int i = 0; i < input.length; i++) {
            if(intDict.get(input[i]) == null) {
                intDict.put(input[i], 1);
            } else {
                intDict.put(input[i],intDict.get(input[i])+1);
            }
        }
        for(Map.Entry<Integer, Integer> o : intDict.entrySet()) {
            if(o.getValue() > 1) {
                System.out.println("There is duplicate in array");
                return;
            }
        }
        System.out.println("There is no duplicate in array");
    }
}

