package com.orangehrmlive.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CredencialesUI {


    public static final Target INPUT_USERNAME =
            Target.the("Digitar Username")
                    .locatedBy("//input[@name='username']");

    public static final Target INPUT_PASSWORD =
            Target.the("Digitar password")
                    .locatedBy("//input[@name='password']");

    public static final Target BTN_CONTINUAR =
            Target.the("Boton de Continuar")
                    .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public static final Target ERROR =
            Target.the("Scenario Uno")
                    .locatedBy("//P[@class='oxd-text oxd-text--p oxd-alert-content-text']");


    public static final Target ERROR_UNO=
            Target.the("Scenario Uno")
                    .locatedBy("//P[@class='oxd-text oxd-text--p oxd-alert-content-text']");


}
