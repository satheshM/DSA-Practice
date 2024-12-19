
import java.util.Arrays;
class  Insertionsort{

    public static void main(String arg[])
    {
        int arr[]=new int[]{2,3,5,7,8,9,5};

        

        System.out.print(Arrays.toString(Isort(arr)));

    }

    static int[] Isort(int []arr)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]>arr[j-1])
                break;
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        return arr;
    }
}