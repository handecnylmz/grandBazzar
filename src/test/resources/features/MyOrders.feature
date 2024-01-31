Feature: Orders Scenario
  @MyOrders1
  Scenario: The user should be able to select a product from the "Home" tab
    Given Clicks on the Home tab
    When Clicks on the first two products that are in stock
    And  Clicks on the cart
    Then Confirms that the selected products are in the cart
    Then Verifies that the items in the cart can be successfully deleted
    Then Clicks on the checkout button
    Then A delivery date is selected
    Then  Clicks on Place Order
    Then  Verify that the message Congratulations! Your order has been created successfully. is displayed
    Then  The user clicks on the profile picture
    Then   The user clicks on My Orders
    Then   Verifies that the user is on the Orders page
    Then  Click on the last order
    Then   The user confirms that the products added to the cart have been successfully ordered



