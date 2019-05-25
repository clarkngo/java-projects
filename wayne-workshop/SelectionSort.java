public class SelectionSort {
  public static void ssort(int[] array) {
    int n = array.length;
    for(int i = 0;i<n;i++)
    {
      int min = i;
      for(int j =i+1;j<n;j++)
      {
        if(array[j]<array[min])
        {
          min = j;
        }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
  }
  public static void printArray(int arr[]) 
  { 
      int n = arr.length; 
      for (int i=0; i<n; ++i) 
          System.out.print(arr[i]+" "); 
      System.out.println(); 
  } 
  public static void main(String[] args) 
  { 
      int[] array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
      ssort(array);
      printArray(array);
  } 
}
