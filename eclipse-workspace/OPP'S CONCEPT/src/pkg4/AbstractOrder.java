package pkg4;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class AbstractOrder 
{
    private long id ;
    
    private LocalDate CreatedOn;
    
    private BigDecimal Amount ;
    
    public abstract void Validate();
    public abstract void Process();
    
    public final void cancle() 
    {
    	System.out.println("this method is for cancalation of orders");
    }
     
}
