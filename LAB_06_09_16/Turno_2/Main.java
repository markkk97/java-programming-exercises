/*
 *
 * Implementare il metodo eliminaElementiMinoriDi(x) dell'interfaccia
 * List che elimina da una lista di numeri interi tutti gli elementi
 * strettamente minori di x.
 *
 * alcuni esempi di risultati attesi
 *
 * lista  :
 * x      : 5
 * atteso :
 *
 * lista  : 1, 2, 3, 4
 * x      : 5
 * atteso :
 *
 * lista  : 1, 2, 3, 4, 5, 6, 7, 8
 * x      : 5
 * atteso : 5, 6, 7, 8
 *
 * lista  : 5, -5, 6, -6, 7, -7
 * x      : 5
 * atteso : 5, 6, 7
 *
 * Non e` consentito usare instanceof, cast, cicli ne' creare nodi
 * della lista oltre a quelli gia` presenti al momento
 * dell'invocazione del metodo.
 * 
 * Non e` consentito modificare il codice al di fuori delle aree
 * delimitate dai commenti COMPLETARE DA QUI... FINO A
 * QUI. All'interno di tali aree va scritto un solo metodo.
 *
 */

abstract class List {
    public abstract List eliminaElementiMinoriDi(int x);
}

class Nil extends List {
    public String toString()
    { return ""; }

    /* COMPLETARE DA QUI */
    public List eliminaElementiMinoriDi(int x)
    { return this; }
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
    public List eliminaElementiMinoriDi(int x)
    {
	if (elem < x) return next.eliminaElementiMinoriDi(x);
	else {
	    next = next.eliminaElementiMinoriDi(x);
	    return this;
	}
    }
    /* COMPLETARE FINO A QUI */
}

public class Main {
    public static void main(String[] args)
    {
	test(crea(), 5, "");
	test(crea(1, 2, 3, 4), 5, "");
	test(crea(1, 2, 3, 4, 5, 6, 7, 8), 5, "5, 6, 7, 8, ");
	test(crea(5, -5, 6, -6, 7, -7), 5, "5, 6, 7, ");
    }

    public static void test(List l, int x, String atteso)
    {
	System.out.println("lista    : " + l);
	System.out.println("x        : " + x);
	l = l.eliminaElementiMinoriDi(x);
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
