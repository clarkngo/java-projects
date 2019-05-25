public class MergeSort {
  public static int[] mergeSort(int[] array) {
    mergeSort(array,0,array.length-1);
    return array;
  }
  public static void mergeSort(int[] array,int left, int right)
  {
    if(left>=right){
      return;
    }
    int mid = left + (right-left)/2;
    mergeSort(array,left,mid);
    mergeSort(array,mid+1,right);
    merge(array,left,mid,right);
  }
  private static void merge(int[] array,int left,int mid,int right)
  {
    int[] helper = new int[array.length];
    for(int i=left;i<=right;i++)
    {
      helper[i]=array[i];
    }
    int lIndex = left;
    int rIndex = mid+1;
    while(lIndex <= mid && rIndex <= right){
      if(helper[lIndex]<=helper[rIndex]){
        array[left++] = helper[lIndex++];
      }
      else{
        array[left++]=helper[rIndex++];
      }
    }
    while(lIndex<=mid){
      array[left++] = helper[lIndex++];
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
      mergeSort(array);
      printArray(array);
  } 
}
