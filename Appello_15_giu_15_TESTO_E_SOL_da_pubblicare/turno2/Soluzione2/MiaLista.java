public class MiaLista {

	private class ListElem {

		private int dato;
		private ListElem next = null;

		public int getDato() {
			return dato;
		}

		public void setDato(int dato) {
			this.dato = dato;
		}

		public ListElem getNext() {
			return next;
		}

		public void setNext(ListElem next) {
			this.next = next;
		}
		
		public String stringaConElementiInOrdineInverso(String s) {
			String risultato = s;
			
			if (next != null) {
				risultato = 
						next.stringaConElementiInOrdineInverso(risultato) +
						", ";
			}
			
			return risultato + dato;
		}

		public int somma() {
			int val=0;
			if (getDato() > 0) val = getDato();
			if (getNext()==null) return val;
			else return val + getNext().somma();
		}

	}

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
	 * nodoSomma
	 * 
	 * metodo che, applicato a una listala modifica inserendo in testa un nodo nuovo
	 * contenente la somma dei numeri positivi contenuti nella medesima (0 se la lista 
	 * è vuota).
         *
         * La soluzione realizzata deve essere RICORSIVA
	 * 
	 * Alcuni esempi di risultati attesi:
	 * 
	 * lista     : 
	 * atteso    : 0
	 * 
	 * lista     : 1
	 * atteso    : 1, 1
	 * 
	 * lista     : 1, -2
	 * atteso    : 1, 1, -2
	 * 
	 * lista     : 2, -2, 4, 7, -6, -4
	 * atteso    : 13, 2, -2, 4, 7, -6, -4
	 * 
	 */
	public void nodoSomma() {
	   // DA COMPLETARE
	   int somma;
	   ListElem nuovo = new ListElem();
	   if (first == null) {
	      first=nuovo;
	      first.setDato(0);
	   }
	   else {
		  somma = first.somma();
		  nuovo.setDato(somma);
		  nuovo.setNext(first);
		  first = nuovo;
	   }
	}

}
