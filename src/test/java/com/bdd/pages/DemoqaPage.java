package com.bdd.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

@DefaultUrl("https://demoqa.com/")
public class DemoqaPage extends PageObject {

    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    private WebElement btn_form;

    @FindBy(xpath = "//span[contains(text(),'Practice Form')]")
    private WebElement option_practice_form;

    @FindBy(xpath = "//div[@class='practice-form-wrapper']")
    private WebElement formularioVisible;


    public void Abrir_la_pagina_DemoQA_en_el_navegador_chrome() {

        Browser.Start(this,"chrome");
    }


    public void hacerClickEnElBotonForm() {
        btn_form.click();
    }

    public void hacerClickEnLaOpcionPracticeForm() {
        option_practice_form.click();
    }

    public void validarQueSeVisualiceUnFormulario() {
        if (!formularioVisible.isDisplayed()) {
            throw new AssertionError("Formulario no está visible");
        }
    }
}
