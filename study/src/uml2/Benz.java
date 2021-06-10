package uml2;

public class Benz extends Car{
    private int price;
    
    @Override
    protected void specialFunction() {
    }
    
    public Status autoDrive() {
        return new Status();
    }
}