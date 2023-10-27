public class reverseString {
    public static void main(String[] args) {

        String str = "Geeks";
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }
        System.out.println(revStr);
    }
}
