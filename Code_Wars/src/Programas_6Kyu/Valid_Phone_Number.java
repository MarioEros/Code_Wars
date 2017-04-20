package Programas_6Kyu;

import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauna Kea
 */
public class Valid_Phone_Number {
    public static boolean validPhoneNumber(String phoneNumber) {
    return Pattern.matches("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}", phoneNumber);
  }
}
