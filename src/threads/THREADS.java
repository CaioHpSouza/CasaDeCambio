/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author caiog
 */
public class THREADS {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws InterruptedException {
       
        
        ThreadDeposito t1 = new ThreadDeposito(100, "Dolar");
        ThreadDeposito t2 = new ThreadDeposito(100, "Euro");
        ThreadDeposito t3 = new ThreadDeposito(100, "Peso");
        
        
        
        t1.start();
        t2.start();
        t3.start();
        //t2.start();
    }

    

    

    
}
