 package interfaz;

import clases.persona;
import javax.swing.*;

public class form1 extends javax.swing.JFrame {

    public form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsexo = new javax.swing.ButtonGroup();
        btncarrera = new javax.swing.ButtonGroup();
        btninteres = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        btn_masculino = new javax.swing.JRadioButton();
        btn_femenino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtnombre2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtapellido1 = new javax.swing.JTextField();
        txtapellido2 = new javax.swing.JTextField();
        btn_sistemas = new javax.swing.JRadioButton();
        btn_derecho = new javax.swing.JRadioButton();
        btn_contaduria = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_musica = new javax.swing.JRadioButton();
        btn_lectura = new javax.swing.JRadioButton();
        btn_deportes = new javax.swing.JRadioButton();
        txtedad = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_interfazimpresion = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre 1:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre1KeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 89, -1));

        btn_masculino.setBackground(new java.awt.Color(0, 0, 153));
        btnsexo.add(btn_masculino);
        btn_masculino.setForeground(new java.awt.Color(255, 255, 255));
        btn_masculino.setText("Masculino");
        jPanel1.add(btn_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 98, -1));

        btn_femenino.setBackground(new java.awt.Color(0, 0, 153));
        btnsexo.add(btn_femenino);
        btn_femenino.setForeground(new java.awt.Color(255, 255, 255));
        btn_femenino.setText("Femenino");
        jPanel1.add(btn_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 98, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre 2:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtnombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre2KeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 89, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido 1:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido 2:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        txtapellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellido1ActionPerformed(evt);
            }
        });
        txtapellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellido1KeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 91, -1));

        txtapellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellido2KeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 91, -1));

        btn_sistemas.setBackground(new java.awt.Color(0, 0, 153));
        btncarrera.add(btn_sistemas);
        btn_sistemas.setForeground(new java.awt.Color(255, 255, 255));
        btn_sistemas.setText("Ingenieria de sistemas");
        jPanel1.add(btn_sistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        btn_derecho.setBackground(new java.awt.Color(0, 0, 153));
        btncarrera.add(btn_derecho);
        btn_derecho.setForeground(new java.awt.Color(255, 255, 255));
        btn_derecho.setText("Derecho");
        btn_derecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_derechoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 98, -1));

        btn_contaduria.setBackground(new java.awt.Color(0, 0, 153));
        btncarrera.add(btn_contaduria);
        btn_contaduria.setForeground(new java.awt.Color(255, 255, 255));
        btn_contaduria.setText("Contaduria");
        btn_contaduria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contaduriaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_contaduria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 98, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 60, -1));

        btn_musica.setBackground(new java.awt.Color(0, 0, 153));
        btn_musica.setForeground(new java.awt.Color(255, 255, 255));
        btn_musica.setText("Musica");
        jPanel1.add(btn_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 98, -1));

        btn_lectura.setBackground(new java.awt.Color(0, 0, 153));
        btn_lectura.setForeground(new java.awt.Color(255, 255, 255));
        btn_lectura.setText("Lectura");
        jPanel1.add(btn_lectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 98, -1));

        btn_deportes.setBackground(new java.awt.Color(0, 0, 153));
        btn_deportes.setForeground(new java.awt.Color(255, 255, 255));
        btn_deportes.setText("Deportes");
        jPanel1.add(btn_deportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 98, -1));

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 101, -1));

        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 98, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Carrera");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Interes");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CAPTURA DE DATOS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 210, -1));

        btn_interfazimpresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/datos.png"))); // NOI18N
        btn_interfazimpresion.setText("Mostrar datos");
        btn_interfazimpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interfazimpresionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_interfazimpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abstract-background-dark-blue-with-modern-concept-vector.jpg"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

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

    private void btn_derechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_derechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_derechoActionPerformed

    private void btn_contaduriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contaduriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contaduriaActionPerformed

    private void txtapellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellido1ActionPerformed

    private void btn_interfazimpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interfazimpresionActionPerformed
boolean camposCompletos = false;
    
    while (!camposCompletos) {
        try {
            String nombre1 = txtnombre1.getText();
            String nombre2 = txtnombre2.getText();
            String apellido1 = txtapellido1.getText();
            String apellido2 = txtapellido2.getText();
            int edad = Integer.parseInt(txtedad.getText());
            String celular = txtcelular.getText();
            String sexo = "";
                if (btn_masculino.isSelected()) {
                    sexo = "Masculino";
                } else if (btn_femenino.isSelected()) {
                    sexo = "Femenino";
                }
                String carrera = "";
                if (btn_sistemas.isSelected()) {
                    carrera = "Ingeniería de Sistemas";
                } else if (btn_derecho.isSelected()) {
                    carrera = "Derecho";
                } else if (btn_contaduria.isSelected()) {
                    carrera = "Contaduría";
                }
                String interes = "";
                if (btn_musica.isSelected()) {
                    interes += "Música ";
                }
                if (btn_lectura.isSelected()) {
                    interes += "\nLectura ";
                }
                if(btn_deportes.isSelected()) {
                    interes += "\nDeporte ";
                }  

            if (nombre1.isEmpty() || nombre2.isEmpty() || apellido1.isEmpty() || apellido2.isEmpty() ||
                celular.isEmpty() || sexo.isEmpty() || carrera.isEmpty()) {
                throw new Exception("Por favor, complete todos los campos.");
            }

            persona p = new persona(nombre1, nombre2, apellido1, apellido2, sexo, interes, carrera, edad, celular);
            form2 f2 = new form2(p);
            f2.setVisible(true);
            this.dispose();
            
            camposCompletos = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error, por favor llene todos los campos", "Error "+e.getMessage(),0);
            break;
        }
    }
    }//GEN-LAST:event_btn_interfazimpresionActionPerformed

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
    int key = evt.getKeyChar();
    boolean numeros = key >= 48 && key <= 57;
    if (!numeros)
    {
        evt.consume();
    }

    if (txtcelular.getText().trim().length() == 10) {
        evt.consume();
    }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
    int key = evt.getKeyChar();
    boolean numeros = key >= 48 && key <= 57;
    if (!numeros)
    {
        evt.consume();
    }

    if (txtedad.getText().trim().length() == 2) {
        evt.consume();
    }
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtnombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre1KeyTyped
    int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtnombre1KeyTyped

    private void txtnombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre2KeyTyped
           int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtnombre2KeyTyped

    private void txtapellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellido1KeyTyped
            int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtapellido1KeyTyped

    private void txtapellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellido2KeyTyped
            int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtapellido2KeyTyped

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new form1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JRadioButton btn_contaduria;
    private javax.swing.JRadioButton btn_deportes;
    private javax.swing.JRadioButton btn_derecho;
    private javax.swing.JRadioButton btn_femenino;
    private javax.swing.JButton btn_interfazimpresion;
    private javax.swing.JRadioButton btn_lectura;
    private javax.swing.JRadioButton btn_masculino;
    private javax.swing.JRadioButton btn_musica;
    private javax.swing.JRadioButton btn_sistemas;
    private javax.swing.ButtonGroup btncarrera;
    private javax.swing.ButtonGroup btninteres;
    private javax.swing.ButtonGroup btnsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre2;
    // End of variables declaration//GEN-END:variables
}
