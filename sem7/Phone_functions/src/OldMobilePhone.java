public class OldMobilePhone extends Phone implements Call, SMS {

    @Override
    public void makeCall() {
        System.out.println("Мобильный телефон старой модели может совершать звонки");
    }

    @Override
    public void answerCall() {
        System.out.println("Мобильный телефон старой модели может принимать звонки");
    }

    @Override
    public void sendSMS() {
        System.out.println("Мобильный телефон старой модели может отправлять СМС");
    }

    @Override
    public void receiveSMS() {
        System.out.println("Мобильный телефон старой модели может получать СМС");
    }

    @Override
    public void deleteSMS() {
        System.out.println("Мобильный телефон старой модели может удалять СМС");
    }
}
