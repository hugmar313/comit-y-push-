/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comitpush;
import java.util.Scanner;
/**
 *
 * @author hugmar
 */
public class Comitpush {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int temp;
        System.out.println("Bienvenido/a");
        // TODO code application logic here
        System.out.println("Introduce una temperatura y te dire si es positiva o negativa:");
        temp=input.nextInt();
        if (temp>0){
            System.out.println("La temperatura es positiva.");
        }
        else{
            if(temp<0){
                System.out.println("Latemperatura es negativa.");
            }
            else{
                System.out.println("La temperatura es 0, por lo tanto no es ni negativa ni positiva.");
            }
        }
    }
    
}
