public class Main {
    public static void main(String[] args) {
        EmailBuilder builder = new EmailBuilder();
        builder.addressAMadam("Jane Doe");
        builder.talkAboutMe("John Doe", "HZ University of Applied Sciences");
        builder.showInterest("Google");
        builder.tellHowToContact();
        builder.sayThanks();

        System.out.println(builder.getEmail());
    }
}