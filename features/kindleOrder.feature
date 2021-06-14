Feature: Validate login information is asked when buying amazon kindle

@test1
  Scenario: Verify user is asked for email or mobile number on attempting to buy amazon kindle
  	Given URL is launched
  	And user clicks on the hamburger menu on the top left corner
  	And Then selects Kindle under Digital Content and Devices
  	And Then clicks Kindle under Kindle E-Reader
  	When user clicks on Buy now
  	Then user is asked for email or mobile number
  
 
  	