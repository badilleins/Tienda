/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package factura;

import datos.Conexion;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import tienda.RegistroClientes;

/**
 *
 * @author bryan
 */
public class Factura extends javax.swing.JFrame {

    Conexion con = new Conexion();
    DefaultTableModel dm = new DefaultTableModel();
    RegistroClientes fr;

    /**
     * Creates new form Factura
     */
    public Factura(JFrame jFrame, boolean par) {
        initComponents();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        String titulos[] = {"Codigo", "Nombre", "Cantidad", "Precio", "Subtotal"};
        dm.setColumnIdentifiers(titulos);
        jTable1.setModel(dm);
        jbtnImprimir.setEnabled(false);
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
        jlblSlogan = new javax.swing.JLabel();
        jlblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnBuscarCliente = new javax.swing.JButton();
        jftxtBusquedaCedula = new javax.swing.JFormattedTextField();
        jbtnRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlblCedula = new javax.swing.JLabel();
        jtxtCedula = new javax.swing.JTextField();
        jlblDireccion = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jlblNombres = new javax.swing.JLabel();
        jlblTelefono = new javax.swing.JLabel();
        jtxtNombres = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtCorreo = new javax.swing.JTextField();
        numeroFactura = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlblNumFac = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblFecFac = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtCodigo = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnImprimir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblSubtotal = new javax.swing.JLabel();
        jlbliva = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturacion");
        setBackground(new java.awt.Color(0, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jlblSlogan.setBackground(new java.awt.Color(255, 255, 255));
        jlblSlogan.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jlblSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jlblSlogan.setText("Descubre mundos infinitos entre las paginas");

        jlblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setText("LibVerso");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Cliente");

        jbtnBuscarCliente.setText("Buscar");
        jbtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarClienteActionPerformed(evt);
            }
        });

        jftxtBusquedaCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Cliente"))));

        jlblCedula.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jlblCedula.setText("Cedula:");

        jtxtCedula.setEditable(false);

        jlblDireccion.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jlblDireccion.setText("Direccion:");

        jtxtDireccion.setEditable(false);

        jlblNombres.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jlblNombres.setText("Nombres:");

        jlblTelefono.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jlblTelefono.setText("Telefono:");

        jtxtNombres.setEditable(false);

        jtxtTelefono.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel2.setText("Correo:");

        jtxtCorreo.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jlblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCedula)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNombres)
                    .addComponent(jlblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCedula)
                    .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNombres)
                    .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelefono)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDireccion)
                    .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        numeroFactura.setBackground(new java.awt.Color(255, 255, 255));
        numeroFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "Datos de la Factura"));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel3.setText("Nro Factura:");

        jlblNumFac.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel5.setText("Fecha:");

        jlblFecFac.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        javax.swing.GroupLayout numeroFacturaLayout = new javax.swing.GroupLayout(numeroFactura);
        numeroFactura.setLayout(numeroFacturaLayout);
        numeroFacturaLayout.setHorizontalGroup(
            numeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroFacturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jlblNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jlblFecFac, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        numeroFacturaLayout.setVerticalGroup(
            numeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numeroFacturaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(numeroFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlblNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jlblFecFac, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jtxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCodigoKeyReleased(evt);
            }
        });

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnImprimir.setText("Imprimir Factura");
        jbtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirActionPerformed(evt);
            }
        });

        jLabel4.setText("Subtotal:");

        jLabel6.setText("IVA 12%:");

        jLabel7.setText("Total:");

        jlblSubtotal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        jlbliva.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        jlblTotal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftxtBusquedaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbliva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jbtnGuardar)
                .addGap(100, 100, 100)
                .addComponent(jbtnImprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnBuscarCliente)
                    .addComponent(jftxtBusquedaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jlblSubtotal)
                    .addComponent(jlbliva)
                    .addComponent(jlblTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnImprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblSlogan)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addGap(215, 215, 215))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSlogan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscarCliente() {
        String cedula = jftxtBusquedaCedula.getText();
        if (!cedula.equals("")) {
            Connection cn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            ResultSet rs2 = null; // Declare rs2 outside the try block
            try {
                cn = con.getConnection();
                ps = cn.prepareStatement("SELECT * FROM clientes WHERE cedula=" + cedula + ";");
                rs = ps.executeQuery();
                if (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String nombresCompletos = nombre + " " + apellido;
                    jtxtCedula.setText(rs.getString("cedula"));
                    jtxtNombres.setText(nombresCompletos);
                    jtxtCorreo.setText(rs.getString("correo"));
                    jtxtTelefono.setText(rs.getString("telefono"));
                    jtxtDireccion.setText(rs.getString("direccion"));
                    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String fechaActual = LocalDate.now().format(formatoFecha);
                    jlblFecFac.setText(fechaActual);

                    int idFac = 1; // Valor predeterminado en caso de no encontrar el campo id_fac en la base de datos
                    try {
                        PreparedStatement ps2 = cn.prepareStatement("SELECT MAX(id_fac) FROM factura");
                        rs2 = ps2.executeQuery(); // Assign rs2 to the ResultSet object returned by ps2
                        if (rs2.next()) {
                            idFac = rs2.getInt(1) + 1;
                        }
                    } catch (SQLException ex) {
                        // Manejo de excepciones al obtener el valor de id_fac
                    } finally {
                        if (rs2 != null) {
                            rs2.close(); // Close the rs2 ResultSet object
                        }
                    }
                    jlblNumFac.setText(String.valueOf(idFac));
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ EL CLIENTE");
                }
            } catch (SQLException e) {
                // Manejo de excepciones
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                    if (cn != null) {
                        cn.close();
                    }
                } catch (SQLException e) {
                    // Manejo de excepciones al cerrar los recursos
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS CAMPOS");
        }
    }

    public void agregarProducto() {
        String barcode = jtxtCodigo.getText();
        if (!barcode.equals("")) {
            String registro[] = new String[5];
            boolean encontrado = false;

            for (int i = 0; i < dm.getRowCount(); i++) {
                if (dm.getValueAt(i, 0).equals(barcode)) {
                    int cantidad = Integer.parseInt(dm.getValueAt(i, 2).toString());
                    double precio = Double.parseDouble(dm.getValueAt(i, 3).toString());
                    cantidad++;
                    double subtotal = cantidad * precio;
                    dm.setValueAt(cantidad, i, 2);
                    dm.setValueAt(subtotal, i, 4);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                Connection cn = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                try {
                    cn = con.getConnection();
                    ps = cn.prepareStatement("SELECT * FROM productos WHERE id = ?");
                    ps.setString(1, barcode);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        registro[0] = rs.getString("id");
                        registro[1] = rs.getString("nombre");
                        registro[2] = "1";
                        registro[3] = rs.getString("precio");
                        double subtotal = Double.parseDouble(registro[2]) * Double.parseDouble(registro[3]);
                        registro[4] = String.valueOf(subtotal);
                        dm.addRow(registro);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el producto con el código " + barcode);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al consultar la base de datos");
                } finally {
                    try {
                        if (rs != null) {
                            rs.close(); // Cerrar el ResultSet
                        }
                        if (ps != null) {
                            ps.close(); // Cerrar el PreparedStatement
                        }
                        if (cn != null) {
                            cn.close(); // Cerrar la Connection
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al cerrar la conexión");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "PRODUCTO NO ENCONTRADO");
        }
    }

    public void Total() {
        int fila = dm.getColumnCount() - 1;
        double subtotal = 0;
        double iva = 0;
        double total = 0;

        for (int i = 0; i < dm.getRowCount(); i++) {
            subtotal = subtotal + Double.parseDouble(dm.getValueAt(i, fila).toString());
        }

        iva = subtotal * 0.12;
        total = subtotal + iva;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        String formattedSubtotal = decimalFormat.format(subtotal);
        String formattedIva = decimalFormat.format(iva);
        String formattedTotal = decimalFormat.format(total);

        jlblSubtotal.setText(formattedSubtotal);
        jlbliva.setText(formattedIva);
        jlblTotal.setText(formattedTotal);
    }

    public void insertarDatos() {
        // Obtener los datos de la interfaz gráfica
        double total = Double.parseDouble(jlblTotal.getText().replace(",", "."));
        Date fecha = Date.valueOf(jlblFecFac.getText());
        String cedula = jtxtCedula.getText();
        String codigo;
        int cantidad;
        double subtotal;

        // Insertar datos en la tabla factura
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement("INSERT INTO factura (fec_fac, id_cli_ven, total) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDate(1, new java.sql.Date(fecha.getTime()));
            ps.setString(2, cedula);
            ps.setDouble(3, total);
            ps.executeUpdate();

            // Obtener el ID de la factura generada
            rs = ps.getGeneratedKeys();
            int idFactura = 0;
            if (rs.next()) {
                idFactura = rs.getInt(1);
            }

            // Insertar datos en la tabla detalle_factura
            for (int i = 0; i < dm.getRowCount(); i++) {
                codigo = dm.getValueAt(i, 0).toString();
                cantidad = Integer.parseInt(dm.getValueAt(i, 2).toString());
                subtotal = Double.parseDouble(dm.getValueAt(i, 4).toString().replace(",", "."));

                ps = cn.prepareStatement("INSERT INTO detalle_factura (id_pro_ven, can_pro_ven, subtotal, id_fac_per) VALUES (?, ?, ?, ?)");
                ps.setString(1, codigo);
                ps.setInt(2, cantidad);
                ps.setDouble(3, subtotal);
                ps.setInt(4, idFactura);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la base de datos");
        } finally {
            try {
                if (rs != null) {
                    rs.close(); // Cerrar el ResultSet
                }
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                if (cn != null) {
                    cn.close(); // Cerrar la Connection
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión");
            }
        }
    }

    private void jbtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_jbtnBuscarClienteActionPerformed

    private void jtxtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            agregarProducto();
            Total();
            jtxtCodigo.setText(""); // Limpiar el campo de texto después de agregar el producto
        }
    }//GEN-LAST:event_jtxtCodigoKeyReleased

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        insertarDatos();
        jbtnImprimir.setEnabled(true);
        jbtnGuardar.setEnabled(false);
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Conexion cc = new Conexion();
            JasperReport reporte=null;
            String path= "src\\factura\\voucher.jasper";
            Map parametros = new HashMap();
            parametros.put("numFac", jlblNumFac.getText());
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint= JasperFillManager.fillReport(path,parametros,cc.getConnection());
            JasperViewer view=new JasperViewer(jprint,false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, "no se pudo" + ex);
        }
    }//GEN-LAST:event_jbtnImprimirActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        // TODO add your handling code here:
        fr = new RegistroClientes();
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnBuscarCliente;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnImprimir;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JFormattedTextField jftxtBusquedaCedula;
    private javax.swing.JLabel jlblCedula;
    private javax.swing.JLabel jlblDireccion;
    private javax.swing.JLabel jlblFecFac;
    private javax.swing.JLabel jlblNombres;
    private javax.swing.JLabel jlblNumFac;
    private javax.swing.JLabel jlblSlogan;
    private javax.swing.JLabel jlblSubtotal;
    private javax.swing.JLabel jlblTelefono;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlbliva;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JPanel numeroFactura;
    // End of variables declaration//GEN-END:variables
}
