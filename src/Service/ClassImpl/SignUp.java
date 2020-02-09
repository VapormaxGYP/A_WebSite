package Service.ClassImpl;

import DataDeal.ClassImpl.UserAcc_S;

public class SignUp implements Service.SignUp {

    private UserAcc_S userAcc_s = new UserAcc_S();

    @Override
    public void Signup(int userID, String passWord, int EPC_Code) {

        userAcc_s.Signup(userID, passWord, EPC_Code );

    }
}
