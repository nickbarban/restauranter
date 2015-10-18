package ppl.da.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ppl.da.core.entity.User;

/**
 * Created by greg on 18.10.15.
 */
public interface UserDao extends JpaRepository<User,Long> {
    /**looks for a user with such params
     * @param email
     * @param password
     * @return User
     */
    @Query("SELECT u FROM User u WHERE u.email = :email and u.password = :password")
    User  findByEmailAndPassword(@Param("email") String email,@Param("password") String password);

    User findByEmail(String email);


}
