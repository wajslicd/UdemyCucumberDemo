$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on GREENKART landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searches for Cucumber vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionVegetables.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 15712622400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 18
    }
  ],
  "location": "StepDefinitionVegetables.user_searches_for_something_vegetable(String)"
});
formatter.result({
  "duration": 3700684800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "StepDefinitionVegetables.something_results_are_displayed(String)"
});
formatter.result({
  "duration": 32304800,
  "status": "passed"
});
formatter.after({
  "duration": 402658600,
  "status": "passed"
});
});