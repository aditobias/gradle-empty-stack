public class IPhoneRobot {
    private Mobile mobileOfRobot;

    public void setMobileOfRobot(Mobile mobileOfRobot) {
        this.mobileOfRobot = mobileOfRobot;
    }

    public void useMobile(){
        if(mobileOfRobot instanceof IPhone){
            System.out.println("This phone is an iPhone!");
        }else{
            System.out.println("This phone is not an iPhone!!!");
        }
    }
}
