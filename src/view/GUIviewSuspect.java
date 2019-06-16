/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Juan Antonio
 */
public class GUIviewSuspect extends javax.swing.JPanel {

    /**
     * Creates new form viewSuspect
     */
    public GUIviewSuspect() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSuspects = new javax.swing.JTable();
        viewSuspect_jScrollPane = new javax.swing.JScrollPane();
        viewSuspectPanel = new javax.swing.JPanel();
        nameSuspectLabel = new javax.swing.JLabel();
        matriculasLabel = new javax.swing.JLabel();
        phoneNumbersLabel = new javax.swing.JLabel();
        emailsLabel = new javax.swing.JLabel();
        companionsLabel = new javax.swing.JLabel();
        recordsLabel = new javax.swing.JLabel();
        factsLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        phoneNumbersList = new java.awt.List();
        licensePlatesList = new java.awt.List();
        jScrollPane2 = new javax.swing.JScrollPane();
        factsTextArea = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        recordsTextArea = new javax.swing.JTextArea();
        companionsList = new java.awt.List();
        previousPhotoButton = new rsbuttom.RSButtonMetro();
        nextPhotoButton = new rsbuttom.RSButtonMetro();
        emailsList = new java.awt.List();
        currentPhoto = new javax.swing.JLabel();
        addLicensePlatesButton = new rsbuttom.RSButtonMetro();
        deleteLicensePlatesButton = new rsbuttom.RSButtonMetro();
        licensePlatesTextField = new javax.swing.JTextField();
        addPhoneNumberButton = new rsbuttom.RSButtonMetro();
        deletePhoneNumberButton = new rsbuttom.RSButtonMetro();
        phoneNumbersTextField = new javax.swing.JTextField();
        deleteEmailButton = new rsbuttom.RSButtonMetro();
        addEmailButton = new rsbuttom.RSButtonMetro();
        emailsTextField = new javax.swing.JTextField();
        addCompanionButton = new rsbuttom.RSButtonMetro();
        deleteCompanionButton = new rsbuttom.RSButtonMetro();
        companionsAllList = new java.awt.List();
        saveChangesButton = new rsbuttom.RSButtonMetro();
        searchTextField = new java.awt.TextField();
        searchButton = new rsbuttom.RSButtonMetro();
        reloadButton = new rsbuttom.RSButtonMetro();
        deleteButton = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));

        tableSuspects.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableSuspects = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tableSuspects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Primer Apellido", "Segundo Apellido", "DNI"
            }
        ));
        jScrollPane1.setViewportView(tableSuspects);

        viewSuspectPanel.setBackground(new java.awt.Color(255, 255, 204));

        nameSuspectLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameSuspectLabel.setText("Información del Sospechoso");

        matriculasLabel.setText("MATRÍCULAS");

        phoneNumbersLabel.setText("TELÉFONOS");

        emailsLabel.setText("EMAILS");

        companionsLabel.setText("ACOMPAÑANTES");

        recordsLabel.setText("ANTECEDENTES");

        factsLabel.setText("HECHOS");

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        factsTextArea.setColumns(20);
        factsTextArea.setRows(5);
        jScrollPane2.setViewportView(factsTextArea);

        recordsTextArea.setColumns(20);
        recordsTextArea.setRows(5);
        jScrollPane8.setViewportView(recordsTextArea);

        previousPhotoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/previous.png"))); // NOI18N

        nextPhotoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/next.png"))); // NOI18N

        currentPhoto.setText("-1");

        addLicensePlatesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N

        deleteLicensePlatesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/delete.png"))); // NOI18N

        addPhoneNumberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N

        deletePhoneNumberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/delete.png"))); // NOI18N

        deleteEmailButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/delete.png"))); // NOI18N

        addEmailButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N

        addCompanionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add.png"))); // NOI18N

        deleteCompanionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/delete.png"))); // NOI18N

        saveChangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/save.png"))); // NOI18N
        saveChangesButton.setText("GUARDAR CAMBIOS");

        javax.swing.GroupLayout viewSuspectPanelLayout = new javax.swing.GroupLayout(viewSuspectPanel);
        viewSuspectPanel.setLayout(viewSuspectPanelLayout);
        viewSuspectPanelLayout.setHorizontalGroup(
            viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(nameSuspectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                    .addComponent(previousPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(currentPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nextPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                    .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                            .addComponent(emailsList, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                                    .addComponent(addEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(deleteEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(emailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(24, 24, 24)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                            .addComponent(factsLabel)
                                            .addGap(112, 112, 112)))
                                    .addGap(18, 18, 18)
                                    .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSuspectPanelLayout.createSequentialGroup()
                                            .addComponent(recordsLabel)
                                            .addGap(114, 114, 114))))
                                .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailsLabel)
                                        .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                            .addComponent(matriculasLabel)
                                            .addGap(293, 293, 293)
                                            .addComponent(phoneNumbersLabel))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSuspectPanelLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(licensePlatesList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                    .addComponent(addLicensePlatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteLicensePlatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(licensePlatesTextField))
                            .addGap(86, 86, 86)
                            .addComponent(phoneNumbersList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                    .addComponent(addPhoneNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deletePhoneNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(phoneNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(320, 320, 320)))
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(companionsList, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companionsLabel)
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addComponent(addCompanionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteCompanionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(companionsAllList, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        viewSuspectPanelLayout.setVerticalGroup(
            viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentPhoto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previousPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameSuspectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addComponent(phoneNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addPhoneNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deletePhoneNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addComponent(phoneNumbersLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(licensePlatesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addLicensePlatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deleteLicensePlatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(phoneNumbersList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addComponent(matriculasLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(licensePlatesList, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(emailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailsList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addComponent(recordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(companionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewSuspectPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(viewSuspectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addCompanionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCompanionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(companionsList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companionsAllList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        viewSuspect_jScrollPane.setViewportView(viewSuspectPanel);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/search.png"))); // NOI18N

        reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/reload.png"))); // NOI18N
        reloadButton.setText("RECARGAR");
        reloadButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/trash.png"))); // NOI18N
        deleteButton.setText("ELIMINAR");
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewSuspect_jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reloadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(viewSuspect_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro addCompanionButton;
    public rsbuttom.RSButtonMetro addEmailButton;
    public rsbuttom.RSButtonMetro addLicensePlatesButton;
    public rsbuttom.RSButtonMetro addPhoneNumberButton;
    public java.awt.List companionsAllList;
    public javax.swing.JLabel companionsLabel;
    public java.awt.List companionsList;
    public javax.swing.JLabel currentPhoto;
    public rsbuttom.RSButtonMetro deleteButton;
    public rsbuttom.RSButtonMetro deleteCompanionButton;
    public rsbuttom.RSButtonMetro deleteEmailButton;
    public rsbuttom.RSButtonMetro deleteLicensePlatesButton;
    public rsbuttom.RSButtonMetro deletePhoneNumberButton;
    private javax.swing.JLabel emailsLabel;
    public java.awt.List emailsList;
    private javax.swing.JTextField emailsTextField;
    private javax.swing.JLabel factsLabel;
    public javax.swing.JTextArea factsTextArea;
    public javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    public java.awt.List licensePlatesList;
    public javax.swing.JTextField licensePlatesTextField;
    private javax.swing.JLabel matriculasLabel;
    public javax.swing.JLabel nameSuspectLabel;
    public rsbuttom.RSButtonMetro nextPhotoButton;
    private javax.swing.JLabel phoneNumbersLabel;
    public java.awt.List phoneNumbersList;
    public javax.swing.JTextField phoneNumbersTextField;
    public rsbuttom.RSButtonMetro previousPhotoButton;
    private javax.swing.JLabel recordsLabel;
    public javax.swing.JTextArea recordsTextArea;
    public rsbuttom.RSButtonMetro reloadButton;
    public rsbuttom.RSButtonMetro saveChangesButton;
    public rsbuttom.RSButtonMetro searchButton;
    public java.awt.TextField searchTextField;
    public javax.swing.JTable tableSuspects;
    private javax.swing.JPanel viewSuspectPanel;
    private javax.swing.JScrollPane viewSuspect_jScrollPane;
    // End of variables declaration//GEN-END:variables
}
