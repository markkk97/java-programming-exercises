public class Main {
    public static void main(String[] args)
    {
	test(crea(1), "");
	test(crea(1, 2), "2");
	test(crea(2, 1), "2, 1");
	test(crea(2, 2, 2, 2), "2, 2, 2");
  test(crea(13, 5, 7, 2), "13, 5, 7, 2");
  //test(crea(5, 8, 1, -6), "2, 2, 2");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.eliminaPrimoSePiuPiccolo();
	System.out.println("ottenuto : " + l);
	System.out.println("atteso   : " + atteso);
	System.out.println(l.toString().equals(atteso) ? "=== OK" : "=== ERRORE");
	System.out.println();
    }

    public static List crea(Integer...v)
    {
	List l = new List();
	for (int i = v.length - 1; i >= 0; i--)
	    l.insertFirst(v[i]);
	return l;
    }
}
