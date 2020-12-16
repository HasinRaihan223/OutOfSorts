public class Sorts{

  public static void bubbleSort(int[] data){
    int l = data.length;
    for (int i = 0; i < l-1; i++){
      for (int j = 0; j < l-i-1; j++)
        if (data[j] > data[j+1]) {
            int temp = data[j];
            data[j] = data[j+1];
            data[j+1] = temp;
        }
      }
  }

}
