public class Person {
    // declaring => create a variable without assigning a value.
    private String firstName = "Faza";
    private String lastName = "Akbar";
    private int age;
    private long id;
    private char firstInitialName;
    private byte roomNumber;
    // company that this person work at
    private Company company;
    // What part of the agency that this person work at.
    // private NewsAgency agency;
    
    // person's generally have ear, nose, skin and other part of the body right
    public static boolean isHavingNose;
    public static boolean isHavingMouth;
    public static boolean isHavingFeel;
    // and so on

    // CONSTRUCTOR places at the bottom-first of the properties
    public Person(String fname, String lname, int age) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.firstInitialName = this.firstName.toUpperCase().charAt(0);
    }

    // generally, we know what the person look like
    // static initializer
    static {
        isHavingFeel = true;
        isHavingMouth = true;
        isHavingNose = true;
    }
    // so we could say that person have nose, mouth, ears and so on.


    /* 
     * public => access modifier
     * void => the return datatype
     * sayHello => the name of the method
     * () => empty argument, so empty input
     * 
     */
    public void sayHello() {
        System.out.println("Hello");
    }

    /* 
     * = The sayHello() method doesn't output or return anything so we 
     *   define it as void
     * = We say public because the majority of person could talk right.
     *   = Also some person has method/function/skill which they're hiding, or protecting
     *     from any other person. so we could make it as 'private' or 'protected'.
     * = But it outputs a "Hello" right?
     *   = It's not considered to be output when you see the result in screen
     * = The output or return something from the method/skill/function for example you could imagine 
     *   how the person work for 1 or 2 month and get paid.
     *   = The job where the person work assume to be publicly known by everybody
     *
     */
    public double doingJob() {
        return 5000.90;
    }
    /*
     * = We want the salary to be return, so we define the double datatype.
     * = Method is a function(block of code) which do something and return something from what it
     *   has doing.
     * = Maybe the person get command from their boss to do something. this command
     *   we called input(pass an argument) and we receive this command by using the
     *   parameter of the method
     */
    public void doWhatBosSay(String theBosCommand) {
        System.out.println("Do what bos say: " + theBosCommand);
    }
    /* 
     * = because your boss want you to do something on his list
     *   then you have a method to do that jobs
     * = This method must receive an array, so the work done
     *   you need that list to be passed to this method.
     * = say that list of jobs is only command, the boss not write
     *   it, you need to write the commands by initialize a new array of jobs which each
     *   of the command is a String datatype.
     */
    public void doListOfJobs(String[] jobs) {
        System.out.println("I got a " + jobs.length + " jobs from my bos.");
    }
    /* 
     * = But you have a coding skill, you can automate the
     *   jobs using the code, and you create a method
     * = String... is a varargs, which is variable arguments
     *   you can pass the jobs as many as you wants
     * = varargs must the last of the parameter if you have more than one 
     *   parameter
     * = varargs dont need you to initialize it with new of the array, so you just
     *   need to pass the list
     */
    public void robotDoJobs(String... jobs) {
        System.out.println("Robot doing his jobs right now, start with " + jobs[0]);
    }

    // person as general could move
    public static void move() {
        System.out.println("Person's moving");
    }

    // getter
    public String getFirstName() {
        return firstName.substring(0,1).toUpperCase() + firstName.substring(1);
    }
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("michael", "james", 35);

        // the person we created say hello
        p1.sayHello();
        // the person we created work for 1 month
        // and get the output/return in form of a salary
        // the person need to store the salary variable it return from doingJob
        // so we create pocket variable or debit card or etc
        double pocket = p1.doingJob();
        System.out.println("The salary in my pocket: $" + pocket);
        // the person we created do what his/her boss say
        // on this method, we input the bos word. in this case
        // we're passing an argument
        p1.doWhatBosSay("fix the network for me");
        p1.doListOfJobs(new String[] {"create an email", "make a letter to my worker", "so on"});
        // you got a robot
        // so you don't need to work to create an array
        p1.robotDoJobs("create an email", "make a letter to my worker", "so on");
        // you call the static method, without creating the object from the class
        move();
        // you can access the static method
        System.out.println("Is human have nose? " + isHavingNose);
        
        System.out.format("The first name: %s", p1.getFirstName());
    }
}
