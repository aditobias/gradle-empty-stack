public class Android extends Mobile{
    final Integer LIMIT = 15;

    @Override
    public void makeCall(String message){
        if(message.length() > LIMIT){
            System.out.println("<Andriod> Message cannot be sent");
        }else{
            System.out.println("<Andriod> Message : " + message);
        }
    }
}