package ppl.da.core.entity;

import javax.persistence.*;

/**
 * Created by greg on 18.10.15.
 */
@Entity
@Table(name = "users")
@AttributeOverride(name = "id", column = @Column(name = "user_id",
        nullable = false,columnDefinition = "BIGINT UNSIGNED"))
public class User extends BaseEntityAudit{
    @Column(name = "name")
    private String name;
    @Column(unique = true,name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "info")
    private String info;

    public User() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
