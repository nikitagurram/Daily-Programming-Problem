public class reverseString {
    public static void main(String[] args) {
        String str = "Geeks";
        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        // String revStr = "";
        // for (int i = 0; i < str.length(); i++) {
        // revStr = str.charAt(i) + revStr;
        // }
        System.out.println(revstr.toString());
    }
}
