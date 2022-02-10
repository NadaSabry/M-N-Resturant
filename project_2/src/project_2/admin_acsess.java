package project_2;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.Statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class admin_acsess extends javax.swing.JFrame {

    DefaultTableModel model, table;

    public admin_acsess() {
        this.rs = null;
        initComponents();
        Select_meal();

    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    public void Select_meal(){
        try {
            
            rs=st.executeQuery("select food_name, drinks from Bill_number");
           tabel.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_acsess().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        meal = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));

        jPanel2.setBackground(new java.awt.Color(158, 158, 158));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("resturant management");

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setText("meal");

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("Id");

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel4.setText("price");

        add.setBackground(new java.awt.Color(33, 33, 33));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(250, 250, 250));
        add.setText("Add");
        add.setDefaultCapable(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(33, 33, 33));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(250, 250, 250));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        update.setBackground(new java.awt.Color(33, 33, 33));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        tabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.MatteBorder(null)));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "meal", "id", "price"
            }
        ));
        tabel.setGridColor(new java.awt.Color(153, 153, 153));
        tabel.setMinimumSize(new java.awt.Dimension(45, 45));
        tabel.setOpaque(false);
        tabel.setPreferredSize(new java.awt.Dimension(255, 426));
        tabel.setRowHeight(30);
        tabel.setRowMargin(5);
        tabel.setSelectionBackground(new java.awt.Color(238, 238, 238));
        tabel.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabel.setShowHorizontalLines(false);
        tabel.setShowVerticalLines(false);
        tabel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tabelComponentAdded(evt);
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ayman\\Desktop\\ad.png")); // NOI18N

        show.setBackground(new java.awt.Color(33, 33, 33));
        show.setFont(new java.awt.Font("Century751 No2 BT", 1, 18)); // NOI18N
        show.setForeground(new java.awt.Color(250, 250, 250));
        show.setText("show all meals");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ayman\\Desktop\\small_search.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(440, 440, 440)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)))
                        .addGap(47, 47, 47)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(571, 571, 571))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
       
          
      
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
               if (price.getText().isEmpty() || meal.getText().isEmpty() || id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "missing information");
        } else {
            try {

                con = DriverManager.getConnection("jdbc:derby://localhost:1527/resturant_manegement", "marihan", "1234");
                PreparedStatement add2 = con.prepareStatement("insert into meals_list (meal,ID,price) values(?,?,?)");
                add2.setString(1, meal.getText());
                add2.setInt(2, Integer.valueOf(id.getText()));
                add2.setInt(3, Integer.valueOf(price.getText()));
                int raw = add2.executeUpdate();
                JOptionPane.showMessageDialog(this, "meal added successfuly");
                con.close();
                Select_meal();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
     
    }//GEN-LAST:event_addMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        
        if (id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "missing information");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/resturant_manegement", "marihan", "1234");
                PreparedStatement del = con.prepareStatement("delete from  meals_list where ID=?");

                del.setInt(1, Integer.valueOf(id.getText()));

                int raw = del.executeUpdate();
                JOptionPane.showMessageDialog(this, "meal deleted successfuly");
                con.close();
                Select_meal();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
           
    }//GEN-LAST:event_deleteMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        DefaultTableModel model=(DefaultTableModel) tabel.getModel();
        
        int my_index=tabel.getSelectedRow();
        meal.setText(model.getValueAt(my_index,0).toString());
        id.setText(model.getValueAt(my_index,1).toString());
        price.setText(model.getValueAt(my_index,2).toString());
    }//GEN-LAST:event_tabelMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed


 DefaultTableModel model=(DefaultTableModel) tabel.getModel();
 if(tabel.getSelectedRowCount()==1){
 String ml =meal.getText();
 String i_d =id.getText();
 String pr =price.getText();
 tabel.setValueAt(ml, tabel.getSelectedRow(), 0);
 tabel.setValueAt(i_d, tabel.getSelectedRow(), 1);
 tabel.setValueAt(pr, tabel.getSelectedRow(), 2);
 JOptionPane.showMessageDialog(this, "meal updated successfuly");
 
 }
 
 else{
 
     if(tabel.getRowCount()==0){
     
      JOptionPane.showMessageDialog(this, "table is empty");
     
     }
     
     else{
     
      JOptionPane.showMessageDialog(this, "please select single row for update");
     
    }
 }
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        try{
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/resturant_manegement", "marihan", "1234");
        st=con.createStatement();
        String query ="select * from meals_list ";
        rs=st.executeQuery(query);
        while(rs.next()){
        String id=String.valueOf(rs.getInt("id"));
        String meal=rs.getString("meal");
        String price=rs.getString("price");
        String tbData []={meal,id,price};
        DefaultTableModel model=(DefaultTableModel) tabel.getModel();
        model.addRow(tbData);
        }
        
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_showActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        
       try{
        String query ="select * from meals_list where meal=?";
       pst=con.prepareStatement(query);
        pst.setString(1, search.getText());
        rs=pst.executeQuery();
        tabel.setModel(DbUtils.resultSetToTableModel(rs));
        while(rs.next()){
        }
        pst.close();
        }
        catch(Exception e){
        e.printStackTrace();
        }       
    }//GEN-LAST:event_searchKeyReleased

    private void tabelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tabelComponentAdded
        
       try{
       
       for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
           if("Windows".equals(info.getName())){
               UIManager.setLookAndFeel(info.getClassName());
               break;
           
           }
       }
       
       } 
       catch(Exception e) {
       
       e.getMessage();
       
       }
       initComponents();
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tabelComponentAdded

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField meal;
    private javax.swing.JTextField price;
    private javax.swing.JTextField search;
    private javax.swing.JButton show;
    private javax.swing.JTable tabel;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
