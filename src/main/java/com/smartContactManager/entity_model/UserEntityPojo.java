package com.smartContactManager.entity_model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name = "USER_SCM")
public class UserEntityPojo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(unique = true)
    private String userEmailId;
    private String password;
    private String descriptionOfUser;
    private String roleOfUser;
    private boolean isEnabled;
    private String imageurl;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ContactEntityModel> contactList = new ArrayList<>();


    public UserEntityPojo() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public String getPassword() {
        return password;
    }

    public String getDescriptionOfUser() {
        return descriptionOfUser;
    }

    public String getRoleOfUser() {
        return roleOfUser;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDescriptionOfUser(String descriptionOfUser) {
        this.descriptionOfUser = descriptionOfUser;
    }

    public void setRoleOfUser(String roleOfUser) {
        this.roleOfUser = roleOfUser;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public List<ContactEntityModel> getContactList() {
        return contactList;
    }

    public void setContactList(List<ContactEntityModel> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", userEmailId='" + userEmailId + '\'' +
                ", password='" + password + '\'' +
                ", descriptionOfUser='" + descriptionOfUser + '\'' +
                ", roleOfUser='" + roleOfUser + '\'' +
                ", isEnabled=" + isEnabled +
                ", imageurl='" + imageurl + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}

