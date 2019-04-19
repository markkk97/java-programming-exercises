/*
 *
 * Implementare il metodo inserisci(x) dell'interfaccia List che
 * inserisce x in una lista ordinata di numeri interi. La lista
 * risultante dall'inserimento deve essere a sua volta ordinata e x
 * non va inserito se gia` presente.
 *
 * alcuni esempi di risultati attesi
 *
 * lista  :
 * x      : 3
 * atteso : 3
 *
 * lista  : 1, 3, 4, 7
 * x      : 2
 * atteso : 1, 2, 3, 4, 7
 *
 * lista  : 1, 3, 4, 7
 * x      : 10
 * atteso : 1, 3, 4, 7, 10
 *
 * lista  : 1, 3, 4, 7, 10
 * x      : 10
 * atteso : 1, 3, 4, 7, 10
 *
 * Non e` consentito usare instanceof, cast, o cicli.
 * 
 * Non e` consentito modificare il codice al di fuori delle aree
 * delimitate dai commenti COMPLETARE DA QUI... FINO A
 * QUI. All'interno di tali aree va scritto un solo metodo.
 *
 */

abstract class List {
    public abstract List inserisci(int x);
}

class Nil extends List {
    public String toString()
    { return ""; }
    
    /* COMPLETARE DA QUI */

    /* COMPLETARE FINO A QUI */
}

class Cons extends List {
    private int elem;
    private List next;

    public Cons(int elem, List next)
    {
	this.elem = elem;
	this.next = next;
    }

    public String toString()
    { return elem + ", " + next.toString(); }
    
    /* COMPLETARE DA QUI */

    /* COMPLETARE FINO A QUI */
}

public class Main {
    public static void main(String[] args)
    {
	test(crea(), 3, "3, ");
	test(crea(1, 3, 4, 7), 2, "1, 2, 3, 4, 7, ");
	test(crea(1, 3, 4, 7), 10, "1, 3, 4, 7, 10, ");
	test(crea(1, 3, 4, 7, 10), 10, "1, 3, 4, 7, 10, ");
    }

    public static void test(List l, int x, String atteso)
    {
	System.out.println("lista    : " + l);
	System.out.println("x        : " + x);
	l = l.inserisci(x);
	System.out.println("ottenuto : " + l);
	System.out.println("atteso   : " + atteso);
	System.out.println(l.toString().equals(atteso) ? "=== OK" : "=== ERRORE");
	System.out.println();
    }
    
    public static List crea(Integer...v)
    {
	List l = new Nil();
	for (int i = v.length - 1; i >= 0; i--)
	    l = new Cons(v[i], l);
	return l;
    }
}
