package com.cinte.qa.pruebacompra.questions;

import com.cinte.qa.pruebacompra.pages.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensaje implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductosPage.MENSAJE_PEDIDO_EXITOSO).viewedBy(actor).asString();
    }

    public static ElMensaje es(){
        return new ElMensaje();
    }
}
