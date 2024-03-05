package wifipassword;

public class Incorrectpassword extends Exception{
    String errorcode;
    public Incorrectpassword(String message,String errorcode){
        super(message);
        this.errorcode=errorcode;
    }
}
