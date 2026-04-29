package week26;

import java.util.*;

public class recursion 
{
    public static void main(String[]args)
    {
        int fact = factorial(5);
        System.out.println("Factorial: "+fact);
        
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        int search = linearSearch(arr, 5);
        System.out.println("Found at index: " + search );
    }
    
    
    public static int factorial(int num)
    {
        //base case
        
        if(num == 0 || num == 1)
        {
            return 1;
        }
        
        return num*factorial(num-1);
    }
    
    
    public static int linearSearch(int[] arr, int target)
    {
        if(arr == null || arr.length == 0)
        {
            return -1;
        }
        
        for (int i =0; i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    public static int linearSearch(int[] arr, int target, int left, int right)
    {
        Arrays.sort(arr);
        
        
        while(left <= right)
        {
            int mid = (left+right)/2;
            
            if(arr[mid] == target)
            {
                return mid;
            }
            
            else if(arr[mid] < target)
            {
                left = mid-1;
            }
            else
            {
                right = mid-1;
            }
        }
        
        return -1;
    }
    
    
    public static int recursiveBinarySearch(int[] arr, int target, int left, int right)
    {
        //base case
        
        if(left > right)
        {
            return -1;
        }
        
        int mid = (left+right)/2; 
        
        if(arr[mid] == target)
        {
            return mid;
        }
        
        else if(arr[mid] < target)
        {
            return recursiveBinarySearch(arr, target, mid+1,right);

        }
        
        else{ return recursiveBinarySearch(arr, target, left,mid-1);}
    }
    
}