package simplon.com.mcq.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import simplon.com.mcq.domain.dtos.UserCreate;
import simplon.com.mcq.domain.dtos.UserLogin;
import simplon.com.mcq.domain.entities.Role;
import simplon.com.mcq.domain.entities.User;
import simplon.com.mcq.repositories.RoleRepository;
import simplon.com.mcq.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository users;
    private final RoleRepository roles;

    public UserServiceImpl(UserRepository users, RoleRepository roles) {
	this.users = users;
	this.roles = roles;
    }

    @Override
    public void create(UserCreate inputs) {
	User entity = new User();
	entity.setUsername(inputs.getUsername());
	entity.setFirstName(inputs.getFirstName());
	entity.setLastName(inputs.getLastName());
	entity.setPassword(inputs.getPassword());
	entity.setPseudo(inputs.getPseudo());
	entity.setEnabled(true);
	entity.setTutor(inputs.isTutor());
	Role defaultRole = roles.findByByDefaultTrue();
	entity.setRole(defaultRole);
	users.save(entity);
    }

    @Override
    public void login(UserLogin inputs) {
	String username = inputs.getUsername();
	Optional<User> entity = users.FindByUsernameAndEnabledTrue(username);
	if (entity.isPresent()) {
	    System.out.println("Login success!");
	} else {
	    System.out.println("Account not found!");
	}

    }

}
