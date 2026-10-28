package ejercicios;

import java.util.*;

public class Persona {
	
	public String nombre;
	public int edad;
	private char sexo = 'H';
	public double peso;
	public double altura;
	public final static int bajoPeso = -1;
	public final static int pesoNormal = 0;
	public final static int sobrePeso = 1;
	
	public Persona() {
		comprobarSexo(sexo);
	}
	
	public Persona(String nom, int eda, char sex) {
		nombre = nom;
		edad = eda;
		sexo = sex;
		comprobarSexo(sexo);
		
	}
	
	public Persona(String nom, int eda, char sex, double pes, double alt) {
		 nombre = nom;
		 edad = eda;
		 sexo = sex;
		 peso = pes;
		 altura = alt;
		 comprobarSexo(sexo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIMC() {
		double imc = peso/(altura * altura);
		
        if (imc<20) {
            return bajoPeso;
            
        } else if (imc<=25 && imc>=20) {
            return pesoNormal;

        } else {
        	return sobrePeso;
        }
	}
	
	public boolean esMayorDeEdad() {
		
		boolean mayor = false;
		if(edad >= 18) {
			mayor = true;
		}
		return mayor;
	}
	
	public char comprobarSexo(char sexo) {
		
		if (sexo == 'H') 
			sexo = 'H';
		  if (sexo == 'M')
			 sexo = 'M';
		else 
			sexo ='H';
	
		return sexo;
	}
	
	public String toString() {
		return " Nombre: " + nombre + "\n Edad: " + edad + "\n Peso: " + peso + "\n Altura: " + altura;
	}
	
	public String imprimirPeso(){
	
		switch (calcularIMC()) {
		  case bajoPeso:
			  return "BAJO PESO";
		  case pesoNormal:
			  return "PESO NORMAL";
		  case sobrePeso:
			  return"SOBREPESO";
		}
		return nombre;
	}
	
	public static void main(String []args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nom = tec.next();
		System.out.println("Introduce tu edad: ");
		int eda = tec.nextInt();
		System.out.println("Introduce sexo: ");
		char sex = tec.next().charAt(0);
		System.out.println("Introduce tu peso: ");
		double pes = tec.nextDouble();
		System.out.println("Introduce tu altura");
		double alt = tec.nextDouble();
		
		Persona p1 = new Persona(nom, eda, sex, pes, alt);
		
		Persona p2 = new Persona(nom, eda, sex);
		p2.setPeso(54);
		p2.setAltura(1.45);
		
		Persona p3 = new Persona();
		p3.setNombre("Carlos");
		p3.setEdad(54);
		p3.setSexo('H');
		p3.setPeso(120);
		p3.setAltura(1.90);
		
		System.out.println(p1.toString());	
		System.out.println(p1.calcularIMC());
		System.out.println(p1.esMayorDeEdad());
		System.out.println(p1.imprimirPeso());
		
		System.out.println("__________________________");
		
		System.out.println(p2.toString());
		System.out.println(p2.calcularIMC());
		System.out.println(p2.esMayorDeEdad());
		System.out.println(p2.imprimirPeso());
		
		System.out.println("__________________________");
		
		System.out.println(p3.toString());	
		System.out.println(p3.calcularIMC());
		System.out.println(p3.esMayorDeEdad());
		System.out.println(p3.imprimirPeso());
		
		
	
	}

}
