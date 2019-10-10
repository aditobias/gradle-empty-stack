public class IPhone extends Mobile{
    final Integer LIMIT = 0;
    @Override
    public void makeCall(String message){
        if(message.length() < LIMIT){
            System.out.println("<iPhone> Message cannot be sent");
        }else{
            System.out.println("<iPhone>Message : " + message);
        }
    }
}