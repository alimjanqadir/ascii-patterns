/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package patterns;

public class App {
    public void generateHalfPyramid(int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void generatePyramid(int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void generateSquare(int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void generateVerticalOrderedSquare(int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.printf(" %d", i + 1);
            }
            System.out.println();
        }
    }

    public void generateHorizontalOrderedSquare(int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.printf(" %d", j + 1);
            }
            System.out.println();
        }
    }

    public void generateCharSquare(int base) {
        for (int i = 0; i < base; i++) {
            for (char c = 'A'; c < 'A' + base; c++) {
                System.out.printf(" %c", c);
            }
            System.out.println();
        }
    }

    public void generateCharSquareOrderedHorizontally(int base) {
        generateCharSquare(base);
    }

    public void generateCharSquareOrderedVertically(int base) {
        for (char c = 'A'; c < 'A' + base; c++) {
            for (int i = 0; i < base; i++) {
                System.out.printf(" %c", c);
            }
            System.out.println();
        }
    }

    public void generateCharSquareReversedHorizontally(int base) {
        for (int i = 0; i < base; i++) {
            char start = (char) ('A' + base - 1);
            for (char c = start; c >= 'A'; c--) {
                System.out.printf(" %c", c);
            }
            System.out.println();
        }
    }

    public void generateCharSquareReversedVertically(int base) {
        char start = (char) ('A' + base - 1);
        for (char c = start; c >= 'A'; c--) {
            for (int i = 0; i < base; i++) {
                System.out.printf(" %c", c);
            }
            System.out.println();
        }
    }

    public void generateNumericSquareWithEnumerationStartWithOne(int base) {
        int increment = 0;
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.printf(" %2d", (j + 1) + (increment * base));
            }
            increment += 1;
            System.out.println();
        }
    }

    public void generateNumericSquareWithEnumerationStartWithOne(int base, int step) {
        int increment = 0;
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.printf(" %2d", increment + 1);
                increment += step;
            }
            System.out.println();
        }

    }

    public void generateNumericSquareWithEnumerationStartWithStepValue(int base, int step) {
        int increment = 2;
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.printf(" %2d", increment);
                increment += step;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        App app = new App();
        app.generateNumericSquareWithEnumerationStartWithStepValue(5, 2);
    }
}
