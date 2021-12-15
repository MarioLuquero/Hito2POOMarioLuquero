package Cuestion1;

public class Trabajador {

	String nombre;
	String ciudad;
	String contratoTemporal;
	float salarioBruto;


//Builders	
	
public Trabajador(String Cnombre, String Cciudad, float CsalarioBruto, String CcontratoTemporal) {
	
	nombre = Cnombre;
	ciudad = Cciudad;
	contratoTemporal = CcontratoTemporal;
	salarioBruto = CsalarioBruto;
		
}

//Getters y Setters

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public float getSalarioBruto() {
	return salarioBruto;
}

public void setSalarioBruto(float salarioBruto) {
	this.salarioBruto = salarioBruto;
}

public String isContratoTemporal() {
	return contratoTemporal;
}

public void setContratoTemporal(String contratoTemporal) {
	this.contratoTemporal = contratoTemporal;
}
	

public void generico() {
	System.out.println("El trabajador se llama "+nombre+", quien reside en "+ciudad+" ,su salario bruto es de "+salarioBruto+" y el contrato que presenta es de "+contratoTemporal);
}
}