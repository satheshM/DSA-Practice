import java.util.Arrays;
class CyclicSort{

    public static void main(String arg[])
    {

        int arr[]=new int []{3,1,2};

        System.out.print(Arrays.toString(cyclicSort(arr)));
    }
    static int [] cyclicSort(int []arr)
    {

            
            
        for(int i=0;i<arr.length;i++)
        {   
            while(arr[i]!=i+1)
            swap( arr,i,arr[i]-1);
        }
        
    return arr;
    }
    
    
    static void swap(int []arr,int a,int b)
{
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}
}



