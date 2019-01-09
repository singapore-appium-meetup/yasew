package io.github.martinschneider.justtestlah.examples.carousell.pages;

import static com.codeborne.selenide.Condition.appear;

import io.github.martinschneider.justtestlah.base.BasePage;
import io.github.martinschneider.justtestlah.configuration.Platform;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({Platform.ANDROID, Platform.IOS})
public class HomePage extends BasePage<HomePage> {

  private LoginPage loginPage;

  public LoginPage goToLogin() {
    $("LOGIN_BUTTON").click();
    return loginPage;
  }

  public boolean isUserMenuVisible() {
    return $("USER_MENU").shouldBe(appear).isDisplayed();
  }
}
