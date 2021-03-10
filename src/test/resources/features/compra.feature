Feature: compra de productos online
  Yo como usuario quiero ingresar a la pagina web para poder comprar productoS

  Scenario: Comprar productos online desde la pagina web
    Given abro la aplicacion
    When escojo un producto o productos que quiero comprar
    And los agrego al carrito para finalizar la compra
    Then el sistema me debe mostrar mensaje Su pedido ha sido confirmado con éxito!
