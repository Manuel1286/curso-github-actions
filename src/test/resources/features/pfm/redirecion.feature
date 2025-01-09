# language: es
# encoding: UTF-8
@EFI-481
Característica: Como usuario del Banco de Bogotá quiero validar los redireccionamietos que hay desde PFM

  @OTHER_MOVEMENTS @TEST_EFI-2615
  Escenario: Validar redireccionamiento a pagos realizados

    Dado     que CamilaN ingresa a PFM
    Cuando   ingrese a Movimientos
    Entonces consultará pagos realizados

  @REDIRECTION_SP @TEST_EFI-2616
  Escenario: Validar redireccionamiento a servicios públicos

    Dado     que Candancee ingresa a PFM
    Cuando   de clic sobre inscripción de servicios públicos
    Entonces redireccionará a servicios públicos










