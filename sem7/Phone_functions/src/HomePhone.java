public class HomePhone extends Phone implements Call{

    @Override
    public void makeCall() {
        System.out.println("Стационарный телефон может совершать звонки");

    }

    @Override
    public void answerCall() {
        System.out.println("Стационарный телефон может принимать звонки");

    }
}
