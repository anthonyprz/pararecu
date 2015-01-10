package paraexamenarraylist;

public class Persona {
	public int dni;
	public Nombres nombre;
	public Apellidos apellido;
	public Numero numero;
	
	//getters
	public int getDni(){
		return this.dni;
	}
	public Nombres getNombre(){
		return this.nombre;
	}
	public Apellidos getApellido(){
		return this.apellido;
	}
	public Numero getNumero(){
		return this.numero;
	}
	//setters
	public void setDni(int dni){
		this.dni = dni;
	}
	public void setNombre(Nombres nombre){
		this.nombre = nombre;
	}
	public void setApellido(Apellidos apellido){
		this.apellido = apellido;
	}
	public void setNumero(Numero numero){
		this.numero = numero;
	}
	
}
