/*
 *
 * Implementare il metodo eliminaPrimiXElementiNegativi(x)
 * dell'interfaccia List che elimina da una lista di numeri interi i
 * primi x elementi negativi.
 *
 * alcuni esempi di risultati attesi
 *
 * lista  :
 * x      : 3
 * atteso :
 *
 * lista  : 1, 2, 3, 4
 * x      : 3
 * atteso : 1, 2, 3, 4
 *
 * lista  : 0, 1, -1, 2, -2, 3, -3, 4, -4
 * x      : 3
 * atteso : 0, 1, 2, 3, 4, -4
 *
 * lista  : 0, -5, -6, -7
 * x      : 10
 * atteso : 0
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
    public abstract List eliminaPrimiXElementiNegativi(int x);
}

class Nil extends List {
    public String toString()
    { return ""; }
    
    /* COMPLETARE DA QUI */
    public List eliminaPrimiXElementiNegativi(int x)
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
    public List eliminaPrimiXElementiNegativi(int x)
    {
	if (x <= 0) return this;
	else if (elem < 0) return next.eliminaPrimiXElementiNegativi(x - 1);
	else {
	    next = next.eliminaPrimiXElementiNegativi(x);
	    return this;
	}
    }
    /* COMPLETARE FINO A QUI */
}

public class Main {
    public static void main(String[] args)
    {
	test(crea(), 3, "");
	test(crea(1, 2, 3, 4), 3, "1, 2, 3, 4, ");
	test(crea(0, 1, -1, 2, -2, 3, -3, 4, -4), 3, "0, 1, 2, 3, 4, -4, ");
	test(crea(0, -5, -6, -7), 10, "0, ");
    }

    public static void test(List l, int x, String atteso)
    {
	System.out.println("lista    : " + l);
	System.out.println("x        : " + x);
	l = l.eliminaPrimiXElementiNegativi(x);
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

