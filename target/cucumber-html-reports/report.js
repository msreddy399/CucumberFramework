$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/features/Sample1.feature");
formatter.feature({
  "line": 1,
  "name": "Sample feature1",
  "description": "",
  "id": "sample-feature1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sample scenario1",
  "description": "",
  "id": "sample-feature1;sample-scenario1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sample_01"
    },
    {
      "line": 3,
      "name": "@High"
    },
    {
      "line": 3,
      "name": "@Sample"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User access home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "Common_SD.user_access_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Common_SD.verify_the_page_title()"
});
formatter.result({
  "status": "skipped"
});
});