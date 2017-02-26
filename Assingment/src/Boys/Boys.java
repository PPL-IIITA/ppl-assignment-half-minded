package Boys;
import Girls.*;
public class Boys {
public     String name;
public     int budget;
public     int inteli;

public     int min_attraction;
public    String girl;
public    int status=0;
public    String type;



   /* public Boys(String name, int budget, int inteli, int attractiveness, int min_attraction, String girl, String status, String type) {
        this.name = name;
        this.budget = budget;
        this.inteli = inteli;
        this.attractiveness = attractiveness;
        this.min_attraction = min_attraction;
        this.girl = girl;
        this.status = status;
        this.type = type;
    }*/

   

    
public boolean ready_to_commit(int maintain,int att)
{
    if(budget>=maintain && min_attraction>=att)
            return true;
            else
        return false;
    
}

        
    public int getBudget() {
        return budget;
    }

    public String getGirl() {
        return girl;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}	








