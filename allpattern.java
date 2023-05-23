public class allpattern {
    public static void main(String[]args)
    { // ineuron program starts
        int n=10;
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)//fori
            {
                if(i==0 || j==((n-1)/2) || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" "+" ");
            for(int j=0;j<n;j++)//for n
            {
                if(j==0 || j==n-1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" "+" ");
            for(int j=0;j<n;j++)//for e
            {
                if(i==0 || j==0 || i==(n-1)/2||i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }
            }
            System.out.print(" "+" ");
            for(int j=0;j<n;j++)//u
            {
                if((j==0||j==(n-1)||i==(n-1)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            
            }
            System.out.print(" "+" ");
            for(int j=0;j<n;j++)//for r
            {
                if((j==0||i==0 && j<(n-1))||( i==((n-1)/2)&& j<((n-1)))||(j==((n-1))&& i<((n-1)/2)&&i>0)||(i==j&& i>((n-1)/2)&& j>((n-1)/2)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" "+" ");
            for(int j=0;j<n;j++)//o
            {
                if((i==0 && j>n/4 && j<((3*n)/4))||(j==n/4 && i>0 && i<n-1)||(i==n-1 && j>(n/4)&&j<((3*n)/4))||(j==((3*n)/4)&& i>0 && i<n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" "+" ");
            for(int j=0;j<n;j++)//n
            {
                if(j==0 || j==n-1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
        
            }
            System.out.print(" "+" ");
            
        
         //ineuron code ends}

    
         for(int j=0;j<n;j++)//pattern 1 starts
         {
             if((j==0 && i<=(n-1))||(i+j<(n/2))||(j-i>=(n)/2)||j==n-1 && i<=n-1)
             {
                 System.out.print("*"+" ");
             }
             else
             {
                System.out.print(" "+" ");
             }
         }
         System.out.print(" "+" ");
            //pattern3 ends

         for(int j=0;j<n;j++)//pattern 4 starts
         {
             if((i-j>=(n-1)/2|| i==n-1)||(i+j>=(n-1)+(n-1)/2))
             {
                 System.out.print("*"+" ");
             }
             else
             {
                System.out.print(" "+" ");
             }

         }

         for(int j=0;j<n;j++) //pattern 5 starts
         {
             if((i==0 && j<=(n-1))||(j+i<(n/2))||(i-j>=(n)/2)||i==n-1 && j<=n-1)
             {
                 System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }
         }   
         System.out.println(" ");
        }   
            
    
       for(int i=1;i<5;i++)
    {
     for(int j=1;j<5;j++)
     {
      System.out.print(i);
     }
     System.out.println(" ");
    }    
    
    
    
}
}


