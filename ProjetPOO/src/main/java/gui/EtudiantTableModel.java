/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import entites.Etudiant;
import service.EtudiantServiceImpl;
import service.InterfaceEtudiantService;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EtudiantTableModel extends AbstractTableModel {
    private final List<Etudiant> etudiant;
    public EtudiantTableModel() {
      EtudiantServiceImpl  etudiantservice = new EtudiantServiceImpl();
      etudiant = etudiantservice.listerAllEtudiant();
    }

   
    @Override
    public int getRowCount() {
       return etudiant.size();
    }

    @Override
    public int getColumnCount() {
       return 6; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etudiant e=etudiant.get(rowIndex);
        Object res = null;
        switch(columnIndex){
            case 0:
                res=e.getId();
                break;
            case 1:
                res=e.getPrenom();
                break;
            case 2:
                res=e.getNom();
                break;
            case 3:
                res=e.getDateNaissance();
                break;
            case 4:
                res=e.getnomFiliaire();
                break;
            case 5:
                res=e.getNiveau();
                break;    
        }
        
        return res;
    }
        
}
      
