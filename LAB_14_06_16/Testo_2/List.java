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
     * aggiungeInFondoSePiuGrandeUltimo
     *
     * Metodo che aggiunge un numero intero elem in fondo ad una lista
     * a patto che sia strettamente piu` grande dell'ultimo elemento
     * della lista.
     *
     * alcuni esempi di risultati attesi
     *
     * lista  :
     * elem   : 1
     * atteso :
     *
     * lista  : 3, 1
     * elem   : 2
     * atteso : 3, 1, 2
     *
     * lista  : 3, 2
     * elem   : 2
     * atteso : 3, 2
     *
     * lista  : 1, 2, 3
     * elem   : 4
     * atteso : 1, 2, 3, 4
     *
     */
    public void aggiungeInFondoSePiuGrandeUltimo(int elem)  {
	     Node p = first;
       Node prev = null;
       while (p != null) {
         prev = p;
         p = p.getNext();
       }
       if(prev!= null && elem > prev.getElem())
        prev.setNext(new Node(elem,null));

    }
}
