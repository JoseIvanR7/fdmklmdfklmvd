/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author kirin
 */
public class Main {
        public static void main(String[] args) {
        pila stack = new pila();

     
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("valor mayor: " + stack.pop());
        System.out.println("valor medio: " + stack.pop());

        System.out.println("Numero de elementos: " + stack.stock());
    }

}
