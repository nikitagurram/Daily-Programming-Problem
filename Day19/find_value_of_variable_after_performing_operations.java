package Day19;

public class find_value_of_variable_after_performing_operations {
    public static void main(String[] args) {
        int x = 0;
        String operations[] = { "--X", "++X", "X++" };
        for (String i : operations) {
            if (i.equals("--X") || i.equals("X--")) {
                x = x - 1;
            }
            if (i.equals("X++") || i.equals("++X"))
                x = x + 1;
        }
        System.out.println(x);
    }
}
