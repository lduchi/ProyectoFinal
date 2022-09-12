package vista;

import Modelo.*;
import com.db4o.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Miguel
 */
public class OpcionesAlumno extends javax.swing.JFrame {
    public static ArrayList<Alumno> listaAlumnos =new ArrayList();
    
    private String cedula, edad, nombres, apellidos, telefono, direccion;
    private String curso;
    private boolean validar;
    Validaciones vali = new Validaciones();

    public OpcionesAlumno() {
        initComponents();
        //btnRegtraralumno.setEnabled(false);
        mostrarTabla();
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Alumno");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrgtroAlumno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcedulaalumno = new javax.swing.JTextField();
        txtnombrAlumno = new javax.swing.JTextField();
        txtApelliAlumno = new javax.swing.JTextField();
        TxtedadAlumno = new javax.swing.JTextField();
        txttlfAlumno = new javax.swing.JTextField();
        txtdireccionalumno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnRegtraralumno = new javax.swing.JButton();
        BtnModAlumno = new javax.swing.JButton();
        BtnEliminaralumno = new javax.swing.JButton();
        BtnBuscarA = new javax.swing.JButton();
        cboxcursos = new javax.swing.JComboBox<>();
        txtcurso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRgtrAlumn = new javax.swing.JTable();
        BtnRegreAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Alumnos");

        txtrgtroAlumno.setFont(new java.awt.Font("Papyrus", 2, 24)); // NOI18N
        txtrgtroAlumno.setText("Registro de Alumnos");

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabel2.setText("Cedula");

        jLabel3.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabel7.setText("Direccion");

        txtcedulaalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaalumnoActionPerformed(evt);
            }
        });

        btnRegtraralumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegtraralumno.setText("REGISTRAR");
        btnRegtraralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegtraralumnoActionPerformed(evt);
            }
        });

        BtnModAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnModAlumno.setText("MODIFICAR");
        BtnModAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModAlumnoActionPerformed(evt);
            }
        });

        BtnEliminaralumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEliminaralumno.setText("ELIMINAR");
        BtnEliminaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminaralumnoActionPerformed(evt);
            }
        });

        BtnBuscarA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnBuscarA.setText("BUSCAR");
        BtnBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegtraralumno)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnEliminaralumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnModAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBuscarA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegtraralumno)
                .addGap(34, 34, 34)
                .addComponent(BtnModAlumno)
                .addGap(37, 37, 37)
                .addComponent(BtnEliminaralumno)
                .addGap(37, 37, 37)
                .addComponent(BtnBuscarA)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        cboxcursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canto", "Guitarra", "Piano", "Bateria" }));
        cboxcursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxcursosActionPerformed(evt);
            }
        });

        txtcurso.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        txtcurso.setText("Curso");

        TablaRgtrAlumn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Edad", "Telefono", "Direccion", "Curso "
            }
        ));
        TablaRgtrAlumn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRgtrAlumnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRgtrAlumn);
        if (TablaRgtrAlumn.getColumnModel().getColumnCount() > 0) {
            TablaRgtrAlumn.getColumnModel().getColumn(4).setHeaderValue("Telefono");
            TablaRgtrAlumn.getColumnModel().getColumn(5).setHeaderValue("Direccion");
        }

        BtnRegreAlumno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnRegreAlumno.setText("REGRESAR");
        BtnRegreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegreAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(txtrgtroAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApelliAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(txtcedulaalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtedadAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombrAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboxcursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdireccionalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txttlfAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRegreAlumno)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrgtroAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcedulaalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombrAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApelliAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtedadAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttlfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccionalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxcursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(BtnRegreAlumno)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaalumnoActionPerformed

    private void BtnEliminaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminaralumnoActionPerformed

        ObjectContainer BaseBD = Conexion.ConectarBD();

        String cedu = JOptionPane.showInputDialog(null,"Ingrese el numero de cedula del Alumno que desa eliminar ");
        cedula = cedu;
        Alumno Abuscar = new Alumno(null, cedula, null, null, null, null, null);
        ObjectSet resul = BaseBD.get(Abuscar);

        if (validar_Alumno(BaseBD, cedula)) {
            String cur = (JOptionPane.showInputDialog(null, "Selecciona el curso", "Cursos", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "Selecciona", "Canto", "Guitarra", "Piano", "Bateria"}, "Selecciona")).toString();
            curso = cur;
            Alumno Abuscarc = new Alumno(curso, null, null, null, null, null, null);
            ObjectSet resulc = BaseBD.get(Abuscarc);
            if (validar_AlumnoCurso(BaseBD, curso)) {
                eliminarAlumno(BaseBD, cedula);

            } else {
                JOptionPane.showMessageDialog(null, "¡El alumno no está registrado en la base de datos con la informacion seleccionada!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡El Alumno no está registrado en la base de datos!");
        }
        BaseBD.close();
        mostrarTabla();
    }//GEN-LAST:event_BtnEliminaralumnoActionPerformed

    private void cboxcursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxcursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxcursosActionPerformed

    private void BtnRegreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegreAlumnoActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnRegreAlumnoActionPerformed

    private void btnRegtraralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegtraralumnoActionPerformed
        ObjectContainer BaseBD = Conexion.ConectarBD();
        if (txtcedulaalumno.getText().equals("") || txtnombrAlumno.getText().equals("") || txtApelliAlumno.getText().equals("") || TxtedadAlumno.getText().equals("")
                || txtdireccionalumno.getText().equals("") || txttlfAlumno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        } else {

            cedula = txtcedulaalumno.getText().trim();
            nombres = txtnombrAlumno.getText().trim();
            apellidos = txtApelliAlumno.getText().trim();
            edad = TxtedadAlumno.getText().trim();
            direccion = txtdireccionalumno.getText().trim();
            telefono = txttlfAlumno.getText().trim();
            curso = cboxcursos.getSelectedItem().toString();
            Alumno alumno = new Alumno(curso, cedula, edad, nombres, apellidos, telefono, direccion);
            if (Validar_Alumno_Curso(BaseBD, cedula, curso) == 0) {
                if (vali.validarCedula(cedula)) {
                    if (vali.validarApellidosyNombre(nombres)) {
                        if (vali.validarApellidosyNombre(apellidos)) {
                            if (vali.validarEdad(edad)) {
                                if (vali.validarTelefono(telefono)) {
                                    if (vali.validarTextoConEspacio(direccion)) {
                                        BaseBD.set(alumno);
                                        listaAlumnos.add(alumno);
                                        JOptionPane.showMessageDialog(null, "El alumnno fue guardado exitosamente!");
                                        limpiarLabel();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La direccion solo debe de contener letras");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Ingrese un numero telefonico valido (09)");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La academia musical no admite menores de 15 años, ingrese una edad correcta");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar sus dos apellidos correctos, intente nuevamente");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar sus dos nombres correctos, intente nuevamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de cedula es incorrecto intente nuevamente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El alumno ya existe, no se puede registrar");
            }
            BaseBD.close();
            mostrarTabla();
        }
    }//GEN-LAST:event_btnRegtraralumnoActionPerformed

    private void BtnModAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModAlumnoActionPerformed
        ObjectContainer BaseBD = Conexion.ConectarBD();
        String cedu = JOptionPane.showInputDialog("Ingrese el numero de cedula del Alumno que desa Modificar: ");
        cedula = cedu;
        Alumno Abuscar = new Alumno(null, cedula, null, null, null, null, null);
        ObjectSet resul = BaseBD.get(Abuscar);

        if (!cedula.equals("") && validar_Alumno(BaseBD, cedula)) {
            txtcedulaalumno.setText(cedula);
            txtcedulaalumno.setEnabled(false);

            String cur = (JOptionPane.showInputDialog(null, "Selecciona el curso", "Cursos", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "Selecciona", "Canto", "Guitarra", "Piano", "Bateria"}, "Selecciona")).toString();
            curso = cur;
            Alumno Abuscarc = new Alumno(curso, null, null, null, null, null, null);
            ObjectSet resulc = BaseBD.get(Abuscarc);
            if (validar_AlumnoCurso(BaseBD, curso)) {
                Alumno AlumnoM = (Alumno) resul.next();
                cboxcursos.addItem(cur);
                cboxcursos.setEnabled(false);
                String nom = JOptionPane.showInputDialog("Ingrese los nombres del Alumno");
                txtnombrAlumno.setText(nom);
                String ap = JOptionPane.showInputDialog("Ingrese los apellidos del Alumno");
                txtApelliAlumno.setText(ap);
                String ed = JOptionPane.showInputDialog("Ingrese la edad del Alumno");
                TxtedadAlumno.setText(ed);
                String tel = JOptionPane.showInputDialog("Ingrese el telefono del Alumno");
                txttlfAlumno.setText(tel);
                String dir = JOptionPane.showInputDialog("Ingrese la direccion del Alumno");
                txtdireccionalumno.setText(dir);

                AlumnoM.setNombres(nom);
                AlumnoM.setApellidos(ap);
                AlumnoM.setEdad(ed);
                AlumnoM.setDireccion(dir);
                AlumnoM.setTelefono(tel);
                AlumnoM.setCurso(cur);
                JOptionPane.showMessageDialog(null, "¡El cliente ha sido modificado con exito!");
                BaseBD.set(AlumnoM);
            } else {
                JOptionPane.showMessageDialog(null, "¡El alumno no está registrado en la base de datos con la informacion seleccionada!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡El Alumno no está registrado en la base de datos!");
        }
        txtcedulaalumno.setEnabled(true);
        cboxcursos.setEnabled(true);
        limpiarLabel();
        BaseBD.close();
        mostrarTabla();

    }//GEN-LAST:event_BtnModAlumnoActionPerformed

    private void BtnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarAActionPerformed
        ObjectContainer BaseBD = Conexion.ConectarBD();
        String cedu = JOptionPane.showInputDialog(null,"Ingrese el numero de cedula del Alumno que desa buscar ");
        cedula = cedu;
        Alumno Abuscar = new Alumno(null, cedula, null, null, null, null, null);
        ObjectSet resul = BaseBD.get(Abuscar);

        if (validar_Alumno(BaseBD, cedula)) {

            Consultar_Alumno_Parametro(BaseBD, cedula);

        } else {
            JOptionPane.showMessageDialog(null, "¡El Alumno no está registrado en la base de datos!");
        }
        mostrarTablaConsulta();
        BaseBD.close();
    }//GEN-LAST:event_BtnBuscarAActionPerformed

    private void TablaRgtrAlumnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRgtrAlumnMouseClicked
        int seleccionado = TablaRgtrAlumn.getSelectedRow();
        
    }//GEN-LAST:event_TablaRgtrAlumnMouseClicked

    public void mostrarTabla() {

        ObjectContainer BaseBD = Conexion.ConectarBD();

        //Consultar todos los alumnos
        Alumno Talumno = new Alumno(null, null, null, null, null, null, null);
        ObjectSet resul = BaseBD.get(Talumno);

        String matriz[][] = new String[resul.size()][7];

        for (int i = 0; i < resul.size(); i++) {
            Alumno alumnoG = (Alumno) resul.next();

            matriz[i][0] = alumnoG.getCedula().toUpperCase();
            matriz[i][1] = alumnoG.getNombres().toUpperCase();
            matriz[i][2] = alumnoG.getApellidos().toUpperCase();
            matriz[i][3] = alumnoG.getEdad();
            matriz[i][4] = alumnoG.getDireccion();
            matriz[i][5] = alumnoG.getDireccion();
            matriz[i][6] = String.valueOf(alumnoG.getCurso()).toUpperCase();
           
            
        }
        TablaRgtrAlumn.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Cedula", "Nombres", "Apellidos", "Edad",  "Curso"
                }
        ));
        BaseBD.close();
    }

    public void mostrarTablaConsulta() {

        ObjectContainer BaseBD = Conexion.ConectarBD();

        Alumno Abuscar = new Alumno(null, cedula, null, null, null, null, null);
        ObjectSet resul = BaseBD.get(Abuscar);
        JOptionPane.showMessageDialog(null, "Existen " + resul.size() + " alumnos");

        String matriz[][] = new String[resul.size()][7];

        for (int i = 0; i < resul.size(); i++) {
            Alumno alumnoG = (Alumno) resul.next();

            matriz[i][0] = alumnoG.getCedula().toUpperCase();
            matriz[i][1] = alumnoG.getNombres().toUpperCase();
            matriz[i][2] = alumnoG.getApellidos().toUpperCase();
            matriz[i][3] = alumnoG.getEdad();
            matriz[i][4] = alumnoG.getTelefono();
            matriz[i][5] = alumnoG.getDireccion().toUpperCase();
            matriz[i][6] = String.valueOf(alumnoG.getCurso()).toUpperCase();

        }
        TablaRgtrAlumn.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Cedula", "Nombres", "Apellidos", "Edad", "Telefono", "Direccion", "Curso"
                }
        ));
        BaseBD.close();
    }

    public static int Validar_Alumno_Curso(ObjectContainer BaseBD, String cedula, String curso) {

        Alumno Abuscar = new Alumno(curso, cedula, null, null, null, null, null);

        ObjectSet resul = BaseBD.get(Abuscar);
        return resul.size();
    }

    public boolean validar_Alumno(ObjectContainer BaseBD, String cedula) {

        Alumno Valumno = new Alumno(null, cedula, null, null, null, null, null);

        ObjectSet resul = BaseBD.get(Valumno);

        validar = resul.hasNext();
        return validar;
    }

    public boolean validar_AlumnoCurso(ObjectContainer BaseBD, String curso) {

        Alumno Valumno = new Alumno(curso, null, null, null, null, null, null);

        ObjectSet resul = BaseBD.get(Valumno);

        validar = resul.hasNext();
        return validar;
    }

    public void eliminarAlumno(ObjectContainer BaseBD, String dni) {

        Alumno Valumno = new Alumno(null, cedula, null, null, null, null, null);

        ObjectSet resul = BaseBD.get(Valumno);

        if (resul.hasNext()) {
            Alumno alumnoE = (Alumno) resul.next();
            BaseBD.delete(alumnoE);

        }

    }

    public static void Consultar_Alumno_Parametro(ObjectContainer base, String cedula) {
        Alumno Abuscar = new Alumno(null, cedula, null, null, null, null, null);
        ObjectSet resul = base.get(Abuscar);
        JOptionPane.showMessageDialog(null, "Existen " + resul.size() + " alumnos");

    }
    public void MostrarDatos(int seleccionado){
            txtcedulaalumno.setText(listaAlumnos.get(seleccionado).getCedula());
          /*  txtnombrAlumno
            txtApelliAlumno
            TxtedadAlumno
            txtdireccionalumno
            txttlfAlumno
            cboxcursos*/
    }

    public void limpiarLabel() {
        txtcedulaalumno.setText("");
        txtnombrAlumno.setText("");
        txtApelliAlumno.setText("");
        TxtedadAlumno.setText("");
        txttlfAlumno.setText("");
        txtdireccionalumno.setText("");

      }

    public void Actualizar_Alumno(ObjectContainer BaseBD, String cedula) {
        Alumno Abuscar = new Alumno(null, cedula, null, null, null, null, null);
    }

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
            java.util.logging.Logger.getLogger(OpcionesAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarA;
    private javax.swing.JButton BtnEliminaralumno;
    private javax.swing.JButton BtnModAlumno;
    private javax.swing.JButton BtnRegreAlumno;
    private javax.swing.JTable TablaRgtrAlumn;
    private javax.swing.JTextField TxtedadAlumno;
    private javax.swing.JButton btnRegtraralumno;
    private javax.swing.JComboBox<String> cboxcursos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApelliAlumno;
    private javax.swing.JTextField txtcedulaalumno;
    private javax.swing.JLabel txtcurso;
    private javax.swing.JTextField txtdireccionalumno;
    private javax.swing.JTextField txtnombrAlumno;
    private javax.swing.JLabel txtrgtroAlumno;
    private javax.swing.JTextField txttlfAlumno;
    // End of variables declaration//GEN-END:variables
}
