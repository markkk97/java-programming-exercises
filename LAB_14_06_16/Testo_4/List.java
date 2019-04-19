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
     * aggiungeSePiuGrandeDiTutti
     *
     * Metodo che aggiunge un numero intero elem all'inizio di una
     * lista a patto che elem sia strettamente piu` grande di tutti gli
     * elementi gia` nella lista.
     *
     * alcuni esempi di risultati attesi
     *
     * lista  :
     * elem   : 1
     * atteso : 1
     *
     * lista  : 4, 2, 1
     * elem   : 3
     * atteso : 4, 2, 1
     *
     * lista  : 3, 2, 1
     * elem   : 3
     * atteso : 3, 2, 1
     *
     * lista  : 3, 2, 1
     * elem   : 4
     * atteso : 4, 3, 2, 1
     *
     */
    public void aggiungeSePiuGrandeDiTutti(int elem) {
      Node p  = first;
      Node res = first;
      while (p != null && p.getNext() != null  ) {
        if (res.getElem() < p.getNext().getElem()){
          res = p.getNext();
        }
          p = p.getNext();
      }
      if (res != null) {

        if (elem > res.getElem()){
          this.insertFirst(elem);
          System.out.println(elem);
        }
      }
        else
        insertFirst(elem);
    }
}
