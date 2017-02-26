/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Boys.*;
/**
 *
 * @author Harsh Gupta
 */
public class ccsv {
    
    String name;// naam ladke ka.
    int att_level;//attractiveness 
    int int_level;//his IQ
    int budget;//his bidget
    //bool isCommitted;
    int min_att_lev;
    boolean isCommitted;//f=comm,t=not_comm
    int typ;
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    void generate()throws FileNotFoundException, IOException
    //public ArrayList<boys> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("Boy.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<Boys> B = new ArrayList<Boys>(100);
        for(int i=0;i<100;i++)
        {
            name="BoyNo"+(i);
            //int_level= (int) (10+(Math.random()*19));
            min_att_lev=(int) (0+(Math.random()*10));
       
            budget=(int) (100+(Math.random()*1000));
            
            
       //     typ=(int)1+(int)(Math.random()*3);
            sb.append(name);
            sb.append(',');
            sb.append(att_level);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(int_level);
            sb.append(',');
            sb.append(min_att_lev);
            sb.append(',');
         //   sb.append(typ);
            sb.append("\n");
            //sb.append(',');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("Boy.csv Done!");
    }

}
