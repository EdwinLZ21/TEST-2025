package com.bdd.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")
public class DemoqaPage extends PageObject {


    public void Abrir_la_pagina_DemoQA_en_el_navegador_chrome() {
        Browser.Start(this,"chrome");
    }
}
