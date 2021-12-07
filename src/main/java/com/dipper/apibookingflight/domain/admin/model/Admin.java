package com.dipper.apibookingflight.domain.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Admin")
public class Admin {
    @Id
    private String id;

    private String name;
    private String surnames;
    private String email;
    private String contact;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String id, String name, String surnames, String email, String contact, String username, String password) {
        this.id = id;
        this.name = name;
        this.surnames = surnames;
        this.email = email;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public static AdminBuilder builder() {
        return new AdminBuilder();
    }

    public static class AdminBuilder {
        private String id;
        private String name;
        private String surnames;
        private String email;
        private String contact;
        private String username;
        private String password;

        public AdminBuilder id(String id) {
            this.id = id;
            return this;
        }

        public AdminBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AdminBuilder surnames(String surnames) {
            this.surnames = surnames;
            return this;
        }

        public AdminBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AdminBuilder contact(String contact) {
            this.contact = contact;
            return this;
        }

        public AdminBuilder username(String username) {
            this.username = username;
            return this;
        }

        public AdminBuilder password(String password) {
            this.password = password;
            return this;
        }

        public Admin build() {
            return new Admin(id, name, surnames, email, contact, username, password);
        }
    }


    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

