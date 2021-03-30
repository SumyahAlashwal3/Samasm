/**
 * Created by sumyah on 2/26/2021.
 */
public class task4_marge {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        int marge[]=new int[arr1.length+arr2.length];
        int c=0;

        for (int i = 0; i < arr1.length; i++) {
            marge[i]=arr1[i];
            c++;
        }
        for (int j = 0; j <arr2.length ; j++) {
            marge[c++]=arr2[j];
        }
        for (int i = 0; i < marge.length; i++) {
            System.out.print(marge[i]+" ");

        }
    }
}
