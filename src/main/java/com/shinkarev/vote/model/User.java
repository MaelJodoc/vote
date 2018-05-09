package com.shinkarev.vote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;

/**
 * Created by Смена on 07.05.2018.
 */

public class User extends BaseModel {
    @Column
    private String email;

    @Column
    private String password;

    @Column
    private boolean isBanned;

    public User(@Email String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {
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

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }
}
