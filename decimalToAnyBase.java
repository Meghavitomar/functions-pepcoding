import java.util.Scanner;
public class decimalToAnyBase {
    public static int decToAnyBase(int n, int b) {
        int ans = 0;
        int power = 1;
        while(n!=0){
            int rem = n%b;
            n/=b;
            ans += rem*power;
            power = power*10;

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int output = decToAnyBase(n, b);
        System.out.println(output);
        scn.close(); 
    }
}
