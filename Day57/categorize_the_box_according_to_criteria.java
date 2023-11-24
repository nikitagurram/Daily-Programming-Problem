package Day57;

/*Given four integers length, width, height, and mass, representing the dimensions and mass of a box, respectively, return a string representing the category of the box.
The box is "Bulky" if:
Any of the dimensions of the box is greater or equal to 104.
Or, the volume of the box is greater or equal to 109.
If the mass of the box is greater or equal to 100, it is "Heavy".
If the box is both "Bulky" and "Heavy", then its category is "Both".
If the box is neither "Bulky" nor "Heavy", then its category is "Neither".
If the box is "Bulky" but not "Heavy", then its category is "Bulky".
If the box is "Heavy" but not "Bulky", then its category is "Heavy".
Note that the volume of the box is the product of its length, width and height.
Input: length = 1000, width = 35, height = 700, mass = 300
Output: "Heavy"
Explanation: 
None of the dimensions of the box is greater or equal to 104. 
Its volume = 24500000 <= 109. So it cannot be categorized as "Bulky".
However mass >= 100, so the box is "Heavy".
Since the box is not "Bulky" but "Heavy", we return "Heavy".
 */
public class categorize_the_box_according_to_criteria {
    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean heavy = false;
        boolean bulky = false;
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            bulky = true;
        } else if ((long) length * width * height >= Math.pow(10, 9))
            bulky = true;
        if (mass >= 100)
            heavy = true;
        if (bulky && heavy)
            return "Both";
        else if (bulky == true)
            return "Bulky";
        else if (heavy == true)
            return "Heavy";
        else
            return "Neither";
    }

    public static void main(String[] args) {
        int l = 20;
        int w = 2000;
        int h = 2390;
        int mass = 200;
        System.out.println(categorizeBox(l, w, h, mass));
    }
}
