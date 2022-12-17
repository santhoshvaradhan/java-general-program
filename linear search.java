// linear search using arraylist
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    // requirement of variables
        int i,key,found=0;
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
        //key is element which we going to find in arraylist
        System.out.println("Enter the finding value :");
        key=in.nextInt();
        for(int j : array)
        {
            if(j==key)
            {
                System.out.println("Element successfully founded");
                found=1;
                break;
            }
        }
        if(found==0)
        {
            System.out.println("Element not successfully founded");
        }
     }
}
