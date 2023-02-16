package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception{
        Scanner login = new Scanner(System.in);
        System.out.println("Bienvenido a ejercicio 5 (login)");
        System.out.println("En este programa vamos a validar tu información dentro de este sistema");
        System.out.println("Por favor, escribe tu usuario");
        String user;
        user = login.nextLine();
        System.out.println("Listo. Ahora por favor ingresa tu contraseña");
        String password;
        password = login.nextLine();
        System.out.println("Cargando...");
        System.out.println("Espera un momento...");
        System.out.println("**************************************************");

        if (user=="laurasoto51997@gmail.com" && password=="Sofia123") {
            System.out.println("Bienvenido al Sistema <3" + user);
        } 
        else if (user=="laurasoto51997@gmail.com" || password!="Sofia123"){
            System.out.println("Parece que no recuerdas tu contraseña");
        } 
        else if (user!="laurasoto51997@gmail.com" || password=="Sofia123"){
            System.out.println("Tus credenciales son incorrectas");
        } 
        else{
            System.out.println("Acceso denegado");
        }

        
        
        login.close();
    }    
}
