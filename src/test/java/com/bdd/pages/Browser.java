package com.bdd.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class Browser {

    public static void Start(PageObject page, String browserType) {
        WebDriver driver = null;

        if (browserType.equalsIgnoreCase("chrome")) {
            // Ruta al driver manual
            String driverPath = Paths.get("drivers", "chromedriver").toAbsolutePath().toString();
            System.setProperty("webdriver.chrome.driver", driverPath);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
        }

        if (driver != null) {
            page.setDriver(driver);
            page.open();
        } else {
            throw new RuntimeException("No se pudo inicializar el navegador: " + browserType);
        }
    }
}
