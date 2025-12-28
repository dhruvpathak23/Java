package Recursion.arrays;

// the target element is 18 and the array is [3,2,1,18,45]
public class linearSearch{
    static boolean search(int[]arr,int index,int target){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,index+1,target);
    }
    public static void main(String[]args){
        int []arr = {3,2,1,18,45};
        int target = 18;
        System.out.println(search(arr, 0, target));
    }
}

