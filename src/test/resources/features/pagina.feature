Feature: Purchase productos de Opencart

  @producto1Path
    #Scenario: Proceso de compra1
    Scenario Outline: Proceso de compra1

    Given USer ingreso a la pagina OpenCart
    When selecciono un producto <name> <country> <city> <card> <month> <year>
    Then venta exitosa

    Examples:
          | name       | country   | city  | card       | month   | year |
          | Gabriel    | Ecuador   | Quito | 0995787383 | Junio   | 2024 |
