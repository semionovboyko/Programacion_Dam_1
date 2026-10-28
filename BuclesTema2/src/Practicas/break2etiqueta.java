package Practicas;

public class break2etiqueta {
	public static void main (String[] args){
        boolean esVerdadero = true;
        externo: //etiqueta la siguiente sentencia, es decir el for.
        for (int i = 0; i<5; i++){
            while (esVerdadero){
                System.out.println("Hola!");
                break externo; //break con etiqueta, hace que rompa la sentencia de la etiqueta, el for.
            }
            System.out.println("Despues del while!");
        }
        System.out.println("Despues del for!");
    }

}
/*Es común utilizar las etiquetas con bucles for o while y en conjunción con las sentencias break y continue.

Una etiqueta se coloca antes de la sentencia a etiquetar seguida de ‘:’
Son útiles cuando tenemos bucles anidados y queremos especificar en cuál de ellos queremos hacer un break o continue.

En el siguiente ejemplo tenemos un ejemplo de break etiquetado:
El funcionamiento normal del break sería salir del bucle más interno, el while en este caso.
Sin embargo, el break etiquetado hace que rompa el bucle etiquetado, es decir el for.*/