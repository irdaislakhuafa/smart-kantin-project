package com.smartkantin.dto.menu;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DaftarSiswaModel extends AbstractTableModel {
    private String[] columnTable = {
        "ID", "NAMA", "ID WALI", "ID CARD", "SALDO"
    };
    private List<DaftarSiswa> dftrSiswa;

    public DaftarSiswaModel(List<DaftarSiswa> daftarSiswa) {
        this.dftrSiswa = daftarSiswa;
    }
    
    

    @Override
    public int getRowCount() {
        return dftrSiswa.size();
    }

    @Override
    public int getColumnCount() {
         return columnTable.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return switch (i1){
            case 0 -> dftrSiswa.get(i).getId_siswa();
            case 1 -> dftrSiswa.get(i).getNama_siswa();
            case 2 -> dftrSiswa.get(i).getId_ortu();
            case 3 -> dftrSiswa.get(i).getId_card();
            case 4 -> "Rp. " + dftrSiswa.get(i).getSaldo();
            default -> "-";
        };
    }
    @Override
    public String getColumnName(int index){
        return columnTable[index];
    }
    @Override
    public Class<?> getColumnClass(int indexColumn){
        if (getValueAt(0, indexColumn) != null)
            return getValueAt(0, indexColumn).getClass();
        else
            return Object.class;
    }
    
}
