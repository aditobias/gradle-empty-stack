public class IPhone extends Mobile{
    @Override
    public void makeCall(String message){
        System.out.println("<iPhone>Message : " + message);
    }
}