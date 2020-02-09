package DataDeal;

import Entity.User_ID_PW;

public interface UserAcc_Log {
    public User_ID_PW login(int userID, String passWord);
}

