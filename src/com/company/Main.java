package com.company;
import java.util.HashMap;
import java.util.Map.Entry;

//Puts all of the array values into a hashmap
public class Main {

    public static int  mostFrequent(int[] arr, int n) {
        HashMap<Integer, Integer> hp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);

            } else {
                hp.put(key, 1);
            }

        }
        int max = 0;
        int res = -1;

        //Value contains frequency. This finds the max value

        for (Entry<Integer, Integer> val : hp.entrySet()) {
            if (max < val.getValue()) {
                res = val.getKey();
                max = val.getValue();

            }
        }
        return res;

    }
}





