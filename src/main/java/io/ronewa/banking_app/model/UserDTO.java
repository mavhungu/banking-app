package io.ronewa.banking_app.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UserDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    @UserUsernameUnique
    private String username;

    @NotNull
    @Size(max = 255)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

}
