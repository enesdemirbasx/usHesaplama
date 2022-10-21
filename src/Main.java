import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b;
        System.out.print("Üssü alınacak sayıyı giriniz:");
        a= inp.nextInt();
        System.out.print("Üs olacak sayıyı giriniz:");
        b= inp.nextInt();
        int sonuc=a;
        for (int i=b;i>1;i--){
            sonuc*=a;
        }
        System.out.println(a+"^"+b+" işleminin sonucu: "+sonuc);

    }
}