package com.cinte.qa.pruebacompra.interactions;

import com.cinte.qa.pruebacompra.drivers.OwnWebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

public class Swipe implements Interaction {

	private int size;
	private String ubication;

	public Swipe(int size, String ubication) {
		this.size = size;
		this.ubication = ubication;
	}

	@Override
	@Step("{0} Scrolling on Page")
	public <T extends Actor> void performAs(T actor) {
		JavascriptExecutor jse = (JavascriptExecutor) OwnWebDriver.getDriver();
		switch (ubication) {
		case "vertical":
			jse.executeScript("window.scrollBy(0," + size + ")");
			break;
		case "horizontal":
			jse.executeScript("window.scrollBy(" + size + ",0)");
			break;
		default:
			break;
		}
	}

	public static Swipe vertical(int size) {
		return Tasks.instrumented(Swipe.class, size, "vertical");
	}

	public static Swipe horizontal(int size) {
		return Tasks.instrumented(Swipe.class, size, "horizontal");
	}

}