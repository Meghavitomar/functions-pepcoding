import java.util.Scanner;
public class AnyBaseToDecimal {
    public static int anyBaseToDec(int n, int b) {
        int ans = 0;
        int power = 1;
        while(n!=0){
            int rem = n%10;
            n/=10;
            ans += rem*power;
            power = power*b;

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int output = anyBaseToDec(n, b);
        System.out.println(output);
        scn.close(); 
    }
}
