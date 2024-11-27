package exceptions;

public class NotDataFoundSavingAccount extends RuntimeException {
    public NotDataFoundSavingAccount(){
        super ("No se encuentra data disponible de la cuenta de ahorros");
    }
}
