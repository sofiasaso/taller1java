import java.util.Scanner;

public class Else{
	public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        
        System.out.println("Ingrese el valor de X ");
        Scanner lectura = new Scanner(System.in);
        a = lectura.nextInt();
        System.out.println("Ingrese el valor de Y ");
        b = lectura.nextInt();
        
        if(a > b){
        
            System.out.println("A es mayor que B");
        }
        else{
        
            System.out.println("B es mayor que A");
        }
    }
}
