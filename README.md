Assumptions made during development:  
1- Checkout is a full service that should has its own view class for containing it logic of displaying the items  
2- Shipment is a part of the checkout phase, meaning that checkout will be calling shipment service class to use its business logic  
3- the method responsible for handling the shipped items has to be static, so that every part can access it without having any access/control over the whole shipping service as it will deal with some sensitive information such as address,etc.  
4- that a product can be shippable and expirable at the same time, according to this I used the strategy design pattern to code for composition and separation of concerns instead of making 4 classes to handle the variations of the products themselves  
5- since that the shipping service has to deal with objects that implements an interface that has the getweight and getname methods, an adapter class is used for smoothing the use of this interface with the main product class used for this logic  
6- hard coded values are provided in the main instead of using a database as it will be too much adjustments for only testing, but in the future everything can be easily adjusted to use for example JPA and JPQL for storing and quering data if we are using Java EE or Springboot or using Jackson dependencies for serializing and storing data in the form of JSON (there is two projects in this account that uses those two approaches)  

  
<img width="1669" height="618" alt="image" src="https://github.com/user-attachments/assets/0a10b0d8-9a71-46b3-8b5a-f382fcf5d065" />
