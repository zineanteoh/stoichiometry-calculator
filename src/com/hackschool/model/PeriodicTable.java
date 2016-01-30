/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackschool.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author teohzinean
 */
public class PeriodicTable {
    
    Map<String,Double> elements = new HashMap<String,Double>();
    
    
    public PeriodicTable(){
        
        elements.put("H",1.0);
        //Helium?
        elements.put("He",2.0);
        elements.put("Li",7.0);
        elements.put("Be",9.0);
        elements.put("B",11.0);
        elements.put("C",12.0);
        elements.put("N",14.0);
        elements.put("O",16.0);
        //Fluorine?
        elements.put("F",19.0);
        elements.put("Na",23.0);
        elements.put("Mg",24.0);
        elements.put("Al",27.0);
        elements.put("Si",28.0);
        elements.put("P",31.0);
        elements.put("S",32.0);
        //Chlorine?
        elements.put("Cl", 35.5);
        elements.put("K",39.0);
        elements.put("Ca",40.0);
        elements.put("Sc",45.0);
        elements.put("Ti",48.0);
        elements.put("V",51.0);
        elements.put("Cr",52.0);
        elements.put("Mn",55.0);
        elements.put("Fe",56.0);
        elements.put("Co",59.0);
        elements.put("Ni",59.0);
        elements.put("Cu",64.0);
        elements.put("Zn",65.0);
        elements.put("Ga",70.0);
        elements.put("Ge",73.0);
        elements.put("As",75.0);
        elements.put("Se",79.0);
        //Bromine?
        elements.put("Br",80.0);
        //Other elements
        elements.put("Ag",108.0);
        elements.put("Cs",55.0);
        elements.put("Rb",85.0);
        elements.put("Sn",119.0);
        elements.put("Au",197.0);
        
    }
    
    public double getAtomicMass(String atomicSymbol){
        double atomicMass = -1;
        if (elements.containsKey(atomicSymbol)){
            atomicMass = elements.get(atomicSymbol);
        }
        return atomicMass;
    }
    
}
