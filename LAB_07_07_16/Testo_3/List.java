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
     * eliminaPrimoSeguitoDaSuccessore
     *
     * Metodo che elimina il primo elemento di una lista di numeri
     * interi che e` seguito dal suo successore.
     *
     * lista  : 1
     * atteso : 1
     *
     * lista  : 1, 2
     * atteso : 2
     *
     * lista  : 2, 1
     * atteso : 2, 1
     *
     * lista  : 0, 2, 3
     * atteso : 0, 3
     *
     */
    public void eliminaPrimoSeguitoDaSuccessore() {
      boolean trovato = false;
      Node p = first;
      Node prev = null;
      while (p != null && !trovato){
        trovato = p.getNext()!= null && p.getElem() == p.getNext().getElem() - 1;
        if (!trovato) { //se non ho trovato scorro la lista
          prev = p;
          p = p.getNext();
        }
      }
      if (trovato){
        if (prev != null)
          prev.setNext(p.getNext());
        else
          first = first.getNext();
      }


    }






}
