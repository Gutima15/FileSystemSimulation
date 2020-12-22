package filesystemsimulation;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

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
    
    
    
    public List<FileSystemFile> getFiles(FileSystemDirectory actualRoot){
        List<FileSystemFile> result = new ArrayList<FileSystemFile>();
        for(FileSystemNode file: actualRoot.getNodes()){
            if(!file.isDirectory()){
                result.add((FileSystemFile) file);
            }
        }
        return result;
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
        PropertiesButton = new javax.swing.JButton();

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
        LookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookButtonActionPerformed(evt);
            }
        });

        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        DownloadButton.setText("Download");
        DownloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadButtonActionPerformed(evt);
            }
        });

        CopyButton.setText("Copy");
        CopyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyButtonActionPerformed(evt);
            }
        });

        BothLabel.setText("Both");

        LeftSaparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        MoveBothButton.setText("Move");
        MoveBothButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveBothButtonActionPerformed(evt);
            }
        });

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        PropertiesButton.setText("Properties");
        PropertiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertiesButtonActionPerformed(evt);
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
                                        .addComponent(PropertiesButton)
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
                                                .addComponent(NewDirectoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(CopyButton)
                                    .addComponent(PropertiesButton)))
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
        FindWindow findWindow = new FindWindow(tree, this);        
        findWindow.setVisible(true);
    }//GEN-LAST:event_FindButtonActionPerformed

    private void ListDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListDirectoryButtonActionPerformed
        Window_Directory_List listWindow = new Window_Directory_List(tree, this);        
        listWindow.setVisible(true);
    }//GEN-LAST:event_ListDirectoryButtonActionPerformed
//MOVE BUTTON LOGIC
    private void MoveRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveRouteButtonActionPerformed
  
          String newRoute = RouteTextField.getText();      
          String[] route = newRoute.split("/");
          List<String> routeList =new ArrayList<String>();
          for(int i = 0; i< route.length; i++){
              routeList.add(route[i]);
          }
          tree = ut.move(routeList, tree, this);
          RouteTextField.setText(tree.getPath());
          fillTree(tree);
          
    }//GEN-LAST:event_MoveRouteButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void EditFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditFileButtonActionPerformed
        List<FileSystemFile> files = getFiles(tree);
        if(files.size() == 0){
            JOptionPane.showMessageDialog(this, "This folder does not contain any file", "Empty folder", INFORMATION_MESSAGE );
        } else {
            Window_File_Editor editWindow = new Window_File_Editor(tree, this, files);
            this.dispose();
            editWindow.setVisible(true);
        }
    }//GEN-LAST:event_EditFileButtonActionPerformed

    private void PropertiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesButtonActionPerformed
        List<FileSystemFile> files = getFiles(tree);
        if(files.size() == 0){
            JOptionPane.showMessageDialog(this, "This folder does not contain any file", "Empty folder", INFORMATION_MESSAGE );
        } else {
            Window_File_Properties editWindow = new Window_File_Properties(tree, this, files);
            this.dispose();
            editWindow.setVisible(true);
        }
    }//GEN-LAST:event_PropertiesButtonActionPerformed

    private void LookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookButtonActionPerformed
        List<FileSystemFile> files = getFiles(tree);
        if(files.size() == 0){
            JOptionPane.showMessageDialog(this, "This folder does not contain any file", "Empty folder", INFORMATION_MESSAGE );
        } else {
            Window_File_View viewWindow = new Window_File_View(tree, this, files);
            this.dispose();
            viewWindow.setVisible(true);
        }
    }//GEN-LAST:event_LookButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            String memory = ut.loadDisc();
            //Load the len line
            int lineLenght = ut.lineLenght();            
            File selectedFile = fc.getSelectedFile();
            String content = ut.getFileContent(selectedFile);
            content = content.replace("\n", " ");
            double lineasNecesarias = Math.ceil((float)content.length()/(float)(lineLenght-1)); //cantidad de líneas vacías que necesita el archivo                    
            //Get a possible index value of the first space where we can write
            //String var= "_____\nramas\ncasa_\n_____\n_____\n";
            List<Integer> emptyIndices = ut.getValidEmptyIndexed(memory,(int)lineasNecesarias, lineLenght);
            //        
            if(emptyIndices == null){
                JOptionPane.showMessageDialog(this, "There is no free space on disc", "Error",  ERROR_MESSAGE);
            }else{
                //Modify the string memory
                memory= ut.addFileToMemory(memory,content,emptyIndices,lineLenght);
                //Writting the new memory
                ut.WriteDisc(memory);
                //Now we add the file in the logic file system
                String fileName = selectedFile.getName();
                FileSystemFile f = new FileSystemFile(fileName);
                f.setSize(content.length()); //
                f.setListOfIndices(emptyIndices); //Necesary to remove...
                tree.add(f);          
                this.fillTree(tree);                
                JOptionPane.showMessageDialog(this, "The file was added correctly", "File added", INFORMATION_MESSAGE );   
            }
        }
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void DownloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadButtonActionPerformed
        List<FileSystemFile> files = getFiles(tree);
        if(files.size() == 0){
            JOptionPane.showMessageDialog(this, "This folder does not contain any file", "Empty folder", INFORMATION_MESSAGE );
        } else {
            Window_download downloadWindow = new Window_download(tree, this, files);
            this.dispose();
            downloadWindow.setVisible(true);
        }
    }//GEN-LAST:event_DownloadButtonActionPerformed

    private void CopyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyButtonActionPerformed
        List<FileSystemFile> files = getFiles(tree);
        if(files.size() == 0){
            JOptionPane.showMessageDialog(this, "This folder does not contain any file", "Empty folder", INFORMATION_MESSAGE );
        } else {
            Window_copy copyWindow = new Window_copy(tree,this,files);
            this.dispose();
            copyWindow.setVisible(true);
        }
        
    }//GEN-LAST:event_CopyButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        List<FileSystemNode> dirFiles = new ArrayList<FileSystemNode>(tree.getNodes());
        if(dirFiles.size() == 0){
            JOptionPane.showMessageDialog(this, "This folder does not contain any file or directory", "Empty folder", INFORMATION_MESSAGE );
        } else {
            Window_remove removeWindow = new Window_remove(tree,this, dirFiles );
            this.dispose();
            removeWindow.setVisible(true);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void MoveBothButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveBothButtonActionPerformed
        JOptionPane.showMessageDialog(this, "This button is not working.", "On developemt", INFORMATION_MESSAGE );
//        List<FileSystemNode> dirFiles = new ArrayList<FileSystemNode>(tree.getNodes());
//        if(dirFiles.size() == 0){
//            JOptionPane.showMessageDialog(this, "This folder does not contain any file or directory", "Empty folder", INFORMATION_MESSAGE );
//        } else {
//            MoveWindow windowMove = new MoveWindow(tree,this, dirFiles);
//            windowMove.setVisible(true);
//        }
    }//GEN-LAST:event_MoveBothButtonActionPerformed
                 
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
    private javax.swing.JButton PropertiesButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JLabel RouteLabel;
    public javax.swing.JTextField RouteTextField;
    private javax.swing.JLabel TreeLabel;
    private javax.swing.JScrollPane TreeScrollPane;
    private javax.swing.JTextArea TreeTextArea;
    private javax.swing.JSeparator UpSeparator;
    // End of variables declaration//GEN-END:variables
}
