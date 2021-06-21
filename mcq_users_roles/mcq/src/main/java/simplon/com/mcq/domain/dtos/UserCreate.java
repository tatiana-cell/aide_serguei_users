package simplon.com.mcq.domain.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserCreate {
    @NotBlank
    @Size(max = 255)
    private String firstName;

    @NotBlank
    @Size(max = 255)
    private String lastName;
    @NotBlank
    @Size(min = 3, max = 12)
    private String pseudo;

    @Size(max = 255)
    @Email
    // crer validator @UniqueUsername
    private String username;

    @NotBlank

    private String password;
    private boolean tutor;

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getPseudo() {
	return pseudo;
    }

    public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public boolean isTutor() {
	return tutor;
    }

    public void setTutor(boolean tutor) {
	this.tutor = tutor;
    }

    public UserCreate() {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
	return "UserCreate [firstName=" + firstName + ", lastName=" + lastName + ", pseudo=" + pseudo + ", userName="
		+ username + ", password=" + password + ", tutor=" + tutor + "]";
    }

}
