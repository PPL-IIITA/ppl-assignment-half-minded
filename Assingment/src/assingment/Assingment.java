package assingment;
import gift.*;
import Boys.*;
import Girls.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import carray.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author Harsh Gupta
 */
public class Assingment {

     
    public static void check_committment(Boys[] b,Girls[] g,int i)
    {
            Logger logger = Logger.getLogger("log");  
                FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("log.txt");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
       // logger.info("sdf");  

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  
            
         int re; 
                    re=i;
                        int h,l;
                       comarray cv=new comarray();
            	for(h=0;h<i;h++){
                	for(l=0;l<re;l++){
                        
                            if(b[h].ready_to_commit(b[h].budget,b[h].min_attraction)&&g[l].ready_to_commit(b[h].budget) && g[l].status==0  && b[h].status == 0)
                        {
				b[h].girl = g[l].name;
				g[l].boy = b[h].name;   
				b[h].status = 1;
				g[l].status = 1;
                                cv.comarray(b[h],g[l],i);
                              //  System.out.println(b[h].name+" "+g[l].name); 
                                logger.info(b[h].name+""+g[l].name);
            		}
		}
//                            System.out.println(h+"h"+l+"l");
			}
                
 
   
              
    
   
    }
public static void main(String[] args) throws IOException {
      
        int i,j;
		i=0;
		j=0;
		Boys boys[] = new Boys[1000];
                ccsv vc=new ccsv();
                vc.generate();
		//String csvFile = "C:/Users/Harsh Gupta/Documents/NetBeansProjects/Assingment/src/assingment/b.csv";
		String line = "";
		String csvSplit = ",";
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader("Boy.csv"));
			while((line = buff.readLine() )!= null){
				String[] boy = line.split(csvSplit);
				System.out.println(boy[0] +"\t"+ boy[1]+"\t"+  boy[2] +"\t"+ boy [3]);
				boys[i] = new Boys();
			    boys[i].name = boy[0];
				//b[i].inteli = Integer.parseInt(boy[1]);
				//b[i].attractiveness = Integer.parseInt(boy[2]); 
				boys[i].min_attraction = Integer.parseInt(boy[1]);
				boys[i].budget = Integer.parseInt(boy[2]);
				//b[i].girl="";
				boys[i].status = Integer.parseInt(boy[3]);
				i++;
                                
			}
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
            
                  gccsv jki=new gccsv();
                  jki.generate();
                Girls gir[] = new Girls[1000];
		//String gcsv = "C:/Users/Harsh Gupta/Documents/NetBeansProjects/Assingment/src/assingment/g.csv";
		String gline = "";
		String gSplit = ",";
		BufferedReader gbuff = null;
       
		try{
			gbuff = new BufferedReader(new FileReader("Girl.csv"));
			while((gline = gbuff.readLine() )!= null){
				String[] girl = gline.split(gSplit);
				//System.out.println(girl[0] + girl[1] + girl[2] + girl[3]+ girl[4]+ girl[5]);
				gir[j] = new Girls();
			    gir[j].name = girl[0];
				//g[j].intelligence = Integer.parseInt(girl[1]);
				gir[j].att = Integer.parseInt(girl[2]); 
				
				gir[j].exp = Integer.parseInt(girl[3]);
				gir[j].boy="";
                                gir[j].status = Integer.parseInt(girl[4]);
				j++;
                                
			}
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                
                        check_committment(boys,gir,i);
                
   //                     comarray v= new comarray();
                        
 

   

}
                
        // TODO code application logic here
 }            
		
                
                

   
    
