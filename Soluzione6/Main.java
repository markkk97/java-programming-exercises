/* Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo delete() che, in una lista di numeri interi,
 * elimina la prima occorrenza dell'elemento x tale che x e` uguale
 * alla somma dei numeri che la precedono.
 *
 * Seguono alcuni esempi di risultati attesi da delete().
 *
 * lista  :
 * atteso :
 *
 * lista  : 1, 2, 3
 * atteso : 1, 2
 *
 * lista  : 1, 3, -3, 2, 3
 * atteso : 1, 3, -3, 2
 *
 * lista  : 3
 * atteso : 3
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

    public void delete()
    {
      Node p = first;
      Node prev = null;
      int x = 0;
      while (p != null && p.getElem() != x) {
          x += p.getElem();
          prev = p;
          p = p.getNext();
      }
      if (p != null)
          if (prev != null) prev.setNext(p.getNext());
          else {
            first = p.getNext();
            System.out.println(p.getNext().getElem());
          }

        }


}

public class Main {
    public static void main(String[] args)
    {
	test(crea(), "");
	test(crea(1, 2, 3), "1, 2");
	test(crea(1, 3, -3, 2, 3), "1, 3, -3, 2");
  test(crea(1, 3, -3, 2, 3, 4, 5), "1, 3, -3, 2, 4, 5");
	test(crea(3), "3");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.delete();
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


/*


//prima versone realizzata

while (p != null && p.getElem() != x) {  //se ometto p.getElem() != x non funziona(nullpointer exception)
  prev = p;
  p = p.getNext();
  x += prev.getElem();
  if (first.getNext() == null)
    first.setNext(null);
  else {
    if (x == p.getElem() && p.getNext() != null)
      prev.setNext(p.getNext());
    else if (x == p.getElem() && p.getNext() == null)
      prev.setNext(null);
   }
}

*/
