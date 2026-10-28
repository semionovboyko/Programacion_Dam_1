package Ejercicio5;

// ¿Podrá tener descendencia esta clase?

// Si pero al tener un metodo abstarcto obliga a sus
// descendientes a sobreescribir esos metodos abstractos

// ¿Se pueden sobrescribir todos sus métodos?

// el metodo get abstracto ya le obligas a sobrescribirlo
//pero el set peso al declararlo final no puedes sobrescribirlo


public abstract class vehiculo {
	private int peso;

	public final void setPeso(int p) {
		peso = p;
	}
	

	public abstract int getVelocidadActual();
}
