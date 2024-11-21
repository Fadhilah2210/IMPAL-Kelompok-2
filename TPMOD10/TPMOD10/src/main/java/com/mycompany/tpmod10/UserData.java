/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmod10;

/**
 *
 * @author Asus
 */
public class UserData {
private int userid;
    private int password;
    private boolean isLoggedIn;

    public UserData(int userid, int password) {
        assert String.valueOf(userid).length() == 4 : "UserID harus terdiri dari 4 digit";
        assert String.valueOf(password).length() == 4 : "Password harus terdiri dari 4 digit";
        this.userid = userid;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void login() throws LoginFailedException {
        if ((userid + password) == 10000) {
            isLoggedIn = true;
            System.out.println("Login successful for user " + userid);
        } else {
            isLoggedIn = false;
            int failedAttempts = LoginFailedException.getFailedCounter(userid) + 1;
            throw new LoginFailedException(
                "Login user " + userid + " gagal, telah gagal login " + failedAttempts + " kali", userid);
        }
    }
}