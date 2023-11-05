package Day38;

/*Given an integer array arr of distinct integers and an integer k.
A game will be played between the first two elements of the array (i.e. arr[0] and arr[1]). In each round of the game, we compare arr[0] with arr[1], the larger integer wins and remains at position 0, and the smaller integer moves to the end of the array. The game ends when an integer wins k consecutive rounds.
Return the integer which will win the game.
It is guaranteed that there will be a winner of the game.
Input: arr = [2,1,3,5,4,6,7], k = 2
Output: 5
Explanation: Let's see the rounds of the game:
Round |       arr       | winner | win_count
  1   | [2,1,3,5,4,6,7] | 2      | 1
  2   | [2,3,5,4,6,7,1] | 3      | 1
  3   | [3,5,4,6,7,1,2] | 5      | 1
  4   | [5,4,6,7,1,2,3] | 5      | 2
So we can see that 4 rounds will be played and 5 is the winner because it wins 2 consecutive games. */
public class find_the_winner_of_array_game {
    static int getWinner(int[] arr, int k) {
        if (k == 1) {
            return Math.max(arr[0], arr[1]);
        }
        int current_winner = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (current_winner > arr[i])
                count++;
            else {
                current_winner = arr[i];
                count = 1;
            }
            if (count == k) {
                return current_winner;
            }
        }
        return current_winner;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4, 6, 7 };
        int k = 2;
        System.out.println(getWinner(arr, k));
    }
}
