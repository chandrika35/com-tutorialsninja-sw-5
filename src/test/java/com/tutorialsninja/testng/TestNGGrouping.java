package com.tutorialsninja.testng;

import org.testng.annotations.Test;

public class TestNGGrouping {
    @Test(groups = {"sanity", "regression"})
    public void accountAndLoginTest1(){
        System.out.println("Running test - accountAndLoginTest1");
    }
    @Test(groups = {"smoke", "regression"})
    public void accountAndLoginTest2(){
        System.out.println("Running test - accountAndLoginTest2");
    }
    @Test(groups = {"sanity", "regression"})
    public void accountRegisterTest1(){
        System.out.println("Running test - accountRegisterTest1");
    }
    @Test(groups = {"smoke", "regression"})
    public void accountRegisterTest2(){
        System.out.println("Running test - accountRegisterTest2");
    }
    @Test(groups = {"sanity", "regression"})
    public void desktopTest1(){
        System.out.println("Running test - desktopTest1");
    }
    @Test(groups = {"smoke", "regressrion"})
    public void desktopTest2(){
        System.out.println("Running test - desktopTest2");
    }
    @Test(groups = {"sanity", "regression"})
    public void laptopsAndNotebooksTest1(){
        System.out.println("Running test - laptopsAndNotebooksTest1");
    }
    @Test(groups = {"smoke", "regression"})
    public void laptopsAndNotebooksTest2(){
        System.out.println("Running test - laptopsAndNotebooksTest2");
    }
    @Test(groups = {"sanity","regression"})
    public void topMenuTest1(){
        System.out.println("Running test -topMenuTest1");
    }
    @Test(groups = {"smoke", "regression"})
    public void topMenuTest2(){
        System.out.println("Running test - topMenuTest2");
    }
    @Test(groups = {"regression"})
    public void topMenuTest3(){
        System.out.println("Running test -topMenuTest3");
    }
}
