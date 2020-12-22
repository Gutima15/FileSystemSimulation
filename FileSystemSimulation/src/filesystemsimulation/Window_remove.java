/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystemsimulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * @author Jorge & Badilla
 */
public class Window_remove extends javax.swing.JFrame {
    FileSystemDirectory root;
    MainWindow parent;    
    List<FileSystemNode> dirFiles;
    Utilities ut = new Utilities();
    /**
     * Creates new form Window_File_View
     */
    public Window_remove(FileSystemDirectory rootName, MainWindow parent, List<FileSystemNode> dirFiles) {
        initComponents();
        root = rootName;        
        this.parent = parent;
        this.dirFiles = dirFiles;        
        setFileNames(dirFiles);
    }

    public void setFileNames(List<FileSystemNode> dirFiles){
        String result = "";       
        for(FileSystemNode f: dirFiles){
            if(f.isDirectory()){
                result += f.getName() + "/\n"; 
            }else{
                result += f.getName() + "\n"; 
            }
            cbx_file_name.addItem(result);
            result = "";
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_file_name = new javax.swing.JLabel();
        cbx_file_name = new javax.swing.JComboBox<>();
        removeButton = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove file");
        setResizable(false);

        lbl_file_name.setText("File: ");

        cbx_file_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_file_nameActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        btn_regresar.setText("Back");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_file_name, 0, 225, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_file_name)
                    .addComponent(cbx_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(btn_regresar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        //agarrar el nombre del jcombobox
        int fileNameIndex = cbx_file_name.getSelectedIndex();
        //buscar el archivo en files
        FileSystemNode dirFile = dirFiles.get(fileNameIndex);                        
        Iterator<FileSystemNode> it= null;
        if(dirFile.isDirectory()){
            root = deleteDir(dirFile,root,it);
            root.getNodes().remove(dirFile);
        }else{            
            ut.removeDiscFile((FileSystemFile) dirFile);
            root.getNodes().remove(dirFile);
        }                
        JOptionPane.showMessageDialog(this, "The file or directory was removed correctly", "Remove", INFORMATION_MESSAGE );
        parent.fillTree(root);
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_removeButtonActionPerformed
    
    public FileSystemDirectory deleteDir(FileSystemNode dirFile, FileSystemDirectory root, Iterator<FileSystemNode> iterator){
        
        if(!dirFile.isDirectory()){ //FILES
            //removeLocalFile                
            ut.removeDiscFile((FileSystemFile) dirFile);
            iterator.remove(); 
            return root;
        }else{
            FileSystemDirectory tempDir = (FileSystemDirectory) dirFile;
            String [] route = dirFile.getPath().split("/");
            List<String> nodeList = new ArrayList<>();
            nodeList.addAll(Arrays.asList(route));
            //root = ut.moveDelete(nodeList, root);
            iterator = tempDir.getNodes().iterator();               
            while(iterator.hasNext()){                    
                FileSystemNode node = iterator.next();
                if(!node.isDirectory()){
                    root = deleteDir(node, root, iterator);
                }else{
                    root= deleteDir(node, root, iterator);
                    iterator.remove();
                }
            }
        }
        return root;
    }
    
    private void cbx_file_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_file_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_file_nameActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cbx_file_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_file_name;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
