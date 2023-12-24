package Day87;

public class minimum_change_to_make_alternating_binary_string {
    public static void main(String[] args) {
        int zero = 0;
        int one = 0;
        String s = "1000";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0')
                    one++;
                else
                    zero++;
            } else {
                if (s.charAt(i) == '1')
                    one++;
                else
                    zero++;
            }
        }
        System.out.println(Math.min(zero, one));
    }
}
