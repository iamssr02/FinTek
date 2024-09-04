package gui;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FinTek extends javax.swing.JFrame {

    public FinTek() {
        initComponents();
        displayCategory();
        getEntries();
        dateField.setSelectableDateRange(null, new java.util.Date());
        dateField.setDate(new java.util.Date());
        ((JTextField) dateField.getDateEditor().getUiComponent()).setEditable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        addCategoryButton = new javax.swing.JButton();
        addSpendingButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        removeSpendingButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        totalAmountText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        viewSpendingMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        addViewCategoryMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FinTek");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add New Expense");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date:");

        dateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount:");

        amountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextFieldActionPerformed(evt);
            }
        });
        amountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category:");

        addCategoryButton.setBackground(new java.awt.Color(255, 255, 0));
        addCategoryButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCategoryButton.setText("Add new category");
        addCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryButtonActionPerformed(evt);
            }
        });

        addSpendingButton.setBackground(new java.awt.Color(51, 204, 0));
        addSpendingButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addSpendingButton.setForeground(new java.awt.Color(255, 255, 255));
        addSpendingButton.setText("Add");
        addSpendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSpendingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountTextField)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(categoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(addSpendingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(addSpendingButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addSpendingButton, amountTextField, categoryComboBox, dateField, jLabel1, jLabel3, jLabel4});

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Last 30 days' spending:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Category", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        removeSpendingButton.setBackground(new java.awt.Color(255, 51, 51));
        removeSpendingButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeSpendingButton.setForeground(new java.awt.Color(255, 255, 255));
        removeSpendingButton.setText("Remove");
        removeSpendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSpendingButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        totalAmountText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalAmountText.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Total Spending:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAmountText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountText)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jMenu2.setText("File");

        viewSpendingMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        viewSpendingMenuItem.setText("View Spending");
        viewSpendingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSpendingMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(viewSpendingMenuItem);
        jMenu2.add(jSeparator1);

        addViewCategoryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addViewCategoryMenuItem.setText("Add/View Category");
        addViewCategoryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addViewCategoryMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(addViewCategoryMenuItem);
        jMenu2.add(jSeparator2);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(exitMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeSpendingButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(removeSpendingButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayCategory(){
        try{
            categoryComboBox.removeAllItems();
            ResultSet resultSet=db.DbConnect.statement.executeQuery(
                    "SELECT * FROM category_info");
            while(resultSet.next()){
                categoryComboBox.addItem(resultSet.getString("category"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void getEntries(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) table.getModel();
            int rowCount = defaultTableModel.getRowCount();
            while(rowCount--!=0){
                defaultTableModel.removeRow(0);
            }
            LocalDate currentDate = LocalDate.now();
            java.time.LocalDate boundaryDate = currentDate.minusDays(30);
            ResultSet resultSet = db.DbConnect.statement.executeQuery(
                "SELECT * FROM spendings WHERE date<='"+
                    currentDate+"' AND date>='"+boundaryDate+"' ORDER BY date");
            int total=0, id=0;
            while(resultSet.next()){
                int amt=resultSet.getInt("amount");
                total+=amt;
                id++;
                Object row[]={resultSet.getInt("sid"), resultSet.getDate("date"), resultSet.getString("category"), amt};
                defaultTableModel.addRow(row);
            }
            totalAmountText.setText(total+"");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void removeSpendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSpendingButtonActionPerformed
        int rowIndex = table.getSelectedRow();
        if(rowIndex!=-1){
            int choice = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to permanently delete this entry?", "Deletion confirmation", 
                    JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                int sid = (Integer) table.getValueAt(rowIndex, 0);
                try{
                    db.DbConnect.statement.executeUpdate(
                            "DELETE FROM spendings WHERE sid='" + sid + "'");
                    JOptionPane.showMessageDialog(null, 
                            "Spending deleted successfully!");
                    getEntries();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }//GEN-LAST:event_removeSpendingButtonActionPerformed

    private void amountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextFieldActionPerformed
        addSpendingButtonActionPerformed(null);
    }//GEN-LAST:event_amountTextFieldActionPerformed

    private void addCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryButtonActionPerformed
        Category categoryWindow = new Category();
    
        categoryWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // Calling displayCategory to refresh the combo box
                displayCategory();
            }
        });

        categoryWindow.setVisible(true);
    }//GEN-LAST:event_addCategoryButtonActionPerformed

    private void addViewCategoryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addViewCategoryMenuItemActionPerformed
        addCategoryButtonActionPerformed(evt);
    }//GEN-LAST:event_addViewCategoryMenuItemActionPerformed

    private void addSpendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSpendingButtonActionPerformed
        try{
            java.util.Date dt=dateField.getDate();
            String amountText = amountTextField.getText();
            String category = (String) categoryComboBox.getSelectedItem();
            
            if(dt!=null && !amountText.equals("") && !category.equals("")){
                int amount = Integer.parseInt(amountText);
                Date date = new Date(dt.getTime());
                db.DbConnect.statement.executeUpdate(
                        "INSERT INTO spendings (category,date,amount) VALUES('"+category+"','"
                                +date+"',"+amount+")");
                JOptionPane.showMessageDialog(null, "Expense added successfully!");
                getEntries();
            }
            else{
                JOptionPane.showMessageDialog(null, "Please fill all details!");
            }
        }
        catch(Exception exception){
            JOptionPane.showMessageDialog(null, exception);
        }
    }//GEN-LAST:event_addSpendingButtonActionPerformed

    private void amountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextFieldKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_amountTextFieldKeyTyped

    private void dateFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateFieldKeyTyped
   
    }//GEN-LAST:event_dateFieldKeyTyped

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void viewSpendingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSpendingMenuItemActionPerformed
        new ViewSpending().setVisible(true);
    }//GEN-LAST:event_viewSpendingMenuItemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinTek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoryButton;
    private javax.swing.JButton addSpendingButton;
    private javax.swing.JMenuItem addViewCategoryMenuItem;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JComboBox<String> categoryComboBox;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton removeSpendingButton;
    private javax.swing.JTable table;
    private javax.swing.JLabel totalAmountText;
    private javax.swing.JMenuItem viewSpendingMenuItem;
    // End of variables declaration//GEN-END:variables
}
