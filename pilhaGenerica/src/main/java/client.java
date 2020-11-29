/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franklin
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha();
        
        System.out.println("Bem vindo ao teste da pilha :)");
        System.out.println();
        System.out.println("Vazia? (teste isEmpty)" + " " + p.isEmpty());
        System.out.println();
        System.out.println("Adicionando elementos.....");
        
        p.push(5);
        System.out.println("Topo (teste top) : "  + p.top());
        p.push(6);
        System.out.println("Topo (teste top) : " + p.top());
        p.push(7);
        System.out.println("Topo (teste top) : " + p.top());
        p.push(8);
        System.out.println("Topo (teste top) : " + p.top());
        System.out.println();

        
        System.out.println("Elementos adicionados!!");
        System.out.println();
        System.out.println("Existe dado? (teste existeDado) " + p.existeDado());
        System.out.println();
        System.out.println("Tamanho (teste tamanho):" +" " + p.tamanho());
        System.out.println();
         
        System.out.println("Vazia? (teste isEmpty) " + p.isEmpty());
        System.out.println();
        System.out.println("Pilha: " + p.toString() );
        System.out.println();
        System.out.println("Desempilhando (Teste pop):");
        System.out.println();
        while (!p.isEmpty()){
             Object elemento =  p.pop();
            System.out.println("Desempilhei "  + elemento);
        }
        System.out.println();
        System.out.println("Vazia? (teste isEmpty) "  + p.isEmpty());
        System.out.println();
        System.out.println("Existe dado? (teste existeDado) " + p.existeDado());
        System.out.println();
        System.out.println("Adicionando elementos para o segundo teste.....");
        p.push(10);
        System.out.println("Topo (teste top) : "  + p.top());
        p.push(9);
        System.out.println("Topo (teste top) : "  + p.top());
        p.push(8);
        System.out.println("Topo (teste top) : "  + p.top());
        p.push(7);
        System.out.println("Topo (teste top) : "  + p.top());
        p.push(6);
        System.out.println("Elementos adicionados!!");
        System.out.println("Topo (teste top) : " + p.top());
        System.out.println("Pilha: " + p.toString());
        System.out.println();
        p.pull(20);
        System.out.println("Topo (teste pull) : " + p.top());
        System.out.println("Pilha: " + p.toString());
        p.limpar();
        System.out.println();
        System.out.println("Pilha após limpeza: " + p.toString());
         
        
    }
    
}
