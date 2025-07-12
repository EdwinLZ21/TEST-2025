package com.bdd.stepdefinitions;

import com.bdd.step.DemoqaStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DemoqaStepDefinition {

    @Steps
    DemoqaStep demoqaStep;

    @Given("Abrir la pagina DemoQA en el navegador chrome")
    public void Abrir_la_pagina_DemoQA_en_el_navegador_chrome(){
         demoqaStep.Abrir_la_pagina_DemoQA_en_el_navegador_chrome();
    }


    @And("hacer click en el boton form")
    public void hacerClickEnElBotonForm() {
        demoqaStep.hacerClickEnElBotonForm();
    }

    @And("hacer click en la opcion practice form")
    public void hacerClickEnLaOpcionPracticeForm() {
        demoqaStep.hacerClickEnLaOpcionPracticeForm();
        
    }

    @Then("validar que se visualice un formulario")
    public void validarQueSeVisualiceUnFormulario() {
        demoqaStep.validarQueSeVisualiceUnFormulario();
    }
}
