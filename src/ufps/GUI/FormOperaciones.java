/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.GUI;

import java.io.File;
import javax.swing.*;
import ufps.Mundo.Archivo;
import ufps.util.Cola;
import ufps.util.ListaCD;

/**
 *
 * @author Rosemberg
 */
public class FormOperaciones extends javax.swing.JFrame {
    
private FormRegistro formPrincipal=null;

private String posActual="/";

private DefaultListModel df=new DefaultListModel();

private boolean esActiva=true;

private HiloDeProceso hiloP=null;

private Cola<Thread>procesos=new Cola<Thread>();

    /**
     * Creates new form FormOperaciones
     */
    public FormOperaciones(FormRegistro x) {
        
        //Para dar Aspecto de el Sistema Operativo donde este
         try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            System.err.println("Error con look");
        }
         
        //Hilo que regula la conexion a toda hora
        HiloConexion hC=new HiloConexion(this);
        hC.start();
              
        formPrincipal=x;
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        //Carga los archivos en el JList
        this.actualizarListadoArchivos();
        this.etiNomUser.setText(this.formPrincipal.getCentro().getUser());
        this.etiPos.setText(posActual);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroDeJuego1 = new ufps.GUI.TableroDeJuego();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaArchivos = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        etiImagen = new javax.swing.JLabel();
        txtNomArchivo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiPos = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtNombreVal = new javax.swing.JTextField();
        txtFechaVal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdAnterior = new javax.swing.JButton();
        cmdSubir = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdSubir2 = new javax.swing.JButton();
        etiCarga = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiNomUser = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tableroDeJuego1.setBackground(new java.awt.Color(255, 255, 255));
        tableroDeJuego1.setPreferredSize(new java.awt.Dimension(787, 1000));

        listaArchivos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaArchivos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaArchivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaArchivosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listaArchivos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        txtNomArchivo.setEditable(false);
        txtNomArchivo.setBorder(null);
        txtNomArchivo.setOpaque(false);

        jLabel3.setText("Usted esta Posicionado");

        jLabel4.setText("en :");

        etiPos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiPos.setForeground(new java.awt.Color(255, 0, 51));
        etiPos.setText("Aqui va dirrrrrrrrrrrr");

        txtFecha.setEditable(false);
        txtFecha.setBorder(null);
        txtFecha.setOpaque(false);

        txtNombreVal.setEditable(false);
        txtNombreVal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNombreVal.setForeground(new java.awt.Color(255, 0, 0));
        txtNombreVal.setBorder(null);
        txtNombreVal.setOpaque(false);

        txtFechaVal.setEditable(false);
        txtFechaVal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFechaVal.setForeground(new java.awt.Color(255, 0, 0));
        txtFechaVal.setBorder(null);
        txtFechaVal.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(etiImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(etiPos)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreVal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombreVal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFechaVal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiPos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        cmdAnterior.setText("Volver Atras");
        cmdAnterior.setEnabled(false);
        cmdAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnteriorActionPerformed(evt);
            }
        });

        cmdSubir.setText("Subir Archivo");
        cmdSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSubirActionPerformed(evt);
            }
        });

        cmdCrear.setText("Crear Carpeta");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });

        cmdSubir2.setText("Subir Carpeta");
        cmdSubir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSubir2ActionPerformed(evt);
            }
        });

        txtCarga.setEditable(false);
        txtCarga.setBorder(null);
        txtCarga.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdSubir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdSubir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cmdAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdSubir)
                .addGap(18, 18, 18)
                .addComponent(cmdSubir2)
                .addGap(18, 18, 18)
                .addComponent(cmdCrear)
                .addGap(29, 29, 29)
                .addComponent(etiCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bienvenido al servidor ");

        etiNomUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiNomUser.setForeground(new java.awt.Color(255, 0, 0));
        etiNomUser.setText("Aqui va Nombre");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufps/Imagenes/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(etiNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiNomUser)))
                .addContainerGap())
        );

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufps/Imagenes/sandboxLogo.png"))); // NOI18N

        jPanel5.setBackground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tableroDeJuego1Layout = new javax.swing.GroupLayout(tableroDeJuego1);
        tableroDeJuego1.setLayout(tableroDeJuego1Layout);
        tableroDeJuego1Layout.setHorizontalGroup(
            tableroDeJuego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tableroDeJuego1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addGroup(tableroDeJuego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroDeJuego1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(tableroDeJuego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tableroDeJuego1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        tableroDeJuego1Layout.setVerticalGroup(
            tableroDeJuego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableroDeJuego1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tableroDeJuego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableroDeJuego1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tableroDeJuego1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tableroDeJuego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableroDeJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableroDeJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnteriorActionPerformed
              
        //si estoy parado en la raiz
        if(posActual.equals("/"))
           return;
        
        this.posActual=this.formPrincipal.getCentro().devolverse();
        
            if(posActual.equals("/"))
                this.cmdAnterior.setEnabled(false);
            
        this.actualizarListadoArchivos();
        
        this.actualizarValoresPropiedades(null);
        
    }//GEN-LAST:event_cmdAnteriorActionPerformed

    private void cmdSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSubirActionPerformed
        // TODO add your handling code here:
        
        JFileChooser val=new JFileChooser();
        
        int x=val.showOpenDialog(val);
        
        if(x==JFileChooser.APPROVE_OPTION){
            File valor=val.getSelectedFile();

            if(!valor.exists()){
                JOptionPane.showMessageDialog(rootPane, "La direccion indicada no existe");
                return;
            }
                        
            this.hiloP=new HiloDeProceso(valor, false, "", this);
            apagarTodo("Subiendo");
            hiloP.start();
            this.procesos.enColar(hiloP);

        }
        
        
    }//GEN-LAST:event_cmdSubirActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        String val=JOptionPane.showInputDialog("Digite el nombre de la nueva carpeta");
        
        if(!this.formPrincipal.getCentro().crearCarpeta(val))
            JOptionPane.showMessageDialog(null, "La carpeta no ha podido ser creada en el servidor");
        
        this.actualizarListadoArchivos();
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdSubir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSubir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSubir2ActionPerformed

    private void listaArchivosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaArchivosMousePressed
        // TODO add your handling code here:
          if(!esActiva)
            return;
        
        boolean tipo=false;
        
        int pos=this.listaArchivos.locationToIndex(evt.getPoint());
            if(pos==-1)
                return;
            

            String[] val=this.listaArchivos.getModel().getElementAt(pos).toString().split("Ð");

            if(val[1].equals("directorio"))
                    tipo=true;
            
            this.actualizarValoresPropiedades(val);

        if(evt.getClickCount()==2){
            
            if(tipo){
                this.cmdAnterior.setEnabled(true);
                this.formPrincipal.getCentro().actualizarPila(posActual);
                this.posActual=val[0];
                this.etiPos.setText(posActual);
                this.actualizarListadoArchivos();
                this.actualizarValoresPropiedades(null);
            }
            
            else{
                
            int seleccion = JOptionPane.showOptionDialog(null, "Selecciona la operacion a realizar", "UFPS", 
      JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, new Object[] { "Descargar", "Borrar", "Obtener Link"}, null);
            realizarOperaciones(seleccion, val[0]);
            
            }
        }
    }//GEN-LAST:event_listaArchivosMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    public void actualizarListadoArchivos(){
        
        ListaCD<Archivo>listaDatos=this.formPrincipal.getCentro().getArchivos(posActual, false);
        ListaCD<Archivo>listaCarpetas=this.formPrincipal.getCentro().getArchivos(posActual, true);

        df.clear();
        llenar(listaCarpetas);
        llenar(listaDatos);
        
        this.listaArchivos.setModel(df);
        
        RenderLista rd=new RenderLista();
        
        this.listaArchivos.setCellRenderer(rd);

    }
   
    private void llenar(ListaCD<Archivo>lista){
        for(Archivo x:lista)
            df.addElement(x.getNombre()+"Ð"+x.getTipo()+"Ð"+x.getFecha());    
    }

    
    private void realizarOperaciones(int seleccion, String valor){
        
        if(seleccion==0){
            
            JFileChooser val=new JFileChooser();
        
            val.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            
            int x=val.showOpenDialog(val);
        
            if(x==JFileChooser.APPROVE_OPTION){

            File dato=val.getSelectedFile();         
            
            if(!dato.exists()){
                JOptionPane.showMessageDialog(rootPane, "La direccion indicada no existe");
                return;
            }

            this.hiloP =new HiloDeProceso(dato, true, valor, this);
            
            apagarTodo("Descargando");
            
            hiloP.start();
            
            this.procesos.enColar(hiloP);
            
            }
        }
        
        if(seleccion==1){
            
            this.formPrincipal.getCentro().eliminar(valor);
            
            JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
            this.actualizarListadoArchivos();   
            this.actualizarValoresPropiedades(null);
         }
        
        if(seleccion==2){
            
        String val=this.formPrincipal.getCentro().getLink(this.posActual);
        
        if(val==null)
           JOptionPane.showMessageDialog(null,"Error, esta por fuera de la carpeta Publica");
            
        else{
            
            FormCopyPaste copiar=new FormCopyPaste(this, val+valor);
            copiar.setVisible(true);
            
            }
        }
    
    }
        

    private void actualizarValoresPropiedades(String[] val) {
        
        this.etiPos.setText(posActual);
        if(val==null){
            this.txtFechaVal.setText("");
            this.txtNombreVal.setText("");
            this.etiImagen.setIcon(new ImageIcon());
            this.txtNomArchivo.setText("");
            this.txtFecha.setText("");
            return;
        }
        
        if(val[1].equals("directorio"))
            this.etiImagen.setIcon(new ImageIcon(this.getClass().getResource("/ufps/Imagenes/iconoCarpeta.jpg")));
        
        else
            this.etiImagen.setIcon(new ImageIcon(this.getClass().getResource("/ufps/Imagenes/Iconoarchivo.png")));
        this.txtNomArchivo.setText(val[0]);

        this.txtFecha.setText(val[2]);
        this.txtFechaVal.setText("Fecha de Modificacion");
        this.txtNombreVal.setText("Nombre");
    }
    
    public void encenterTodo(String val){
        
        this.cmdAnterior.setEnabled(true);
        this.cmdSubir.setEnabled(true);
        this.cmdSubir2.setEnabled(true);
        this.cmdCrear.setEnabled(true);
        this.esActiva=true;
        
        this.etiCarga.setIcon(new ImageIcon());
        this.txtCarga.setText("");
        JOptionPane.showMessageDialog(null, val);
    }
    
    public void apagarTodo(String tex){
        
        this.cmdAnterior.setEnabled(false);
        this.cmdSubir.setEnabled(false);
        this.cmdSubir2.setEnabled(false);
        this.cmdCrear.setEnabled(false);
        this.esActiva=false;
        
        this.etiCarga.setIcon(new ImageIcon(this.getClass().getResource("/ufps/Imagenes/cargandoSubir.gif")));
        this.txtCarga.setText(tex);
    }
    
    public FormRegistro getFormPrincipal() {
        return formPrincipal;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAnterior;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdSubir;
    private javax.swing.JButton cmdSubir2;
    private javax.swing.JLabel etiCarga;
    private javax.swing.JLabel etiImagen;
    private javax.swing.JLabel etiNomUser;
    private javax.swing.JLabel etiPos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList listaArchivos;
    private ufps.GUI.TableroDeJuego tableroDeJuego1;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaVal;
    private javax.swing.JTextField txtNomArchivo;
    private javax.swing.JTextField txtNombreVal;
    // End of variables declaration//GEN-END:variables

    public void cancelarPrograma() {
        
        vaciarProcesos();
        
        JOptionPane.showMessageDialog(etiImagen, "Se ha perdido la conexion a internet, el programa se cerrar y las acciones que se estan realizando seran canceladas","Advertencia",JOptionPane.ERROR_MESSAGE);
        
        System.exit(0);
        
    }

    private void vaciarProcesos() {
        
        while(!this.procesos.esVacio()){
            Thread h=this.procesos.deColar();
            
            if(h.isAlive())
                h.interrupt();
        }
    }


    



    
    
}
