/* Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo insert(x) che, in una lista di numeri
 * interi, inserisce l'elemento x in fondo alla lista se x e` uguale
 * alla somma dei numeri gia` presenti nella lista.
 *
 * Seguono alcuni esempi di risultati attesi da insert(3).
 *
 * lista  :
 * atteso :
 *
 * lista  : 1, 2
 * atteso : 1, 2, 3
 *
 * lista  : 1, 2, 3
 * atteso : 1, 2, 3
 *
 * lista  : 0, 1, 1, 1
 * atteso : 0, 1, 1, 1, 3
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

    public void insert(int x) {
      Node p = first;
      Node prev = null;
      int s = 0;

      while (p != null ) {
        s += p.getElem();
        prev =p;
        p = p.getNext();

        }
        if (p == null && x == s){
          if (prev != null)
            prev.setNext(new Node(x,null));
          else
            first.setNext(new Node(x,null));
      }



    }

}

public class Main {
    public static void main(String[] args)
    {
	test(crea(3), "3, 3");
	test(crea(1, 2), "1, 2, 3");
	test(crea(1, 2, 3), "1, 2, 3");
	test(crea(0, 1, 1, 1), "0, 1, 1, 1, 3");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.insert(3);
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
{
Node p = first;
Node prev = null;
int s = 0;
while (p != null) {
  s += p.getElem();
  prev = p;
  p = p.getNext();
}
if (x == s)
  if (prev != null) prev.setNext(new Node(x, null));
  else first = new Node(x, null);
}

*/
