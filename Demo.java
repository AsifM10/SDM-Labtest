public class Demo {
    public static void main(String[] args) {
        int i=1, n=20, n1=0, n2 = 1;

        System.out.println("Fibonacchi Series till"+n+" numbers");

        while(i<=n)
        {
            System.out.println(n1+", ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;

            i++;
        }
    }
}
