import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int sayi;
	    double sum=0;
        Scanner intscanner = new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
	    sayi = intscanner.nextInt();
	    for(double i=1;i<=sayi;i++){
	        sum = sum + (1/i);
        }
	    System.out.println("Sonuç: "+sum);
    }
}
