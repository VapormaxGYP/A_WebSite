package Entity;

public class User_IPE {

    public User_IPE(int userID, String passWord, int EPCcode) {
        this.userID = userID;
        this.passWord = passWord;
        this.EPCcode = EPCcode;
    }

    private int userID;
    private String passWord;
    private int EPCcode;

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

    public int getEPCcode() {
        return EPCcode;
    }

    public void setEPCcode(int EPCcode) {
        this.EPCcode = EPCcode;
    }


}