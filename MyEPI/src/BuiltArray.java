import java.util.Scanner;

public class BuiltArray {

  public static int[] buildArray(int[] A) {  // building new array
    int tmp = multiply(A);
    for (int k = 0; k < A.length; k++) {
      A[k] = tmp / A[k];
    }
    return A;

  }

  // Calculate multiplication of array elements

  public static int multiply(int[] A) {
    int mult = 1;
    int st = 0;
    while (st < A.length) {
      mult *= A[st];
      st++;
    }
    return mult;
  }

  // Input from user

  public static void main(String[] args) {

    BuiltArray o = new BuiltArray();
    Scanner s = new Scanner(System.in);

    System.out.println("Enter array size");
    int size = s.nextInt();
    int[] A = new int[size];
    System.out.println("Enter array elements");
    for (int i = 0; i < size; i++) {
      A[i] = s.nextInt();
    }

    System.out.println("Given Array is ");
    for (int i = 0; i < size; i++) {
      System.out.println(A[i]);
    }

    //o.buildArray(A);
    System.out.println("New Array is ");
    for (int n : buildArray(A)) {
      System.out.println(n);
    }


  }

}
