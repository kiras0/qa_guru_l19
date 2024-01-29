package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {
    @Key("browserUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("119.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    URL getRemoteUrl();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

}





/*  ==============================================================

    public  String getBaseUrl(){
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        return baseUrl;
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        return Browser.valueOf(browser);
    }
    public URL getRemoteUrl(){
        String remoteUrl = System.getProperty("browser");
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "https://localhost:4444";
        }
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
*/

