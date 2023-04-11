Feature:Login
Scenario: Suceessfully login with valid credential


    Given User Launch Chrome Browser
    When User Open url  "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and password as "admin"
    And Click  on Login 
    Then page title should be "Dashboard / nopCommerce administration"
    And close browser