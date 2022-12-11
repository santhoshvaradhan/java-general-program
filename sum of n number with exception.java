// custom execption handling;
//program for sum of n numbers;
import java.lang.*;
import java.util.*;
class Exceptionclass extends Exception 
{
    String errorvar;
    Exceptionclass(String errvar)
    {
        errorvar=errvar;
    }
    void errordisplay()
    {
        System.out.println("something is wrong on code please enter proper vlaue and execute it .....");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value:");
        int value=in.nextInt();
        try{
            if(((Object)value).getClass().getSimpleName()=="Integer")
            {
            int Sum=0;
        for(int i=0;i<value;i++)
        {
            Sum=Sum+i;
        }
        System.out.println("process completed successfully without fail");
        }
        else{
            throw new Exceptionclass("enter the Integer value:error: "+value);
        }
        }
        catch(Exceptionclass errorobj)
        {
            System.out.println(errorobj.errorvar);
        }
        finally
        {
            System.out.println("process is executed");
        }
    }
}
