import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    // O(N)
    public static int solve(ArrayList<Integer> seats){
        int solution = 0;
        final int DESKS = seats.remove(0);

        HashMap<Integer, Boolean> occupied = new HashMap<>();
        // Add all seats and label it with true/false based on occupation.
        for(int i = 1; i <= DESKS; i++)
            occupied.put(i, !seats.contains(i));

        for(int i = 1; i <= DESKS; i++)
        {
            // Checks if there's a seat below me.
            if (occupied.containsKey(i + 2))
                if(occupied.get(i) & occupied.get(i + 2)) solution++;

            // Check if the current seat is on left.
            if (i % 2 == 1)
                if (occupied.get(i) & occupied.get(i + 1)) solution++;
        }

        return solution;
    }
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(12, 2, 6, 7, 11))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(8, 1, 8))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(4, 1))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(6, 4))));
    }
}
