//NUMBER SYSTEM



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
    public static int BinToDec(int n) {
        int ans = 0;
        int power = 1;
        while(n!=0){
            int rem = n%10;
            n/=10;
            ans += rem*power;
            power = power*2;

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Binary = decToBin(n);
        int Decimal = BinToDec(Binary);
        System.out.println(Decimal);
        scn.close(); 
    }
}
