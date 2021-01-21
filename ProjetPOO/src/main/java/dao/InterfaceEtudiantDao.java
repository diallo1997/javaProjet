/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entites.Etudiant;
import entites.Filiaire;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface InterfaceEtudiantDao {

    public void ajouterEtudiant(Etudiant e);

    public List<Etudiant> listerEtudiantFiliare(Filiaire F);

    public List<Etudiant> listerEtudiantClasse(Filiaire F, String niveau);

    public List<Etudiant> listerAllEtudiant();
}
