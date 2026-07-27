package com.projeto.guild.entities;

import java.util.Objects;

public class Adventurer {
    private long id;
    private String name;
    private String email;
    private String roleClass;
    private String password;

    public Adventurer() {}

    public Adventurer(long id, String name, String email, String roleClass, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roleClass = roleClass;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Adventurer that = (Adventurer) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getRoleClass() {
        return roleClass;
    }

    public void setRoleClass(String roleClass) {
        this.roleClass = roleClass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
