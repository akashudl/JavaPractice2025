package ProblemSolvingUsignloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {


        int[] arr = {1,2,6,5,3};
//        System.out.println(facingSunBuildingCount(arr));
//            LeadersInarray(arr);
        ClimbMountain(arr);
    }

    private static boolean  ClimbMountain(int[] arr) {
        int climb=0;
        while(climb<arr.length-1&&arr[climb]<arr[climb+1])
            climb+=1;
        if (climb==0||climb==arr.length-1)
            return false;
        while(climb<arr.length-1&&arr[climb]>arr[climb+1])
            climb+=1;

        if(climb==arr.length-1)
            return true;
        else
            return false;
    }


    //    How can we modify the above solutions to store the output in a stable order or in the same order as they are present in the input?
//    How can we modify the above code to handle the scenario of duplicate elements?
//    Can we think of solving this problem using recursion? If yes, what would be the time and space complexity?
//    Can we think of solving this problem using a stack? If yes, what would be the time and space complexity?
    private static void LeadersInarray(int[] arr) {   // Took 20 mins to solve l  -> slow
        boolean flag=false;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]<=arr[j]){
                 flag=true;
                 break;
             }
         }
         if(flag==false){
             al.add(arr[i]);
         }else {
             flag=false;
         }
        }
        al.forEach(item -> System.out.print(item+" "));
    }


    public static int  facingSunBuildingCount(int arr[]){
        int count=1;
        if(arr.length<=1){
            return 1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                count++;
            }
        }
        return  count;
    }
}


