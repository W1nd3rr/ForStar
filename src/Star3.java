import java.util.Scanner;


public class Star3 {


    public static void main(String[] args) {
        int kolom;
        Scanner input = new Scanner (System.in);
        int p,l;
        System.out.println("masukkan panjang");
        p = input.nextInt();
        System.out.println("masukkan lebar ");
        l = input.nextInt();
        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < p ; j++)
            {
            System.out.print("*");  
            }
            System.out.println("");
        }
    }
    
}
