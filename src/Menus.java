import java.util.Scanner;

public class Menus {
	
	Cafetetera cafetetera = new Cafetetera(10, 5, new float[5][5], 2);
	
	public void menuCliente() {
		
		System.out.println(" __________________________________________");
		System.out.println("|                                          |");
		System.out.println("|                 CAFTETERA                |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|           Introducir opción:             |");
		System.out.println("|           (1) Visualizar Productos       |");
		System.out.println("|           (2) Administrar máquina        |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|__________________________________________|");
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = sc.nextInt();
		//boolean salir = false;
		
		switch (opcion) {
		
		case 1:
			this.menuProductos();
		//case 2:
			
		default:
			System.out.println("Opción incorrecta");
			this.menuCliente();
		}
		sc.close();
	}
	
	public void menuProductos() {
		
		System.out.println(" __________________________________________");
		System.out.println("|                                          |");
		System.out.println("|                 CAFTETERA                |");
		System.out.println("|                                          |");
		System.out.println("|         Café 0: Ristretto (0.80€)        |");
		System.out.println("|         Café 1: Vianés    (1.00€)        |");
		System.out.println("|         Café 2: Capuccino (1.10€)        |");
		System.out.println("|         Té   3: Tailandés (1.20€)        |");
		System.out.println("|         Té   4: Palestino (1.50€)        |");
		System.out.println("|                                          |");
		System.out.println("|        Pulsa la opción que deseas...     |");
		System.out.println("|                Para volver atrás pulsa 5 |");
		System.out.println("|__________________________________________|");
		
		Scanner sc = new Scanner(System.in);
		
		int cafe = sc.nextInt();
		
//		if ((cafe >= 0) && (cafe <=4)) {
//			cafetetera.pedirCafe(cafe);
//			cafetetera.servirCafe(cafe);
//			this.menuCliente();
//		}
//		else if (cafe == 5) {
//			this.menuCliente();
//		}
		switch (cafe) {
		case 0:
			cafetetera.pedirCafe(cafe);
			cafetetera.servirCafe(cafe);
			this.menuCliente();
		case 1:
			cafetetera.pedirCafe(cafe);
			cafetetera.servirCafe(cafe);
			this.menuCliente();
		case 2:
			cafetetera.pedirCafe(cafe);
			cafetetera.servirCafe(cafe);
			this.menuCliente();
		case 3:
			cafetetera.pedirCafe(cafe);
			cafetetera.servirCafe(cafe);
			this.menuCliente();
		case 4:
			cafetetera.pedirCafe(cafe);
			cafetetera.servirCafe(cafe);
			this.menuCliente();
		case 5:
			this.menuCliente();
		default:
			System.out.println("Opción incorrecta");
			this.menuProductos();			
		}
		
		
		sc.close();
	}
}