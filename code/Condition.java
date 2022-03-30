package sa.id.simple.domain;

import java.util.HashMap;
import java.util.Map;

public class Condition {

    private boolean numberInRange(int lower, int upper, int input) {
        if(input >= lower && input <= upper) return true;
        return false;
    }

    private boolean isPrime(int number)
    {
        if (number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        var squareRoot = (int)Math.floor(Math.sqrt(number));

        for (int i = 3; i <= squareRoot; i += 2)
        {
            if (number % i == 0) return false;
        }

        return true;
    }
    private String processByCondition(int input) {
        if (!numberInRange(0,1000, input)) return "number is not in range";
        Map<Integer, Character> dict = new HashMap<>();
        dict.put(3, 'A');
        dict.put(5, 'B');
        String result = "";
        if (input == 1 || input == 2) {  }
        else {
            /* Condition divide By Number*/
            for(Map.Entry<Integer, Character> o : dict.entrySet()) {
                if(input % o.getKey() == 0) result += o.getValue();
            }
            /* Condition is Prime Number*/
            if(isPrime(input)) result += 'P';
        }
        return result;
    }

    public int[] produceArrayInt(int num){
        int[] result = new int[num];
        for(int i = 1; i<=num; i++){
            result[(i-1)] = i;
        }
        return result;
    }

    public void processIntegerArray(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Input: "+ intArr[i] +" Output: "+processByCondition(intArr[i]));
        }
    }

}

