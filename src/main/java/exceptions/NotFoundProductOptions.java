package exceptions;

public class NotFoundProductOptions extends RuntimeException {
  public NotFoundProductOptions(String product) {
    super("No existen opciones configuradas para " + product);
  }
}
