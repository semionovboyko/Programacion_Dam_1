package ejercicio4;

import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Modelo> listaModelos;
	private int numAptosPlanPive;
	
	public Catalogo(){ 
		listaModelos = new ArrayList<Modelo>();
		numAptosPlanPive = 0;
	}
	
	public void anyadir(Modelo m){
		//Averiguamos si m ya esta en la lista y en que posicion
		int pos = listaModelos.indexOf(m);
		if(pos == -1){
			//Es un nuevo modelo. Lo anyadimos al final
			listaModelos.add(m);
		} else {
			//Vamos a sustituir el elemento de la posicion pos
			//Si el que quitamos era AptoPlanPive, decrementamos numero
			if(listaModelos.get(pos).aptoPlanPIVE()){
				numAptosPlanPive --;
			}
			
			//Sustituimos uno por otro
			listaModelos.remove(pos);
			listaModelos.add(pos,m);
			//o bien 
			//listaModelos.set(pos, m); //Escribir encima
		}
		//Si m es apto incrementamos número
		if(m.aptoPlanPIVE()){
			numAptosPlanPive ++;
		}
	}
	public String toString(){
		String res = "";
		for(Modelo m: listaModelos){
			res = res + m.toString();
			if(m.aptoPlanPIVE()) res += "-  APTO";
			else res += "- NO APTO";
			res += "Tasa " + Modelo.tasaPorEmisiones(m.getEmisiones())+ " euros";
		}
		return res;
	}
    
}
