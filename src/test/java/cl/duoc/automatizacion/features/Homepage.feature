Feature: Homepage Action

  Scenario: Que el titulo del Homepage sea el correcto
    Given Que el usuario ingresa al homepage
    When Cuando la pagina termine de cargarse
    Then Entonces el titulo del homepage será el correcto
