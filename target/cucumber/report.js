$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipediaSerach.feature");
formatter.feature({
  "name": "Wikipedia search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.step({
  "name": "User is on Wikipedia homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wiki_steps.user_is_on_Wikipedia_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wiki_steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wiki_steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wiki_steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.step({
  "name": "User is on Wikipedia homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wiki_steps.user_is_on_Wikipedia_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wiki_steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wiki_steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the main header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wiki_steps.user_sees_is_in_the_main_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.step({
  "name": "User is on Wikipedia homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wiki_steps.user_is_on_Wikipedia_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wiki_steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wiki_steps.user_clicks_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wiki_steps.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
});