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
        for (int i = 1; i <= base; i++) {
            for (int j = 0; j < base; j++) {
                System.out.printf(" %d", i);
            }
            System.out.println();
        }
    }

    public void generateHorizontalOrderedSquare(int base) {
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= base; j++) {
                System.out.printf(" %d", j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        App app = new App();
    }
}
