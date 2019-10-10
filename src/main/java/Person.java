public class Person {

    Mobile mobile;

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void makeCall(String message){
        mobile.makeCall(message);
    }

}
