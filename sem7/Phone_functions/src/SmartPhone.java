public class SmartPhone extends Phone implements Call, Camera, Email, Game, Internet, SMS, Video {

    @Override
    public void makeCall() {
        System.out.println("Смартфон может совершать звонки");
    }

    @Override
    public void answerCall() {
        System.out.println("Смартфон может принимать звонки");
    }

    @Override
    public void takePicture() {
        System.out.println("Смартфон может фотографировать");
    }

    @Override
    public void sendEmail() {
        System.out.println("Смартфон может отправлять электронную почту");
    }

    @Override
    public void receiveEmail() {
        System.out.println("Смартфон может принимать электронную почту");
    }

    @Override
    public void deleteEmail() {
        System.out.println("Смартфон может удалять электронную почту");
    }

    @Override
    public void playGames() {
        System.out.println("Смартфон может запускать игры");
    }

    @Override
    public void connect() {
        System.out.println("Смартфон может выходить в интернет");
    }

    @Override
    public void disconnect() {
        System.out.println("Смартфон может отключать интернет");
    }

    @Override
    public void sendSMS() {
        System.out.println("Смартфон может отправлять СМС");
    }

    @Override
    public void receiveSMS() {
        System.out.println("Смартфон может получать СМС");
    }

    @Override
    public void deleteSMS() {
        System.out.println("Смартфон может удалять СМС");
    }

    @Override
    public void playVideo() {
        System.out.println("Смартфон может воспроизводить видео");
    }

    @Override
    public void takeVideo() {
        System.out.println("Смартфон может снимать видео");
    }
}
