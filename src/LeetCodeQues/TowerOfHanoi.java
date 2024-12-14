package LeetCodeQues;

public class TowerOfHanoi {

    // Recursive function to solve the Tower of Hanoi problem
    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: If there's only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }

        // Step 1: Move n-1 disks from 'fromRod' to 'auxRod' using 'toRod' as auxiliary
        solveHanoi(n - 1, fromRod, auxRod, toRod);

        // Step 2: Move the nth (largest) disk from 'fromRod' to 'toRod'
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);

        // Step 3: Move the n-1 disks from 'auxRod' to 'toRod' using 'fromRod' as auxiliary
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // Number of disks
        solveHanoi(numberOfDisks, 'A', 'C', 'B'); // A, B, and C are the rod names
    }
}
