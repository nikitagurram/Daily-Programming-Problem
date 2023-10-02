/*
 * Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'. 
 * She is not allowed to remove pieces that are colored 'B'.
Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. 
    He is not allowed to remove pieces that are colored 'A'.
Alice and Bob cannot remove pieces from the edge of the line.
If a player cannot make a move on their turn, that player loses and the other player wins.
Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins
Input: colors = "AAABABB"
Output: true
Explanation:
AAABABB -> AABABB
Alice moves first.
She removes the second 'A' from the left since that is the only 'A' whose neighbors are both 'A'.
Now it's Bob's turn.
Bob cannot make a move on his turn since there are no 'B's whose neighbors are both 'B'.
Thus, Alice wins, so return true.

Input: colors = "AA"
Output: false
Explanation:
Alice has her turn first.
There are only two 'A's and both are on the edge of the line, so she cannot move on her turn.
Thus, Bob wins, so return false.

 */
public class remove_colored_pieces_if_both_neighbors_are_the_same_color {
    public static void main(String[] args) {
        String colors = "AAABBAB";
        int alice = 0;
        int bob = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            char ch = colors.charAt(i);
            char preCh = colors.charAt(i - 1);
            char nextCh = colors.charAt(i + 1);
            if (ch == 'A' && preCh == 'A' && nextCh == 'A')
                alice++;
            if (ch == 'B' && preCh == 'B' && nextCh == 'B')
                bob++;
        }
        if (alice > bob)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
