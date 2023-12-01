package Day64;

/**
 * count_items_matching_rule
 * You are given an array items, where each items[i] = [typei, colori, namei]
 * describes the type, color, and name of the ith item. You are also given a
 * rule represented by two strings, ruleKey and ruleValue.
 * The ith item is said to match the rule if one of the following is true:
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 * Example 1:
 * Input: items =
 * [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
 * ruleKey = "color", ruleValue = "silver"
 * Output: 1
 * Explanation: There is only one item matching the given rule, which is
 * ["computer","silver","lenovo"].
 * Example 2:
 * Input: items =
 * [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
 * ruleKey = "type", ruleValue = "phone"
 * Output: 2
 * Explanation: There are only two items matching the given rule, which are
 * ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item
 * ["computer","silver","phone"] does not match.
 * 
 */
public class count_items_matching_rule {
    public static void main(String[] args) {
        int key;
        String ruleKey = "color";
        String ruleValue = "silver";
        String items[][] = { { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };
        if (ruleKey.equals("type"))
            key = 0;
        else if (ruleKey.equals("color"))
            key = 1;
        else
            key = 2;
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i][key].equals(ruleValue))
                count++;
        }
        System.out.println(count);
    }

}