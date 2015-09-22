package maven.Pages;

import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/9/2015.
 */
public abstract class Login extends GeneralPage {
    // Page Title
    public static final String title = "";

    // Login form title
    public static final String xPathLoginFormTitle = "//h1[contains(.,'Please Enter your Username and Password')]";

    // Username -> label
    public static final String xPathUsernameLabel = "//th[contains(.,'Username:')]";
    // Username -> input
    public static final String xPathUsernameInput = "//input[@id='login']";
    // Username -> Set
    public static void setUsername(String username) {
        inputTextfield(xPathUsernameInput, username);
    }

    // Password -> label
    public static final String xPathPasswordLabel = "//th[contains(.,'Password:')]";
    // Password -> input
    public static final String xPathPasswordInput = "//input[@id='password']";
    // Password -> Set
    public static void setPassword(String password) {
        inputTextfield(xPathPasswordInput, password);
    }

    // Remember me on this computer -> Label
    public static final String xPathRememberMeLabel = "//td[contains(.,'Remember me on this computer')]";
    // Remember me on this computer -> input
    public static final String xPathRememberMeInput = "//input[@id='remember']";
    // Remember me -> ON
    public static void setRememberMeOn() {
        setCheckboxOn(xPathRememberMeInput);
    }
    // Remember me -> OFF
    public static void setRememberMeOff() {
        setCheckboxOff(xPathRememberMeInput);
    }
    // Set Remember Me
    public static void setRememberMe(boolean state) {
        if (state) {
            setRememberMeOn();
        }
        else {
            setRememberMeOff();
        }
    }

    // Login button
    public static final String xPathLoginButton = "//input[@id='btn_login']";
    // Press Login
    public static void login() {
        click(xPathLoginButton);
    }

    // "Help" link
    public static final String xPathHelpLink = "//a[contains(.,'Help')]";
    // Click "Help"
    public static void help() {
        click(xPathHelpLink);
    }

    // "Did you forget your password?" link
    public static final String xPathForgetLink = "//a[contains(.,'Did you forget your password?')]";
    // Click "Did you forget..."
    public static void forget() {
        click(xPathForgetLink);
    }

    // Login using credentials
    public static void loginAs(String[] credentials) {
        setUsername(credentials[0]);
        setPassword(credentials[1]);
        setRememberMe(Boolean.getBoolean(credentials[2]));
        login();
    }
}