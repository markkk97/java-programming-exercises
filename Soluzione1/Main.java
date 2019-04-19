/* Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo insert(x,y) che, in una lista di numeri
 * interi, inserisce l'elemento x prima della prima occorrenza di y se
 * y e` presente e non fa nulla in caso contrario.
 *
 * Seguono alcuni esempi di risultati attesi da insert(1,2).
 *
 * lista  :
 * atteso :
 *
 * lista  : 5, 2, 3
 * atteso : 5, 1, 2, 3
 *
 * lista  : 2, 3, 5
 * atteso : 1, 2, 3, 5
 *
 * lista  : 5, 2, 2
 * atteso : 5, 1, 2, 2
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

    public void insert(int x, int y) {
      Node p =first;
      Node prev = null;
      while (p != null && p.getElem() != y) {
        prev = p;
        p = p.getNext();
      }

      if (p != null) {
        if (prev != null)
          prev.setNext(new Node(x,p));
        else if (prev == null)
        first = new Node(x,first);


    }


    }

  }


public class Main {
    public static void main(String[] args)
    {
	test(crea(4), "4");
	test(crea(5, 2, 3), "5, 1, 2, 3");
	test(crea(2, 3, 5), "1, 2, 3, 5");
	test(crea(5, 2, 2), "5, 1, 2, 2");
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
while (p != null && p.getElem() != y) {
    prev = p;
    p = p.getNext();
}
if (p != null)
    if (prev != null) prev.setNext(new Node(x, p));
    else first = new Node(x, p);

// seconda versione


Node prev = null;
Node p = first;
while (p != null && p.getElem() != y) {
  prev = p;
  p = p.getNext();
}
if (p != null){
  if (prev!= null)
    prev.setNext(new Node(x,p));
  else
    if(p != null)
    first = new Node(x, p);
}

*/
