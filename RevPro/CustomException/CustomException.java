public class CustomException
{

    static class InvalidOperationException extends Exception {
        public InvalidOperationException(String message) {
            super(message);
        }
    }

    static void operation(String oper) throws InvalidOperationException {
        if (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))) {
            throw new InvalidOperationException("The operation you are looking or inputting is not valid operation input");
        }
        else {
            System.out.println(oper + " " + "is a valid operation");
        }
    }

    public static void main(String[] args)
    {
        try {
            operation("=");
        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}