# language: es
# encoding: UTF-8

Característica: Inicio de sesión en la app Éxito

  Como usuario de la aplicación Éxito
  Quiero iniciar sesión correctamente
  Para acceder a las funcionalidades disponibles en mi cuenta

  @Login
  Escenario: Inicio de sesión exitoso en la aplicación Éxito

    Dado que abro la aplicación Éxito en mi dispositivo
    Cuando ingreso a la sección de inicio de sesión
    Y proporciono mis credenciales válidas
    Entonces debería acceder correctamente a mi cuentaion