# SwiggyAutomation_Phase2

Steps Performed :

1 . Open Eclipse and create Maven Project 

2. Delete Default packages from maven Project

3. Add the following Dependencies in POM.xml : 

Cucumber core
Cucumber java
Cucumber -Testng
Cucumber jvm deps
Cucumber Reporting
Gherkin
Testng
jcommander
Selenium java 3.141.59
Extent Reports
Log4j-api
Log4j-core
Log4j-api

4. Create Folder with name Feature and create a file "OrderingFood.feature" 

5. Write the featuire and Scenerio in feature file

6. Using that feature file snippets write step defnition OrderingFoodSteps.java in 
com.swiggy.testscripts

7. Convert the Maven project to testNG

8. Implement Page object design model and write source code according to feature file shown 
below

Feature: A user should be able to select his location and order food from any of his nearest 
restaurants
Scenario: Choosing Location and Ordering Cashew Special Fried Rice from Udipi Akshaya 
Grand
Given A User is On Landing Page of Swiggy
When he click on link text Eluru
And it will display main page
When user click location tab and pass "Eluru" it will display all the restaurants in Eluru
When user clicks on Search icon and pass "CashewBiryani" and search
And select first available item in suggesion box
When User navigate to dishes icon
And add Cashew Special Fried Rice to cart it will added to cart
When user click on cart icon
Then he has verify the "SECURE CHECKOUT" Text in cart
Note: I can order any delicious Cashew biryani from the swiggy suggession in that particular 
time.

9. Run test cases with remote session using Selenium Grid

10. Push the code to GitHub and run test cases @7PM on March 17th using Jenkins
