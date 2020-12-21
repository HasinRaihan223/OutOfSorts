public class Sorts{

  public static void bubbleSort(int[] data){
    int len = data.length;
    for (int i = 0; i < len-1; i++){
      for (int j = 0; j < len-i-1; j++)
        if (data[j] > data[j+1]) {
            int temp = data[j];
            data[j] = data[j+1];
            data[j+1] = temp;
        }
      }
  }

  public static void selectionSort(int[] data){
    int len = data.length;
    for (int i = 0; i < len-1; i++){
      for (int j = i+1; j < len; j++){
        int current = i;
        if (data[j] < data[current]){
          current = j;
        }
        int temp = data[current];
        data[current] = data[i];
        data[i] = temp;
      }
    }
  }

  public static void insertionSort(int[] data){
    int len = data.length;
    for (int i = 0; i < len; i++){
      int current = data[i];
      int j = i-1;
      while ( j >= 0 && current < data[j]){
        data[j+1] = data[j];
        j -= 1;
      }
      data[j + 1] = current;
    }
  }

}
