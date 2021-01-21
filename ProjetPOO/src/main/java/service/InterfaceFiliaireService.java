/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entites.Filiaire;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface InterfaceFiliaireService {
    
    public void ajouterFiliare(Filiaire F);
    
    public void modifierFiliare(String ancienNom, String nouveauNom);
    
    public void supprimerFiliare(String nomFliaire);
    
}
