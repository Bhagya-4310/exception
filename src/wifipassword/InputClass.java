package wifipassword;

public class InputClass{
    public static void main(String[] args) {
        Wifi wifi = new Wifi();
        wifi.username = "bhagi4310";
        wifi.password = "4310";
        wifi.setpassword="4310";
        try {
            if (wifi.setpassword.equals(wifi.password)) {
                System.out.println("wifi connected");
            } else {
                throw new Incorrectpassword(ErrorCode.wrong_password.toString(),"incorrect password");
            }
        } catch (Incorrectpassword e) {
            System.out.println(e.errorcode);
        }
    }
}
