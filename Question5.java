import java.util.HashMap;
import java.util.Scanner;

public class Question5 {

  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     *
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    //System.out.print("Enter a integer: ");
    int times = in.nextInt();
    int seen = 0;
    HashMap<Integer, Integer> visited = new HashMap<>();
    for (int i = 0; i < times; i++) {
      //System.out.print("Enter a integer: ");
      int n = in.nextInt();
      if (visited.containsKey(n)) {
        visited.put(n, visited.get(n) + 1);
      } else {
        visited.put(n, 1);
      }
    }
    for (int x : visited.values()) {
      if (seen < x) {
        seen = x;
      }
    }
    System.out.print(seen);
  }
}
