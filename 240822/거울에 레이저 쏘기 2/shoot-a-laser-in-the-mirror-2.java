import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final boolean debug = false;
        // Initialize scanner.
        final Scanner sc = new Scanner(System.in);

        // Get N, which is width and height of lattice.
        final int n = sc.nextInt();

        // Get lattice's mirror information.
        final char[][] lattice = new char[n][n];
        for (int rowIdx = 0; rowIdx < n; rowIdx++) {
            final String row = sc.next();
            for (int colIdx = 0; colIdx < n; colIdx++) {
                lattice[rowIdx][colIdx] = row.charAt(colIdx);
                if (debug) {
                    System.out.println(String.format(
                        "(row=%d, col=%d)=%s",
                        rowIdx, colIdx, lattice[rowIdx][colIdx]
                    ));
                }
            }
        }

        // X, Y coordinates.
        int currentX;
        int currentY;
        int previousX;
        int previousY;

        // Get starting coordinate.
        // Leftmost-top square is (0, 0), rightmost-bottom square is (n-1, n-1)
        final int k = sc.nextInt();
        if (k <= n) {
            currentX = k - 1;
            currentY = 0;
            previousX = currentX;
            previousY = currentY - 1;
        } else if (k <= 2 * n) {
            currentX = n - 1;
            currentY = k - n - 1;
            previousX = currentX + 1;
            previousY = currentY;
        } else if (k <= 3 * n) {
            currentX = (3 * n) - k;
            currentY = n - 1;
            previousX = currentX;
            previousY = currentY + 1;
        } else {
            currentX = 0;
            currentY = (4 * n) - k;
            previousX = currentX - 1;
            previousY = currentY;
        }

        // Travel through lattice.
        int hitCount = 0;
        while (true) {
            int changeX = currentX - previousX;
            int changeY = currentY - previousY;
            if (debug) {
                System.out.println(String.format(
                    "current=(%d, %d), previous=(%d, %d), change=(%d, %d), square=%s",
                    currentX, currentY, previousX, previousY, changeX, changeY,
                    lattice[currentY][currentX]
                ));
            }
            
            previousX = currentX;
            previousY = currentY;
            if (lattice[currentY][currentX] == '/') {
                currentX -= changeY;
                currentY -= changeX;
            } else {
                currentX += changeY;
                currentY += changeX;
            }
            hitCount++;
            if (!inRange(currentX, currentY, n)) {
                break;
            }
        }

        // Print result
        System.out.println(hitCount);
    }

    /**
     * Check if coordinate is in range of lattice.
     */
    public static boolean inRange(int xCoordinate, int yCoordinate, int n) {
        return xCoordinate >= 0 &&
                xCoordinate < n &&
                yCoordinate >= 0 &&
                yCoordinate < n;
    }
}