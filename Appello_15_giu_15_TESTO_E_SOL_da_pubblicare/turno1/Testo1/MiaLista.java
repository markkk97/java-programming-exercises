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

		public void mettiMaxInFondo(int currmax){
			int max = 0;
			if (currmax > this.getDato())
					max = currmax;
			else
					max = this.getDato();

			if (this.getNext() == null) {
				   this.setNext(new ListElem());
				   this.getNext().setDato(max);
				}
				else this.getNext().mettiMaxInFondo(max);


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
	 * mettiMaxInFondo
	 *
	 * metodo che modifica una lista aggiungendo un nodo in fondo alla medesima.
	 * Tale nodo deve avere come valore il massimo di quelli già contenuti nella
	 * lista (0 se la lista è vuota)
         *
         * La soluzione realizzata deve essere RICORSIVA
	 *
	 * Alcuni esempi di risultati attesi:
	 *
	 * lista     :
	 * atteso    : 0
	 *
	 * lista     : 1
	 * atteso    : 1 1
	 *
	 * lista     : 1, 2
	 * atteso    : 1, 2, 2
	 *
	 * lista     : 2, 3, 4, 7, 6, 5
	 * atteso    : 2, 3, 4, 7, 6, 5, 7
	 *
	 */
	public void mettiMaxInFondo() {
		if ( first == null){
			first = new ListElem();
			first.setDato(0);
		} else {
			first.mettiMaxInFondo(0);
		}
		}





	}




	
