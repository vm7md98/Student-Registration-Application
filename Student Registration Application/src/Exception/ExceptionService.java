package Exception;

public class ExceptionService extends ArithmeticException {

    public String msg;
    public String action;

    public ExceptionService(String msg, String action) {
        this.msg = msg;
        this.action = action;

    }

    public ExceptionService(String msg) {
        this.msg = msg;
    }

    
    public void showError(String msg) {
        System.out.println(this.msg);
    }

    @Override
    public String toString() {
        return this.msg ;
    }

    public String toString2() {
        return  this.action;
    }
}
