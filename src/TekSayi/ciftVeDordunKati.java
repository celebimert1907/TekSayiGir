package TekSayi;

import java.util.Scanner;

public class ciftVeDordunKati {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int girilen;
        boolean negatif = true;

        do {
            System.out.print("Bir sayi giriniz: ");
            girilen = input.nextInt();
            if (girilen < 0) {
                System.out.println("Dogru giris yaptiniz !");
                for (int i = 0; girilen<i; i--) {
                    if (i % 2 == 0 && i % 4 == 0) {
                        System.out.println(i);
                        negatif = false;
                    } else {
                        System.out.println(i + " :2 ye ve 4 e bolunmez !!!");
                    }
                }
            } else{
                System.out.println("Hatali giris yaptiniz !!!");
            }
        } while (negatif) ;
    }
}



