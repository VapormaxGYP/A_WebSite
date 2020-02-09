package Service.ClassImpl;

import DataDeal.ClassImpl.UserAcc_Log;

public class Login implements Service.Login
{
    private UserAcc_Log userAccount = new UserAcc_Log();

    @Override
    public Object login(int userID, String passWord) {

        return userAccount.login(userID,passWord);
    }
}