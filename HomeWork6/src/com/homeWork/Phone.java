package com.homeWork;

public class Phone implements Cloneable{

    private int id;
    private String surname;
    private String name;
    private String fatherName;
    private String address;
    private String phoneNumber;
    private String creditNumber;
    private int debet;
    private int credit;
    private int townCalls;
    private int interCalls;
    private int internet;

    public Phone(int id, String surname, String name, String fatherName, String address, String phoneNumber,
                 String creditNumber, int debet, int credit, int townCalls, int interCalls, int internet) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditNumber = creditNumber;
        this.debet = debet;
        this.credit = credit;
        this.townCalls = townCalls;
        this.interCalls = interCalls;
        this.internet = internet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTownCalls() {
        return townCalls;
    }

    public void setTownCalls(int townCalls) {
        this.townCalls = townCalls;
    }

    public int getInterCalls() {
        return interCalls;
    }

    public void setInterCalls(int interCalls) {
        this.interCalls = interCalls;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditNumber='" + creditNumber + '\'' +
                ", debet=" + debet +
                ", credit=" + credit +
                ", townCalls=" + townCalls +
                ", interCalls=" + interCalls +
                ", internet=" + internet +
                '}';
    }
}
