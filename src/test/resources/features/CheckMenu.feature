Feature: Check all the menu

  Scenario: Check data in Training menu
    Given User open homepage
    When User click Training Menu
    Then User should see all Training Menu

  Scenario:Check data in Nutrition menu
    Given User open homepage
    When User click Nutrition Menu
    Then User should see all Nutrition Menu

  Scenario: Check data in Knowledge Base menu
     Given User open homepage
     When User click Knowledge Base Menu
     Then User should see all Knowledge Base Menu

  Scenario: Check data in About Us menu
     Given User open homepage
     When User click About Us Menu
     Then User should see all About Us menu

   Scenario: Check data in Online Trainer menu
     Given User open homepage
     When User click Online Trainer
     Then User should see Online Trainer page