import java.util.Arrays;
class  Bubblesort{

    public static void main(String arg[])
    {
        int arr[]=new int[]{2,3,5,7,8,9,5};

        

        System.out.print(Arrays.toString(Bsort(arr)));

    }

    static int[] Bsort(int []arr)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<(arr.length-1)-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }
}