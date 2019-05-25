public class BubbleSort {
  public static int[] bubbleSort(int[] arr) {
    int temp = 0;
    int max_length = arr.length - 1;

    for (int j = 0; j < arr.length - 1; j++) {
      for (int i = 0; i < max_length; i++) {

        if (arr[i] > arr[i + 1]) {
          temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
      
      max_length--;
    }


    return arr;
  }
  public static void main(String[] args) {
    int num_arr[] = {10,3,2,4,6,7,1};
    int sorted_arr[] = bubbleSort(num_arr);
    for (int i = 0; i < sorted_arr.length; i++) {
      System.out.print(sorted_arr[i] + ", ");  
    }
    System.out.println();
  }
}
