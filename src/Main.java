//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null) { // si la LinkedList tiene 0 o un elemento no se puede dar vuelta
                return head;
            }
            ListNode left = null;
            ListNode right = head; //Inicializamos right en head, el primer nodo de la LinkedList

            while(right != null ) { //Mientras la LinkedList tenga elementos
                ListNode temp = right.next;//Variable temporal para que no se pierda el índice del nodo al hacer swapping
                right.next = left; //right.next es null, entonces lo que hacemos es correr los nodos de la izquierda hacia la derecha
                //dando vuelta la lista

                //Movemos los pointers
                left = right;
                right = temp;
            }
            return left;
        }

    //Time complexity O(n) lineal, space Complexity O(1), no se utiliza espacio adicional,
    //independientemente del tamaño de la lista.
    //Algoritmo de two pointers(slow-fast technique)- Floyd
    public static void main(String[] args) {

    }
}