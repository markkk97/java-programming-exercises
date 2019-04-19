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
     * eliminaUltimoSePiuGrande
     *
     * Metodo che elimina l'ultimo elemento di una lista se e` il piu`
     * grande.
     *
     * alcuni esempi di risultati attesi
     *
     * lista  :
     * atteso :
     *
     * lista  : 1
     * atteso :
     *
     * lista  : 1, 2
     * atteso : 1
     *
     * lista  : 1, 3, 2
     * atteso : 1, 3, 2
     *
     */
    public void eliminaUltimoSePiuGrande() {
      Node max = first;
      Node p = first;
      Node prev = null;
      while ( p != null && p.getNext() != null) {
        if(max.getElem() < p.getNext().getElem()){
          max = p.getNext(); //assegnamento max

        } prev = p;
          p = p.getNext();
      }
        if (prev != null) {
          if (p.getElem() >= max.getElem()) // se l'ultimo e maggore di max'
            prev.setNext(null);//elimina l'ultimo
        }
        else if(first == null ||first.getNext() == null) //lista vuota o con un solo elem
          first = null;



  }


}
