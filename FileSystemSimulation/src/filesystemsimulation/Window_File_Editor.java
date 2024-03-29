/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystemsimulation;
//root/home/progra.py

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * @author Jorge & Badilla 
 */
public class Window_File_Editor extends javax.swing.JFrame {
    FileSystemDirectory root;
    MainWindow parent;    
    List<FileSystemFile> files;
    Utilities ut = new Utilities();
    /**
     * Creates new form Window_File_View
     */
    public Window_File_Editor(FileSystemDirectory rootName, MainWindow parent, List<FileSystemFile> file) {
        initComponents();
        root = rootName;        
        this.parent = parent;
        files = file;
        setFileNames(files);
    } 
    
    public void setFileNames(List<FileSystemFile> files){
        for(FileSystemFile f: files){
            jComboBoxFile.addItem(f.getName());
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

        jPanel1 = new javax.swing.JPanel();
        lbl_file_name = new javax.swing.JLabel();
        lbl_content = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEditor = new javax.swing.JTextArea();
        btn_load_file = new javax.swing.JButton();
        btn_save_file = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jComboBoxFile = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit file");
        setResizable(false);

        lbl_file_name.setText("File: ");

        lbl_content.setText("File editor:");

        jTextAreaEditor.setColumns(20);
        jTextAreaEditor.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEditor);

        btn_load_file.setText("Load file");
        btn_load_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_fileActionPerformed(evt);
            }
        });

        btn_save_file.setText("Save file");
        btn_save_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_fileActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jComboBoxFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(btn_load_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_content)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save_file, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFile, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_file_name)
                    .addComponent(jComboBoxFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_load_file)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_content)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save_file)
                    .addComponent(CancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void btn_load_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_fileActionPerformed
        //clean textArea
        jTextAreaEditor.setText("");
        //agarrar el nombre del jcombobox
        int fileNameIndex = jComboBoxFile.getSelectedIndex();        
        //buscar el archivo en files
        FileSystemFile file = files.get(fileNameIndex);
        //cargar en textArea
        String memory = ut.loadDisc();
        int lineLenght = ut.lineLenght();
        String result = ut.memoryToString(memory, file.listOfInicialIndices, lineLenght);
        result = result.replace("_","");
        jTextAreaEditor.setText(result);
        jComboBoxFile.setEnabled(false);
    }//GEN-LAST:event_btn_load_fileActionPerformed

    private void jComboBoxFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFileActionPerformed
        
    }//GEN-LAST:event_jComboBoxFileActionPerformed

    private void btn_save_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_fileActionPerformed
        String newContent = jTextAreaEditor.getText();
        if(!newContent.equals("")){
            //Memory Load
            String memory = ut.loadDisc();
            //Load the len line
            int lineLenght = ut.lineLenght();
            //Calculate the necesary lines to store the file      
            double nuevasLineasNecesarias = Math.ceil((float)newContent.length()/(float)lineLenght); //cantidad de líneas vacías que necesita el archivo
            int fileNameIndex = jComboBoxFile.getSelectedIndex();        
            //buscar el archivo en files
            FileSystemFile file = files.get(fileNameIndex);
            double oldLineasNecesarias = (double) file.listOfInicialIndices.size();
            double dif = oldLineasNecesarias - nuevasLineasNecesarias;
            List<Integer> oldIndexList = new ArrayList(file.listOfInicialIndices.size());
            for(Integer i: file.listOfInicialIndices){
                oldIndexList.add(i);
            }
            if(dif < 0){
                List<Integer> newEmptyIndices = ut.getValidEmptyIndexed(memory, (int)Math.abs(dif), lineLenght); //To Add
                if(newEmptyIndices == null){
                    JOptionPane.showMessageDialog(this, "There is no space on disc", "Full Disc", JOptionPane.ERROR_MESSAGE);
                } else {
                    //add new indexes
                    for(Integer i: newEmptyIndices){
                        file.listOfInicialIndices.add(i);
                    }
                }
            } else {
                if(dif > 0){
                    //remove extra indices
                    for(int i = (int)oldLineasNecesarias; i > ((int)oldLineasNecesarias - dif) ; i--){
                        file.listOfInicialIndices.remove(i-1);
                    }
                }
            }
            // "\n_____\nhola \n____\nesta_\nhoy__\n"
            memory = ut.deleteFileInMemory(memory, oldIndexList, lineLenght);
            //Modify the string memory
            memory= ut.addFileToMemory(memory,newContent,file.listOfInicialIndices,lineLenght);
            //Writting the new memory
            ut.WriteDisc(memory);
            //Now we add the file in the logic file system
            file.setSize(newContent.length()); //
            //file.setListOfIndices(emptyIndices); //Necesary to remove...
            this.dispose();            
            parent.fillTree(root);                
            JOptionPane.showMessageDialog(this, "The file was edited correctly", "File edited", INFORMATION_MESSAGE );        
            parent.setVisible(true);
            // "\n_____\nhola \ncomo \nesta_\n_____\n" -> crece, decrece, igual tamaño
            // [6,12,18,24, , ] delete, va a esas lineas y borra 
            // "\n_____\nhola \ncomo \nesta_\nhoy__\n"
        } else {
            JOptionPane.showMessageDialog(this, "The new content of the file is empty", "File Content Empty", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_save_fileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton btn_load_file;
    private javax.swing.JButton btn_save_file;
    private javax.swing.JComboBox<String> jComboBoxFile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaEditor;
    private javax.swing.JLabel lbl_content;
    private javax.swing.JLabel lbl_file_name;
    // End of variables declaration//GEN-END:variables
}
