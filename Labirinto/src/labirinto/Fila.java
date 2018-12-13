/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

/**
 *
 * @author leore
 */
public class Fila <T>{
 
private int  elemento;
private int tamanho;
    
 public void enfileirar(T elemneto){
     this.tamanho=elemento;
     this.tamanho++;
    this.adicionar(elemento);
 }   
    


    private void adicionar(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
