/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author aleja
 */
public class Rectangulo {// simulitud como trabajar con funciones en matlab
    private int base, altura, area;
    
    public Rectangulo(int base, int altura){
       this.base=base;
       this.altura=altura;
    }
    
    public void CalculoArea(){
    
        area=base*altura;       
    }
    public void Imprimir(){
    CalculoArea();
    System.out.println("el area es "+area);
    }
}