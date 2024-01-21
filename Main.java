import java.util.Scanner;
// Fady Zaki SDEV200 1/20/24
public class Main {

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int[][] list1 = readArray(scanner);

        System.out.println("Enter list2: ");
        int[][] list2 = readArray(scanner);

        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false; 
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false; 
                }
            }
        }

        return true; 
    }

    public static int[][] readArray(Scanner scanner) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
