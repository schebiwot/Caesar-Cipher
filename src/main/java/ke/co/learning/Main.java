package ke.co.learning;

import ke.co.learning.services.Cipher;
import ke.co.learning.services.Decipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Cipher!");
        Cipher cipher=new Cipher("",0);
        Decipher decipher=new Decipher("",0);

        Scanner scanner=new Scanner(System.in);
    while(true) {


        System.out.print("Enter message: ");
        String message = scanner.next();

        System.out.print("Enter a process (En/Dec): ");
        String process = scanner.next();

        System.out.print("Enter a key: ");
        int key = scanner.nextInt();

        cipher.setKey(key);
        cipher.setMessage(message);

        decipher.setKey(key);
        decipher.setMessage(message);

        System.out.print("Do you want to continue ?(c/q): ");
        String nextStep = scanner.next();
            String output ="";
        if(process.startsWith("e")){
            output= cipher.encrypt();
        }
        else{  output= decipher.decrypt();}

System.out.println("your message is:"+ output);
        if (!nextStep.startsWith("c")) {

            System.out.println("Cheers!");
            break;
        }
    }
    }
}