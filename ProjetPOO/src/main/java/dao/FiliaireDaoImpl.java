/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entites.Filiaire;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FiliaireDaoImpl implements InterfaceFiliaireDao {

    public FiliaireDaoImpl() {
    }

    public void ajouterFiliare(Filiaire F) {

        try {
            String nomFiliaire = F.getNomFiliaire();

            String requete = "INSERT INTO FILIAIRE(NOM_FILIAIRE) VALUES('" + nomFiliaire + "')";
            System.out.println("requete=" + requete);

            Statement st = DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliaireDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modifierFiliare(String ancienNom, String nouveauNom) {
        
        
        String requete = "update filiaire set nomfiliaire='"+nouveauNom+"' where nomfiliaire='"+ancienNom+"'";
        
        try {
            Statement st = DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliaireDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void supprimerFiliare(String nomFiliaire) {

        try {
            String requete = "DELETE FROM FILIAIRE WHERE NOM_FILIAIRE='" + nomFiliaire + "'";
            System.out.println("requete=" + requete);

            Statement st = DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliaireDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
