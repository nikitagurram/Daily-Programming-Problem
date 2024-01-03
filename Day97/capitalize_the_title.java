package Day97;

public class capitalize_the_title {
    public static void main(String[] args) {
        String title = "capiTalize THe stRing";
        String str[] = title.split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
            if (str[i].length() > 2) {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            res.append(str[i]).append(" ");
        }
        System.out.println(res.toString().trim());
    }
}
