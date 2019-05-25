import java.util.*; 
public class SimpleSearch { 
    public static int findNum(int arr[], int n) 
    { 
        if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int i = 0; 
        while (i < len) { 
            if (arr[i] == n) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
    public static void main(String[] args) 
    { 
        int[] array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
        if(findNum(array,3) == -1){
            System.out.println("The number does not exist in this array.");
        }else{
            System.out.println("Index position is: "+findNum(array,3));
        }
    } 
} 