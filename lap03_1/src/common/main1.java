/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import controller.SearchProgamming;
import model.Element;

/**
 *
 * @author son
 */
public class main1 {
    public static void main(String[] args) {
//         Library library = new Library();
//        Element element = new Element();
//        
//        //1. Enter a possitive number
////         element.setSize_array(library.getInt("Enter number of array", 1, 100));
//        int size = library.getInt("Enter the number of elements in the array", 1, 100);
//        element.setSize_array(size);
//        int[] array=  library.createArray(size);
//     String title = " Menu";
//     String s[]=  new String[]{"linear search", "binary search","exit"};
//     SearchProgamming p = new SearchProgamming(title, s);
//     p.run();
     
Library library = new Library();
    Element element = new Element();

    int size = library.getInt("Enter the number of elements in the array", 1, 100);
    element.setSize_array(size);

    int[] array = library.createArray(size);
    element.setArray(array);

    String title = "Menu";
    String s[] = new String[]{"linear search", "binary search", "exit"};
    SearchProgamming p = new SearchProgamming(title, s, element);
    p.run();
    }
}
