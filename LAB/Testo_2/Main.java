/*
 *
 * Implementare il metodo sposta(x) dell'interfaccia List che elimina
 * da una lista di numeri interi tutte le occorrenze di x ed inserisce
 * x in fondo alla lista.
 *
 * alcuni esempi di risultati attesi
 *
 * lista  :
 * x      : 5
 * atteso : 5
 *
 * lista  : 1, 2, 3, 4, 5
 * x      : 3
 * atteso : 1, 2, 4, 5, 3
 *
 * lista  : 1, 2, 3, 4, 5
 * x      : 8
 * atteso : 1, 2, 3, 4, 5, 8
 *
 * lista  : 5, 4, 1, 5, 3
 * x      : 5
 * atteso : 4, 1, 3, 5
 *
 * Non e` consentito usare instanceof, cast, o cicli.
 * 
 * Non e` consentito modificare il codice al di fuori delle aree
 * delimitate dai commenti COMPLETARE DA QUI... FINO A
 * QUI. All'interno di tali aree va scritto un solo metodo.
 *
 */

abstract class List {
    public abstract List sposta(int elem);
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
	test(crea(), 5, "5, ");
	test(crea(1, 2, 3, 4, 5), 3, "1, 2, 4, 5, 3, ");
	test(crea(1, 2, 3, 4, 5), 8, "1, 2, 3, 4, 5, 8, ");
	test(crea(5, 4, 1, 5, 3), 5, "4, 1, 3, 5, ");
    }

    public static void test(List l, int x, String atteso)
    {
	System.out.println("lista    : " + l);
	System.out.println("x        : " + x);
	l = l.sposta(x);
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
