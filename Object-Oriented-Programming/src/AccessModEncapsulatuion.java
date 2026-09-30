/**
 * standard demonstration of encapsulation 
 */
public class AccessModEncapsulatuion {
 public static void main(String[] args) {
    try {
        BankAccount DristisAccount = new BankAccount("IFSC1234567", "Bank of India");
         try{
        DristisAccount.deposit(100);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
        DristisAccount.withdrawl(100000);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error :"+e.getMessage());
        }
        DristisAccount.Display();
    } 
    catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
         }
         
}
}
class BankAccount{
    // key ides of encapsulation - check for invariants (conditions for the object to be valid)
    // and manatain them for the life time of the object    
    private double balence ;
    private  final String ifscCode ;
    private final String bankName;
    // initializing the values of the private final variables using constructor
    // because these properties are final and can be initialized only once
    // the main goal is to prevent object from getting created at the first place 
    // in case the properties are not initialized properly
    BankAccount(String ifscCode, String bankName){
        if( ifscCode==null || ifscCode.length()!=11 || bankName==null || bankName.length()==0)
           throw new IllegalArgumentException("invalid input");
        else{
        this.balence= 0.0f;
        this.ifscCode=ifscCode;
        this.bankName=bankName;
            }
}
// conditions are put in behaviours like deposit and withdrawl 
// to prevebt user from manipulating the sensitive properties 
    public void deposit(double DepositedAmount){
        if(DepositedAmount<=0)
         throw new IllegalArgumentException("invalid input for deposit");
            else
        this.balence+=DepositedAmount;
    }
    public void  withdrawl(double WithdrawlAmount){
        if(WithdrawlAmount <=0 || WithdrawlAmount > this.balence)
            throw new IllegalArgumentException("invalid input for withdrawl");
            else 
            this.balence-=WithdrawlAmount;
    }
    void Display(){
        System.out.println(this.balence);
        System.out.println(this.bankName);
        System.out.println(this.ifscCode);
    }
}