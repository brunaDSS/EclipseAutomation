$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/shopping Card.feature");
formatter.feature({
  "line": 1,
  "name": "test e-commerce website",
  "description": "",
  "id": "test-e-commerce-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "validate the create account page",
  "description": "",
  "id": "test-e-commerce-website;validate-the-create-account-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@CreateAccount"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "i enter my details",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "is should be able to sign up and validate \"\u003curl\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "test-e-commerce-website;validate-the-create-account-page;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 31,
      "id": "test-e-commerce-website;validate-the-create-account-page;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php?controller\u003dmy-account"
      ],
      "line": 32,
      "id": "test-e-commerce-website;validate-the-create-account-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5271712878,
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
  "location": "Ecommerce.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 6174612743,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "validate the create account page",
  "description": "",
  "id": "test-e-commerce-website;validate-the-create-account-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@CreateAccount"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "i enter my details",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "is should be able to sign up and validate \"http://automationpractice.com/index.php?controller\u003dmy-account\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Ecommerce.i_enter_my_details()"
});
formatter.result({
  "duration": 12344010229,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027id_gender\u0027 and @value\u003d\u00272\u0027]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027ABBEY-WED\u0027, ip: \u0027192.168.2.68\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\BRUNA~1.DUS\\AppData\\Local\\Temp\\scoped_dir10476_27947}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 353f1fd2382efbc0ae1dcef73e67ebf9\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027id_gender\u0027 and @value\u003d\u00272\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat modules.CreateAccountActions.executeCreateAccount(CreateAccountActions.java:29)\r\n\tat step_definitions.Ecommerce.i_enter_my_details(Ecommerce.java:87)\r\n\tat ✽.And i enter my details(src/test/resources/Features/shopping Card.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php?controller\u003dmy-account",
      "offset": 43
    }
  ],
  "location": "Ecommerce.is_should_be_able_to_sign_up_and_validate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current page URL is http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1273156950,
  "status": "passed"
});
});