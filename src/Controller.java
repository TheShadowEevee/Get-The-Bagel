/**
 *  Copyright (c) 2023 Michael Malloy, Enter-Name
 *  CNIT 25501 Final Project - GET THE bagel
 */

public class Controller extends javax.swing.JFrame {

    static Player Ted = null;
    
    /**
     * Creates new form Controller
     */
    public Controller() {
        initComponents();
        setupGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftTextPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adventurePane = new javax.swing.JTextPane();
        rightButtonPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statisticsPane = new javax.swing.JTextPane();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        NorthMovementButton = new javax.swing.JButton();
        SouthMovementButton = new javax.swing.JButton();
        WestMovementButton = new javax.swing.JButton();
        EastMovementButton = new javax.swing.JButton();
        PodiumButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFileDropdown = new javax.swing.JMenu();
        quitMenuButton = new javax.swing.JMenuItem();
        menuEditDropdown = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Bagel] - Development Build");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        leftTextPanel.setMinimumSize(new java.awt.Dimension(200, 277));
        leftTextPanel.setPreferredSize(new java.awt.Dimension(200, 277));

        adventurePane.setEditable(false);
        adventurePane.setAutoscrolls(false);
        adventurePane.setFocusable(false);
        adventurePane.setMinimumSize(new java.awt.Dimension(1000, 1000));
        adventurePane.setName(""); // NOI18N
        adventurePane.setPreferredSize(new java.awt.Dimension(125, 150));
        adventurePane.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(adventurePane);

        javax.swing.GroupLayout leftTextPanelLayout = new javax.swing.GroupLayout(leftTextPanel);
        leftTextPanel.setLayout(leftTextPanelLayout);
        leftTextPanelLayout.setHorizontalGroup(
            leftTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftTextPanelLayout.setVerticalGroup(
            leftTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftTextPanel);

        rightButtonPanel.setMinimumSize(new java.awt.Dimension(300, 277));
        rightButtonPanel.setOpaque(false);

        statisticsPane.setEditable(false);
        statisticsPane.setAutoscrolls(false);
        statisticsPane.setFocusable(false);
        statisticsPane.setMinimumSize(new java.awt.Dimension(125, 150));
        statisticsPane.setName(""); // NOI18N
        statisticsPane.setPreferredSize(new java.awt.Dimension(125, 150));
        statisticsPane.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(statisticsPane);

        jTextField3.setEditable(false);
        jTextField3.setText("DEVELOPMENT BUILD - Gameplay not final");

        NorthMovementButton.setText("North");
        NorthMovementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorthMovementButtonActionPerformed(evt);
            }
        });

        SouthMovementButton.setText("South");
        SouthMovementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SouthMovementButtonActionPerformed(evt);
            }
        });

        WestMovementButton.setText("West");
        WestMovementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WestMovementButtonActionPerformed(evt);
            }
        });

        EastMovementButton.setText("East");
        EastMovementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EastMovementButtonActionPerformed(evt);
            }
        });

        PodiumButton.setText("Podium");
        PodiumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PodiumButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NorthMovementButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(WestMovementButton)
                        .addGap(73, 73, 73)
                        .addComponent(EastMovementButton))
                    .addComponent(SouthMovementButton)
                    .addComponent(PodiumButton))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(EastMovementButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NorthMovementButton)
                        .addGap(59, 59, 59)
                        .addComponent(SouthMovementButton))
                    .addComponent(WestMovementButton)
                    .addComponent(PodiumButton))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout rightButtonPanelLayout = new javax.swing.GroupLayout(rightButtonPanel);
        rightButtonPanel.setLayout(rightButtonPanelLayout);
        rightButtonPanelLayout.setHorizontalGroup(
            rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        rightButtonPanelLayout.setVerticalGroup(
            rightButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(rightButtonPanel);

        menuFileDropdown.setText("File");

        quitMenuButton.setText("Quit");
        quitMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuButtonActionPerformed(evt);
            }
        });
        menuFileDropdown.add(quitMenuButton);

        menuBar.add(menuFileDropdown);

        menuEditDropdown.setText("Edit");
        menuBar.add(menuEditDropdown);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Menu Option Handling
    private void quitMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuButtonActionPerformed

    private void NorthMovementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorthMovementButtonActionPerformed
        this.movePlayer(0);
    }//GEN-LAST:event_NorthMovementButtonActionPerformed

    private void EastMovementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EastMovementButtonActionPerformed
        this.movePlayer(1);
    }//GEN-LAST:event_EastMovementButtonActionPerformed

    private void SouthMovementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SouthMovementButtonActionPerformed
        this.movePlayer(2);
    }//GEN-LAST:event_SouthMovementButtonActionPerformed

    private void WestMovementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WestMovementButtonActionPerformed
        this.movePlayer(3);
    }//GEN-LAST:event_WestMovementButtonActionPerformed

    private void PodiumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PodiumButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PodiumButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EastMovementButton;
    private javax.swing.JButton NorthMovementButton;
    private javax.swing.JButton PodiumButton;
    private javax.swing.JButton SouthMovementButton;
    private javax.swing.JButton WestMovementButton;
    private javax.swing.JTextPane adventurePane;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel leftTextPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEditDropdown;
    private javax.swing.JMenu menuFileDropdown;
    private javax.swing.JMenuItem quitMenuButton;
    private javax.swing.JPanel rightButtonPanel;
    private javax.swing.JTextPane statisticsPane;
    // End of variables declaration//GEN-END:variables
    
    String adventureContextHead = null;
    
    // Setup the game and window
    private void setupGame() {
        // Setup new Player
        this.Ted = new Player("Ted Bagelson");
        //PuzzleScreen puzzle = new PuzzleScreen();
        
        adventureContextHead = 
                "You have woken up in a strange house. Looking around, your surroundings seem familiar yet foreign.\n" +
                "Standing up, your stomach growls. It's time for breakfast. There must be a bagel somewhere in this house you can eat.";
        
        updateStatistics();
        updateAdventure();
        //puzzle.puzzleScreen();
    }
    
    // Update text boxes
    private void updateStatistics() {
        statisticsPane.setText(
                "Name: " + Ted.name +
                "\nHP: " + Ted.HP +
                "\nFloor " + Ted.location[0] + ", Room " + Ted.location[1]
        );
    }
    
    // TODO: Implement actual gameplay
    private void updateAdventure() {
        
        // Player player = new Player(); - Replace this with world class
        
        adventurePane.setText(
                this.adventureContextHead + "\n\n" +
                CurrentRoom.currentDescription + "\n\n" +
                "What would you like to do?"
        );
    }
    
    // Update player name
    private void updatePlayerName() {
        //String newName = playerNameTextField.getText();
        //Ted.changeName(newName);
        
        //updateStatistics();
    }
    
    // Manage player health
    private void healPlayer(int heal) {
        Ted.increaseHP(heal);
        
        updateStatistics();
    }
    
    private void damagePlayer(int damage) {
        Ted.decreaseHP(damage);
        
        updateStatistics();
    }
    
    // Update player location
    private void movePlayer(int direction) {

        if (CurrentRoom.doorNullTest(direction)) {
            CurrentRoom.updateRoom(CurrentRoom.currentDoors[direction]);
        } else {
            // TODO: Make something happen visually on fail, this means the player is trying to move OOB
            //System.out.println(success);
        }
        
        updateStatistics();
        updateAdventure();
    }
}
