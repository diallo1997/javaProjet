/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Filiaire {

    private String nomFiliaire;

    private static final String niveau1 = "Licence 1";
    private static final String niveau2 = "Licence 2";
    private static final String niveau3 = "Licence 3";
    private static final String niveau4 = "Master 1";
    private static final String niveau5 = "Master 2";

    public Filiaire() {
    }

    public Filiaire(String nomFiliaire) {
        this.nomFiliaire = nomFiliaire;
    }

    public String getNomFiliaire() {
        return nomFiliaire;
    }

    public static String getNiveau1() {
        return niveau1;
    }

    public static String getNiveau2() {
        return niveau2;
    }

    public static String getNiveau3() {
        return niveau3;
    }

    public static String getNiveau4() {
        return niveau4;
    }

    public static String getNiveau5() {
        return niveau5;
    }

}
