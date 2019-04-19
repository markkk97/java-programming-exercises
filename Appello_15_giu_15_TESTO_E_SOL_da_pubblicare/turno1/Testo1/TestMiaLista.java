public class TestMiaLista {

	public static void main(String[] args) {
		testa(creaLista(), "0");
		testa(creaLista(1), "1, 1");
		testa(creaLista(1, 2), "1, 2, 2");
		testa(creaLista(2, 3, 4, 7, 6, 5), "2, 3, 4, 7, 6, 5, 7");
	}
	
	public static void testa(MiaLista lista, String risultatoAtteso) {

		System.out.println("lista       : " + lista);
                lista.mettiMaxInFondo();
		System.out.println("ottenuto    : " + lista);
		System.out.println("atteso      : " + risultatoAtteso);
                System.out.println();
                if (lista.toString().equals(risultatoAtteso)) System.out.println("OK");
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
