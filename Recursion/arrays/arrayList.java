package Recursion.arrays;
import java.util.ArrayList;
// the return type should be in arraylist form 
// the target element is 4 and the array is [1,3,4,5,4,67,8,87,4] 
// return all the indices where the target element is found
public class arrayList {
    static ArrayList <Integer> solution (int[]arr,int target,int index,ArrayList <Integer>list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return solution(arr,target,index+1,list);
    }
    public static void main(String[]args){
        int[] arr = {1,3,4,5,4,67,8,87,4};
        int target = 4;
        System.out.println(solution(arr, target, 0, new ArrayList<>()));
    }
}