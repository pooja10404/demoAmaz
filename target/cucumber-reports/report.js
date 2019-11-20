$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/feature/AmazonUICheck.feature");
formatter.feature({
  "name": "BasicUIVerification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.step({
  "name": "Verify \"\u003cuiItemsForVerification\u003e\" is present",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uiItemsForVerification"
      ]
    },
    {
      "cells": [
        "amazonLogo"
      ]
    },
    {
      "cells": [
        "searchBox"
      ]
    },
    {
      "cells": [
        "cart"
      ]
    },
    {
      "cells": [
        "tryPrime"
      ]
    },
    {
      "cells": [
        "returnAndOrder"
      ]
    },
    {
      "cells": [
        "signinOption"
      ]
    },
    {
      "cells": [
        "hamburger"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"amazonLogo\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"searchBox\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"cart\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"tryPrime\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"returnAndOrder\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"signinOption\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check landing page UI for top menubar.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BasicUIVerification"
    }
  ]
});
formatter.step({
  "name": "Open Application",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.open_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"hamburger\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LandinPageSteps.verify_is_present(String)"
});
formatter.result({
  "status": "passed"
});
});