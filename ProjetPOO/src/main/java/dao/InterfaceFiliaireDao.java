/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entites.Filiaire;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface InterfaceFiliaireDao {
    
    public void ajouterFiliare(Filiaire F);
    
    public void modifierFiliare(String ancienNom, String nouveauNom);
    
    public void supprimerFiliare(String nomFliaire);
    
}