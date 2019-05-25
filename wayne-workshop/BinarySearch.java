class BinarySearch { 
  public static int bSearch(int arr[], int l, int r, int x) 
  { 
      if (r >= l) { 
          int mid = l + (r - l) / 2; 

          if (arr[mid] == x) 
              return mid; 

          if (arr[mid] > x) 
              return bSearch(arr, l, mid - 1, x); 

          return bSearch(arr, mid + 1, r, x); 
      } 

      return -1; 
  } 

  public static void main(String[] args) 
  { 
      int arr[] = { 2, 3, 4, 10, 40 }; 
      int l = arr.length; 
      int x = 10; 
      if (bSearch(arr, 0, l-1, x ) == -1) 
          System.out.println("This number does not exist"); 
      else
          System.out.println("Index position is: " + bSearch(arr, 0, l-1, x)); 
  } 
} 
