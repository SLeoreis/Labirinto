/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.util.PriorityQueue;

/**
 *
 * @author decom
 */
public class Node implements Comparable{
    private int h;
    private int f;
    private int g;
    private posicao posicao;
public Node (posicao posicao, int h){
    super();
    this.h = h;
    this.g = g;
    this.f = h+g;
    this.posicao=posicao;
}
    @Override
 public int compareTo(Object o) {
      if ( this.getF() > ((Node)o).getF())
          return 1;
      else if(this.getF() <((Node)o).getF())
          return -1;
      return 0;
    }
 

 public int calcularHeuristica(posicao finalNode){
      return Math.abs(finalNode.getLinha() - posicao.getLinha()) + Math.abs(finalNode.getColuna() - posicao.getColuna());  
 }
 
public void gerarsucessor(Node no, int matriz[][], posicao finalposicao, PriorityQueue borda){
    
    posicao pdir = new posicao(no.getposicao().getLinha(), no.getposicao().getColuna() +1);
    posicao pesq = new posicao(no.getposicao().getLinha(), no.getposicao().getColuna() -1);
    posicao psup = new posicao(no.getposicao().getLinha()+1, no.getposicao().getColuna());
    posicao pinf = new posicao(no.getposicao().getLinha()-1, no.getposicao().getColuna());
    
    if(pdir.getColuna() < matriz[0].length && matriz[pdir.getLinha()][pdir.getColuna()] ==1){
        Node novo=new Node(pdir,no.getG()+1);  
        borda.add(novo);
    }
    if(pesq.getColuna() >= 0 && matriz[pesq.getLinha()][pesq.getColuna()] == 1){
        Node novo=new Node(pesq,no.getG()+1);  
        borda.add(novo);
    }
    
    
    
}   
public void aestrela( Node inicialNode,posicao finalPos,PriorityQueue borda,int matriz[][]){
    borda.add(inicialNode);
    
    Fila fila= new Fila();
    
    while(!borda.isEmpty()){
        Node no=(Node) borda.remove();
    
        fila.enfileirar(no);

        if(no.posicao.getLinha()==finalPos.getLinha() && no.posicao.getColuna() == finalPos.getColuna()){
            break;
        }
       
        gerarsucessor(no, matriz, finalPos, borda);
    }
}
 public static void main(String[] args) {
     PriorityQueue<Node> borda = new PriorityQueue<>();
     Node c1 = new Node(new posicao(0,5),15456123);
     Node c2 = new Node(new posicao(1,2),56456456);
     Node c3 = new Node(new posicao(1,2),47874555);
     Node c4 = new Node(new posicao(1,2),14711457);
     borda.add(c1);
     borda.add(c2);
     borda.add(c3);
     borda.add(c4);
     
     while(!borda.isEmpty()){
         System.out.println((borda.remove()).getF());
}
        
        
 }
    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the f
     */
    public int getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(int f) {
        this.f = f;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the posicao
     */
    public posicao getposicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setposicao(posicao posicao) {
        this.posicao = posicao;
    }
 }
   