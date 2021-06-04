package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) throws IOException {

        final WebDriver edge = SetUp.get("http://localhost:8083/MOVIE-TICKET/login", 3000);

//        Take screen shot and save the image to specific path on your computer
        TakesScreenshot screenshot = (TakesScreenshot) edge;

        final File image = screenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(image, new File("C:\\Users\\pragathi\\downloads\\Screenshots\\selenium-screenshot.png"));

    }
}
