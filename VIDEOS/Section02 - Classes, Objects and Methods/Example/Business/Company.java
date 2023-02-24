import java.time.LocalDate;

public class Company {
    private FactoryWorker worker;
    protected String[] assetName;     // company has asset which we don't share to outside of the company
                                      // because we have the same product with the sub-company, we allowed
                                      // the sub to access the asset

    /*
     * possibly, we could set the company's name to public, because the company should known by everyone
     * but in the case of object oriented-programming, properties/attributes must be protected from
     * change on purpose by user who create the code. So, we make the private to the company name
     * 
     */
    private String companyName;      // okay, we share our information detail about our company
    private LocalDate companyDob;

    private String companyFile;     // we don't want to other know about our file right? since it may be contain
                                    // secret of the company

    // suppose we make a company
    public Company(String companyName, LocalDate dob) {
        this.companyName = companyName;
        this.companyDob = dob;
    }


    public void evacuateArea() {
        System.out.println("This area must be accessible to all of the worker.");
    }

    /*
     * the rest room only available for worker on the company and the sub-company
     */
    protected void restRoom() {
        System.out.println("This area must be accessible to all of the worker in the company.");
    }
    /* 
     * the working area could accessible by the sub-company and the company itself
     */
    protected void workArea() {
        System.out.println("This work are must be accessible by sub-company and the company itself.");
    }

    /*
     * private means these room only accessible through this company, not the out of the company
     * or the sub-company
     */
    private void labRoom() {
        System.out.println("This lab is only accessible by certain worker.");
    }

    private void cleaningRoom() {
        System.out.println("This cleaning room only accessible by the cleaner staff.");
    }

    private void networkRoom() {
        System.out.println("This network room only accessible by the IT staff.");
        
    }
    
}

/* NOTE
 * INTRODUCTION
 * = class should be capitalized because it's the standard convention in java programming.
 * = public => define the visibility of the class
 * = class => the keyword that indicate we're creating a class
 * = { => signifies the start where we can define our code
 * = } => signified the end of our code
 * 
 * = The story behind it is the news agency will interviews the company, but it's not allowed
 *   to interview the worker, because the company doesn't want to.
 *   = Because the company doesn't allow the agency to talk with the worker, the company create
 *     a meeting to make a boundary(package in java, 3rd operation)
 * = You could access the class even in private in the same package(FactoryWorker is private, accessed by Company)
 * = This called a package protection, now the agency cannot talk to the worker.
 * 
 * = The agency has person, which worked in the agency, so we create one(4th operation)
 *   = The person also has name, age, pet or other which can be hold on java by creating a variable.
 * = Variable is a thing that hold a value.
 *   - We use descriptive name to create a variable in java.
 *   - They can hold/contain more than a number or a name.
 *   - You store something on it using the name, then you can refer back to it using the name.
 * 
 * = Java is statically typed language, means you need to tell the java what kind of data that you gonna hold
 *   or store in the variable
 *   = On java, we store the firstname of the person using string datatype, age using the integer datatype or store object 
 *     on the object datatype etc. (5th operation)
 * 
 * DATA TYPES AND VARIABLES
 * = the datatype of the person:
 *   - String => datatype for storing the text, signifies by the double double quotes("")
 *   - int => integer datatype for storing the whole number with no decimal point.
 *     - long => integer with the longest range than the integer itself
 *     - byte => integer with the most smallest range.
 *   - char => character datatype for storing single character signifies with the double single quote('') 
 *   - class => datatype where you can hold a reference to an object(instances of the class itself).
 *     = In this case the Person class could store/hold a value what company they're work at or what part of
 *       the agency they're work at.
 *     - class gives a birth to the object by using the new keyword.
 *     - The object that's created will store in address memory computer, and then this address will referenced
 *       by the variable of the class.
 *   - To make the constant variable, so we can't change after we created it we use the final keyword after the
 *     access modifier (private/public/protected)
 *     - We use uppercase letter when creating a constant. 
 *     - if the variable name has more than one word, we seperated them by underscore(_);
 *   - Array => collection of other datatypes
 *     - For example, if you have a list of an String, integer, class, or the array itself you can store it to the
 *       array. (operation 6th)
 * 
 * METHODS
 * = The person where is he/she work, literally has skills that it applied to its job right, so the person has a
 *   function to the company.
 *   - The function of the object on java called a method.
 *   - when you encounter the function in functionional programming, the context is different.
 *   - This function could be the behaviour of the person like breathe, move, or say something.(7th operation)
 * = The main method inside the class is almost not even part of the class, but it needed to live in class
 *   because the rules of java that there's no function outside of the class.
 * = Methods only call after you create the instances from the class
 *   - the analogy is like build the building from the blueprint of the building. the building has a function 
 *     when the building is done build right?
 *   - now the blueprint also have a function(in the java case this is known as static method), which tell
 *     you the date of the blue print was created for example, the length of the one part of the 
 *     construction and so on.
 *   - this static method is owned by the blueprint. so we can call it without creating the building (create
 *     instances from the class). 
 *   - this static method would be the general or utility class when encounter outside of this context.
 *   - operation 8th
 * = Also we have static properties(in this case the general attributes of the class), without creating the object
 *   from the class we could imagine the blue print has a color blue, the line to make building picture is white
 *   and so on.
 *   - Operation 9th
 * = So the static method/properteis are belong to the class itself, and the non-static method/properties are belong
 *   to the instances(object) of the class itself.
 * = Instead of creating array in-class initializer, you could create an initializer to the static properties (operation
 *   10th) using the static initializer
 * = You could also initialize the static properties using the static method
 * 
 * 
 * MEMBER VISIBILITY
 * = Member visibility(public, private, protected) define how we access the method or properties(attributes) of the object.
 *   = public class means the class can be seen everywhere(by other class).
 *   = public method can be access from anywhere as long as its class is accessible.
 *   = private method only could be access via the methods within the same class, you cannot access private method inside
 *     any other class.
 *     = The only way to get the private method is if other method that the same class has public and this method call 
 *       that private method.
 *   = protected method only accessible through the same package(folder), the same class, or through subclass that extend
 *     the class in which method is the member of the class.
 *   = package protected has same accessibility with the protected method, the different is that package protected method
 *     you dont write the access modifier and can't accessible through the subclass that extend the class with 
 *     different package(folder). 
 * = let say that on the company we have room(such as lab, IT related room, cleaning room, staff room) that limit the 
 *   access of the factory worker, so we could set this room as private or public (operation 12 - 13)
 *   = the company also has a secret jobs, where certain company and staff could only accessible
 * = private properties only accessible by the method(main method as well) of the class, not the other class.
 * = public properties accessible to the class or the other class's method.
 * = protected properties accessible through the same package, same class or the subclass extend the class of this properties.
 * 
 * CONSTRUCTORS
 * = You create a constructor inside the class with the access modifier following name that's the same as class name, 
 *   with no return datatype.
 * = Constructor allows you to initialize any properties as the object being created (operation 13th)
 * = Why do we need constructors?
 *   = Well, we create object from class and we need the constructor method to create that object inside the class.
 *   = If we don't specify how we construct the object from the class(blue print), you only have the class and that's
 *     for sure is useless right?
 *   = All object we see around us has properties right? that's how we know the object we encounter. so that we should
 *     has constructor when creating class.
 * = You call the constructor by using the new keyword
 *          
 *          Company Tesla = new Company("Tesla", LocalDate.of(year:1997, month:2, dayOfMonth:30));
 * 
 * = In practice, you don't construct an object with no value. It's not recommended in programming
 * = If you write a class and dont create any construct at all, java will give you a free no argument default
 *   constructor. So it still valid to create object like the following with no construct at all:
 *          
 *          Company Amazon = new Company();
 * 
 * = But when you create a constructor, the free no argument default constructor will excluded. Java will give you
 *   an error if you try to use it.
 * 
 * PROPERTIES ENCAPSULATION
 * = Java convention defined to get access(get or set value) to the properties of a class, you need a setter and getter
 *   methods. 
 * = When creating a class, by default we should make the properties private or protected or package protected 
 * = It's not recommended to access the properties directly, and the standard way is we expose the properties 
 *   via getter or setter methods.
 * = What's the purpose of the getter setter method when eventually the properties we're accessed are modified?
 *   = By using getter and setters, we have opportunity to do a level of protection if we want to.
 *   = The user who's calling getter and setter doesn't need to know if we're doing any protections or changing
 *     the data at all.
 *   = Suppose the person you create using Person class is like the following:
 *      
 *          Person michael = new Person("michael", "james", LocalDate.of(year:1980, month:2, dayOfMonth:30));
 *  
 *   = When you try to get the name, you'll likely get the "michael" not "Michael" that supposed to be so.
 * 
 *          System.out.format("This person's name: %s", Person.getName());      // => michael
 * 
 *   = And the protection we provide when the user program try to get the name is like the following:
 *          
 *          public String getName() {
 *              // concatenate the first character of the name
 *              // with the rest of the characters
 *              return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
 *          }
 * 
 *  = Now then, when we get the name we get the correct following:
 *      
 *          System.out.format("This person's name: %s", person.getName());      // => Michael
 * 
 * = Suppose you remind of the conventional name should be capitalized on the first character, you
 *   could use the setter methods to change your last name properties
 *          
 *          public void setLastName(String name) {
 *              this.lastName = name.substring(0,1).toUpperCase();
 *          }
 * 
 *          setLastName("James");
 * 
 * = Then in the future, you'll get the correct name
 *      
 *          System.out.format("This person's last name: %s", person.getLastName());
 *          
 * = The setter and getter methods help you to verify the input of the user.
 * = So the user doesn't control the input to your class, make the code buggy, doesn't change your
 *   code directly that make the class doesn't know the modified properties.
 */

/* OPERATIONS
 * create a class called FactoryWorker
 * create a class called NewsAgency
 * create a package called Business
 * create a class called Person
 * create a variable inside the 4th
 * create a class arrayDemo outside of this business package
 * create a method called sayHello in person class
 * create a static method in person
 * create a static attributes in person
 * create a static initializer
 * implement the visibility to the company
 * create a public, private, and protected room in company
 * create a constructor for Person class
 */