# language: es
# encoding: UTF-8

@EFI-481 @DemoPFM @RegresionPFM
Característica: Como usuario del Banco de Bogota validar el Tour por PFM cuando el usuario ingresa por primera vez

  @FirstTime  @TEST_EFI-1634
  Escenario: Usuario ingresa a la aplicación por primera vez podrá navegar en el Demo de Pfm
    Dado que Maria ingresa a la aplicacion de banca movil
    Cuando ella ingresa a PFM
    Entonces podrá navegar en el tour de Pfm

  @BackQueryOption @TEST_EFI-1635
  Escenario: Usuario ingresa a la aplicación por primera vez podrá regresar a Macro categorías
    Dado que Daniela ingresa a la aplicacion de banca movil
    Cuando ella ingresa a PFM
    Entonces podrá navegar hasta Macro categorías y retroceder a opciones de consulta
