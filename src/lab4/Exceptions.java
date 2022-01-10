package lab4;


public class Exceptions {
    public static class NotPresent extends ArithmeticException{
        public NotPresent(String s){
            super(s);
        }
    }
    public static class Story extends RuntimeException{
        public Story(){
            super();
        }
    }
}
