package screens;

import utils.ReusableMethods;

public class Screens extends ReusableMethods {
    private HomeScreen homeScreen;
    private LoginScreen loginScreen;

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
