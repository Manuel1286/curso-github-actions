@Test

Feature: Validación de credenciales en OrangeHRM Live

  @TC1
  Scenario Outline: Login online en OrangeHRM Live con diferentes tipos de credenciales
    Given que el usuario se encuentra en la página de login de OrangeHRM Live
    When ingresa el username <username> y la password <password>
    And hace clic en el botón de login
    Then el sistema debe mostrar el resultado <resultado>

    Examples:
      | username    | password       | resultado                |
      | Admin       | admin123       | Login exitoso            |
      | UsuarioFake | admin123       | Invalid credentials      |
      | Admin       | PasswordErrada | Invalid credentials      |
      | ""          | ""             | Username cannot be empty |