package com.smartContactManager.pojo;

public class UserPojo {
    private String userEmailId;
    private String password;
    private String descriptionOfUser;
    private String roleOfUser;


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
        System.out.println();
        return roleOfUser;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "userEmailId='" + userEmailId + '\'' +
                ", password='" + password + '\'' +
                ", descriptionOfUser='" + descriptionOfUser + '\'' +
                ", roleOfUser='" + roleOfUser + '\'' +
                '}';
    }
}
