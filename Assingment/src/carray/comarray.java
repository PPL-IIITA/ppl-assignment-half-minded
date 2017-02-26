/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carray;

import Boys.Boys;
import Girls.Girls;

/**
 *
 * @author Harsh Gupta
 */
public class comarray {

Boys c[]=new Boys[1000];    
Girls d[]=new Girls[1000];       
  
       // int te_aarray[1000];


    public void comarray(Boys b, Girls g,int i) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        c[i]=new Boys();
        d[i]=new Girls();
        c[i]=b;
        d[i]=g;
       //System.out.println(c[i].name+"   "+d[i].name);
    }
   
    
}
