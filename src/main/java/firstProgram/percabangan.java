package firstProgram;

import java.util.Scanner;
public class percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password: ");
        String validPassword = "password";

        //Jika Benar maka Selamat Datang Bos!
        if (password.equals((validPassword))){
            System.out.println("Selamat Datang Bos!");
        }
        //Jika Salah (else) maka error message
        else {
            System.out.println("Password Anda Salah, coba lagi");
        }
        System.out.println("Terima kasih sudah menggunakan aplikasi kami");

    }

    public static String prompt (String message){
     Scanner scanner = new Scanner(System.in);
     System.out.println(message);
     return scanner.nextLine();
    }

}
