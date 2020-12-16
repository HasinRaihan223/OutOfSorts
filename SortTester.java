import java.util.Arrays;

public class SortTester {

  public static void main(String[]args) {
    int[] x = {5,1,12,-5,16};
    Sorts.bubbleSort(x);
    System.out.println(Arrays.toString(x));

    int[] y = {2,3,4,5,1};
    Sorts.bubbleSort(y);
    System.out.println(Arrays.toString(y));

    int[] z = {6,1,2,3,4,5};
    Sorts.bubbleSort(z);
    System.out.println(Arrays.toString(z));

    int[] a = {2,1};
    Sorts.bubbleSort(a);
    System.out.println(Arrays.toString(a));

    int[] b = {};
    Sorts.bubbleSort(b);
    System.out.println(Arrays.toString(b));

    int[] c = {1};
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));


  }

}
