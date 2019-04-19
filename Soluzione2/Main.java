/* Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo delete(x,y) che, in una lista di numeri
 * interi, elimina la prima occorrenza dell'elemento x che precede y
 * se y e` presente e non fa nulla in caso contrario.
 *
 * Seguono alcuni esempi di risultati attesi da delete(1,2).
 *
 * lista  : 1
 * atteso : 1
 *
 * lista  : 1, 2, 3
 * atteso : 2, 3
 *
 * lista  : 5, 1, 3, 1, 2
 * atteso : 5, 1, 3, 2
 *
 * lista  : 5, 1, 2, 1, 2
 * atteso : 5, 2, 1, 2
 *
 * Non e` consentito usare break o continue o return all'interno di
 * cicli.
 *
 * Non e` consentito modificare in alcun modo il codice al di fuori
 * del metodo "delete".
 *
 */

class Node {
    private int elem;
    private Node next;

    public Node(int elem, Node next)
    {
	this.elem = elem;
	this.next = next;
    }

    public int getElem()
    { return elem; }

    public Node getNext()
    { return next; }

    public void setNext(Node next)
    { this.next = next; }
}

class List {
    private Node first;

    public List()
    { first = null; }

    public void insertFirst(int elem)
    { first = new Node(elem, first); }

    public String toString()
    {
	String s = "";
	for (Node p = first; p != null; p = p.getNext()) {
	    if (p != first) s += ", ";
	    s += p.getElem();
	}
	return s;
    }

    public void delete(int x, int y) {
      Node p = first;
      Node prev = null;
      boolean trovato = false;
       while( p!= null && p.getNext() != null && !trovato)  {
         trovato = p.getElem() == x && p.getNext().getElem() == y;
         if (!trovato){
        prev = p;
        p = p.getNext();
      }

      }
      if (trovato) {
        if (prev!= null)
        prev.setNext(p.getNext());
      else
        first = first.getNext();



      }






    }
}

public class Main {
    public static void main(String[] args)
    {
  test(crea(), "");
	test(crea(1, 2, 3), "2, 3");
	test(crea(5, 1, 3, 1, 2), "5, 1, 3, 2");
	test(crea(5, 1, 2, 1, 2), "5, 2, 1, 2");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.delete(1, 2);
	System.out.println("ottenuto : " + l);
	System.out.println("atteso   : " + atteso);
	System.out.println(l.toString().equals(atteso) ? "=== OK" : "=== ERRORE");
	System.out.println();
    }

    public static List crea(Integer...v)
    {
	List l = new List();
	for (int i = v.length - 1; i >= 0; i--)
	    l.insertFirst(v[i]);
	return l;
    }
}











//soluzione mia quasi giusta
/*

      if (first == null) //lista vuota
        throw new IllegalStateException("lista vuota");

      else if (first.getNext() == null) //lista con un solo elemento
        first = first;

      else {

        Node prev = null;
        Node current = first;
        Node next = current.getNext();

        while (next != null) {
          prev = current;
          current = next;
          next = next.getNext();
          if (first.getElem() == x && prev.getElem() == y) {
            first = first.getNext();
          }
          if (current.getElem() == x && next.getElem() == y) {
            System.out.println(current.getElem());
            prev.setNext(next);
            //found = found.getNext();
          }

        }



      }



      //SECONDA VERSIONE

      boolean trovato = false;
      while (p != null && !trovato) {
          trovato = p.getElem() == x && p.getNext() != null && p.getNext().getElem() == y;
          if (!trovato) {
        prev = p;
        p = p.getNext();
          }
      }
      if (trovato)
          if (prev != null) prev.setNext(p.getNext());
          else first = p.getNext();

*/
