import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class rotateArray {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");
    
    int[] wow = {1,2,3,4,5,6,7};
    
    for (int i : rotate(wow, 3)) {
      System.out.println(i);
    }
  }
  
  public static int[] rotate(int[] arr,int k){
    int[] res=new int[arr.length];
    int j=0;
    for(int i=arr.length-k; i<arr.length;i++){
      res[j]=arr[i];
      j++;
    }  
      for(int i=0;i<arr.length-k;i++){
        res[j]=arr[i];
        j++;
    }
     return res; 
  }
}
