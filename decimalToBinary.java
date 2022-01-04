import java.util.Scanner;
public class decimalToBinary {
    public static int decToBin(int n) {
        int ans = 0;
        int power = 1;
        while(n!=0){
            int rem = n%2;
            n/=2;
            ans += rem*power;
            power = power*10;

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(decToBin(n));
        scn.close(); 
    }
}
