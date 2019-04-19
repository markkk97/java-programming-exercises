public class MiaLista {


	private ListElem first;

	public MiaLista() {
		first = null;
	}

	public void insert(int val) {

		ListElem elem = new ListElem();
		elem.setDato(val);
		elem.setNext(first);

		first = elem;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void printList() {
		System.out.print(this.toString());
	}

	public String toString() {
		ListElem iterator = first;
		String s = "";
		while (iterator != null) {
			s += iterator.getDato();
			iterator = iterator.getNext();
			if (iterator != null)
				s += ", ";
		}
		return s;
	}

	/*
	 * nodoMinPari
	 * 
	 * metodo che restituisce il riferimento a uno dei nodi, della lista a cui è applicato,
         * contenente il minimo numero pari (null se la lista è vuota o se non ve ne sono).
         *
         * La soluzione realizzata deve essere RICORSIVA. Le liste si suppongono essere costituite
	 * da soli valori > 0
	 * 
	 * Alcuni esempi di risultati attesi:
	 * 
	 * lista     : 
	 * atteso    : null
	 * 
	 * lista     : 1
	 * atteso    : null
	 * 
	 * lista     : 1, 2
	 * atteso    : rif al nodo che contiene 2
	 * 
	 * lista     : 1, 2, 3, 4
	 * atteso    : rif al nodo che contiene 2
	 * 
	 * lista     : 6, 3, 4, 4, 6, 7
	 * atteso    : rif al nodo che contiene 4
	 * 
	 */
	public ListElem nodoMinPari() {
	   // DA COMPLETARE
           if (first == null) return null;
           else return first.nodoMinPari();
	}

}
