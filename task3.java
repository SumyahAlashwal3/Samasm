import java.util.Arrays;
import java.util.Random;

/**
 * Created by admin on 31/03/2021.
 */

    public class task3 {
        int a[]={10,11,12,13,14};
        public void remove(int []arr,int index )
        {
            if(index>=0&&index<arr.length)
            {
                int i=index;
                while (i<arr.length-1)
                {
                    arr[i]=arr[i+1];
                    i++;
                }
                arr[i]=0;
            }
        }
        public int seqSearch(int []a,int element)
        {
            boolean flag=false;
            int i=0;
            int index=-1;
            while (i<a.length&&!flag){
                if(a[i]==element){
                    flag=true;
                    index=i;
                }
                i++;
            }return index;
        }
        public void insertionSort(int arr[])
        {
            for (int i = 0; i <arr.length ; i++) {
                int curr=arr[i];
                int j=i;
                while (j>0&&curr<arr[j-1]){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=curr;
            }
        }
        public void fillRandom(int arr[])
        {
            Random r=new Random();
            r.setSeed(System.currentTimeMillis());
            for (int i = 0; i <arr.length; i++) {
                a[i]=r.nextInt(101);
            }
        }

        public static void main(String[] args) {
            task3 s=new task3();
            System.out.println(Arrays.toString(s.a));
            s.fillRandom(s.a);
            // s.insertionSort(s.a);
            // s.remove(s.a,2);
            System.out.println(Arrays.toString(s.a));
            //  System.out.println(o.seqSearch(s.a,191));
        }
    }
}

}
