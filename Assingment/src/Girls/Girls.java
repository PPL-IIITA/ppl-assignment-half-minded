/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Girls;
import Boys.*;
/**
 *
 * @author Harsh Gupta
 */
public class Girls {
	public String name;
	public int att;
	public int exp;
	public int intelligence;
	public String boy;
	public int status;
	public String type;
        
        public int happy;
        

   /* public Girls(String name, int att, int exp, int intelligence, String boyf, int status, String type, int maintain, int happy) {
        this.name = name;
        this.att = att;
        this.exp = exp;
        this.intelligence = intelligence;
        
        this.status = status;
        this.type = type;
        this.maintain = maintain;
        this.happy = happy;
    }

     */ 
        
      public  boolean ready_to_commit(int maintain)
        {
            if(exp<=maintain)
            return true;
            
            else
                 return false;
        }
    public int getStatus() {
        return status;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    public int getExp() {
        return exp;
    }



 
        
	
}