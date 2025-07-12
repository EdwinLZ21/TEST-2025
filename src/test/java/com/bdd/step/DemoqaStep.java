package com.bdd.step;

import com.bdd.pages.DemoqaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoqaStep extends ScenarioSteps {

    DemoqaPage demoqaPage;

    @Step
    public void Abrir_la_pagina_DemoQA_en_el_navegador_chrome() {
        demoqaPage.Abrir_la_pagina_DemoQA_en_el_navegador_chrome();
    }

    @Step
    public void hacerClickEnElBotonForm() {
        demoqaPage.hacerClickEnElBotonForm();
    }

    @Step
    public void hacerClickEnLaOpcionPracticeForm() {
        demoqaPage.hacerClickEnLaOpcionPracticeForm();
    }

    @Step
    public void validarQueSeVisualiceUnFormulario() {
        demoqaPage.validarQueSeVisualiceUnFormulario();
    }
}
