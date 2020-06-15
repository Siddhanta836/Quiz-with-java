/**
 * Write a description of class play here.
 *
 * @author (Siddhanta Bhattacharjee)
 */
import java.util.*;
public class quiz extends database
{
    
    public void get()
    {
        int ans=0;
        double amount=0.0;
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Hello "+name);
        System.out.println("WELCOME TO OUR KBC 2020...LETS START OUR TODAYS GAME!");
        
        System.out.println("Status: \n Score:"+s+"\n amount won: 0.0");
        for(int i=0;i<5;i++)
        {
            System.out.println(q[i]);
            for(int j=0;j<4;j++)
            {
                System.out.print(o[i][j]+"\t");
                if(j==1)
                System.out.println();
                
            }
            System.out.println("\nchoose your answer.....");
            ans=sc.nextInt();
            if(ans==a[i])
            {
                s+=2;
                amount=s*500;
                
                System.out.println("Status: \n Score:"+s+"\namount won: "+amount);
            }
            else
            {
            System.out.println("WRONG ANSWER!!");
            s--;
            amount=amount-(i*200);
            System.out.println("Status: \n Score:"+s+"\n amount won: "+amount);
            }
        }
        System.out.println("THANK YOU SO MUCH FOR YOUR PARTICIPATION");
        System.out.println("CONGRATULATIONS "+name+" YOU HAVE WON $"+amount);
    }
    public static void main(String args[])
    {
        quiz obj= new quiz();
        obj.get();
    }
}