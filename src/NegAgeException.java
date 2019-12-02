public class NegAgeException extends Exception {
    private int age;
    public NegAgeException(int age){
        this.age = age;
    }
    @Override
    public String getMessage() {
        return "The age: " + age + " is illegal.";
    }
}
