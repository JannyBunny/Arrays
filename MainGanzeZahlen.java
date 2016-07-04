/**
 * Die Klasse enthaelt in ihrer main-Methode Treiber-Code zum Erstellen von 
 * Instanzen der Klasse SammlungGanzerZahlen und zum testweisen Aufruf von
 * deren Methoden.
 * @author JRG
 *
 */


public class MainGanzeZahlen {

/**
 * main-Methode: Die einzige Methode dieser Klasse. 
 * Erzeugt Objekte der Klasse SammlungGanzerZahlen und ruft deren Methoden auf.
 * @param args Argumente von main
 */
	public static void main(String[] args) {
		
	
		
		SammlungGanzerZahlen ganzeZahlen = new SammlungGanzerZahlen();
		
//		try {
		ganzeZahlen.zeigeZahlen();
//		}
//		catch(ArrayStoreException ex)
//		{
//			System.err.println("ArrayStoreException");
//		}
//		catch(IndexOutOfBoundsException ex)
//		{
//			System.err.println("ArrayStoreException");
//		}
		
		ganzeZahlen.gibAnzahl();
		
		try {
			ganzeZahlen.gibZahl(1000);
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.err.println("IndexOutOfBoundsException gibZahl(1000)");
		}
		
		
		
		try {
			for (int i=0; i<=100; i++){
				ganzeZahlen.hinzufuegen(i+1);
			}
		}
//		catch(IllegalArgumentException ex)
//		{
//			System.err.println("IllegalArgumentException");
//		}
		catch(ArrayStoreException ex)
		{
			System.err.println("ArrayStoreException ganzeZahlen.hinzufuegen(0-100)");
		}
//		catch(NullPointerException ex)
//		{
//			System.err.println("IndexOutOfBoundsException");
//		}
		
		try {
			for (int i=0;i<=100;i++)
				ganzeZahlen.loescheZahl(i);
		}
		catch(NullPointerException ex)
		{
			System.err.println("NullPointerException ganzeZahlen.loescheZahl(0-100)");
		}
		
		ganzeZahlen.zeigeZahlen();
		
		//array füllen
		try {
			for (int i=0; i<=13; i++){
				ganzeZahlen.hinzufuegen(i);
			}
		}
//		catch(IllegalArgumentException ex)
//		{
//			System.err.println("IllegalArgumentException");
//		}
		catch(ArrayStoreException ex)
		{
			System.err.println("ArrayStoreException hinzufuegen 0-12");
		}
		
		ganzeZahlen.zeigeZahlen();
		
		
		try {
			for (int i=0;i<=100;i++)
				ganzeZahlen.fuegeZahlEin((i*i)+1, i+1);
		}
		catch(ArrayStoreException ex)
		{
			System.err.println("ArrayStoreException fuegeZahlEin((i*i), i ");
		}
//		catch(IndexOutOfBoundsException ex)
//		{
//			System.err.println("IndexOutOfBoundsException");
//		}
		ganzeZahlen.zeigeZahlen();
		
		//für exception
		
		try {
			for (int i=15;i<=18;i++)
				ganzeZahlen.loescheZahl(i);
		}
		catch(NullPointerException ex)
		{
			System.err.println("NullPointerException ganzeZahlen.loescheZahl(18-20)");
		}
		ganzeZahlen.zeigeZahlen();
		
		try {
			ganzeZahlen.fuegeZahlEin(0, 1);
		}
		catch(ArrayStoreException ex)
		{
			System.err.println("ArrayStoreException fuegeZahlEin(0, 1)");
		}
		try {
			ganzeZahlen.fuegeZahlEin(0, 1);
		}
		catch(ArrayStoreException ex)
		{
			System.err.println("ArrayStoreException fuegeZahlEin(0, 1)");
		}
		
		ganzeZahlen.zeigeZahlen();
		
//		ganzeZahlen.gibGroesste();
		try {
			ganzeZahlen.gibGroesste();
		}
		catch(GleicheZahlException ex)
		{
			System.err.println("GleicheZahlException gibGroesste");
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.err.println("IndexOutOfBoundsException gibGroesste");
		}
		
		
//		//löschen, für exception
//		try {
//			for (int i=0;i<=21;i++)
//				ganzeZahlen.loescheZahl(i);
//		}
//		catch(NullPointerException ex)
//		{
//			System.err.println("NullPointerException gibGroesste 0-20");
//		}
		
//		ganzeZahlen.gibGroesste();
		try {
			ganzeZahlen.gibGroesste();
		}
		catch(GleicheZahlException ex)
		{
			System.err.println("GleicheZahlException gibGroesste2");
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.err.println("IndexOutOfBoundsException gibGroesste2");
		}
		
		
//		ganzeZahlen.gibKleinste();
		try {
			ganzeZahlen.gibKleinste();
		}
		catch(GleicheZahlException ex)
		{
			System.err.println("GleicheZahlException gibKleinste");
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.err.println("IndexOutOfBoundsException gibKleinste");
		}
		ganzeZahlen.zeigeZahlen();
		
//		//löschen, für exception
//		try {
//			for (int i=0;i<=21;i++)
//				ganzeZahlen.loescheZahl(i);
//		}
//		catch(NullPointerException ex)
//		{
//			System.err.println("NullPointerException loescheZahl 0-18");
//		}
		
//		ganzeZahlen.gibKleinste();
		try {
			ganzeZahlen.gibKleinste();
		}
		catch(GleicheZahlException ex)
		{
			System.err.println("GleicheZahlException gibKleinste2");
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.err.println("IndexOutOfBoundsException gibKleinste2");
		}
		
		
		
//		ganzeZahlen.kehreReihenfolgeUm();
//		try {
		ganzeZahlen.kehreReihenfolgeUm();
//		}
//		catch(ArrayStoreException ex)
//		{
//			System.err.println("ArrayStoreException");
//		}
//		catch(IndexOutOfBoundsException ex)
//		{
//			System.err.println("ArrayStoreException");
//		}
		ganzeZahlen.zeigeZahlen();
		
	}

}
