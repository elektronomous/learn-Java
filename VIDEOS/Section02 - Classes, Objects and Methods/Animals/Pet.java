import java.time.LocalDate;
import java.time.Month;

public class Pet {
    private String name;
    LocalDate dob;

    // constructor
    public Pet() {
        this.name = "Pet1";
        this.dob = LocalDate.of(2022, Month.JULY, 22);
    }

    protected void protecthedMethod() {
        System.out.println("This is protected method of cat");
    }

    void packageProtected() {
        System.out.println("This is the packageProtected methods");
    }

    /* getter */
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    /* setter */
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pet{" +
               "name='" + name + '\'' +
               ", dob=" + dob +
               '}';
    }

        
}

/*
 * = This pet will be inherited to specific animal like cat, dog, bird
 *   and so on because it has some properties or methods that similar to the animals
 * = Now in the case that pet has methods that 
 * = The toString() will call automatically when you try to print the object
 * = This toString() method is commonly use when showing information about the objects being
 *   printed.
 *           
 *          Pet pet1 = new Pet();
 *          System.out.println(dog);
 * 
 * = It does the same
 *          
 *          System.out.println(dog.toString());
 * 
 * = Because we extend the behaviour of the pet to specific animal, we have different information
 *   to show what animal we're going to print.
 * = So we could overide the same method that the pet(parent class, class we extended from) has, to
 *   our specific animal which inheritated the pet behaviour(method).
 *   = This will show us the different information about the object.
 *   = To override the method, we tell java by using anotation(@Override)
 * = But why the pet(our parent class) still need @Override the toString method since our parent
 *   doesn't extending any class?
 *   = By default, all class we created that's not extend any class implicitly extend a parent class 
 *     called Object
 * 
 */