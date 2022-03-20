package io.testproject.generated.tests.myfirstproject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Project: mobile-test-suite
 * By: Nathalia Bomtempo (nathaliabomtempo284@gmail.com)
 */
@DisplayName("mobile-test-suite")
public class Mobiletestsuite implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("kernpA9r1tdLHBsfZCm3BBMM_QxrdWr3QuzVivJJPJc1", getCapabilities(), "Nathalia Bomtempo");
  }

  @DisplayName("mobile-test-suite")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String email) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Is 'email' is clickable?
    GeneratedUtils.sleep(500);
    by = By.id("br.usjt.ucsist.cadaluno:id/editTextUsuario");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 2. Type '{{email}}' in 'email'
    GeneratedUtils.sleep(500);
    by = By.id("br.usjt.ucsist.cadaluno:id/editTextUsuario");
    driver.findElement(by).sendKeys(email);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("nathaliabomtempo284@gmail.com"));
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.UDID, "0056534017");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "YOUR_APP_PACKAGE");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "YOUR_APP_ACTIVITY");
    capabilities.setCapability(MobileCapabilityType.APP, "APP_FILE_PATH");
    return capabilities;
  }
}
