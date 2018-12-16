
public class Cafetetera {

	private int vasos;
	private float nivel_agua;
	private float consumibles [][]; //[número cápsula], [tiempo], [agua], [temperatura], [precio]
	private int max_consumibles;
	
	/**
	 * @param vasos
	 * @param nivel_agua
	 * @param consumibles
	 * @param max_consumibles
	 */
	public Cafetetera(int vasos, float nivel_agua, float[][] consumibles, int max_consumibles) {
		this.vasos = vasos;
		this.nivel_agua = nivel_agua;
		this.consumibles = new float[5][5];
		this.max_consumibles = max_consumibles;
		this.recargarCafetetera();
	}
	
	/**
	 * @return the vasos
	 */
	public int getVasos() {
		return vasos;
	}

	/**
	 * @param vasos the vasos to set
	 */
	public void setVasos(int vasos) {
		this.vasos = vasos;
	}

	/**
	 * @return the nivel_agua
	 */
	public float getNivel_agua() {
		return nivel_agua;
	}

	/**
	 * @param nivel_agua the nivel_agua to set
	 */
	public void setNivel_agua(float nivel_agua) {
		this.nivel_agua = nivel_agua;
	}

//recargar cafetetera
	/**
	 * @return consumibles los consumibles recargados al máximo
	 */
	public float[][] recargarCafetetera() {
		
		//capsulas
		for (int i=0; i<5; i++)
			consumibles[i][0] = max_consumibles;
		
		//tiempo
		consumibles[0][1] = 8;
		consumibles[1][1] = 9;
		consumibles[2][1] = 7;
		consumibles[3][1] = 9;
		consumibles[4][1] = 9;
				
		//agua por cápsula
		consumibles[0][2] = 0.15f;
		consumibles[1][2] = 0.2f;
		consumibles[2][2] = 0.25f;
		consumibles[3][2] = 0.3f;
		consumibles[4][2] = 0.25f;

		//temperatura
		consumibles[0][3] = 80;
		consumibles[1][3] = 90;
		consumibles[2][3] = 70;
		consumibles[3][3] = 90;
		consumibles[4][3] = 95;

		//precio
		consumibles[0][4] = 0.8f;
		consumibles[1][4] = 1;
		consumibles[2][4] = 1.1f;
		consumibles[3][4] = 1.2f;
		consumibles[4][4] = 1.5f;

		return consumibles;
	}
	
//comprobar el estado de la cafetetera
	public boolean hayAguaCafetera(int cafe) {
		if (nivel_agua >= consumibles[cafe][2]) 
			return true;
		return false;
	}

	public boolean hayCapsula(int cafe) {
		if (consumibles[cafe][0] > 0) 
			return true;
		return false;
	}

	public boolean hayVasos() {
		if (vasos > 0) 
			return true;
		return false;
	}
	
	/* Método que retorna lo siguiente:
	 * 		0 (ningún problema)
	 * 		1 (no hay agua)
	 * 		2 (no hay cápsula)
	 * 		3 (no hay vasos)
	 */
	public int estadoCafetera(int cafe) {
		if (!this.hayAguaCafetera(cafe)) 
			return 1;
		if (!this.hayCapsula(cafe))
			return 2;
		if (!this.hayVasos())
			return 3;
		return 0;
	}
	
	public void modificarAgua(int cafe) {
		this.nivel_agua -= this.consumibles[cafe][2];
	}
	
	public void modificarVasos() {
		this.vasos -= 1;
	}
	
	public void modificarCapsula(int cafe) {
		this.consumibles[cafe][0] -= 1.0f;
	}
	
	
	public int pedirCafe(int cafe) {
		int cod_err;
		if ((cod_err = estadoCafetera(cafe)) == 0) {
			this.modificarAgua(cafe);
			this.modificarCapsula(cafe);
			this.modificarVasos();
		}
		return cod_err;
	}

	//Mensajes de error	
	public void servirCafe(int cafe) {
		int mensaje = this.pedirCafe(cafe);
		if (mensaje == 0) {
			System.out.println("Café servido...........");
		}
		else {
			System.out.println(this.errorMensaje(mensaje));
		}
	}

	public String errorMensaje(int mensaje) {
		
		switch (mensaje) {
		case 1:
			return "Error, cafetera sin agua";
		case 2:
			return "Error, no hay cápsulas";
		case 3:
			return "Error, no hay vasos";
		}
		return null;
	}

}
