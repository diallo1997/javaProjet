/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entites.Etudiant;
import entites.Filiaire;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EtudiantDaoImpl implements InterfaceEtudiantDao {

    public static final SimpleDateFormat SQL_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public EtudiantDaoImpl() {
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        String id = e.getId();
        String prenom = e.getPrenom();
        String nom = e.getNom();
        Date dateNaissance = e.getDateNaissance();
        String dateString = SQL_FORMAT.format(dateNaissance);
        String nomFiliaire = e.getnomFiliaire();
        String niveau = e.getNiveau();

        String requete = "INSERT INTO etudiant(ID,PRENOM,NOM,DATE_NAISSANCE,NOM_FILIAIRE,NIVEAU) VALUES ('" + id + "', '" + prenom + "','" + nom + "','" + dateString + "', '" + nomFiliaire + "','" + niveau + "')";
        System.out.println("requete=" + requete);

        try {
            Statement st = DbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Etudiant> listerEtudiantFiliare(Filiaire F) {

        String requete = "SELECT * FROM ETUDIANT WHERE FILIAIRE='" + F + "'";
        ResultSet list = null;
        try {
            Statement st = DbUtils.getConnection().createStatement();
            list = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (List<Etudiant>) list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Etudiant> listerEtudiantClasse(Filiaire F, String niveau) {
        String requete = "SELECT * FROM ETUDIANT WHERE FILIAIRE='" + F + "' AND NIVEAU='" + niveau + "'";
        ResultSet list = null;
        try {
            Statement st = DbUtils.getConnection().createStatement();
            list = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (List<Etudiant>) list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Etudiant> listerAllEtudiant() {
        String requete = "SELECT * FROM ETUDIANT ";
        ResultSet list = null;
        try {
            Statement st = DbUtils.getConnection().createStatement();
            list = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (List<Etudiant>) list;
    }

}
