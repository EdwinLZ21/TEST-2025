#language: en

  @DEMOQA_FEATURE
  Feature: Registro en DemoQA
    As a usuario
    I  hacer pruebas en el formulario de DemoQA
    So validar mis conocimientos

  @DEMOQA_SCENARIO_01
  Scenario: Ingresar al apartado de formularios
    Given Abrir la pagina DemoQA en el navegador chrome
    And hacer click en el boton form
    And hacer click en la opcion practice form
    Then validar que se visualice un formulario
