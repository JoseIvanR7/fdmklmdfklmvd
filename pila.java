
package Lista;

public class pila {

    private int array[];
    private int top;

    public pila() {
        array = new int[20];
        top = -1; 
    }

    public void push(int value) {
        if (top == array.length - 1) {
            System.out.println("stack lleno, no da push " + value);
            return;
        }

        top++;
        array[top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack esta vacio, no pop");
            return -1;
        }

        int value = array[top];
        top--;

        return value;
    }

    public int stock() {
        return top + 1;
    
}
    public static void main(String[] args) {
        pila stack = new pila();

     
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("El valor mayor es: " + stack.pop());
        System.out.println("El valor medio es : " + stack.pop());
        System.out.println("Eliminando un elemento más: " + stack.pop());
        

        System.out.println("El numero de elementos es: " + stack.stock());
    }
}
//pilas con list enlazada main