public class MissingNumberFinderArray {
public static void main(String[] args) {
int[] arr = {6, 1, 4, 8, 3, 7};

    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
    }

    int[] b = new int[max + 1]; 
    for (int i = 0; i < arr.length; i++) {
        b[arr[i]] = 1;
    }

    System.out.println("Bilangan yang hilang:");
    for (int i = min; i <= max; i++) {
        if (b[i] == 0) {
            System.out.println(i); 
        }
    }
}
}
