import java.util.Scanner;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	
	Cafetetera cafetetera = new Cafetetera(10, 5, new float[5][5], 2);
	Usuario user = new Usuario("usuario", 1234);
	
	public void menuCliente() {
		
		System.out.println(" __________________________________________");
		System.out.println("|                                          |");
		System.out.println("|                 CAFTETERA                |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|           Introducir opción:             |");
		System.out.println("|           (1) Visualizar Productos       |");
		System.out.println("|           (2) Administrar máquina        |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|__________________________________________|");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		
		case 1:
			this.menuProductos();
		case 2:
			this.menuUsuario();
		default:
			System.out.println("Opción incorrecta");
			this.menuCliente();
		}
	}
	
	public void menuProductos() {
		
		System.out.println(" __________________________________________");
		System.out.println("|                                          |");
		System.out.println("|                 CAFTETERA                |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|         Café 0: Ristretto (0.80€)        |");
		System.out.println("|         Café 1: Vianés    (1.00€)        |");
		System.out.println("|         Café 2: Capuccino (1.10€)        |");
		System.out.println("|         Té   3: Tailandés (1.20€)        |");
		System.out.println("|         Té   4: Palestino (1.50€)        |");
		System.out.println("|                                          |");
		System.out.println("|        Pulsa la opción que deseas...     |");
		System.out.println("|                                          |");
		System.out.println("|                Para volver atrás pulsa 5 |");
		System.out.println("|__________________________________________|");
				
		int cafe = sc.nextInt();
		
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
	}
	
	public void menuUsuario() {
		System.out.println(" __________________________________________");
		System.out.println("|                                          |");
		System.out.println("|              CAFTETERA(Admin)            |");
		System.out.println("|                                          |");
		System.out.println("|     Introduce el usuario y contraseña    |");
		System.out.println("|__________________________________________|");
		
		System.out.print("Usuario: ");
		user.setLogin(sc.next());
		System.out.println("Contraseña: ");
		int contraseña = sc.nextInt();
		if (contraseña == user.getPassword()) 
			this.menuAdmin();
		else {
			System.out.println("Contraseña incorrecta");
			this.menuCliente();
		}
	}
	
	
	
	public void menuAdmin() {
		
		System.out.println(" __________________________________________");
		System.out.println("|                                          |");
		System.out.println("|              CAFTETERA(Admin)            |");
		System.out.println("|                                          |");
		System.out.println("|         (1) Ver recaudación              |");
		System.out.println("|         (2) Estado consumibles           |");
		System.out.println("|         (3) Añadir vasos                 |");
		System.out.println("|         (4) Añadir agua                  |");
		System.out.println("|         (5) Añadir cápsulas              |");
		System.out.println("|         (6) Recoger recaudación          |");
		System.out.println("|         (7) Salir                        |");
		System.out.println("|         (8) Apagar Cafetetera            |");
		System.out.println("|                                          |");
		System.out.println("|        Pulsa la opción que deseas...     |");
		System.out.println("|__________________________________________|");
				
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Opción no disponible de momento");
			this.menuAdmin();
		case 2:
			System.out.println("Número de vasos: " + cafetetera.getVasos());
			System.out.println("Nivel de agua: " + cafetetera.getNivel_agua());
			for(int i = 0; i < 5; i++)
				System.out.println("Cápsulas del consumible " + i + ": " + (cafetetera.capsulasCafe(i)));	
			this.menuAdmin();
		case 3:
			System.out.print("Introduce el número de vasos: ");
			cafetetera.setVasos(sc.nextInt());
			this.menuAdmin();
		case 4:
			System.out.print("Introduce el nivel del agua: ");
			cafetetera.setNivel_agua(sc.nextFloat());
			this.menuAdmin();
		case 5:
			System.out.print("Introduce el número de cápsulas: ");
			cafetetera.añadirCapsulas(sc.nextFloat());
			this.menuAdmin();
		case 6:
			System.out.println("Opción no disponible de momento");
			this.menuAdmin();
		case 7:
			this.menuCliente();
		case 8:
			System.out.println("Apagando cafetera.....................................................................................................................................................................");
			System.exit(1);
		default:
			System.out.println("Opción incorrecta");
			this.menuAdmin();			
		}	
	}  
}
