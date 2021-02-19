Feature: Feature to Amazon website

@purchase
Scenario Outline: Purchase a product from Amazon

Given Open the Amazon Website
When Search for the product "<productName>" and click the desired product
And Check the availability as In stock
And  Add a quantity "<quantity>" and click Add to cart
Then Go to the cart page and check the product names and total prices

Examples:

|productName|quantity|
|sony home theater 5.1|2|