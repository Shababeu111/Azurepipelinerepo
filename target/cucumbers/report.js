$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberJava\cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verification of application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "annotation.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 10791069100,
  "status": "passed"
});
formatter.match({
  "location": "annotation.enter_the_Username_and_Password()"
});
formatter.result({
  "duration": 18685586200,
  "status": "passed"
});
formatter.match({
  "location": "annotation.Reset_the_credential()"
});
formatter.result({
  "duration": 13600,
  "status": "passed"
});
});