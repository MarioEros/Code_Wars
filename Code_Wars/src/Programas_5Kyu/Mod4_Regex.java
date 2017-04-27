/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas_5Kyu;

import java.util.regex.Pattern;

/**
 *
 * @author Mauna Kea
 */
public class Mod4_Regex {
  public static Pattern mod4 = Pattern.compile(".*\\[[\\-\\+]?([0-9]*([13579][26]|[24680][048])|[48])\\].*");
}
