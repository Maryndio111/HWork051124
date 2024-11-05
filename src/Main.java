import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List strings = new ArrayList<>("muu", "bee", "kukarerku", "kwa", "myau", "gav");


        Map<String, Integer> countMap = new HashMap<>();
        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            Map<String, Boolean> resultMap = new HashMap<>();
            for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                Boolean put = resultMap.put(entry.getKey(), entry.getValue());
                System.out.println(resultMap);

            }


        }
    }
}