
package interfaz;

import clases.persona;

public class form2 extends javax.swing.JFrame {

    private persona persona;


    public form2() {
        initComponents();
    }
  
    public form2(persona persona) {
        initComponents();
        this.persona = persona;
        mostrarDatos();
    }
    
    private void mostrarDatos() {
        txtnombre1.setText(persona.getNombre1());
        txtnombre2.setText(persona.getNombre2());
        txtapellido1.setText(persona.getApellido1());
        txtapellido2.setText(persona.getApellido2());
        txtedad.setText(String.valueOf(persona.getEdad()));
        txtcelular.setText(String.valueOf(persona.getCelular()));
        txtsexo.setText(persona.getSexo());
        txtcarrera.setText(persona.getCarrera());
        txtinteres.setText(persona.getInteres());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        txtapellido1 = new javax.swing.JTextField();
        txtnombre2 = new javax.swing.JTextField();
        txtapellido2 = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtcarrera = new javax.swing.JTextField();
        txtinteres = new javax.swing.JTextArea();
        txtvolveracaptura = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MOSTRAR DATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre 1:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre 2:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido 1:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido 2:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 148, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 148, 69, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 37, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carrera");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Interes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        txtnombre1.setEditable(false);
        jPanel1.add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 62, 109, -1));

        txtapellido1.setEditable(false);
        txtapellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellido1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 102, 109, -1));

        txtnombre2.setEditable(false);
        jPanel1.add(txtnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 60, 102, -1));

        txtapellido2.setEditable(false);
        jPanel1.add(txtapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 100, 100, -1));

        txtedad.setEditable(false);
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 145, 109, -1));

        txtcelular.setEditable(false);
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 145, 97, -1));

        txtsexo.setEditable(false);
        jPanel1.add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 90, -1));

        txtcarrera.setEditable(false);
        jPanel1.add(txtcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 184, -1));

        txtinteres.setEditable(false);
        txtinteres.setColumns(20);
        txtinteres.setRows(5);
        jPanel1.add(txtinteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 120, 60));

        txtvolveracaptura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/avance.png"))); // NOI18N
        txtvolveracaptura.setText("Volver a la captura");
        txtvolveracaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvolveracapturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtvolveracaptura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abstract-background-dark-blue-with-modern-concept-vector.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellido1ActionPerformed

    }//GEN-LAST:event_txtapellido1ActionPerformed

    private void txtvolveracapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvolveracapturaActionPerformed
         form1 f1 = new form1(); // Crea una nueva instancia de form1 con la misma persona
        f1.setVisible(true); // Muestra form1
        this.dispose();
    }//GEN-LAST:event_txtvolveracapturaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtapellido2;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextArea txtinteres;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre2;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JButton txtvolveracaptura;
    // End of variables declaration//GEN-END:variables

}
