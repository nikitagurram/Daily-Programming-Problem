/*Input: hours = [0,1,2,3,4], target = 2
Output: 3
Explanation: The company wants each employee to work for at least 2 hours.
- Employee 0 worked for 0 hours and didn't meet the target.
- Employee 1 worked for 1 hours and didn't meet the target.
- Employee 2 worked for 2 hours and met the target.
- Employee 3 worked for 3 hours and met the target.
- Employee 4 worked for 4 hours and met the target.
There are 3 employees who met the target. */
public class number_of_employees_who_met_the_target {
    public static void main(String[] args) {
        int hours[] = { 1, 4, 2, 5, 0 };
        int target = 2;
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target)
                count++;
        }
        System.out.println(count);
    }
}
