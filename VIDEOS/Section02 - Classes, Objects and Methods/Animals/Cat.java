public class Cat extends Pet {
    public void meow() {
        System.out.println("meow meow");
    }

    // override the toString() method
    // @Override is anotation that tells the java we're overriding from the class we extends
    @Override
    public String toString() {
        // if you wanna access the toString() of the parent class
        // you call it using super keyword:
        //      super.toString();

        // TODO Auto-generated method stub
        return "Cat{name=Tony, date=2022-10-21}";
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        System.out.println(cat1);
        // before you override the method, you got result 
        // pet {name='Pet', dob=2022-07-22}

        // after you override the method
    }
}
