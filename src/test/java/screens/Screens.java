package screens;

import utils.ReusableMethods;

public class Screens extends ReusableMethods {
    private HomeScreen homeScreen;
    private LoginScreen loginScreen;
    private RegisterScreen registerScreen;
    private OrderScreen orderScreen;
    private AdressScreen adressScreen;

    public AdressScreen adressScreen() {
         if (adressScreen == null) {
             adressScreen = new AdressScreen();
         }
         return adressScreen;
    }
    public OrderScreen orderScreen() {
        if (orderScreen == null) {
            orderScreen = new OrderScreen();
        }
        return orderScreen;
    }

    public RegisterScreen registerScreen() {
        if (registerScreen == null) {
            registerScreen = new RegisterScreen();
        }
        return registerScreen;
    }

    public HomeScreen homeScreen() {
        if (homeScreen == null) {
            homeScreen = new HomeScreen();
        }
        return homeScreen;
    }public LoginScreen loginScreen() {
        if (loginScreen == null) {
            loginScreen = new LoginScreen();
        }
        return loginScreen;
    }
}
