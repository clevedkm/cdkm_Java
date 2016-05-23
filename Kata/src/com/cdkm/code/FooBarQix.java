package com.cdkm.code;

import java.util.TreeMap;

public class FooBarQix {

	//version du traitement avec l'utilisation de la map
    public void affichierNombreUseMap(int nombreMax) {   	
    	TreeMap<Integer, String> fooBarQixMap = initialisationDuMap();
    	
    	for(int i =1 ;i <=nombreMax; i++){
    		String resultat =""; 
    		resultat = stringFromDivisor(fooBarQixMap, i, resultat);
    		//on regarde le nombre de fois que le chiffre est present
    		resultat = stringFromNumberOccurence(fooBarQixMap, resultat, i);
    		
    		System.out.println(resultat.equalsIgnoreCase("")? i :resultat);
    		//System.out.println(i+" =>"+resultat);
    	}
	}

	public TreeMap<Integer, String> initialisationDuMap() {
		TreeMap<Integer, String> fooBarQixMap = new TreeMap<>();
    	fooBarQixMap.put(3, "Foo");
    	fooBarQixMap.put(5, "Bar");
    	fooBarQixMap.put(7, "Qix");
		return fooBarQixMap;
	}

	private static String stringFromNumberOccurence(TreeMap<Integer, String> fooBarQixMap, String resultat, int i) {
		String chaine = Integer.toString(i);
		for(int j=0; j<chaine.length(); j++){
			//mettre la cle de laman en char
			for(Integer key : fooBarQixMap.keySet()){
				if(chaine.charAt(j) == key.toString().charAt(0))
					resultat += fooBarQixMap.get(key);
			}
		}
		return resultat;
	}
	
	private static String stringFromDivisor(TreeMap<Integer, String> fooBarQixMap, int i, String resultat) {
		for(Integer key : fooBarQixMap.keySet()){
			//on regarde le diviseur
			if(i % key == 0){
				resultat += fooBarQixMap.get(key);
			}
		}
		return resultat;
	}

}
