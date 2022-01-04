import java.util.Scanner;
public class digitFrequency{
public static int getDigitFrequency(int n, int d) {
  int occurance = 0;
  while(n!=0){
      int ans = n%10;
      n/=10;
      if(ans == d)
          occurance++;
        } 
  return occurance;
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    System.out.println(getDigitFrequency( n, d));
    scn.close();
}}
