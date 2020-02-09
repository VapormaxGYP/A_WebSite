package Entity;

public class User_ID_PW {

    private int userID;
    private String passWord;

    public User_ID_PW(int userID, String passWord) {
        this.userID = userID;
        this.passWord = passWord;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
