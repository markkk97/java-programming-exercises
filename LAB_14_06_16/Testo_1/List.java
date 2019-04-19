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
     * aggiungeSeTrovaPredecessore
     *
     * Metodo che aggiunge un numero intero elem successivamente alla
     * prima occorrenza di (elem - 1), a patto che (elem - 1) sia gia`
     * presente nella lista.  Interrompere la scansione della lista
     * appena possibile. E` vietato fare uso di break.
     *
     * alcuni esempi di risultati attesi
     *
     * lista  :
     * elem   : 1
     * atteso :
     *
     * lista  : 2, 1
     * elem   : 3
     * atteso : 2, 3, 1
     *
     * lista  : 1, 2
     * elem   : 3
     * atteso : 1, 2, 3

     * lista  : 1, 1, 3
     * elem   : 2
     * atteso : 1, 2, 1, 3
     *
     */
    public void aggiungeSeTrovaPredecessore(int elem) {
	     Node p = first;
       Node prev = null;
       if (first != null){
       while (p.getElem() != elem -1 && p != null){
         p = p.getNext();
        }
        if (p != null)
          p.setNext(new Node (elem,p.getNext()));
      }
  }
}
