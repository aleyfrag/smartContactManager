package com.smartContactManager.entity_model;


import jakarta.persistence.*;


@Entity
@Table(name = "CONTACT_DETAILS_SCM")
public class ContactEntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactId;
    private String contactName;
    private String conatctNickName;
    private String contactType;
    @Column(length = 5000)
    private String contactDescription;
    private String contactNumber;
    private String contactImageurl;

    @ManyToOne
    private UserEntityPojo user;

    public UserEntityPojo getUser() {
        return user;
    }

    public void setUser(UserEntityPojo user) {
        this.user = user;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setConatctNickName(String conatctNickName) {
        this.conatctNickName = conatctNickName;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public void setContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setContactImageurl(String contactImageurl) {
        this.contactImageurl = contactImageurl;
    }

    public int getContactId() {
        return contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getConatctNickName() {
        return conatctNickName;
    }

    public String getContactType() {
        return contactType;
    }

    public String getContactDescription() {
        return contactDescription;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactImageurl() {
        return contactImageurl;
    }
}
