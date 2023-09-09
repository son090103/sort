/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author son
 */
public class search {
    
     public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
   public int linearsearch(int[] array, int k){
       for(int i=0;i<array.length;i++){
           if(array[i]==k)
               return i;
       }
       return -1;
       // nếu không tìm thấy 
   }
   public int binarysearch(int[] array, int value, int l, int r){
       
       int mid=(r+l)/2;
       if(l>r) return -1;
       if(array[mid]==value){
           return mid;
       }
       else if(array[mid]>value)
           return binarysearch(array, value, l, mid);
       
           return binarysearch(array, value, mid, r);
   }
}
