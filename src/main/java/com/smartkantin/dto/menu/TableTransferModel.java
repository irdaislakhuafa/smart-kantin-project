package com.smartkantin.dto.menu;

import com.smartkantin.dto.menu.TableTransfer;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableTransferModel extends AbstractTableModel{
        private final String[] columnTable = {
            "ID", "WALI MURID", "ID CARD SISWA", "TOTAL", "BUKTI", "STATUS"
        };
        private List<TableTransfer> table;

        public TableTransferModel(List<TableTransfer> table) {
            this.table = table;
        }
        
        @Override
        public int getRowCount() {
            return table.size();
        }

        @Override
        public int getColumnCount() {
            return columnTable.length;
        }

        @Override
        public Object getValueAt(int i, int i1) { // mengisi setiap kolom pada table 
//            System.out.println("Index : "+ i1);
//            System.out.println("data : "+ i1);
            return switch (i1){
                case 0 -> table.get(i).getId_transfer();
                case 1 -> table.get(i).getNama_wali();
                case 2 -> table.get(i).getId_card();
                case 3 -> "Rp. " + table.get(i).getTotal();
                case 4 -> table.get(i).getBukti();
                case 5 -> table.get(i).getStatus();
                default -> "-";
            };
        }
        @Override
        public String getColumnName(int index){
            System.out.println("wkwkwk");
            return columnTable[index];
        }
        @Override
        public Class<?> getColumnClass(int index){ // merepresentasikan setiap object pada table agar lebih manusiawi  
            if (getValueAt(0, index) != null)
                return getValueAt(0, index).getClass();
            else
                return Object.class;
        }
}