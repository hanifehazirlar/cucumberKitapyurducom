package pages;

import utils.ReusableMethods;

public class Pages extends ReusableMethods {
    public Pages(){
    }

    private HomePage homeScreen;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    private OrderPage orderPage;

    private AdressPage adressPage;
    public  AdressPage adressPage(){
        if (adressPage==null){
            adressPage = new AdressPage();
        }
        return  adressPage;
    }


    public OrderPage orderPage(){
        if (orderPage== null){
            orderPage = new OrderPage();
        }
        return orderPage;
    }

    public HomePage homePage() {
        if (homeScreen == null) {
            homeScreen = new HomePage();
        }
        return homeScreen;
    }

     public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

 public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }
}

