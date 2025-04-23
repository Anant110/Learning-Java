package Core_Java_Concepts.Arrays;

//Next permutation java code

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Size of array: ");
        int size=scanner.nextInt();
        arr=new int[size];

        System.out.println("Enter the array digits");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int n=arr.length;
        Next_permutation(arr,n);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void Next_permutation(int []arr,int n){
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }

        if(pivot==-1){
            for(int i=0,j=n-1;i<j;i++,j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            return;
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                int tempo=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=tempo;
                break;
            }
        }
        for(int i=pivot+1,j=n-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
