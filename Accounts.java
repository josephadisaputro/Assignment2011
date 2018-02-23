public class Accounts <a>{
    private int SIN;
    private double limit;
    private double balance;
    private checking check = new checking();
    
    public Accounts(){
        
    }
    public Accounts(int s){
        SIN = s;
    }
    
    //this is limit in transaction (it applies in withdraw and overdraft)
    public void setLimit(double limit){
        this.limit = limit;
    }
    public double getLimit(){
        return this.limit;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdrawAmount(double amount){
        balance = balance - amount;
        if(balance < 0){
            penalty();
        }    
    }
    public void depositAmount(double amount){
        balance = balance + amount;
    }
    
    public void penalty(){
    
        
    
    }
    
    
    
    
    
    public class checking{
    
        private String Option;
        public checking(String o){
            setOverdraft(o);
        }
        public checking(){
            
        }
        
        // USER IS DECIDING OVERDRAFT PROTECTION ON CHECKING ACCOUNT
        public void setOverdraftOption(String userChoice){
            String temp = userChoice;
            
            if(temp.equals("No overdraft protection")){
                Option = temp;
            }else if(temp.equals("Pay per use")){
                Option = temp;
            }else if(temp.equals("Monthly fixed fee")){
                Option = temp;
            }else{
                //execption for non of the options
            }
        }
        
        
    }
    
    public class credit{
    
        private String rule;
        private Account acc = new Account();
        public credit(String o){
            setOverdraft(o);
        }
        
        // USER IS DECIDING OVERDRAFT PROTECTION ON CHECKING ACCOUNT
        public void setOverdraftOption(String userChoice){
            String temp = userChoice;
            
            if(temp.equals("High credit limit")){
                rule = temp;
            }else if(temp.equals("Low credit limit")){
                rule = temp;
            }else{
                //execption for non of the options
            }
        }
        
        public void setCreditLimit(){
        double currLimit = acc.getLimit();
        if(rule.equals("Low credit limit")){    
            if(currLimit <= 1000){
                setlimit(currLimit);
            }else{
                // to be continued
            }
        }else if(rule.equals("Low credit limit")){    
            if(currLimit > 1000){
                setlimit(currLimit);
            }else{
                // to be continued
            }
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[]args){
        
    }
}
