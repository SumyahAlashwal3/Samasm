import java.util.Scanner;

/**
 * Created by sumyah on 2/26/2021.
 */
public class task4_reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=input.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=input.nextInt();
        }


        int start=0;
        int end=n-1;

        while (start<end) {
           int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for (int j = 0; j <n ; j++) {
            System.out.print(arr[j]+" ");

        }
    }
}
