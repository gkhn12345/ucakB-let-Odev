import java.util.Scanner;

public class ucakBiletiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,yas,kmUcret = 0.10,bilet,
                toplamUcret,cocukIndirimi=0.50,gencIndirimi=0.10,yasliIndirimi=0.30,gidisDonusIndirimi=0.20
                ,toplamUcret1,toplamUcret2,toplamUcret3,toplamUcret4,ucrett ;
        boolean isError = false;

        System.out.println("Mesafe giriniz : ");
        km = input.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextDouble();
        System.out.println("Yolculuk tipi :\n1-Tek yön\n2-Gidiş dönüş " );
        bilet = input.nextDouble();
        toplamUcret = (kmUcret * km);
        if(yas>=0 && yas<=150){
            if (bilet==1&&  bilet == 2){

            }
        }else{
            isError = true ;
        }
        if (yas < 12 ){
            toplamUcret1 = (toplamUcret-(toplamUcret * cocukIndirimi)) ;
            if (bilet == 2){
                toplamUcret4 = (toplamUcret-(toplamUcret * gidisDonusIndirimi)) ;
                System.out.println("ücret:"+toplamUcret4);

            }else if (bilet == 1){
                System.out.println("ücret: " +toplamUcret1);
            }
        }
        if (yas>=12 && yas <24){
            toplamUcret2 = (toplamUcret -(toplamUcret * gencIndirimi)) ;
            if (bilet == 2){
                toplamUcret4 = (toplamUcret-(toplamUcret * gidisDonusIndirimi)) ;
                System.out.println("ücret:"+toplamUcret4);

            }else if (bilet == 1){
                System.out.println("ücret: " +toplamUcret2);
            }
        }
        if (yas>65){
            toplamUcret3 = (toplamUcret-(toplamUcret * yasliIndirimi)) ;
            if (bilet == 2){
                toplamUcret4 = (toplamUcret-(toplamUcret * gidisDonusIndirimi)) ;
                System.out.println("ücret:"+toplamUcret4);
            }else if (bilet == 1){
                System.out.println("ücret: " +toplamUcret3);
            }

        }

        if (isError){
            System.out.println("Hatalı işlem yaptınız,Lütfen tekrar deneyiniz.");
        }




    }
}
