public class Person {

    Boolean changePhone = false;
    Mobile personPhone = new Mobile();

    public void setChangePhone(Boolean changePhone) {
        this.changePhone = changePhone;
    }

    public void usePhone(){
        if(changePhone){
            personPhone = new IPhone();
        }else{
            personPhone = new Android();
        }
    }

}
