package Student_Programs;

//Given an array of integers, find the one that appears an odd number of times.
//There will always be only one integer that appears an odd number of times.

import java.util.Scanner;
class Harshit01{
public static void main(String[] args) {
    int[] arr = {0,0,0,0,0};
    int[] count = {0,0,0,0,0};
    Scanner sc = new Scanner(System.in);
    for (int i=0;i<5;i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i < 5 ; i++) {
        for (int j = 0; j < 5 ; j++) {
            if (arr[i] == arr[j])
                count[i]++;
        }
    }
    for (int x = 0 ; x < 5 ; x++) 
    {
        if(count[x]%2 != 0)
            System.out.println(arr[x] + " appears " + count[x] + " times.");
    }
    }
}

