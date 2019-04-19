public class TestMiaLista {

	public static void main(String[] args) {
		testa(creaLista(), "null");
		testa(creaLista(1), "null");
		testa(creaLista(1, 2), "rif al nodo che contiene 2");
		testa(creaLista(1, 2, 3, 4), "rif al nodo che contiene 2");
		testa(creaLista(6, 3, 4, 4, 6, 7), "rif al nodo che contiene 4");
	}

	public static void testa(MiaLista lista, String risultatoAtteso) {
                ListElem ris= null;
		String risS = "";
		System.out.println("lista       : " + lista);
                ris = lista.nodoMinPari();
		if (ris==null) risS = "ottenuto    : null";
		else risS = "ottenuto    : rif al nodo che contiene " + ris.getDato();
		System.out.println(risS);
		System.out.println("atteso      : " + risultatoAtteso);
                System.out.println();
                if (risS.equals("ottenuto    : " + risultatoAtteso)) System.out.println("OK");
                else System.out.println("ERRORE");
	}

	public static MiaLista creaLista(Integer...valori) {
		MiaLista lista = new MiaLista();
		for (int i = valori.length - 1; i >= 0; i--) {
			lista.insert(valori[i]);
		}
		return lista;
	}

}
