package a.b.c.d.e.f;

public class Solu {
    public class Node {
        String data;
        Node next;
        
        Node(String dat) {
            this.data = dat;
        }
        
        /**
        *Invierte la secuencia de nodos que componen una lista.
        *@
        **/
        //gus invierte el orden de la lista de los nodos
        Node gus() {
            if(next == null){ // se pregunto si el nodo tiene hijos
              return this; //si tiene hijos devuelve el mismo nodo
            } else { //si no tiene hijos hace las siguintes instrucciones
              Node otro = next; //se usa una variables auxiliar para almacenar al hijo del nodo
              next      = null; //Se le quita el nodo hijo al nodo en el que se está
              Node tavo = otro.gus(); //se aplica recurción a los demás nodos de la lista
              otro.next = this; //el nodo hijo se vuelve el padre del nodo actual
              return tavo; // no sé bien que se aquí
            }
        }
      
        /**
         * Imprime en la consola la secuencia de Nodos que 
         * componen a esta lista. Por ejemplo, para la lista
         * que devuelve el método "build", la invocación de
         * este método escribe en la consola: 
         * 
         * A-->B-->C-->D-->E-->F-->
         * 
         * Lo anterior sería lo que se visualiza en la consola 
         * justo después de ejecutar las siguintes dos lineas:
         * 
         *         Node a = build();
         *         a.prn();
         *         
         */
        public void prn() {
            // Este método requiere sólo de 3 a 7 lineas de código para funcionar correctamente
          System.out.println(a.data);
          Node aux = a.Next;
          while(aux != null){
            System.out.println(aux.dat);
            aux = a.Next;
         }
        
    }// ends Node class
    
    /**
     * COMENTARIO INCORRECTO:
     * 
     * Método que crea 6 Nodos cada uno con una letra diferente y
     * luego a cada uno en su propiedad next le asigna en siguiente.
     * 
     * @return Node Regresa el primero que se creó.
     */
    private Node build() {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    public static void main (String args[]) {
        new Solu().ok();
    }

}
