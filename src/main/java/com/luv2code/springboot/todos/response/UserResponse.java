package com.luv2code.springboot.todos.response;

import com.luv2code.springboot.todos.entity.Authority;

import java.util.List;

public class UserResponse {

    private long id;
    private String fullname;
    private String email;
    private List<Authority> authorities;

    public UserResponse(long id, String fullname, String email, List<Authority> authorities) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.authorities = authorities;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
