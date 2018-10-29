$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/dresses.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping card management",
  "description": "",
  "id": "shopping-card-management",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "validate checkout with blank transfer",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-blank-transfer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@CheckOut"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "i checkout by bank wire",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should be able to place an order and confirm the \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-blank-transfer;",
  "rows": [
    {
      "cells": [
        "message"
      ],
      "line": 27,
      "id": "shopping-card-management;validate-checkout-with-blank-transfer;;1"
    },
    {
      "cells": [
        "Your order on My Store is complete."
      ],
      "line": 28,
      "id": "shopping-card-management;validate-checkout-with-blank-transfer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11631524629,
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
formatter.step({
  "line": 5,
  "name": "i sign in",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 12953097452,
  "status": "passed"
});
formatter.match({
  "location": "accountManagement.i_sign_in()"
});formatter.result({
  "duration": 10939262497,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "validate checkout with blank transfer",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-blank-transfer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@CheckOut"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "i checkout by bank wire",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should be able to place an order and confirm the \"Your order on My Store is complete.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_add_a_product_to_the_card()"
});
formatter.result({
  "duration": 18289326563,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_proceed_to_check_out()"
});
formatter.result({
  "duration": 14805112051,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_address()"
});
formatter.result({
  "duration": 9750803213,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_shipping_information()"
});
formatter.result({
  "duration": 9325894259,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_checkout_by_bank_wire()"
});
formatter.result({
  "duration": 6289134432,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_my_order()"
});
formatter.result({
  "duration": 22745410917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 52
    }
  ],
  "location": "DressesShopping.i_should_be_able_to_place_an_order_and_confirm_the(String)"
});
formatter.result({
  "duration": 6390670,
  "status": "passed"
});
formatter.after({
  "duration": 3444075305,
  "status": "passed"
});fformatter.before({
  "duration": 15658911059,
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
formatter.step({
  "line": 5,
  "name": "i sign in",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
})foformatter.result({
  "duration": 12286052813,
  "status": "passed"
});
formatter.match({
  "location": "accountManagement.i_sign_in()"
})foformatter.result({
  "duration": 8215374417,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "validate checkout with blank transfer is available in the placed orders",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-blank-transfer-is-available-in-the-placed-orders",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@CheckOut"
    },
    {
      "line": 30,
      "name": "@CheckoutWithOrderRef"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "i checkout by bank wire",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "i should be able to see my order in the order history",
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_add_a_product_to_the_card()"
});fformatter.result({
  "duration": 13029730250,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_proceed_to_check_out()"
});
formatter.result({
  "duration": 3095134376,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_address()"
});
formatter.result({
  "duration": 2095066201,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_shipping_information()"
});
formatter.result({
  "duration": 2338109988,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_checkout_by_bank_wire()"
});
formatter.result({
  "duration": 1428846131,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_my_order()"
});
formatter.result({
  "duration": 2417236701,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_should_be_able_to_see_my_order_in_the_order_history()"
});
formatter.result({
  "duration": 5601150353,
  "status": "passed"
});
formatter.after({
  "duration": 323801581,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 43,
  "name": "validate checkout with bank Check",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-bank-check",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@CheckOut"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "i checkout by check",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "i should be able to place an order and confirm the \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 52,
  "name": "",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-bank-check;",
  "rows": [
    {
      "cells": [
        "message"
      ],
      "line": 53,
      "id": "shopping-card-management;validate-checkout-with-bank-check;;1"
    },
    {
      "cells": [
        "Your order on My Store is complete."
      ],
      "line": 54,
      "id": "shopping-card-management;validate-checkout-with-bank-check;;2"
    }
  ],
  "keyword": "Examples"
});fformatter.before({
  "duration": 8619692081,
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
formatter.step({
  "line": 5,
  "name": "i sign in",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});fformatter.result({
  "duration": 6736981731,
  "status": "passed"
});
formatter.match({
  "location": "accountManagement.i_sign_in()"
});
formatter.result({
  "duration": 6433107475,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "validate checkout with bank Check",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-bank-check;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@CheckOut"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "i checkout by check",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "i should be able to place an order and confirm the \"Your order on My Store is complete.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_add_a_product_to_the_card()"
});
formatter.result({
  "duration": 8544727010,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_proceed_to_check_out()"
});
formatter.result({
  "duration": 1930230515,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_address()"
});
formatter.result({
  "duration": 1218896076,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_shipping_information()"
});
formatter.result({
  "duration": 1567668319,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_checkout_by_check()"
});
formatter.result({
  "duration": 1333440402,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_my_order()"
});
formatter.result({
  "duration": 2091213098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 52
    }
  ],
  "location": "DressesShopping.i_should_be_able_to_place_an_order_and_confirm_the(String)"
});
formatter.result({
  "duration": 82996,
  "status": "passed"
});
formatter.after({
  "duration": 233761201,
  "status": "passed"
});
formatter.before({
  "duration": 7084810571,
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
formatter.step({
  "line": 5,
  "name": "i sign in",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 7814514280,
  "status": "passed"
});
formatter.match({
  "location": "accountManagement.i_sign_in()"
});
formatter.result({
  "duration": 5166816805,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "validate checkout with bank Check",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-bank-check",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@CheckOut"
    },
    {
      "line": 57,
      "name": "@CheckoutWithOrderRef"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "i checkout by check",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "i should be able to see my order in the order history",
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_add_a_product_to_the_card()"
});
formatter.result({
  "duration": 7420000620,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_proceed_to_check_out()"
});
formatter.result({
  "duration": 1715140655,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_address()"
});
formatter.result({
  "duration": 1438428093,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_shipping_information()"
});
formatter.result({
  "duration": 1469844127,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_checkout_by_check()"
});
formatter.result({
  "duration": 893550452,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_my_order()"
});
formatter.result({
  "duration": 1803819958,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_should_be_able_to_see_my_order_in_the_order_history()"
});
formatter.result({
  "duration": 10072630412,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027box\u0027]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027ABBEY-WED\u0027, ip: \u0027192.168.2.68\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\BRUNA~1.DUS\\AppData\\Local\\Temp\\scoped_dir24500_24200}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: fd2a55ae3351fa65b4265705ea27e403\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027box\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat modules.CheckOutActions.getOrderRef(CheckOutActions.java:76)\r\n\tat step_definitions.DressesShopping.i_should_be_able_to_see_my_order_in_the_order_history(DressesShopping.java:221)\r\n\tat ✽.Then i should be able to see my order in the order history(src/test/resources/Features/dresses.feature:65)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?controller\u003dorder-confirmation\u0026id_cart\u003d787467\u0026id_module\u003d30\u0026id_order\u003d79023\u0026key\u003db666027c57f988e67c766b9b8c0148f9");
formatter.after({
  "duration": 3284335772,
  "status": "passed"
});
});;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     formatter.before({
  "duration": 12388588628,
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
formatter.step({
  "line": 5,
  "name": "i sign in",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 12757301939,
  "status": "passed"
});
formatter.match({
  "location": "accountManagement.i_sign_in()"
});
formatter.result({
  "duration": 12322983211,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "validate checkout with bank Check",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-bank-check;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@CheckOut"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "i checkout by check",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "i should be able to place an order and confirm the \"Your order on My Store is complete.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_add_a_product_to_the_card()"
});
formatter.result({
  "duration": 12039244577,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_proceed_to_check_out()"
});
formatter.result({
  "duration": 3235048174,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_address()"
});
formatter.result({
  "duration": 6967674247,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_shipping_information()"
});
formatter.result({
  "duration": 11508036437,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_checkout_by_check()"
});
formatter.result({
  "duration": 9814623413,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_my_order()"
});
formatter.result({
  "duration": 30658176223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 52
    }
  ],
  "location": "DressesShopping.i_should_be_able_to_place_an_order_and_confirm_the(String)"
});
formatter.result({
  "duration": 5927726,
  "status": "passed"
});
formatter.after({
  "duration": 205895391,
  "status": "passed"
});
formatter.before({
  "duration": 4077559226,
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
formatter.step({
  "line": 5,
  "name": "i sign in",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 21310618735,
  "status": "passed"
});
formatter.match({
  "location": "accountManagement.i_sign_in()"
});
formatter.result({
  "duration": 13490271313,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "validate checkout with bank Check",
  "description": "",
  "id": "shopping-card-management;validate-checkout-with-bank-check",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@CheckOut"
    },
    {
      "line": 57,
      "name": "@CheckoutWithOrderRef"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "i add a product to the card",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "i  proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "i confirm the address",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "i confirm the shipping information",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "i checkout by check",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "i confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "i should be able to see my order in the order history",
  "keyword": "Then "
});
formatter.match({
  "location": "DressesShopping.i_add_a_product_to_the_card()"
});
formatter.result({
  "duration": 13737026732,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_proceed_to_check_out()"
});
formatter.result({
  "duration": 2126380916,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_address()"
});
formatter.result({
  "duration": 2789356877,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_the_shipping_information()"
});
formatter.result({
  "duration": 3024656733,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_checkout_by_check()"
});
formatter.result({
  "duration": 2484121546,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_confirm_my_order()"
});
formatter.result({
  "duration": 4169087869,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_should_be_able_to_see_my_order_in_the_order_history()"
});
formatter.result({
  "duration": 10231865504,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027box\u0027]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027ABBEY-WED\u0027, ip: \u0027192.168.2.68\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\BRUNA~1.DUS\\AppData\\Local\\Temp\\scoped_dir23556_17699}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 31b0b03826ca2983b9264308c5f5a393\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027box\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat modules.CheckOutActions.getOrderRef(CheckOutActions.java:76)\r\n\tat step_definitions.DressesShopping.i_should_be_able_to_see_my_order_in_the_orderformatter.result({
  "duration": 10069604032,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027box\u0027]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: Tformatter.after({
  "duration": 5547330058,
  "status": "passed"
});
});or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027ABBEY-WED\u0027, ip: \u0027192.168.2.68\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\BRUNA~1.DUS\\AppData\\Local\\Temp\\scoped_dir22572_11916}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 5ed8e8ced1d6588658730baede2b881c\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027box\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat modules.CheckOutActions.getOrderRef(CheckOutActions.java:76)\r\n\tat step_definitions.DressesShopping.i_should_be_able_to_see_my_order_in_the_order_history(DressesShopping.java:221)\r\n\tat ✽.Then i should be able to see my order in the order history(src/test/resources/Features/dresses.feature:65)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?controller\u003dorder-confirmation\u0026id_cart\u003d787460\u0026id_module\u003d30\u0026id_order\u003d79018\u0026key\u003db666027c57f988e67c766b9b8c0148f9");
formatter.after({
  "duration": 4881346040,
  "status": "passed"
});
});