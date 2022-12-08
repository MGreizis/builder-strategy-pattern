public class EmailBuilder {
    private String _email = "";

    public void addNewLine() {
        _email += "\n";
    }

    public void addressAMadam(String name) {
        _email += "Dear Ms. " + name + ", \r";
        this.addNewLine();
        this.addNewLine();
    }

    public void addressAMister(String name) {
        _email += "Dear Sir " + name + ", \r";
        this.addNewLine();
    }

    public void toUnknown() {
        _email += "To whom it may concern, \r";
        this.addNewLine();
    }

    public void talkAboutMe(String name, String university) {
        _email += "I am " + name + " from " + university + ". \r";
        this.addNewLine();
    }

    public void showInterest(String company) {
        _email += "I am interested in working for " + company + ". \r";
        this.addNewLine();
        this.addNewLine();
    }

    public void tellHowToContact() {
        _email += "Please contact me at grei0003@hz.nl \r";
        this.addNewLine();
    }

    public void sayThanks() {
        _email += "Thank you for your time. \r";
        this.addNewLine();
    }

    public void reset() {
        _email = "";
    }

    public String getEmail() {
        return _email;
    }

    public void sendEmail() {
        System.out.println(_email);
    }
}
