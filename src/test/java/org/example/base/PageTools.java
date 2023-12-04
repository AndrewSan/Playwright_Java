package org.example.base;

import com.microsoft.playwright.*;

import java.nio.file.Paths;
import java.util.Random;
import java.util.random.RandomGenerator;

public class PageTools extends BaseTest{

    public static void sleep(Double sec){
        page.waitForTimeout(sec);
    }

    public static void takeScreenshot(){
        Random random = new Random();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./snaps/img" + random.nextInt() +".png")));
    }

    public static void takeFullScreenshot(){
        Random random = new Random();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./snaps/FullImg" + random.nextInt() +".png")).setFullPage(true));
    }

    public static void recordVideo(){

    }
}
