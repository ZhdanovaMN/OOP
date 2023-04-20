public class Main {
    public static void main(String[] args) {

        Phone homePhone = new HomePhone();
        Phone oldMobilePhone = new OldMobilePhone();
        Phone mobilePhone = new MobilePhone();
        Phone smartPhone = new SmartPhone();



        homePhone.makeCall();
        homePhone.answerCall();
        ((OldMobilePhone) oldMobilePhone).sendSMS();
        ((MobilePhone) mobilePhone).connect();
        ((SmartPhone) smartPhone).sendEmail();
        ((SmartPhone) smartPhone).playVideo();
    }
}