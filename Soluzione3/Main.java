/* Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo insert(x,y) che, in una lista di numeri
 * interi, inserisce l'elemento x prima di ogni occorrenza di y.
 *
 * Seguono alcuni esempi di risultati attesi da insert(1,2).
 *
 * lista  :
 * atteso :
 *
 * lista  : 5, 2
 * atteso : 5, 1, 2
 *
 * lista  : 2, 2, 3
 * atteso : 1, 2, 1, 2, 3
 *
 * lista  : 5, 1
 * atteso : 5, 1
 *
 * Non e` consentito usare break o continue o return all'interno di
 * cicli.
 *
 * Non e` consentito modificare in alcun modo il codice al di fuori
 * del metodo "insert".
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

    public void insert(int x, int y)
    {
      Node p = first;
      Node prev = null;

      while (p != null) {
        if (p.getElem() == y)
          if (prev != null)
            prev.setNext(new Node(x,p));
          else
            insertFirst(x);
            
        prev = p;
        p = p.getNext();

    }
  }
}

public class Main {
    public static void main(String[] args)
    {
	test(crea(), "");
	test(crea(5, 2), "5, 1, 2");
	test(crea(2, 2, 3), "1, 2, 1, 2, 3");
	test(crea(5, 1), "5, 1");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.insert(1, 2);
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
Node p = first;
Node prev = null;
while (p != null) {
    if (p.getElem() == y)
  if (prev != null) prev.setNext(new Node(x, p));
  else first = new Node(x, p);
    prev = p;
    p = p.getNext();
}
*/
