package exceptions;

public class NotFoundProductException extends RuntimeException {
  public NotFoundProductException(String product) {
    super("la data para " + product + " no existe");
  }
}
