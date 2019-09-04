#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Launch Nationwide Webpage and verify the elements
  This feature filewill be used to verify the elements of nationwide webpage

  @E2E
  Scenario: Launch nationwide webpage
  Given Chrome Driver is launched
  And Nationwide webaddress is given
  Then Validate that nationwide webpage is launched
    

  @E2E
  Scenario: Select Mortgage Menu and new customer questions
  Given Mortgage Menu is selected 
  Then  answer mortgage questionaaire to find the rates
    
   	@FilterVerification1
    Scenario: Filter on mortgage rates & verify the rates
    Given Mortgage type is fixed rate and product fee is yes
    Then Verify the mortgage rates for fixed rate with product fee 
    
    @FilterVerification2
    Scenario: Filter on mortgage rates & verify the rates
    Given Mortgage type is Tracker rate and product fee is yes
    Then Verify the mortgage rates for tracker rate with product fee 
    
    
    
   

   
