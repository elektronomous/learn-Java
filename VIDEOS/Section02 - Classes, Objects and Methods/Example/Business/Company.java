public class Company {
    private FactoryWorker worker;
}

/* NOTE
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
 * = The person where is he/she work, literally has skills that it applied to its job right, so the person has a
 *   function to the company.
 *   - The function of the object on java called a method.
 *   - when you encounter the function in functionional programming, the context is different.
 *   - This function could be the behaviour of the person like breathe, move, or say something.(7th operation)
 * = The main method inside the class is almost not even part of the class, but it needed to live in class
 *   because the rules of java  
 * 
 */

/* OPERATIONS
 * create a class called FactoryWorker
 * create a class called NewsAgency
 * create a package called Business
 * create a class called Person
 * create a variable inside the 4th
 * create a class arrayDemo outside of this business package
 * create a method called sayHello in person class
 */