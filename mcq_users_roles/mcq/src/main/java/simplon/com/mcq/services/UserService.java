package simplon.com.mcq.services;

import simplon.com.mcq.domain.dtos.UserCreate;
import simplon.com.mcq.domain.dtos.UserLogin;

public interface UserService {
    void create(UserCreate inputs);

    void login(UserLogin inputs);
}
