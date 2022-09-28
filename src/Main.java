import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz:");

        double enterPrice,KDV8,KDV18;
        double KDVoran=0.18;
        double KDVoran2=0.08;
        enterPrice = input.nextDouble();
        KDV8 = enterPrice + enterPrice * KDVoran2;
        KDV18 = enterPrice + enterPrice * KDVoran;

        System.out.println("Ürünün KDV'siz fiyatı:" + enterPrice);
        Boolean sonuc = (enterPrice < 1000);

        System.out.println("Ürünün KDV'li fiyatı:");
        String priceWithKDV = String.valueOf(sonuc ? KDV18 : KDV8);
        System.out.println(priceWithKDV);

        String kdvRate = sonuc ? "KDV oranı %18" : "KDV oranı %8" ;
        System.out.println(kdvRate);
    }

}