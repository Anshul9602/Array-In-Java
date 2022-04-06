

import java.util.Scanner;

public class arraymethods {
    public static void main(String[] args) {
        // array element sum and average
        {
            float add[] ={10.5f,15.6f,46.5f};
            float sum = 0;
            for (float element : add) {
                sum = sum + element;

            }
           // System.out.println("the value is :" + sum);
            float present = sum / add.length;
           // System.out.println(present);
        
              Scanner sc = new Scanner(System.in);
             float num = sc.nextFloat();
              boolean isInArray  = false;
              for (float element:add){
              if (num==element){
                isInArray = true;
                break;   // if prsent in array then loop break
                     }
                }
        
             if (isInArray){
            System.out.println("in this array");
             }
            else {
            System.out.println("not in prsent in array");
            } 
        }    



               // two array addition


        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {12, 13, 14}};
        int result[][] = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]  + " ");
            }
            System.out.println(" ");
        }
       
        // revers element in array


        int arr[]= {10,1,3,13,15};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i=0;i<n; i++){
            // swap a[i] and a[l-1-i]
            // creation an temp store prevaious value
            temp =arr[i];
            arr[i] =arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element: arr){
            System.out.print(element +" ");
        }
    }
}

