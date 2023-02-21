public class Person {
    // declaring => create a variable without assigning a value.
    private String firstName = "Faza Akbar";
    private int age;
    private long id;
    private char firstInitialName;
    private byte roomNumber;
    // company that this person could interview
    private Company company;
    // What part of the agency that this person work at.
    // private NewsAgency agency;

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
     * = But it output a "Hello" right?
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
     * = Method is a function(block of code) which do something and return something from what it
     *   has doing.
     * = Maybe the person get command from their boss to do something. this command
     *   we called input(pass an argument) and we receive this command by using the
     *   parameter of the method
     * = We want the salary to be return, so we define the double datatype.
     */
    public void doWhatBosSay(String theBosCommand) {
        System.out.println("Do what bos say: " + theBosCommand);
    }

    public static void main(String[] args) {
        Person p1 = new Person();

        // the person we created say hello
        p1.sayHello();
        // the person we created work for 1 month
        // and get the output/return in form of a salary
        // the person need to store the salary variable it return from doingJob
        // so we create pocket variable or debit card or etc
        double pocket = p1.doingJob();
        System.out.println("The salary: $" + salary);
        // the person we created do what his/her boss say
        // on this method, we input the bos word. in this case
        // we're passing an argument
        p1.doWhatBosSay("fix the network for me");
    }
}
