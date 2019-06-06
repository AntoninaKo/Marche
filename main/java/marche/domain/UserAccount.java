package marche.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import marche.dto.UserDTO;

@Entity
@Table(name = "user_account")
public class UserAccount implements Serializable {

}
