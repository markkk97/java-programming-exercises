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
     * eliminaPrimoSePiuPiccolo
     *
     * Metodo che elimina il primo elemento di una lista di numeri
     * interi, a patto che tale elemento sia il piu` piccolo della
     * lista. Il metodo non deve fare alcuna assunzione sul contenuto
     * della lista. In particolare, non e` detto che la lista sia
     * ordinata o che contenga solo numeri non negativi.
     *
     * alcuni esempi di risultati attesi
     *
     * lista  : 1
     * atteso :
     *
     * lista  : 1, 2
     * atteso : 2
     *
     * lista  : 2, 1
     * atteso : 2, 1
     *
     * lista  : 2, 2, 2, 2
     * atteso : 2, 2, 2
     *
     */
    public void eliminaPrimoSePiuPiccolo() {
	     Node p = first;
       Node res = null;
       while(p.getNext() != null) {
        if (first != null)
          res = first;
        if (res.getElem() > p.getNext().getElem())
          res = p.getNext();
        p = p.getNext();
       }

       if (first.getNext() == null || res.getElem() == first.getElem())
        first = first.getNext();


    }
}
