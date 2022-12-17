// Binary search using arraylist
import java.util.*;
// collection is package which contain sort function;
import java.util.Collections.*;
class HelloWorld {
    public static void main(String[] args) {
    // requirement of variables
        int i,key,found=0,low,high,mid;
        System.out.println("Enter the number of elements:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        // array declaration 
        ArrayList <Integer> array=new ArrayList<Integer>();
        // getting elements from user
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element"+(i+1)+":");
            int arr=in.nextInt();
            array.add(arr);
        }
        // elements are sorting
        Collections.sort(array);
        //key is element which we going to find in arraylist
        System.out.println("Enter the finding value :");
        key=in.nextInt();
        low=0;
        high=n-1;
        while(high>low)
        {
            mid=(low+high)/2;
            if(array.get(mid)==key)
            {
                System.out.println("Element is successfully founded");
                found=1;
                break;
            }
            else if(array.get(mid)>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(found==0)
        {
            System.out.println("Element not successfully founded");
        }
       }
}
