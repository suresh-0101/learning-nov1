package encapsulation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
    private Long   accountNumber;
    private Double balance;


    public Double getAccountBalance(Long requestAccountNumber, Integer pin) throws Exception{

         if(isValidAccountNumber(requestAccountNumber)){
             if(isValidPin(pin)) {
                 return balance;
             }else{
                 throw new InvalidPinException("Invalid Pin Exception");
             }
         }else{
             throw new InvalidUserException("Invalid Account Number");
         }
    }
    private boolean isValidAccountNumber(Long requestAccountNumber) throws InvalidUserException {
            return true;
    }
    private boolean isValidPin(Integer pin){
        return true;
    }

}
