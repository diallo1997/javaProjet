/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.EtudiantDaoImpl;
import dao.InterfaceEtudiantDao;
import entites.Etudiant;
import entites.Filiaire;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EtudiantServiceImpl implements InterfaceEtudiantService{
    
    private final InterfaceEtudiantDao etudiantDao= new EtudiantDaoImpl();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantDao.ajouterEtudiant(e);
    }

    @Override
    public List<Etudiant> listerEtudiantFiliare(Filiaire F) {
        return etudiantDao.listerEtudiantFiliare(F);
    }

    @Override
    public List<Etudiant> listerEtudiantClasse(Filiaire F, String niveau) {
        return etudiantDao.listerEtudiantClasse(F, niveau);
    }

    @Override
    public List<Etudiant> listerAllEtudiant() {
        return etudiantDao.listerAllEtudiant();
    }
    
}
