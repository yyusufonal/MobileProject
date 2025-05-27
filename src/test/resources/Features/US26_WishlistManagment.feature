Feature: US_26 WishList

  Background: User opens the app
    * User makes driver adjustments
@remove
  Scenario:  Wishlist page usage test
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
    * Toaster is displayed
    * User clicks the button with description "Wishlist"
    * User see Wishlist title and wishlist item quantity
    #remove
    * On the page that opens, click on the red heart sign in the upper right corner of the products.
    #* User see Wishlist title and wishlist item quantity when wishlist is empty