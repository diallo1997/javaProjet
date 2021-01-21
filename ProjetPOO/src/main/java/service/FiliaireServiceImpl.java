/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.FiliaireDaoImpl;
import dao.InterfaceFiliaireDao;
import entites.Filiaire;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FiliaireServiceImpl implements InterfaceFiliaireDao{
    
    private final InterfaceFiliaireDao filiaireDao= new FiliaireDaoImpl();

    public FiliaireServiceImpl() {
    }

   

    @Override
    public void ajouterFiliare(Filiaire F) {
        filiaireDao.ajouterFiliare(F);
    }

    @Override
    public void modifierFiliare(String ancienNom, String nouveauNom) {
        filiaireDao.modifierFiliare(ancienNom, nouveauNom);
    }

    @Override
    public void supprimerFiliare(String nomFliaire) {
        filiaireDao.supprimerFiliare(nomFliaire);
    }
    
    

}
