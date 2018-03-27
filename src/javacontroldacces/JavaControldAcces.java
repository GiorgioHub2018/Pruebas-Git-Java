/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javacontroldacces;

/**
 *
 * @author Guillem
 */
public class JavaControldAcces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ControlDAcces ControlArena= new ControlDAcces();
        
        //Veta un usuari i mira si pot entrar;
        
        ControlArena.vetaUsuari("C330");
        if (ControlArena.entraUsuari("C330")) {
            System.out.println("Usuari ha entrar al recinte.");
        } else {
            System.err.println("Usuari està vetat.");
        }
        
        // Entra un nou usuari no vetat
        if (ControlArena.entraUsuari("B")) {
            System.out.println("Usuari ha entrar al recinte.");
        } else {
            System.err.println("Usuari no ha entrat.");
        }
        // Entram 350 nous usuaris no vetats
        for (int i = 0; i < 350; i++) {
            if (ControlArena.entraUsuari("C" + i)) {
                System.out.println("Usuari ha entrar al recinte." + i);
            } else {
                System.out.println("Usuari no ha entrat." + i);
            }
        }     
    }
}

