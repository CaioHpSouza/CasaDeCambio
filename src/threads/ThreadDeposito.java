/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caiog
 */
public class ThreadDeposito extends Thread {
    double valor;
    String tipo;
    
    public ThreadDeposito(double n, String moeda)
    {
        valor = n;
        tipo = moeda; 
    }
 
    
    @Override
    public void run()
    {
        if(tipo.equals("Dolar")){
            valor = valor * 5.58;
        }else if(tipo.equals("Euro") ){
            valor = valor * 6.56;
        }else{
            valor = valor * 0.072;
        }
        
        System.out.println(tipo+" : "+valor);
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadDeposito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
