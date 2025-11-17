/* Write a program to sort strings in alphabetical order. */



import java.io.*;

public class SortStrings {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter number of strings: ");
        int n = Integer.parseInt(br.readLine());

        String arr[] = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        // Simple bubble sort (JDK 1.3 compatible)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

