import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        double r,pi=3.14,area,alpha,aarea,perimeter;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Dairenizin yarıçapını giriniz:");
        r=input.nextDouble();
        System.out.print("Lütfen hesaplama yapmak istediğiniz açıyı girin:");
        alpha=input.nextDouble();
        perimeter=pi*2*r;
        area=pi*r*r;
        aarea=(pi*(r*r)*alpha)/360;
        System.out.println("Girmiş olduğunuz yarıçap: "+r);
        System.out.println("Girmiş olduğunuz açı: "+alpha);
        System.out.println("Dairenizin çevresi: "+perimeter);
        System.out.println("Dairenizin alanı: "+area);
        System.out.println("Seçili açının alanı: "+aarea);



    }
}
