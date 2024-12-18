

public class BinarySearch {

    


    public static void main(String arg[])
    {

        int arr[]=new int[] {1,3,4,2,6,7,5,9,8,10};

        int target=2;

        int index=BinarySearch(arr,target);      
        
        System.out.println("Target index("+target+"): "+index);

        
    }
    public static int BinarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start/2);

            if(arr[mid]== target)
            {
                return mid;
            }
            if(arr[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }

        return -1;
    }
}