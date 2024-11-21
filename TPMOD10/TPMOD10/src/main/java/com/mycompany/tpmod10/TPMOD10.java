/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmod10;

/**
 *
 * @author Asus
 */
public class TPMOD10 {

    public static void main(String[] args) {
        // Objek pertama dengan id dan password benar
        UserData user1 = new UserData(1234, 8766);

        // Objek kedua dengan id dan password salah
        UserData user2 = new UserData(1113, 8888);

        try {
            user1.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }

        try {
            user2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }

        try {
            user2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}