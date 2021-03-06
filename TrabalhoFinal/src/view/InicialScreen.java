/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Marco
 */
public class InicialScreen extends javax.swing.JFrame {

    /**
     * Creates new form InicialScreen
     */
    public InicialScreen() {
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

        InicialScreen = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Student = new javax.swing.JMenu();
        registerStudent = new javax.swing.JMenuItem();
        deleteStudent = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        registerInstrument = new javax.swing.JMenuItem();
        deleteInstrument = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        registerCourse = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        registerTheater = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout InicialScreenLayout = new javax.swing.GroupLayout(InicialScreen);
        InicialScreen.setLayout(InicialScreenLayout);
        InicialScreenLayout.setHorizontalGroup(
            InicialScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        InicialScreenLayout.setVerticalGroup(
            InicialScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        Student.setText("Alunos");
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });

        registerStudent.setText("Cadastrar");
        registerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStudentActionPerformed(evt);
            }
        });
        Student.add(registerStudent);

        deleteStudent.setText("Cancelar matr??cula");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });
        Student.add(deleteStudent);

        jMenuBar1.add(Student);

        jMenu3.setText("Instrumentos");

        registerInstrument.setText("Registrar");
        registerInstrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerInstrumentActionPerformed(evt);
            }
        });
        jMenu3.add(registerInstrument);

        deleteInstrument.setText("Deletar");
        deleteInstrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInstrumentActionPerformed(evt);
            }
        });
        jMenu3.add(deleteInstrument);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Provas");
        jMenuBar1.add(jMenu8);

        jMenu5.setText("Cursos");

        registerCourse.setText("Cadastrar");
        registerCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCourseActionPerformed(evt);
            }
        });
        jMenu5.add(registerCourse);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Turmas");
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Funcion??rios");
        jMenuBar1.add(jMenu2);

        jMenu6.setText("Teatros");

        registerTheater.setText("Cadastrar");
        registerTheater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerTheaterActionPerformed(evt);
            }
        });
        jMenu6.add(registerTheater);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Sobre");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InicialScreen)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InicialScreen, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentActionPerformed
        RegisterStudent rg_st = new RegisterStudent();
        InicialScreen.add(rg_st);
        rg_st.setVisible(true);
        
    }//GEN-LAST:event_registerStudentActionPerformed

    private void registerInstrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerInstrumentActionPerformed
        RegisterInstrument rg_inst = new RegisterInstrument();
        InicialScreen.add(rg_inst);
        rg_inst.setVisible(true);
    }//GEN-LAST:event_registerInstrumentActionPerformed

    private void deleteInstrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInstrumentActionPerformed
        DeleteInstrument dl_inst = new DeleteInstrument();
        InicialScreen.add(dl_inst);
        dl_inst.setVisible(true);
    }//GEN-LAST:event_deleteInstrumentActionPerformed

    private void registerTheaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerTheaterActionPerformed
        RegisterTheater rg_th = new RegisterTheater();
        InicialScreen.add(rg_th);
        rg_th.setVisible(true);
    }//GEN-LAST:event_registerTheaterActionPerformed

    private void registerCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCourseActionPerformed
        RegisterCourse rg_cs = new RegisterCourse();
        InicialScreen.add(rg_cs);
        rg_cs.setVisible(true);
    }//GEN-LAST:event_registerCourseActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
       
    }//GEN-LAST:event_StudentActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
        DeleteStudent dl_st = new DeleteStudent();
        InicialScreen.add(dl_st);
        dl_st.setVisible(true);
    }//GEN-LAST:event_deleteStudentActionPerformed

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
            java.util.logging.Logger.getLogger(InicialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane InicialScreen;
    private javax.swing.JMenu Student;
    private javax.swing.JMenuItem deleteInstrument;
    private javax.swing.JMenuItem deleteStudent;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem registerCourse;
    private javax.swing.JMenuItem registerInstrument;
    private javax.swing.JMenuItem registerStudent;
    private javax.swing.JMenuItem registerTheater;
    // End of variables declaration//GEN-END:variables
}
