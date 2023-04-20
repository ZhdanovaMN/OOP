public class MobilePhone extends Phone implements Call, SMS, Internet, Game, Camera {
    @Override
    public void makeCall() {
        System.out.println("Мобильный телефон может совершать звонки");
    }

    @Override
    public void answerCall() {
        System.out.println("Мобильный телефон может принимать звонки");
    }

    @Override
    public void takePicture() {
        System.out.println("Мобильный телефон может фотографировать");
    }

    @Override
    public void playGames() {
        System.out.println("Мобильный телефон может запускать игры");
    }

    @Override
    public void connect() {
        System.out.println("Мобильный телефон может выходить в интернет");
    }

    @Override
    public void disconnect() {
        System.out.println("Мобильный телефон может отключать интернет");
    }

    @Override
    public void sendSMS() {
        System.out.println("Мобильный телефон может отправлять СМС");
    }

    @Override
    public void receiveSMS() {
        System.out.println("Мобильный телефон может получать СМС");
    }

    @Override
    public void deleteSMS() {
        System.out.println("Мобильный телефон может удалять СМС");
    }
}
