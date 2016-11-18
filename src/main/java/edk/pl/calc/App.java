package edk.pl.calc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/////// komentarz
    	@SuppressWarnings("resource")
		Scanner Wejsciowe = new Scanner(System.in);
        int menu = 0;
        int pierwsza = 0;
        int druga = 0;
        int wynik = 0;
        
        while(true){
	        System.out.println("Witaj w programie kalkulator!");
	        System.out.println("Wprwadź dwie liczby na których chcesz wykonać działanie");
	        
	        System.out.print("Podaj 1 liczbę: ");
	        pierwsza = Wejsciowe.nextInt();
	        System.out.print("Podaj drugą liczbę: ");
	        druga = Wejsciowe.nextInt();
	        System.out.println("Wybierz działanie jakie chcesz wykonać na liczbach");
	        System.out.println("1)Dodawanie 2)Odejmowanie 3)Dzielenie 4)Mnożenie");
	        System.out.print("Wybierz opcję wpisując 1 , 2 , 3, 4:    ");
	        
	        menu = Wejsciowe.nextInt();
	        
	        if (!(menu >=0 || menu <=5)) {
	           do {
	              System.out.print("Źle wybrana opcja, spróbuj jeszcze raz!");
	              menu = Wejsciowe.nextInt();
	           }
	           while (menu <= 0 || menu >= 5);
	          
	        }
	        else {
		        switch(menu) {
		            case 1:
		                wynik = pierwsza + druga;
		                System.out.println("Wynik dodawania to: " + wynik);
		                break;
		            case 2:
		                wynik = pierwsza - druga;
		                System.out.println("Wynik odejmowania to:" + wynik);
		                break;
		            case 3:
		                wynik = pierwsza / druga;
		                System.out.println("Wynik dzielenia to: " + wynik);
		                break;
		            case 4:
		                wynik = pierwsza * druga;
		                System.out.println("Wynik mnożenia to: " + wynik);
		                break;
		            default:
		                System.out.println("Niepoprawny parametr. Podaj liczbę z zakresu 1 -4 by wybrać działanie dla programu");
		        }
	        }
	        
	        //System.out.println( "Hello World!" );
        }
    }
}
