import java.util.Date;
public class Account2{

    public class checking{
        private String OverdraftOption;
        private double balance = 0.0;
        private boolean MonthlyOverdraft = false;
        private boolean DailyOverdraft = false;
        public checking(){
        
        }
        
        public double getBalance(){
            return this.balance;
        }
        public void depositAmount(double amount){
            balance = balance + amount;
        }
        public void withdrawAmount(double amount){
            double temp = balance - amount;
            if(temp < 0 && OverdraftOption.equals("No overdraft protection")){
                balance -= NSF;
            }else if (temp < 0 && OverdraftOption.equals("Pay per use")){       
                balance -= amount;
                DailyOverdraft = true;
            }else if (temp < 0 && OverdraftOption.equals("Monthly fixed fee")){       
                balance -= amount;
                MonthlyOverdraft = true;
            }
        }
        
        // USER IS DECIDING OVERDRAFT PROTECTION ON CHECKING ACCOUNT
        private void setOverdraftOption(String userChoice){
            
            if(userChoice.equals("No overdraft protection")){
                OverdraftOption = userChoice;
            }else if(userChoice.equals("Pay per use")){
                OverdraftOption = userChoice;
            }else if(userChoice.equals("Monthly fixed fee")){
                OverdraftOption = userChoice;
            }else{
                //execption for non of the options
            }
        }
    
    }
    public class credit{
        private String LimitOption;
        private double balance = 0.0;
        private double limit;
        private double CLE = 29.0;
        public credit(){
        
        }
        public credit(double l){
            setLimit(l);
        }
        
        public void setLimitOption(String userChoice){
            
            if(userChoice.equals("High credit limit")){
                LimitOption = userChoice;
            }else if(userChoice.equals("Low credit limit")){
                LimitOption = userChoice;
            }else{
                //execption for non of the options
            }
        }
        
        public double getBalance(){
            return this.balance;
        }
        public void depositAmount(double amount){
            balance = balance + amount;
            
        }
        
        public void withdrawAmount(double amount){
            double temp = balance - amount;
            if(temp < 0 && LimitOption.equals("High credit limit")){
                balance -= CLE;
            }else if (temp < 0 && LimitOption.equals("Low credit limit")){    
                balance = balance;
            }else{
                balance = balance - amount;
            }
            
        }
        public void setLimit(double limit){
            
            if(rule.equals("Low credit limit")){
                if(limit <= 1000){
                    this.balance = limit;
                    this.limit = limit;
                }else{
                    // to be continued
                }
            }else if(rule.equals("Low credit limit")){    
                if(limit > 1000){
                this.balance = limit;
                this.limit = limit;
                }else{
                    // to be continued
                }
            }    
        }
        
        
        
    }
    
    private checking ch = new checking();
    private credit cr = new credit();
    
    private int SIN;

    
    
    
    // this is a constructor for accounts class
    public void Accounts(int s){
        SIN = s;
    }

    
    public double getCheckingBalance(){
        return ch.getBalance();
    }
    public double getCreditBalance(){
        return cr.getBalance();
    }
}

