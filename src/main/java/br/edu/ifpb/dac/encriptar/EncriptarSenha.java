/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.encriptar;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Fernando
 */
public class EncriptarSenha {
    public static String encriptar(String senha){
        String senhaEncriptada = null;
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senhaEncriptada = hexString.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        }
        return senhaEncriptada;
    }
}