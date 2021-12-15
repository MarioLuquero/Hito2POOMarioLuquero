package Cuestion2;

//Al tener la hija los mismos metodos que el padre está habiendo un caso de herencia, que ocurre cuando pasan los atributos de una clase a otra, los "hereda"


//Builders

public class Hija extends Padre {

	public Hija(String Cnombre, int Cedad) {
		super(Cnombre, Cedad);
		
	}

	public void Saludar() {
		System.out.println("Hola, soy la hija");
	 }
}