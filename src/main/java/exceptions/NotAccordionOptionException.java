package exceptions;

public class NotAccordionOptionException extends RuntimeException {

  public NotAccordionOptionException(String accordionOption) {
    super("La opción ingresada no existe en el menú " + accordionOption);
  }
}
