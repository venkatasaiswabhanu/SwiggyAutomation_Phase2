Feature: A user should be able to select his location and order food from any of his nearest restaurants

Scenario: Choosing Location and Ordering Cashew Special Fried Rice from Udipi Akshaya Grand

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