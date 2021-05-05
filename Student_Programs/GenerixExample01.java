package Student_Programs;

import java.util.*;

public class GenerixExample01
{
 public static void main(String[] args) 
 {
    Integer[] list = new Integer[10];
    int value = 0;
    for (int i = 0; i < list.length; i++) 
    {
        list[i] = ++value;
    }
    printInts(list);

    double dvalue = 0.0;
    Double[] dlist = new Double[10];
    for (int i = 0; i < dlist.length; i++) 
    {
        dlist[i] = ++dvalue;
    }
    print(dlist);
 }
 public static void printInts(Integer[] list) 
 {
    for(Integer item:list)
    {
        System.out.print(item + " ");
    }
    System.out.println("");
 }

 public static <E extends Comparable<E>> void print(E[] list) 
 {
    for(E item:list)
    {
        System.out.print(item + " ");
    }
    System.out.print("");
 }
}
