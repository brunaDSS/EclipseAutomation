$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/cardManagementAsGuest.feature");
formatter.feature({
  "line": 1,
  "name": "card management actions as a guest customer",
  "description": "",
  "id": "card-management-actions-as-a-guest-customer",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 58,
  "name": "validate the sort functionality by price on the dresses page",
  "description": "",
  "id": "card-management-actions-as-a-guest-customer;validate-the-sort-functionality-by-price-on-the-dresses-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 57,
      "name": "@SortProducts"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "i get the \"\u003cinfo\u003e\" of all dresses",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "i sort the \"\u003cinfo\u003e\" by \"\u003ccondition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "i sort the dresses page by \"\u003ccondition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "i shouldn see the products sorted in the right order",
  "keyword": "Then "
});
formatter.examples({
  "line": 64,
  "name": "",
  "description": "",
  "id": "card-management-actions-as-a-guest-customer;validate-the-sort-functionality-by-price-on-the-dresses-page;",
  "rows": [
    {
      "cells": [
        "info",
        "condition"
      ],
      "line": 65,
      "id": "card-management-actions-as-a-guest-customer;validate-the-sort-functionality-by-price-on-the-dresses-page;;1"
    },
    {
      "cells": [
        "prices",
        "lower"
      ],
      "line": 66,
      "id": "card-management-actions-as-a-guest-customer;validate-the-sort-functionality-by-price-on-the-dresses-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4602206932,
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
  "name": "i click on Dresses",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "i hover the first product",
  "keyword": "And "
});
formatter.match({
  "location": "accountManagement.i_open_the_automationPractice_website()"
});
formatter.result({
  "duration": 7145165163,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_click_on_Dresses()"
});
formatter.result({
  "duration": 3407046552,
  "status": "passed"
});
formatter.match({
  "location": "DressesShopping.i_hover_the_first_product()"
});
formatter.result({
  "duration": 239019842,
  "status": "passed"
});
formatter.scenario({
  "line": 66,
  "name": "validate the sort functionality by price on the dresses page",
  "description": "",
  "id": "card-management-actions-as-a-guest-customer;validate-the-sort-functionality-by-price-on-the-dresses-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 57,
      "name": "@SortProducts"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "i get the \"prices\" of all dresses",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "i sort the \"prices\" by \"lower\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "i sort the dresses page by \"lower\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "i shouldn see the products sorted in the right order",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "prices",
      "offset": 11
    }
  ],
  "location": "GuestCardManagement.i_get_the_of_all_dresses(String)"
});
formatter.result({
  "duration": 500868895,
  "error_message": "java.lang.NumberFormatException: For input string: \"$26.00\"\r\n\tat sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)\r\n\tat sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)\r\n\tat java.lang.Double.parseDouble(Double.java:538)\r\n\tat modules.GuestCardManagementActions.i_get_the_of_all_dresses(GuestCardManagementActions.java:260)\r\n\tat step_definitions.GuestCardManagement.i_get_the_of_all_dresses(GuestCardManagement.java:158)\r\n\tat ✽.And i get the \"prices\" of all dresses(src/test/resources/Features/cardManagementAsGuest.feature:59)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "prices",
      "offset": 12
    },
    {
      "val": "lower",
      "offset": 24
    }
  ],
  "location": "GuestCardManagement.i_sort_the_by(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "lower",
      "offset": 28
    }
  ],
  "location": "GuestCardManagement.i_sort_the_dresses_page_by(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GuestCardManagement.i_shouldn_see_the_products_sorted_in_the_right_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?id_category\u003d8\u0026controller\u003dcategory");
formatter.after({
  "duration": 1491821284,
  "status": "passed"
});
});