#Author: Juan Olivares
#Feature: para el inicio de session aplicacion
@tag
Feature: Inicio de sesion

  @tag1
  Scenario: Caso100_Inicio de sesion incorrecto Pagina
    Given Ingreso al navegador
    When Ingresar usuario "lalo"
    And Ingresar contrasena "1234"
    And Click en boton ingresar
    Then se valida el mensaje de ingreso incorrecto

 #@tag2
 # Scenario Outline: Caso110_Registro
 #   Given Ingreso al navegador
 #  When diligencio formulario<usuario><contrasena><Direccion>
   

 #  Examples: 
 #    | usuario | contrasena | Direccion |
 #    | "lalo"  | "1234"     |"Calle falsa 123"|
