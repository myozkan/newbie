
import java.util.Scanner;
public class otomasyon {
    public static void main(String args[]) {
        //İki ürün tipinden birini seçmenizi sağlar.
       System.out.println("Lütfen yiyecekler için 1'i, içecekler için 2'yi tuşlayınız.");
       Scanner input = new Scanner(System.in);
       double turSecimi = input.nextDouble();

       if (turSecimi==1) {      /*Ürün tipi olarak yiyecekler seçilirse.*/
            //Mevcut para tutarını yazmanızı sağlar ve para tutarına göre ürünleri listeler.
           System.out.println("Lütfen mevcut paranızı yazın. ");
           input = new Scanner(System.in);
           double para = input.nextDouble();

           if (para<1)
               System.out.println("Allah versin kardeşim.");
           if (para >= 1)
               System.out.println("1-Ülker Çikolatalı Gofret");
           if (para >= 1.25)
               System.out.println("2-Kitkat");
           if (para >= 1.50)
               System.out.println("3-Snicker's");
           if (para >= 1.75)
               System.out.println("4-Ülker İkram");

            //Listelenen ürünleri seçmenizi sağlar ve seçilen ürünü listeler.
           if (para>=0.75) {
               System.out.println("Lütfen seçiminizi tuşlayın. ");
               input = new Scanner(System.in);
               int secim = input.nextInt();

               if (secim == 1 && para >= 1)
                   System.out.println("Ülker Çikolatalı Gofret");
               else if (secim == 2 && para >= 1.25)
                   System.out.println("Kitkat");
               else if (secim == 3 && para >= 1.50)
                   System.out.println("Snicker's");
               else if (secim == 4 && para >= 1.75)
                   System.out.println("Ülker İkram");
               else
                   System.out.println("Beceremedin, geberdin.");

           }
       }







        else if (turSecimi==2) {    /*Ürün tipi olarak içecekler seçilirse*/

           //Mevcut para tutarını yazmanızı sağlar ve para tutarına göre ürünleri listeler.
           System.out.println("Lütfen mevcut paranızı yazın. ");
           input = new Scanner(System.in);
           double para = input.nextDouble();


           if (para<0.75)
               System.out.println("Allah versin kardeşim.");
           if (para >= 0.75)
               System.out.println("1-Erikli 500ml Su");
           if (para >= 1)
               System.out.println("2-Beypazarı Sade Soda");
           if (para >= 1.25)
               System.out.println("3-Dimes Karışık Meyve Suyu");
           if (para >= 2)
               System.out.println("4-Coca Cola 330ml");
           if (para >= 2.50)
               System.out.println("5-Doğanay Şalgam Suyu");

           //Aşağıdaki bölüm ürünleri seçmeye ve seçilen ürünleri listelemeye yarar.
        if (para>=0.75) {
            System.out.println("Lütfen seçiminizi tuşalayın.");
            input = new Scanner(System.in);
            double secim = input.nextDouble();

            if (secim == 1 && para >= 0.75)
                System.out.println("Erikli 500ml Su.");
            else if (secim == 2 && para >= 1)
                System.out.println("Beypazarı Sade Soda.");
            else if (secim == 3 && para >= 1.25)
                System.out.println("Dimes Karışık Meyve Suyu.");
            else if (secim == 4 && para >= 2)
                System.out.println("Coca Cola 330ml.");
            else if (secim == 5 && para >= 2.50)
                System.out.println("Doğanay Şalgam Suyu");
            else
                System.out.println("Beceremedin, geberdin.");
        }

       }


        else {  /*Ürün tipi için 1 yahut 2 den başka seçenek seçilirse*/
           System.out.println("Beceremedin, geberdin.");
       }

    }


}
