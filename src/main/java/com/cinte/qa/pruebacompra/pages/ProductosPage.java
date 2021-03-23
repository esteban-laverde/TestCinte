package com.cinte.qa.pruebacompra.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {

    public static final Target MENU_TELEVISORES = Target.the("Televisores")
            .locatedBy("//div[contains(@class,'menu menu-nonfood')]//div[6]//a");
    public static final Target COMPUTADOR_ASUS = Target.the("COMPUTADOR ASUS")
            .locatedBy("//button[contains(@data-productid,'566742')]");
    public static final Target POLITICA_COOKIES = Target.the("Aceptar Cookies")
            .locatedBy("//button[contains(@class,'swal2-confirm swal2-styled')]");
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Boton Agregar al Carrito")
            .locatedBy("(//a[@href='/cart'])[4]");
    public static final Target TERMINOS_CONDICIONES = Target.the("Acepto terminos y condiciones")
            .locatedBy("//label[@class='checkbox terms-label']//span");
    public static final Target BOTON_FINALIZAR_COMPRA = Target.the("Boton finalizar compra")
            .locatedBy("//button[@class='btn primary go-to-checkout']");
    public static final Target EMAIL = Target.the("Campo Email")
            .locatedBy("//input[@id='client-pre-email']");
    public static final Target CONTINUAR_CON_LA_COMPRA = Target.the("BOTON CONTINUAR CON LA COMPRA")
            .locatedBy("//button[@id='btn-identified-user-button']");
    public static final Target BOTON_CONTINUAR = Target.the("BOTON CONTINUAR")
            .locatedBy("//button[@id='btn-client-pre-email']");
    public static final Target DIA_ENTREGA = Target.the("Dia de la entrega")
            .locatedBy("//div[@aria-activedescendant='true']");
    public static final Target BOTON_IR_METODO_DE_PAGO = Target.the("Boton ir a metodo de pago")
            .locatedBy("//button[@class='submit btn btn-large btn-success btn-go-to-payment']");
    public static final Target PAGO_EN_EFECTIVO = Target.the("Selecciona pago en efectivo")
            .locatedBy("//span[@class='payment-group-item-text' and contains(text(),'PagoEfectivo')]");
    public static final Target COMPRAR_AHORA = Target.the("Boton comprar ahora")
            .locatedBy("(//span[contains(text(),'Comprar ahora')])[2]");
    public static final Target MENSAJE_PEDIDO_EXITOSO = Target.the("Mensaje de pedido exitoso!!")
            .locatedBy("//span[contains(text(),'Su pedido ha sido confirmado con éxito!')]");


}
