package Classes;

import java.util.HashMap;
import java.util.Map;

public class fiboNacci {
    public static int fibMemo(int n, Map<Integer, Integer> map) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int fibValue = fibMemo(n - 1, map) + fibMemo(n - 2, map);
            map.put(n, fibValue);
            return fibValue;
        }
    }
}
