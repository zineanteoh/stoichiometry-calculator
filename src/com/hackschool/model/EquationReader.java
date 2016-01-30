/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackschool.model;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author teohzinean
 */
public class EquationReader {
    
    private List<String> reactantList;
    private List<String> productList;
    public EquationReader(String eqation){
        
        
        String equation = eqation.trim().toLowerCase();
        String reactants = equation.split("=")[0].trim();
        String products = equation.split("=")[1].trim();
        
        this.reactantList = Arrays.asList(reactants.split("\\+"));
        this.productList = Arrays.asList(products.split("\\+"));
    }
    
    
    
    
    
    public  double getReactantCoefficient(String element){
        element = element.trim().toLowerCase();
        double coefficient = -1;
        String tempCoefficient = "";
        boolean isFound = false;
        for(String reactant: this.reactantList){
            if (reactant.trim().contains(element)){
                isFound = true;
              for(int i=0; i< reactant.trim().length();i++){
                  char temChar = reactant.trim().charAt(i);
                  if (temChar >= '0' && temChar <= '9'){
                      tempCoefficient+=temChar;
                  }
                  else{
                      if (temChar == '.')  {
                          tempCoefficient += temChar;
                      } else {
                          break;
                      }
                    
                  }
              }
               
                
                
            }
        }
        
        if (isFound){
            if (tempCoefficient.isEmpty()){
                coefficient = 1.0;
            }
            else{
                coefficient = Double.parseDouble(tempCoefficient);
            }
        }
        
        return coefficient;
    }
    
    public double getProductCoefficient(String element){
        element = element.trim().toLowerCase();
        double coefficient = -1;
        String tempCoefficient = "";
        boolean isFound = false;
        for(String product: this.productList){
            if (product.trim().contains(element)){
                isFound = true;
              for(int i=0; i< product.trim().length();i++){
                  char temChar = product.trim().charAt(i);
                  if (temChar >= '0' && temChar <= '9'){
                      tempCoefficient+=temChar;
                  }
                  else{
                      if (temChar == '.') {
                          tempCoefficient += temChar;
                      } else {
                          break;
                      }
                  }
              }
               
                
                
            }
        }
        
        if (isFound){
            if (tempCoefficient.isEmpty()){
                coefficient = 1;
            }
            else{
                coefficient = Double.parseDouble(tempCoefficient);
            }
        }
        
        return coefficient;
    }
    
}
