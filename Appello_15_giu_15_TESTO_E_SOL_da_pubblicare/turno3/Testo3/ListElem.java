public class ListElem {

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

	

}
