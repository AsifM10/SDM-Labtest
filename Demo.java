import java.util.Scanner;
public class Demo {
    public static void PrimeNo()
    {
        int num=20, count;

        for(int i=1; i<=num; i++)
        {
            count = 0;
            for(int j=2; j<=i/2; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }

            if(count == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void Armstrong()
    {
        Scanner scan = new Scanner(System.in);
        int num = 121;
        int temp, rem, res=0;
        temp=num;
        while(temp !=0)
        {
            rem = temp % 10;
            res += Math.pow(rem,3 );
            temp /= 10;
        }

        if(res == num)
        System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not an armstrong");
    }
    public static void main(String[] args) {
        
        System.out.println("Enter what piece of code you want to execute");
        System.out.println("option : fibonacchi , prime , armstrong");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
       /*  int i=1, n=20, n1=0, n2 = 1;

        System.out.println("Fibonacchi Series till"+n+" numbers");

        while(i<=n)
        {
            System.out.println(n1+", ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;

            i++;
        } */

        switch(choice){
            case "fibonacchi" :  int i=1, n=20, n1=0, n2 = 1;

            System.out.println("Fibonacchi Series till"+n+" numbers");
    
            while(i<=n)
            {
                System.out.println(n1+", ");
    
                int next = n1 + n2;
                n1 = n2;
                n2 = next;
    
                i++;
            }
            break;

            case "prime" : PrimeNo();
            break;

            case "armstrong" : Armstrong();
        }
    }
}
