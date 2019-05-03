
package fekrebekr;

import java.util.Random;
import java.util.Scanner;

public class Fekrebekr {
    public static int[] arr=new int[5];
    public static int[] inputarr=new int[5];
    public static int[] compare={3,3,3,3,3};

    

    public static void Random()
    {
        int counter=0;
        Random fb=new Random();
        int random=fb.nextInt(8)+1;
        arr[0]=random;
        counter++;
        while(counter<arr.length)
        {
            random = fb.nextInt(8)+1;
            boolean flag = find(random, counter);
            if(flag==false)
            {
                 arr[counter]=random;
                 counter++;
            }
        }

    }
    
    public static boolean find(int random,int counter)
    {
        for (int i=0;i<counter;i++)
        {
          if(arr [i]== random) 
          {
              return true;
          }
            
        }
        return false;
    }
    
    public static void getinput()
    {
        Scanner obj=new Scanner(System.in);
        for (int i=0;i<inputarr.length;i++)
        {
            inputarr[i]=obj.nextInt();
        }
    }
    
    public static void compare()
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<inputarr.length;j++)
            {
                if(arr[i]==inputarr[j])
                {
                    if(i==j)
                    {
                        compare[i]=1;
                    }
                    else
                    {
                        compare[i]=2;
                    }
                }
            }
        }
    }
    
    public static boolean checkwin()
    {
        int sum=0;
        for (int i=1;i<compare.length;i++)
        {
            if(compare[i]==1)
            {
                sum+=compare[i];
            }
            
        }
        if (sum==5)
        {
            return true;
        }
        else if(sum!=5)
        {
            Random();
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Random();
        
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        
            
        getinput();
        compare();
        for (int i = 0; i <compare.length; i++) 
        {
            if (compare[i]==1){
                System.out.println("green");
            }
            else if(compare[i]==2){
                System.out.println("blue");
            }
            else
            {
                System.out.println("red");
            }
        }
        
        checkwin();
        
        
    }
    
}
