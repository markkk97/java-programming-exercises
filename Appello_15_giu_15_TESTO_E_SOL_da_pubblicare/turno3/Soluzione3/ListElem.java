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

	public ListElem nodoMinPari() {
               ListElem tmp = null;
	       if (this.getNext() != null) {
		  tmp = getNext().nodoMinPari();
			System.out.println("tmp dopo ric"  + tmp.getDato());
		  if (this.getDato()%2 == 0)
		     if (tmp != null) {
			if (tmp.getDato() > this.getDato()){
				System.out.println("tmp" + tmp.getDato());
				System.out.println("this" + this.getDato());
				tmp = this;
			}
		     }
		     else tmp = this;
	       }
	       else if (this.getDato()%2 == 0) tmp = this;
	       return tmp;
	}

}
