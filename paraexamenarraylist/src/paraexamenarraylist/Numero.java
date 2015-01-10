package paraexamenarraylist;

public class Numero {
	private int numero;
	private String letra;
	private String nombreJuego;
	
	public int getNumero (){
		return this.numero;
	}
	public String getLetra (){
		return this.letra;
	}
	public String getNombreJuego(){
		return this.nombreJuego;
	}
	
	public void setNumero (int numero){
		this.numero = numero;
	}
	public void setLetra (String letra){
		this.letra = letra;
	}
	public void setNombreJuego (String nombreJuego){
		this.nombreJuego = nombreJuego;
	}
}
