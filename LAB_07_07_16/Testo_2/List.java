/********** IMPORTANTE! COMPILARE! **********/

/* COGNOME:
 * NOME:
 * MATRICOLA:
 * TURNO:
 * NUMERO MACCHINA:
 */


public class List {
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

    /*
     * eliminaPrimoNegativo
     *
     * Metodo che elimina il primo elemento negativo di una lista di
     * interi.
     *
     * alcuni esempi di risultati attesi
     *
     * lista  : 1
     * atteso : 1
     *
     * lista  : -3, 1
     * atteso : 1
     *
     * lista  : 1, -3
     * atteso : 1
     *
     * lista  : -1, 2, -3
     * atteso : 2, -3
     *
     */
    public void eliminaPrimoNegativo()
    {
	     Node p = first;
       Node prev  = null;
       while(p!=null && p.getElem() > 0) {
         prev = p;
         p = p.getNext();
       }
       System.out.println(p.getElem());
       if (prev != null ) {
         if (p != null)
        prev.setNext(p.getNext());
      }
        else
          first = first.getNext();

    }
}
