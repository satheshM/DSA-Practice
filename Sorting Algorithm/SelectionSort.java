import java.util.Arrays;
class SelectionSort{

    public static void main(String arg[])
    {

        int arr[]=new int []{5,4,3,2,1,0};

        System.out.print(Arrays.toString(selectionSort(arr)));
    }
    static int [] selectionSort(int []arr)
    {

            
            
        for(int i=0;i<arr.length;i++)
        {   
            int maxIndex=0;
            for(int j=1;j<arr.length-i;j++)
            {
               

              if(arr[j]>arr[maxIndex])
              {
                
                maxIndex =j;
                

            }
        }
        swap( arr,maxIndex,(arr.length-1)-i);
       

        

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