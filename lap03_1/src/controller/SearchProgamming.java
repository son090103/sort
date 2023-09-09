/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.*;
import java.util.Scanner;
import model.Element;
import view.Menu;

/**
 *
 * @author son
 */
public class SearchProgamming extends Menu{
   
    search s = new search();
    Library l = new Library();
    Element e = new Element();
        public SearchProgamming(String title, String s[], Element element) {
        super(title, s);
        this.e = element;
    }

    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:{
                Scanner sc = new Scanner(System.in);
                int size_array= e.getSize_array();
                 int[] array = e.getArray();
                l.display(array);
                int k = sc.nextInt();
                System.out.println("want to find "+ k +":"+s.linearsearch(array, k));
                break;
            }
            case 2:
                {
                      int size_array = e.getSize_array();
                int[] array = e.getArray();
                l.display(array);
                System.out.println("Mang sau khi sap xep la: ");
                s.buddleSort(array);
                l.display(array);
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value you want to find: ");
                int value = sc.nextInt();
                  System.out.println("Value " + value + " found at index: " + s.binarysearch(array, value, 0, array.length));
                  break;
                  }
                
            default:
                throw new AssertionError();
        }
    }
    
    
}
