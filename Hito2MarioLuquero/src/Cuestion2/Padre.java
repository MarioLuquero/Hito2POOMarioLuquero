package Cuestion2;

public abstract class Padre {

	String nombre;
	int edad;
	
//Builders
	
public Padre(String Cnombre, int Cedad) {
	nombre = Cnombre;
	edad = Cedad;

}

public void Saludar() {
	System.out.println("Hola, soy el padre");
 }

}


//La clase padre no est� instanciada, esto ocurre cuando tienen m�todos en com�n