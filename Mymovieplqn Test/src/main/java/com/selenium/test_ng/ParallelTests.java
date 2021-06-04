package com.selenium.test_ng;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ParallelTests {

    @Test
    @DisplayName("Open Chrome")
    void openChrome() {
//        File file = new File("D:\\Softwares\\web-drivers\\chromedriver.exe");

//        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8083/MOVIE-TICKET/login");
    }

    @Test
    @DisplayName("Open Edge")
    void openEdge() {

//        File file = new File("D:\\Softwares\\web-drivers\\msedgedriver.exe");

//        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("http://localhost:8083/MOVIE-TICKET/login");
    }
}
