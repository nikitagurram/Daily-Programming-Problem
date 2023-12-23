package Day86;

import java.util.HashSet;
import java.util.Set;

public class path_crossing {
    public static void main(String[] args) {
        String s = "NESWW";
        System.out.println(isPathCrossing(s));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> res = new HashSet<>();
        int x = 0, y = 0;
        res.add("0-0");
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                x = x + 0;
                y = y + 1;
            } else if (path.charAt(i) == 'S') {
                x += 0;
                y -= 1;
            } else if (path.charAt(i) == 'E') {
                x += 1;
                y += 0;
            } else if (path.charAt(i) == 'W') {
                x -= 1;
                y += 0;
            }
            String pair = String.valueOf(x) + "-" + String.valueOf(y);
            if (res.contains(pair)) {
                return true;
            }
            res.add(pair);
        }
        return false;
    }
}
