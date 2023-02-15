@ui @DZone
@Link1
Feature: DZone.Com is One Of The World's Largest Online Communities And Leading Publisher Of Knowledge Resources For Software Developers
Scenario: User is able to open the Application and Gathering Informations to open Different Links
Given User open a Browser
And User Navigate frome Google Search Page to Landing Page of the Application
When User click on the first link "REFCARDS" 
Then Open New page on the same Browser
Then Close the Application
@Link2
Scenario: User is able to open the Application and Gathering Informations to open Different Links
Given User open a Browser
And User Navigate frome Google Search Page to Landing Page of the Application
When User click on the Second link "TREND REPORTS" 
Then Open New page on the same Browser
Then Close the Application
@Link3
Scenario: User is able to open the Application and Gathering Informations to open Different Links
Given User open a Browser
And User Navigate frome Google Search Page to Landing Page of the Application
When User click on the Third link "EVENTS" 
Then Open New page on the same Browser
Then Close the Application

@MouseHover
Scenario: User is able to open the Application and See All the contents on Mouse Hover and click any Link for Details
Given User open a Browser
And User Navigate frome Google Search Page to Landing Page of the Application
When User hover the Mouse
Then List is Open
Then Close the Application
@Join
Scenario: User is able to open the Application and See All the contents on Mouse Hover and click any Link for Details
Given User open a Browser
And User Navigate frome Google Search Page to Landing Page of the Application
When User Click on the Join Button
Then Fill the MemberShip Form
And Join the MemberShip
Then Close the Application