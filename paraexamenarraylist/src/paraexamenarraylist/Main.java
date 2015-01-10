package paraexamenarraylist;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;




	public class Main {
		
		public static void main (String [] arg){
			//metodos
			ArrayList<Persona> personas = new ArrayList<Persona>();
			Scanner sc = new Scanner(System.in);
			
			try {
				FileInputStream fis = new FileInputStream("persona.txt");
				InputStreamReader isr = new InputStreamReader(fis, "UTF8");
				BufferedReader br = new BufferedReader(isr);
				
				String linea = br.readLine();
				String [] campos = null;
				
				while (linea !=null){
					Persona persona = new Persona();
					Nombres nombres = new Nombres();
					Apellidos apellidos = new Apellidos();
					Numero numero = new Numero();
					Juego jue = new Juego();
					
					
					
					campos = linea.split("#");						//primer split
					String sitio = campos[0];
					String [] campos2 = sitio.split("/");			//segundo split
					
					persona.setDni(Integer.parseInt(campos[0]));	//dni de Persona
					
					nombres.setNombre(campos[1]); 					//nombre de NOMBRES
					persona.setNombre(nombres);	//importante!!!!!!!!!!!!
					
					
					sitio = campos[2];
					campos2 = sitio.split("/");
					apellidos.setApellido(campos2[0]);              //apellidos de Apellidos
					apellidos.setApellido2(campos2[1]);
					persona.setApellido(apellidos);  //importante!!!!!!!!!!!!
					
					sitio = campos [3];
					campos2 = sitio.split("/");//hay que colocarlo si o si por lo visto
																		//numero de Numero
					numero.setNumero(Integer.parseInt(campos2[0]));  //es in para eso se usa (Integer.parseInt)
					numero.setLetra(campos2[1]);
					numero.setNombreJuego((campos2[2]));
					persona.setNumero(numero);  //importante!!!!!!!!!!!!
					
					
					personas.add(persona);
					linea = br.readLine();
					
				}
				//mostrar en pantalla
				for (int i=0;i<personas.size() ;i++ ) {
					Nombres nomb = new Nombres();
					Apellidos ape = new Apellidos();
					Numero num  = new Numero();
					System.out.println("-------------------------------------");
					System.out.println("DNI: " + (personas.get(i).getDni()));
					
					nomb = personas.get(i).getNombre();
					System.out.println("nombre: " + nomb.getNombre());
					
					ape = personas.get(i).getApellido();
					System.out.println("apellido: " + ape.getApellido());
					System.out.println("segundo apellido: " + ape.getApellido2());
					
					num = personas.get(i).getNumero();
					System.out.println("numero: " + num.getNumero());
					System.out.println("letra: " + num.getLetra());
					System.out.println("juego: " + num.getNombreJuego());
					
				}
				
			
			}catch(Exception ioe) {
				System.out.println("aqui hay un error: "+ioe);
			}

			
		}
	}
