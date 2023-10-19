# The Food Truck
The Food Truck is a sample Store Management Peoject to help scholars understand the **Store Management Poject**.

Note: You can delete the stikethroughed sections, I left them in for clarity.
## Define
1. ~~**Create a business plan** – What product or service will your store sell? What attributes do those items share in common? What attributes are unique to specific items?~~  
**The Food Truck** is a Code.org business that sells desserts. Among the desserts it sells are cookies, pies, donuts and cupcakes. The unique value proposition for this business is that it uses advanced technology to make the desserts people want available to them where they are. It does this by connecting its inventory and order system to social media and Google Maps. You won't find The Food Truck trying to sell pies in Julian or donuts outside the Donut Bar.

1. ~~**Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.~~  
Here is how The Food Truck represents its inventory:![](/Users/scerruti/IntelliJIDEAProjects/The Food Truck/UML/The Food Truck Class Diagram.png)

## Plan
Here is a list of tasks that you will need to do in the _Try_ step.

✅ TO DO: Use your knowledge of object-oriented programming and class structure and design to create your store management system:
1. **Create Classes** – Create the superclass and the subclasses. Make sure the subclasses extend the superclasses.

   | Level      | Class Name                  |
   |------------|-----------------------------| 
   | Superclass | Dessert                     |
   | Subclasses | Cookie, Cupcake, Donut, Pie |
1. **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.

   | Class | Instance Variables          |
   |------|-----------------------------|
   | Dessert | String flavor, double price |
   | Cookie | boolean isChewy             |
   | Cupcake | boolean isMini              | 
   | Donut | boolean hasSprinkles        |  
   | Pie  | int diameter                |
2. **Constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword as appropriate to call the superclass constructor.

   | Class   | Constructors                     |
   |---------|----------------------------------|
   | Dessert | Dessert()                        |
   |         | Dessert(String, double)          |
   | Cookie  | Cookie()                         |
   |         | Cookie(String, double, boolean)  |
   | Cupcake | Cupcake()                        | 
   |         | Cupcake(String, double, boolean) |
   | Donut   | Donut()                          |  
   |         | Donut(String, double, boolean)   |  
   | Pie     | Pie()                            |
   |         | Pie(String, double, int)         |

1. **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from the class.

   | Class   | Accessors                 |
      |---------|---------------------------|
   | Dessert | String getFlavor()        |
   |         | double getPrice()         |
   | Cookie  | boolean getIsChewy()      |
   | Cupcake | boolean getIsMini()       |
   | Donut   | boolean getHasSprinkles() |  
   | Pie     | int getDiameter()         |

   | Class   | Mutators                 |
    |---------|--------------------------|
   | Dessert | setFlavor(String)        |
   |         | setPrice(double)         |
   | Cookie  | setIsChewy(boolean)      |
   | Cupcake | setIsMini(boolean)       |
   | Donut   | setHasSprinkles(boolean) |  
   | Pie     | setDiameter(int)         |

1. **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

   | Class   | toString                        |
   |---------|---------------------------------|
   | Dessert | flavor + price                  |
   | Cookie  | super.toString() + isChewy      |
   | Cupcake | super.toString() + isMini       |
   | Donut   | super.toString() + hasSprinkles |  
   | Pie     | super.toString() + diameter     |

## Try

* Implement your plan.

## Reflect

* Describe your project.
* What are two things about your project that you are proud of?
* Describe something you would improve or do differently if you had an opportunity to change something about your project.

Generate a class diagram in the IDE. How does it compare to the one you drew?
![](/Users/scerruti/IntelliJIDEAProjects/The Food Truck/UML/Complete The Food Truck Class Diagram.png)

