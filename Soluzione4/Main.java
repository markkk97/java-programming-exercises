/* Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo delete(x) che, in una lista di numeri
 * interi, elimina ogni occorrenza dell'elemento x.
 *
 * Seguono alcuni esempi di risultati attesi da delete(2).
 *
 * lista  :
 * atteso :
 *
 * lista  : 5, 2, 1
 * atteso : 5, 1
 *
 * lista  : 2, 2, 3
 * atteso : 3
 *
 * lista  : 5, 1, 2
 * atteso : 5, 1
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

    public void delete(int x) {
      Node prev = null;
      Node p = first;
      while (p!= null) {
        if (p.getElem() == x){
          if (prev != null)
            prev.setNext(p.getNext());
          else
            first = p.getNext();
        }
        else
        prev = p;

        p = p.getNext();
      }
    }
}

public class Main {
    public static void main(String[] args)
    {
	test(crea(2), "");
	test(crea(5, 2, 1), "5, 1");
  test(crea(2, 2, 3), "3");
	test(crea(5, 1, 2), "5, 1");
  test(crea(5, 1, 2, 2 , 2), "5, 1");
  test(crea(5, 1, 2, 2, 5, 2), "5, 1, 5");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.delete(2);
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


// versione mia quasi corretta
Node p = first;
Node prev = null;
while (p != null) {
  prev = p;
  p = p.getNext();
//  System.out.println(prev.getElem());
  if (p!= null && p.getElem() == x) {
      prev.setNext(p.getNext());
  if (p.getNext() != null && p.getNext().getElem() == x){
    while (p.getNext() != null && p.getNext().getElem() == x) {
        p = p.getNext().getNext();
        prev.setNext(p);
    }
  } else if (p.getNext() != null && p.getNext().getElem() != x) {
    prev.setNext(p.getNext());
  }
  }
  else {
    if (first.getElem() == x)
      first = first.getNext();
  }


}




Node p = first;
Node prev = null;
while (p != null) {
  if (p.getElem() == x)
if (prev != null) prev.setNext(p.getNext());
else first = p.getNext();
  else
prev = p;
  p = p.getNext();
}




Node p = first;
Node prev = null;
while (p != null) {
  if (p.getElem() == x) {
    if (prev != null) prev.setNext(p.getNext());
    else first = p.getNext();
  }
  else {
    prev = p; //viene tenuta traccia di prev solamente se p.getElem è  != da x. se e uguale
              //allora si cancella facendo prev.setNext(p.getNext());
              //ma prev all'inizio e 0 null, se il peimo elemeto della lista è = x e devo
              //cancellarlo allora visto che prev e ancora null lo cancelolo con first = p.getNext();
              //un volta fatti tutti i controlli allora scorro la lista facendo p = p.getNext();
              //poi riniziano i controlli
  }
  p = p.getNext();
}

*/
