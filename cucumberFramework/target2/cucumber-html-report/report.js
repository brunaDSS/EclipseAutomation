$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/cardManagementAsGuest.feature");
formatter.feature({
  "line": 1,
  "name": "card management actions as a guest customer",
  "description": "",
  "id": "card-management-actions-as-a-guest-customer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6762239914,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i open the automationPractice website",
  "keyword": "Given "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 6739336061,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "validate shopping card when the guest leaves the site and returns",
  "description": "",
  "id": "card-management-actions-as-a-guest-customer;validate-shopping-card-when-the-guest-leaves-the-site-and-returns",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@ShoppingAsGuest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i click on Dresses",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i hover the first product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click on add to card",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i click on continue shopping",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i get the card quantity",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i copy the cookies",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i close the browser",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i open the browser",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "i restore the cookies",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "i get the card quantity",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "i should be able to see my products in the card",
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_click_on_Dresses()"
});
formatter.result({
  "duration": 3266451003,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_hover_the_first_product()"
});
formatter.result({
  "duration": 278266036,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_click_on_add_to_card()"
});
formatter.result({
  "duration": 209877568,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_click_on_continue_shopping()"
});
formatter.result({
  "duration": 1572974925,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_get_the_card_quantity()"
});
formatter.result({
  "duration": 132813083,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_copy_the_cookies()"
});
formatter.result({
  "duration": 32073801,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_close_the_browser()"
});
formatter.result({
  "duration": 2198815425,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_open_the_browser()"
});
formatter.result({
  "duration": 11110391306,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_restore_the_cookies()"
});
formatter.result({
  "duration": 60176204,
  "status": "passed"
});
formatter.match({
  "location": "GuestCardManagement.i_get_the_card_quantity()"
});
formatter.result({
  "duration": 25775559,
  "error_message": "org.openqa.selenium.NoSuchSessionException: no such session\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027ABBEY-WED\u0027, ip: \u0027192.168.2.68\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\BRUNA~1.DUS\\AppData\\Local\\Temp\\scoped_dir14564_172}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 904dfc861d4792fec299e2543ed9cb06\n*** Element info: {Using\u003dxpath, value\u003d//a[@title\u003d\u0027View my shopping cart\u0027]/span[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.getText(Unknown Source)\r\n\tat helpers.GlobalUtils.getElementText(GlobalUtils.java:69)\r\n\tat modules.GuestCardManagementActions.getCardQuantity(GuestCardManagementActions.java:45)\r\n\tat step_definitions.GuestCardManagement.i_get_the_card_quantity(GuestCardManagement.java:52)\r\n\tat ✽.And i get the card quantity(src/test/resources/Features/cardManagementAsGuest.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GuestCardManagement.i_should_be_able_to_see_my_products_in_the_card()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 553482519,
  "status": "passed"
});
});