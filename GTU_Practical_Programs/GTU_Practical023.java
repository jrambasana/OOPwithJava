package GTU_Practical_Programs;

/*
* Program - 23
* Write a generic method that returns the minimum 
* elements in a two-dimensional array.
*/

import java.util.*;

public class GTU_Practical023
{
 public static void main(String[] args) 
 {
    Integer[][] list = new Integer[10][10];
    int value = 0;
    for (int i = 0; i < list.length; i++) 
    {
        for (int j = 0; j < list[i].length; j++) 
        {
                list[i][j] = ++value;
        }
    }
    System.out.println("Min Integer = " + min(list));

    double dvalue = 0.0;
    Double[][] dlist = new Double[10][10];
    for (int i = 0; i < dlist.length; i++) 
    {
        for (int j = 0; j < dlist[i].length; j++) 
        {
                dlist[i][j] = ++dvalue;
        }
    }
    System.out.println("Min Double = " + min(dlist));
 }

 public static <E extends Comparable<E>> E min(E[][] list) 
 {
    E min = list[0][0];
    for (E[] elements : list) 
    {
        for (E element : elements) 
        {
            if (element.compareTo(min) < 0)
            {
                min = element;
            }
        }
    }
    return min;
 }
}