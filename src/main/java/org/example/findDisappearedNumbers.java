package org.example;

import java.util.*;

public class findDisappearedNumbers {
    public static void callfindDisappearedNumbers() {
        Scanner sc = new Scanner(System.in);
        int arrsize;
        System.out.println("Enter the size of the array: ");
        arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arrsize; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing numbers are : "+ Arrays.toString(findDisappearedNumbers(arr)));
    }
    public static int[] findDisappearedNumbers(int[] arr) {
        Set<Integer> hashSet= new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        //Adding nums to hashmap
        for(int i : arr)
        {
            hashSet.add(i);
        }
        //Iterating through [1,n] to check if it does not contain
        for(int i = 1; i <= arr.length; i++)
        {
            if(!(hashSet.contains(i)))
            {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
