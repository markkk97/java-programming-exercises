public class Main {
    public static void main(String[] args)
    {
	test(crea(-1), "");
	test(crea(-3, 1), "1");
	test(crea(1, -3), "1");
	test(crea(-1, 2, -3), "2, -3");
    }

    public static void test(List l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.eliminaPrimoNegativo();
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
