package filesystemsimulation;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jorge & Badilla
 */
public class MainWindow extends javax.swing.JFrame {
    Utilities ut = new Utilities();
    private FileSystemDirectory tree;
    private FileSystemDirectory treeTemp;
    public MainWindow() {
        initComponents();
        tree = new FileSystemDirectory("root");
        TreeTextArea.setText("->" + tree.getPath());
        RouteTextField.setText(tree.getPath());
    }
    
    public void fillTree(FileSystemDirectory treeToPrint){        
        int indent = 0;
        FileSystemDirectory tempTree = treeToPrint;
        tempTree = ut.moveUp(tempTree);
        StringBuilder sb = new StringBuilder();       
        tempTree.printDirectoryTree(tempTree, indent, sb);
        String finalResult = sb.toString().replace( treeToPrint.getName()+"/" , treeToPrint.getName()+ " <-- You are here" );
        TreeTextArea.setText(finalResult);
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RouteLabel = new javax.swing.JLabel();
        RouteTextField = new javax.swing.JTextField();
        MoveRouteButton = new javax.swing.JButton();
        FirstSeparator = new javax.swing.JSeparator();
        TreeScrollPane = new javax.swing.JScrollPane();
        TreeTextArea = new javax.swing.JTextArea();
        TreeLabel = new javax.swing.JLabel();
        DirectoryLabel = new javax.swing.JLabel();
        NewDirectoryButton = new javax.swing.JButton();
        ListDirectoryButton = new javax.swing.JButton();
        FileLabel = new javax.swing.JLabel();
        NewFileButton = new javax.swing.JButton();
        EditFileButton = new javax.swing.JButton();
        LookButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        DownloadButton = new javax.swing.JButton();
        CopyButton = new javax.swing.JButton();
        BothLabel = new javax.swing.JLabel();
        LeftSaparator = new javax.swing.JSeparator();
        MoveBothButton = new javax.swing.JButton();
        FindButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        UpSeparator = new javax.swing.JSeparator();
        LastSeparator = new javax.swing.JSeparator();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File system");
        setName("MainWindow"); // NOI18N
        setResizable(false);

        RouteLabel.setText("Route");

        RouteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteTextFieldActionPerformed(evt);
            }
        });

        MoveRouteButton.setText("Move");
        MoveRouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveRouteButtonActionPerformed(evt);
            }
        });

        TreeTextArea.setEditable(false);
        TreeTextArea.setColumns(20);
        TreeTextArea.setRows(5);
        TreeScrollPane.setViewportView(TreeTextArea);

        TreeLabel.setText("Tree");

        DirectoryLabel.setText("Directory operations");

        NewDirectoryButton.setText("New directory");
        NewDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDirectoryButtonActionPerformed(evt);
            }
        });

        ListDirectoryButton.setText("List directories");
        ListDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListDirectoryButtonActionPerformed(evt);
            }
        });

        FileLabel.setText("File operations");

        NewFileButton.setText("New file");
        NewFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFileButtonActionPerformed(evt);
            }
        });

        EditFileButton.setText("Edit file");
        EditFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditFileButtonActionPerformed(evt);
            }
        });

        LookButton.setText("Look");

        LoadButton.setText("Load");

        DownloadButton.setText("Download");

        CopyButton.setText("Copy");

        BothLabel.setText("Both");

        LeftSaparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        MoveBothButton.setText("Move");

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CloseButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TreeLabel))
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FileLabel)
                                        .addComponent(TreeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                                        .addComponent(RouteTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NewFileButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EditFileButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LookButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LoadButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DownloadButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CopyButton))
                                    .addComponent(RouteLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpSeparator)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(DirectoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(NewDirectoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                .addComponent(MoveRouteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(BothLabel))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LeftSaparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(MoveBothButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FindButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ListDirectoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RouteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RouteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoveRouteButton))
                .addGap(10, 10, 10)
                .addComponent(FirstSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TreeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TreeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DirectoryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewDirectoryButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BothLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FileLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NewFileButton)
                                    .addComponent(EditFileButton)
                                    .addComponent(LookButton)
                                    .addComponent(LoadButton)
                                    .addComponent(DownloadButton)
                                    .addComponent(CopyButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MoveBothButton)
                                    .addComponent(FindButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListDirectoryButton)
                        .addGap(13, 13, 13)
                        .addComponent(LastSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LeftSaparator, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CloseButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RouteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteTextFieldActionPerformed

    private void NewFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileButtonActionPerformed
        Window_File_Creation fileWindow = new Window_File_Creation(tree, this);
        this.dispose();
        fileWindow.setVisible(true);
    }//GEN-LAST:event_NewFileButtonActionPerformed
//NEW DIRECTORY LOGIC
    private void NewDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDirectoryButtonActionPerformed
        Window_Directory_Creation directoryWindow = new Window_Directory_Creation(tree, this);
        this.dispose();
        directoryWindow.setVisible(true);
    }//GEN-LAST:event_NewDirectoryButtonActionPerformed

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindButtonActionPerformed

    private void ListDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListDirectoryButtonActionPerformed
        Window_Directory_List listWindow = new Window_Directory_List(tree, this);        
        listWindow.setVisible(true);
    }//GEN-LAST:event_ListDirectoryButtonActionPerformed
//MOVE BUTTON LOGIC
    private void MoveRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveRouteButtonActionPerformed
        String newRoute = RouteTextField.getText();      
        String[] route = newRoute.split("/");
        if(route[0].equals("root") && route.length==1 && tree.getName().equals("root")){
            JOptionPane.showMessageDialog(null, "You're already in " + tree.getPath());
        }else{
            List<String> list;  
            list = new ArrayList<String>();
            for(int i = 0; i< route.length; i++){
                list.add(route[i]);
            }
            FileSystemDirectory tempTree = tree;
            tree = ut.moveUp(tree); //Voy a root
            if(route[0].equals("root") && route.length==1){
                JOptionPane.showMessageDialog(null, "Success in moving to " + tree.getPath());
            }else{      
                String lastPathDir = list.get(list.size()-1);
                list.remove(0);
                tree = moveDown(list,tree);
                if(tree == null){
                    tree = tempTree;
                    JOptionPane.showMessageDialog(null, "Route not found");
                }else{
                    if(list.isEmpty())                    {
                        JOptionPane.showMessageDialog(null, "Success in moving to " + tree.getPath());                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Path not found. Moving to the last valid path: " + tree.getPath());                        
                    }
                }                
            }
            RouteTextField.setText(tree.getPath());
            fillTree(tree);
        }             
    }//GEN-LAST:event_MoveRouteButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void EditFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditFileButtonActionPerformed
        String ruta = RouteTextField.getText();
        Window_File_Editor editWindow = new Window_File_Editor(tree, this, ruta);
    }//GEN-LAST:event_EditFileButtonActionPerformed
   
    
      
    public FileSystemDirectory moveDown (List<String> list, FileSystemDirectory actual){  
         // [root, badilla]
        if (list.isEmpty()){
            return actual;
        }else{
            for(FileSystemNode n:actual.getNodes()){
                System.out.println(n.getName()+" "+list.get(0)+" "+n.getName().equals(list.get(0)));
                if(n.getName().equals(list.get(0))){
                    actual = (FileSystemDirectory) n;
                    list.remove(0);
                    moveDown(list, actual);
                    break;
                }else{
                    actual = null;
                }                     
            }
        }
        return actual;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BothLabel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton CopyButton;
    private javax.swing.JLabel DirectoryLabel;
    private javax.swing.JButton DownloadButton;
    private javax.swing.JButton EditFileButton;
    private javax.swing.JLabel FileLabel;
    private javax.swing.JButton FindButton;
    private javax.swing.JSeparator FirstSeparator;
    private javax.swing.JSeparator LastSeparator;
    private javax.swing.JSeparator LeftSaparator;
    private javax.swing.JButton ListDirectoryButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton LookButton;
    private javax.swing.JButton MoveBothButton;
    private javax.swing.JButton MoveRouteButton;
    private javax.swing.JButton NewDirectoryButton;
    private javax.swing.JButton NewFileButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JLabel RouteLabel;
    public javax.swing.JTextField RouteTextField;
    private javax.swing.JLabel TreeLabel;
    private javax.swing.JScrollPane TreeScrollPane;
    private javax.swing.JTextArea TreeTextArea;
    private javax.swing.JSeparator UpSeparator;
    // End of variables declaration//GEN-END:variables
}
