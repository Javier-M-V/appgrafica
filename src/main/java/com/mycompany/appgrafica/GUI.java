/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appgrafica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier Moreno Vilaplana
 */
public class GUI extends javax.swing.JFrame {
    
    public GUI() {
        initComponents(); 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowMultiQueries=true","root", "1234");
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Metadatos = new javax.swing.JTabbedPane();
        pestanamenuprincipal = new javax.swing.JPanel();
        panelgestiondepemp = new javax.swing.JPanel();
        empleadosButton = new javax.swing.JButton();
        departamentosButton = new javax.swing.JButton();
        emnuprincipalMantenimiento = new javax.swing.JPanel();
        creartablas = new javax.swing.JButton();
        BorrarTablas = new javax.swing.JButton();
        InsertarDatos = new javax.swing.JButton();
        VerMetadatos = new javax.swing.JButton();
        irAEjecutarScripts = new javax.swing.JButton();
        jButtonProcedures = new javax.swing.JButton();
        gestordepartamentos = new javax.swing.JPanel();
        panelprincipalgestiondepartamentos = new javax.swing.JPanel();
        numDe = new javax.swing.JLabel();
        nomDep = new javax.swing.JLabel();
        loc = new javax.swing.JLabel();
        numDeTexfield = new javax.swing.JTextField();
        nomDeTexfield = new javax.swing.JTextField();
        locTexfield = new javax.swing.JTextField();
        borrarDepartamentosButton = new javax.swing.JButton();
        modificarDepartamentosButton = new javax.swing.JButton();
        consultarDepartamentosButton = new javax.swing.JButton();
        panelsecundariogestiondep = new javax.swing.JPanel();
        adelanteDepartamentosButton = new javax.swing.JButton();
        ultimoDepartamentosButton = new javax.swing.JButton();
        atrasDepartamentosButton = new javax.swing.JButton();
        primeroDepartamentosButton = new javax.swing.JButton();
        aceptarButtonGestionDept = new javax.swing.JButton();
        cancelarGestionDepartamentosButton = new javax.swing.JButton();
        insertarDepartamentosButton = new javax.swing.JButton();
        homeDepartamentosButton = new javax.swing.JButton();
        pestanaempleados = new javax.swing.JPanel();
        panelprincipalempleados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empNojTextField = new javax.swing.JTextField();
        apellidosjTextField = new javax.swing.JTextField();
        dirjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comisionjTextField = new javax.swing.JTextField();
        salariojTextField = new javax.swing.JTextField();
        fechajTextField = new javax.swing.JTextField();
        oficiojTextField = new javax.swing.JTextField();
        deptNoEmpleadosjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        empleadosConstultarButton = new javax.swing.JButton();
        empleadosModificarButton = new javax.swing.JButton();
        empleadosBorrarButton = new javax.swing.JButton();
        empleadosInsertarButton = new javax.swing.JButton();
        homeEmpleadosButton = new javax.swing.JButton();
        panelsecundariogestiondep1 = new javax.swing.JPanel();
        adelanteEmpleadosButton = new javax.swing.JButton();
        ultimoEmpleadosButton = new javax.swing.JButton();
        atrasEmpleadosButton = new javax.swing.JButton();
        primeroEmpleadosButton = new javax.swing.JButton();
        aceptarEmpleadosButton = new javax.swing.JButton();
        CancelarEmpleadosButton = new javax.swing.JButton();
        scripts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextareaScripts = new javax.swing.JTextArea();
        ejecutarscript = new javax.swing.JButton();
        cargarscript = new javax.swing.JButton();
        menuprincipalscripts = new javax.swing.JButton();
        jPanelMetadatos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBBDD = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        JtableInfoDeTablas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableInfoDept = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Procedures = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListprocedures = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jButtonProcedure = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Metadatos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                MetadatosComponentShown(evt);
            }
        });

        panelgestiondepemp.setBorder(javax.swing.BorderFactory.createTitledBorder("gestionempleadodepartamentos"));

        empleadosButton.setText("Ir a gestión de empleados");
        empleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosButtonActionPerformed(evt);
            }
        });

        departamentosButton.setText("Ir a gestión departamentos");
        departamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelgestiondepempLayout = new javax.swing.GroupLayout(panelgestiondepemp);
        panelgestiondepemp.setLayout(panelgestiondepempLayout);
        panelgestiondepempLayout.setHorizontalGroup(
            panelgestiondepempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelgestiondepempLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(panelgestiondepempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(departamentosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empleadosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        panelgestiondepempLayout.setVerticalGroup(
            panelgestiondepempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgestiondepempLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(departamentosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empleadosButton)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        creartablas.setText("Crear tablas");
        creartablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creartablasActionPerformed(evt);
            }
        });

        BorrarTablas.setText("Borrar tablas");
        BorrarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTablasActionPerformed(evt);
            }
        });

        InsertarDatos.setText("Insertar datos");
        InsertarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarDatosActionPerformed(evt);
            }
        });

        VerMetadatos.setText("Ver metadatos de la BBDD");
        VerMetadatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMetadatosActionPerformed(evt);
            }
        });

        irAEjecutarScripts.setText("Ejecutar Scripts");
        irAEjecutarScripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAEjecutarScriptsActionPerformed(evt);
            }
        });

        jButtonProcedures.setText("Ejecutar procedures");
        jButtonProcedures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProceduresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emnuprincipalMantenimientoLayout = new javax.swing.GroupLayout(emnuprincipalMantenimiento);
        emnuprincipalMantenimiento.setLayout(emnuprincipalMantenimientoLayout);
        emnuprincipalMantenimientoLayout.setHorizontalGroup(
            emnuprincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emnuprincipalMantenimientoLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(emnuprincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(irAEjecutarScripts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonProcedures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerMetadatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InsertarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorrarTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creartablas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        emnuprincipalMantenimientoLayout.setVerticalGroup(
            emnuprincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emnuprincipalMantenimientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(creartablas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrarTablas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertarDatos)
                .addGap(18, 18, 18)
                .addComponent(VerMetadatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(irAEjecutarScripts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProcedures)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout pestanamenuprincipalLayout = new javax.swing.GroupLayout(pestanamenuprincipal);
        pestanamenuprincipal.setLayout(pestanamenuprincipalLayout);
        pestanamenuprincipalLayout.setHorizontalGroup(
            pestanamenuprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanamenuprincipalLayout.createSequentialGroup()
                .addComponent(panelgestiondepemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emnuprincipalMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pestanamenuprincipalLayout.setVerticalGroup(
            pestanamenuprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanamenuprincipalLayout.createSequentialGroup()
                .addGroup(pestanamenuprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelgestiondepemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pestanamenuprincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emnuprincipalMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelgestiondepemp.getAccessibleContext().setAccessibleName("Gestionempleadosdepartamentos");
        panelgestiondepemp.getAccessibleContext().setAccessibleDescription("");

        Metadatos.addTab("Menú principal", pestanamenuprincipal);

        gestordepartamentos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                gestordepartamentosComponentShown(evt);
            }
        });

        panelprincipalgestiondepartamentos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelprincipalgestiondepartamentosComponentShown(evt);
            }
        });

        numDe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numDe.setText("nº Departamento");

        nomDep.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nomDep.setText("Nombre departamento");

        loc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loc.setText("Localización");

        numDeTexfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDeTexfieldActionPerformed(evt);
            }
        });

        borrarDepartamentosButton.setText("Borrar");
        borrarDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarDepartamentosButtonActionPerformed(evt);
            }
        });

        modificarDepartamentosButton.setText("Modificar");
        modificarDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDepartamentosButtonActionPerformed(evt);
            }
        });

        consultarDepartamentosButton.setText("Consultar");
        consultarDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarDepartamentosButtonActionPerformed(evt);
            }
        });

        adelanteDepartamentosButton.setText("▶");
        adelanteDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteDepartamentosButtonActionPerformed(evt);
            }
        });

        ultimoDepartamentosButton.setText("▷");
        ultimoDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoDepartamentosButtonActionPerformed(evt);
            }
        });

        atrasDepartamentosButton.setText("◀");
        atrasDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasDepartamentosButtonActionPerformed(evt);
            }
        });

        primeroDepartamentosButton.setText("◁");
        primeroDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroDepartamentosButtonActionPerformed(evt);
            }
        });

        aceptarButtonGestionDept.setText("Aceptar");
        aceptarButtonGestionDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonGestionDeptActionPerformed(evt);
            }
        });

        cancelarGestionDepartamentosButton.setText("Cancelar");
        cancelarGestionDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarGestionDepartamentosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelsecundariogestiondepLayout = new javax.swing.GroupLayout(panelsecundariogestiondep);
        panelsecundariogestiondep.setLayout(panelsecundariogestiondepLayout);
        panelsecundariogestiondepLayout.setHorizontalGroup(
            panelsecundariogestiondepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsecundariogestiondepLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(panelsecundariogestiondepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelsecundariogestiondepLayout.createSequentialGroup()
                        .addComponent(primeroDepartamentosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasDepartamentosButton))
                    .addComponent(aceptarButtonGestionDept))
                .addGap(18, 18, 18)
                .addGroup(panelsecundariogestiondepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsecundariogestiondepLayout.createSequentialGroup()
                        .addComponent(adelanteDepartamentosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ultimoDepartamentosButton))
                    .addComponent(cancelarGestionDepartamentosButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(167, 167, 167))
        );
        panelsecundariogestiondepLayout.setVerticalGroup(
            panelsecundariogestiondepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsecundariogestiondepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelsecundariogestiondepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ultimoDepartamentosButton)
                    .addComponent(atrasDepartamentosButton)
                    .addComponent(primeroDepartamentosButton)
                    .addComponent(adelanteDepartamentosButton))
                .addGap(51, 51, 51)
                .addGroup(panelsecundariogestiondepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarButtonGestionDept)
                    .addComponent(cancelarGestionDepartamentosButton))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        insertarDepartamentosButton.setText("Insertar");
        insertarDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarDepartamentosButtonActionPerformed(evt);
            }
        });

        homeDepartamentosButton.setText("Home");
        homeDepartamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeDepartamentosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelprincipalgestiondepartamentosLayout = new javax.swing.GroupLayout(panelprincipalgestiondepartamentos);
        panelprincipalgestiondepartamentos.setLayout(panelprincipalgestiondepartamentosLayout);
        panelprincipalgestiondepartamentosLayout.setHorizontalGroup(
            panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalgestiondepartamentosLayout.createSequentialGroup()
                .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalgestiondepartamentosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numDeTexfield, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(nomDeTexfield)
                            .addComponent(locTexfield))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(panelsecundariogestiondep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(insertarDepartamentosButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarDepartamentosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarDepartamentosButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrarDepartamentosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeDepartamentosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelprincipalgestiondepartamentosLayout.setVerticalGroup(
            panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalgestiondepartamentosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDe)
                    .addComponent(numDeTexfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarDepartamentosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomDep)
                    .addComponent(nomDeTexfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarDepartamentosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc)
                    .addComponent(locTexfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarDepartamentosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelprincipalgestiondepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelsecundariogestiondep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelprincipalgestiondepartamentosLayout.createSequentialGroup()
                        .addComponent(insertarDepartamentosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(homeDepartamentosButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout gestordepartamentosLayout = new javax.swing.GroupLayout(gestordepartamentos);
        gestordepartamentos.setLayout(gestordepartamentosLayout);
        gestordepartamentosLayout.setHorizontalGroup(
            gestordepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipalgestiondepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gestordepartamentosLayout.setVerticalGroup(
            gestordepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipalgestiondepartamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Metadatos.addTab("Gestión departamentos", gestordepartamentos);

        pestanaempleados.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pestanaempleadosComponentShown(evt);
            }
        });

        panelprincipalempleados.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelprincipalempleadosComponentShown(evt);
            }
        });

        jLabel1.setText("emp_no:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Dir:");

        jLabel4.setText("Fecha_alt:");

        jLabel5.setText("Salario:");

        jLabel6.setText("Comisión:");

        salariojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salariojTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Dept_no:");

        jLabel8.setText("Oficio:");

        empleadosConstultarButton.setText("Consultar");
        empleadosConstultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosConstultarButtonActionPerformed(evt);
            }
        });

        empleadosModificarButton.setText("Modificar");
        empleadosModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosModificarButtonActionPerformed(evt);
            }
        });

        empleadosBorrarButton.setText("Borrar");
        empleadosBorrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosBorrarButtonActionPerformed(evt);
            }
        });

        empleadosInsertarButton.setText("Insertar");
        empleadosInsertarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosInsertarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empleadosConstultarButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(empleadosInsertarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empleadosBorrarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empleadosModificarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empleadosConstultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleadosModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleadosBorrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empleadosInsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        homeEmpleadosButton.setText("Home");
        homeEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeEmpleadosButtonActionPerformed(evt);
            }
        });

        adelanteEmpleadosButton.setText("▶");
        adelanteEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteEmpleadosButtonActionPerformed(evt);
            }
        });

        ultimoEmpleadosButton.setText("▷");
        ultimoEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoEmpleadosButtonActionPerformed(evt);
            }
        });

        atrasEmpleadosButton.setText("◀");
        atrasEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasEmpleadosButtonActionPerformed(evt);
            }
        });

        primeroEmpleadosButton.setText("◁");
        primeroEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroEmpleadosButtonActionPerformed(evt);
            }
        });

        aceptarEmpleadosButton.setText("Aceptar");
        aceptarEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarEmpleadosButtonActionPerformed(evt);
            }
        });

        CancelarEmpleadosButton.setText("Cancelar");
        CancelarEmpleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarEmpleadosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelsecundariogestiondep1Layout = new javax.swing.GroupLayout(panelsecundariogestiondep1);
        panelsecundariogestiondep1.setLayout(panelsecundariogestiondep1Layout);
        panelsecundariogestiondep1Layout.setHorizontalGroup(
            panelsecundariogestiondep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsecundariogestiondep1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(panelsecundariogestiondep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelsecundariogestiondep1Layout.createSequentialGroup()
                        .addComponent(primeroEmpleadosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasEmpleadosButton))
                    .addComponent(aceptarEmpleadosButton))
                .addGap(18, 18, 18)
                .addGroup(panelsecundariogestiondep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsecundariogestiondep1Layout.createSequentialGroup()
                        .addComponent(adelanteEmpleadosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ultimoEmpleadosButton))
                    .addComponent(CancelarEmpleadosButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(167, 167, 167))
        );
        panelsecundariogestiondep1Layout.setVerticalGroup(
            panelsecundariogestiondep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsecundariogestiondep1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelsecundariogestiondep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ultimoEmpleadosButton)
                    .addComponent(atrasEmpleadosButton)
                    .addComponent(primeroEmpleadosButton)
                    .addComponent(adelanteEmpleadosButton))
                .addGap(51, 51, 51)
                .addGroup(panelsecundariogestiondep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarEmpleadosButton)
                    .addComponent(CancelarEmpleadosButton))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelprincipalempleadosLayout = new javax.swing.GroupLayout(panelprincipalempleados);
        panelprincipalempleados.setLayout(panelprincipalempleadosLayout);
        panelprincipalempleadosLayout.setHorizontalGroup(
            panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                        .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(35, 35, 35)
                        .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oficiojTextField)
                            .addComponent(dirjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(fechajTextField))
                            .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comisionjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deptNoEmpleadosjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelsecundariogestiondep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeEmpleadosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelprincipalempleadosLayout.setVerticalGroup(
            panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                        .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(fechajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(salariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(comisionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(empNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(apellidosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(dirjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(oficiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(deptNoEmpleadosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprincipalempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelsecundariogestiondep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelprincipalempleadosLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(homeEmpleadosButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pestanaempleadosLayout = new javax.swing.GroupLayout(pestanaempleados);
        pestanaempleados.setLayout(pestanaempleadosLayout);
        pestanaempleadosLayout.setHorizontalGroup(
            pestanaempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipalempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pestanaempleadosLayout.setVerticalGroup(
            pestanaempleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipalempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Metadatos.addTab("Gestión empleados", pestanaempleados);

        scripts.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                scriptsComponentShown(evt);
            }
        });

        TextareaScripts.setColumns(20);
        TextareaScripts.setRows(5);
        jScrollPane1.setViewportView(TextareaScripts);

        ejecutarscript.setText("Ejecutar script");
        ejecutarscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarscriptActionPerformed(evt);
            }
        });

        cargarscript.setText("Cargar script");
        cargarscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarscriptActionPerformed(evt);
            }
        });

        menuprincipalscripts.setText("Menú principal");
        menuprincipalscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuprincipalscriptsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scriptsLayout = new javax.swing.GroupLayout(scripts);
        scripts.setLayout(scriptsLayout);
        scriptsLayout.setHorizontalGroup(
            scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scriptsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scriptsLayout.createSequentialGroup()
                        .addGap(0, 253, Short.MAX_VALUE)
                        .addComponent(ejecutarscript)
                        .addGap(18, 18, 18)
                        .addComponent(cargarscript)
                        .addGap(140, 140, 140)
                        .addComponent(menuprincipalscripts))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        scriptsLayout.setVerticalGroup(
            scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scriptsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ejecutarscript)
                    .addComponent(cargarscript)
                    .addComponent(menuprincipalscripts))
                .addGap(14, 14, 14))
        );

        Metadatos.addTab("Scripts", scripts);

        jPanelMetadatos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelMetadatosComponentShown(evt);
            }
        });

        jTableBBDD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Driver", "URL", "Usuario"
            }
        ));
        jScrollPane3.setViewportView(jTableBBDD);

        JtableInfoDeTablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Catálogo", "Esquema", "Tabla", "Tipo"
            }
        ));
        jScrollPane4.setViewportView(JtableInfoDeTablas);

        jTableInfoDept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Tamaño", "¿Null?"
            }
        ));
        jScrollPane5.setViewportView(jTableInfoDept);

        jLabel9.setText("Nombre de la BBDD");

        jLabel10.setText("Info de las tablas");

        jLabel11.setText("Info de departamentos");

        javax.swing.GroupLayout jPanelMetadatosLayout = new javax.swing.GroupLayout(jPanelMetadatos);
        jPanelMetadatos.setLayout(jPanelMetadatosLayout);
        jPanelMetadatosLayout.setHorizontalGroup(
            jPanelMetadatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMetadatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMetadatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMetadatosLayout.createSequentialGroup()
                        .addGroup(jPanelMetadatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanelMetadatosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelMetadatosLayout.createSequentialGroup()
                        .addGroup(jPanelMetadatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelMetadatosLayout.setVerticalGroup(
            jPanelMetadatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMetadatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Metadatos.addTab("Metadatos", jPanelMetadatos);

        Procedures.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ProceduresComponentShown(evt);
            }
        });

        jListprocedures.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListprocedures);

        jLabel12.setText("Procedures disponibles");

        jButtonProcedure.setText("Ejecutar procedure");
        jButtonProcedure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcedureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProceduresLayout = new javax.swing.GroupLayout(Procedures);
        Procedures.setLayout(ProceduresLayout);
        ProceduresLayout.setHorizontalGroup(
            ProceduresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProceduresLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(ProceduresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProceduresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProcedure)
                .addGap(278, 278, 278))
        );
        ProceduresLayout.setVerticalGroup(
            ProceduresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProceduresLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProcedure)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        Metadatos.addTab("Procedures", Procedures);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Metadatos, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Metadatos, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentosButtonActionPerformed

        Metadatos.setSelectedComponent(gestordepartamentos);
    }//GEN-LAST:event_departamentosButtonActionPerformed

    private void empleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosButtonActionPerformed
        Metadatos.setSelectedComponent(pestanaempleados);
    }//GEN-LAST:event_empleadosButtonActionPerformed

    private void consultarDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarDepartamentosButtonActionPerformed
        
        opcion=1;
        modificarDepartamentosButton.setEnabled(false);
        borrarDepartamentosButton.setEnabled(false);
        insertarDepartamentosButton.setEnabled(false);
        numDeTexfield.setEnabled(true);
        nomDeTexfield.setEnabled(true);
        locTexfield.setEnabled(true);
        numDeTexfield.setEditable(true);
        nomDeTexfield.setEnabled(false);
        locTexfield.setEnabled(false);
    }//GEN-LAST:event_consultarDepartamentosButtonActionPerformed

    private void adelanteDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteDepartamentosButtonActionPerformed
     
        try {
            if(result.next()){
                numDeTexfield.setText(result.getString("dept_no"));
                nomDeTexfield.setText(result.getString("dnombre"));
                locTexfield.setText(result.getString("loc"));
                atrasDepartamentosButton.setEnabled(true);
                ultimoDepartamentosButton.setEnabled(true);
                primeroDepartamentosButton.setEnabled(true);
            }
            else{
                adelanteDepartamentosButton.setEnabled(false);
                ultimoDepartamentosButton.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adelanteDepartamentosButtonActionPerformed

    private void atrasDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasDepartamentosButtonActionPerformed
         try {
                if(result.previous()){
                    numDeTexfield.setText(result.getString("dept_no"));
                    nomDeTexfield.setText(result.getString("dnombre"));    
                    locTexfield.setText(result.getString("loc"));
                }
                else{
                    primeroDepartamentosButton.setEnabled(false);
                    atrasDepartamentosButton.setEnabled(false);
                    adelanteDepartamentosButton.setEnabled(true);
                    ultimoDepartamentosButton.setEnabled(true);
                }
            } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atrasDepartamentosButtonActionPerformed

    private void ultimoDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoDepartamentosButtonActionPerformed
        try {
            if(result.last()){
                numDeTexfield.setText(result.getString("dept_no"));
                nomDeTexfield.setText(result.getString("dnombre"));    
                locTexfield.setText(result.getString("loc"));
                adelanteDepartamentosButton.setEnabled(false);
                ultimoDepartamentosButton.setEnabled(false);
                primeroDepartamentosButton.setEnabled(true);
                atrasDepartamentosButton.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimoDepartamentosButtonActionPerformed

    private void adelanteEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteEmpleadosButtonActionPerformed
        try {
            if(result.next()){
                setAlltext(result);
                adelanteEmpleadosButton.setEnabled(true);
                ultimoEmpleadosButton.setEnabled(true);
                primeroEmpleadosButton.setEnabled(true);
                atrasEmpleadosButton.setEnabled(true); 
            } 
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_adelanteEmpleadosButtonActionPerformed

    private void ultimoEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoEmpleadosButtonActionPerformed
        try {
            if(result.last()){
                setAlltext(result);
                adelanteEmpleadosButton.setEnabled(false);
                ultimoEmpleadosButton.setEnabled(false);
                primeroEmpleadosButton.setEnabled(true);
                atrasEmpleadosButton.setEnabled(true);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimoEmpleadosButtonActionPerformed

    private void atrasEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasEmpleadosButtonActionPerformed
        try {
            if(result.previous()){
                setAlltext(result);
                adelanteEmpleadosButton.setEnabled(true);
                atrasEmpleadosButton.setEnabled(true);
                primeroEmpleadosButton.setEnabled(true);
                atrasEmpleadosButton.setEnabled(true);
                
            }
            else{
                    adelanteDepartamentosButton.setEnabled(false);
                    atrasDepartamentosButton.setEnabled(false);
                    adelanteDepartamentosButton.setEnabled(true);
                    ultimoDepartamentosButton.setEnabled(true);
                }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atrasEmpleadosButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void numDeTexfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDeTexfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDeTexfieldActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
    }//GEN-LAST:event_formComponentShown
    //Lógica del botón aceptar
    private void aceptarEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarEmpleadosButtonActionPerformed
        
        switch(opcion){
        
            case 0: //caso base o de respuesta a cancelar
                    consultarDepartamentosButton.setEnabled(true);
                    modificarDepartamentosButton.setEnabled(false);
                    borrarDepartamentosButton.setEnabled(false);
                    insertarDepartamentosButton.setEnabled(true);
                    setVoidText();
                    desactivarEmpleadosFlechas();
                    empleadosConstultarButton.setEnabled(true);
                    empleadosInsertarButton.setEnabled(true);
                    empleadosModificarButton.setEnabled(false);
                    empleadosBorrarButton.setEnabled(false); 
                break;
            
            case 1://consulta
         
                try {
                    String consulta="SELECT * FROM empleados WHERE emp_no="+Integer.parseInt(empNojTextField.getText());
                    Statement stat = conexion.createStatement();
                    result = stat.executeQuery(consulta);
                    result.first();
                    int numde= result.getInt("emp_no");
                    String apell = result.getString("apellido");
                    String ofi = result.getString("oficio");
                    int dir=result.getInt("dir");
                    java.sql.Date hoy = result.getDate("fecha_alt");
                    float sal = result.getFloat("salario");
                    float comi = result.getFloat("comision");
                    int depno = result.getInt("dept_no");
                    setEnableAllTextFieldsEmpleados();
                    empNojTextField.setText(Integer.toString(numde));
                    apellidosjTextField.setText(apell);
                    oficiojTextField.setText(ofi);
                    dirjTextField.setText(Integer.toString(dir));
                    fechajTextField.setText(hoy.toString());
                    salariojTextField.setText(Float.toString(sal));
                    comisionjTextField.setText(Float.toString(comi));
                    deptNoEmpleadosjTextField.setText(Integer.toString(depno));
                    aceptarEmpleadosButton.setEnabled(false);
                    empleadosConstultarButton.setEnabled(false);
                    empleadosBorrarButton.setEnabled(true);
                    empleadosModificarButton.setEnabled(true);
                    empleadosInsertarButton.setEnabled(false);
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex+" Empleado no existente");
                }
                break;
                
            case 2: //modificación
                
                    try {
                    PreparedStatement statement = null;
                    String sql = String.format("UPDATE empleados "
                            + "SET apellido=?, oficio= ?, dir=?, salario=?,comision = ? "
                            + "WHERE emp_no="+Integer.parseInt(empNojTextField.getText()));
                    statement = conexion.prepareStatement(sql);
                    statement.setString(1,apellidosjTextField.getText());
                    statement.setString(2, oficiojTextField.getText());
                    statement.setInt(3, Integer.parseInt(dirjTextField.getText()));
                    statement.setDouble(4,Float.parseFloat(salariojTextField.getText()));
                    statement.setDouble(5, Float.parseFloat(comisionjTextField.getText()));
                    statement.executeUpdate();
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }   
                opcion=0;
                setVoidText();
                break;
                
            case 3: //inserción
              
                 try {
                    java.util.Date f = new java.util.Date();
                    java.sql.Date fsql= new Date(f.getTime());
                    PreparedStatement statement = null;
                    String sql = String.format("INSERT INTO empleados("
                            + "emp_no,apellido,oficio, dir,fecha_alt, salario,comision, dept_no)"
                            + "VALUES(?,?,?,?,?,?,?,?)");
                    statement = conexion.prepareStatement(sql);
                    statement.setInt(1,Integer.parseInt(empNojTextField.getText()));
                    statement.setString(2,apellidosjTextField.getText());
                    statement.setString(3, oficiojTextField.getText());
                    statement.setInt(4, Integer.parseInt(dirjTextField.getText()));
                    statement.setDate(5, fsql);
                    statement.setDouble(6,Float.parseFloat(salariojTextField.getText()));
                    statement.setDouble(7, Float.parseFloat(comisionjTextField.getText()));
                    statement.setInt(8, Integer.parseInt(deptNoEmpleadosjTextField.getText()));
                    statement.executeUpdate();
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }   
                opcion=0;
                setVoidText();
                break;
     
            case 4: //borrado
                desactivarflechas();
                setNoEditableEmpleados();
                String delete = "DELETE FROM empleados WHERE emp_no ="+Integer.parseInt(empNojTextField.getText());
                try {
                    Statement statement = conexion.createStatement();
                     statement.executeLargeUpdate(delete);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
                opcion=0;
                setVoidText();
                break;
                         
            default:
                break;
        }
    }//GEN-LAST:event_aceptarEmpleadosButtonActionPerformed

    private void aceptarButtonGestionDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonGestionDeptActionPerformed
        Statement stat;
        //TODO:meter ventanitas de aviso
        
        switch(opcion){
        
            case 0://caso default
                consultarDepartamentosButton.setEnabled(true);
                modificarDepartamentosButton.setEnabled(false);
                borrarDepartamentosButton.setEnabled(false);
                insertarDepartamentosButton.setEnabled(true);
                numDeTexfield.setText("");
                nomDeTexfield.setText("");
                locTexfield.setText("");
                numDeTexfield.setEnabled(false);
                nomDeTexfield.setEnabled(false);
                locTexfield.setEnabled(false);
                adelanteDepartamentosButton.setEnabled(false);
                atrasDepartamentosButton.setEnabled(false);
                primeroDepartamentosButton.setEnabled(false);
                ultimoDepartamentosButton.setEnabled(false);
                break;
            
            case 1: //consultar
                
                String getext = numDeTexfield.getText();
                if(!getext.isEmpty()){
                    try {
                        stat = conexion.createStatement();
                        String sql = "Select * FROM departamentos WHERE dept_no ="+Integer.parseInt(numDeTexfield.getText());
                        result = stat.executeQuery(sql);
                        result.first();
                        numDeTexfield.setText(Integer.toString(result.getInt("dept_no")));
                        nomDeTexfield.setText(result.getString("dnombre"));
                        locTexfield.setText(result.getString("loc"));
      
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Algo se ha roto porque ese departamento no existe");
                    }
                }
                cancelarGestionDepartamentosButton.setEnabled(true);
                consultarDepartamentosButton.setEnabled(true);
                numDeTexfield.setEditable(false);
                nomDeTexfield.setEnabled(true);
                locTexfield.setEnabled(true);
                nomDeTexfield.setEditable(true);
                locTexfield.setEditable(true);
                modificarDepartamentosButton.setEnabled(true);
                borrarDepartamentosButton.setEnabled(true);
                primeroDepartamentosButton.setEnabled(false);
                atrasDepartamentosButton.setEnabled(false);
                adelanteDepartamentosButton.setEnabled(false);
                ultimoDepartamentosButton.setEnabled(false);
                break;
                
            case 2: //modificación
                try {
                      
                      desactivarflechas();
                      String nombreactualizar = nomDeTexfield.getText();
                      String nombrelocactualizar = locTexfield.getText();

                      String sql="UPDATE departamentos SET dnombre='"+nombreactualizar
                              +"',loc='"+nombrelocactualizar
                              +"'WHERE dept_no="+numDeTexfield.getText();

                      stat = conexion.createStatement();
                      stat.executeLargeUpdate(sql);
                  } catch (SQLException ex) {
                      JOptionPane.showMessageDialog(this, ex);
                  }
                opcion=0;
                break;
                
            case 3: //inserción
                  try {
                    String update = "INSERT INTO departamentos(dept_no,dnombre,loc)VALUES"
                            + "("+Integer.parseInt(numDeTexfield.getText())
                            +",'"+nomDeTexfield.getText()
                            +"','"+locTexfield.getText()+"')";
                    Statement statement = conexion.createStatement();
                    statement.executeLargeUpdate(update);
                } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(this, ex);
                }
                opcion=0;
                break;
      
            case 4: //borrado
                desactivarflechas();
                String delete = "DELETE FROM departamentos WHERE dept_no ="+Integer.parseInt(numDeTexfield.getText());
                try {
                    Statement statement = conexion.createStatement();
                     statement.executeLargeUpdate(delete);
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(this, "Algo se ha roto: "+ex);
                }
                opcion=0;
                break;
                
            default:
                break;
        } 
    }//GEN-LAST:event_aceptarButtonGestionDeptActionPerformed

    private void homeDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeDepartamentosButtonActionPerformed
         Metadatos.setSelectedComponent(pestanamenuprincipal);
    }//GEN-LAST:event_homeDepartamentosButtonActionPerformed

    private void homeEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeEmpleadosButtonActionPerformed
        Metadatos.setSelectedComponent(pestanamenuprincipal);
    }//GEN-LAST:event_homeEmpleadosButtonActionPerformed

    private void primeroDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroDepartamentosButtonActionPerformed
        
        try {
            if(result.first()){
                numDeTexfield.setText(result.getString("dept_no"));
                nomDeTexfield.setText(result.getString("dnombre"));    
                locTexfield.setText(result.getString("loc"));
                adelanteDepartamentosButton.setEnabled(true);
                ultimoDepartamentosButton.setEnabled(true);
                primeroDepartamentosButton.setEnabled(false);
                atrasDepartamentosButton.setEnabled(false);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_primeroDepartamentosButtonActionPerformed

    private void salariojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salariojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salariojTextFieldActionPerformed

    private void primeroEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroEmpleadosButtonActionPerformed
        try {
            if(result.first()){
                setAlltext(result);
                adelanteEmpleadosButton.setEnabled(true);
                ultimoEmpleadosButton.setEnabled(true);
                primeroEmpleadosButton.setEnabled(false);
                atrasEmpleadosButton.setEnabled(false);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
               
    }//GEN-LAST:event_primeroEmpleadosButtonActionPerformed

    private void empleadosConstultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosConstultarButtonActionPerformed
        opcion=1;
        setDisableAllTextFieldsEmpleados();
        empNojTextField.setEditable(true);
        empleadosModificarButton.setEnabled(false);
        empleadosInsertarButton.setEnabled(false);
        aceptarEmpleadosButton.setEnabled(true);
    }//GEN-LAST:event_empleadosConstultarButtonActionPerformed

    private void empleadosModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosModificarButtonActionPerformed
        opcion=2;
        aceptarEmpleadosButton.setEnabled(true);
        empleadosBorrarButton.setEnabled(false);
        setEditableEmpleados();
        fechajTextField.setEditable(false);
        empNojTextField.setEditable(false);
    }//GEN-LAST:event_empleadosModificarButtonActionPerformed

    private void empleadosBorrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosBorrarButtonActionPerformed
        opcion=4;
        aceptarEmpleadosButton.setEnabled(true);
        empleadosModificarButton.setEnabled(false);
        
    }//GEN-LAST:event_empleadosBorrarButtonActionPerformed

    private void empleadosInsertarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosInsertarButtonActionPerformed
       opcion=3;
       empleadosConstultarButton.setEnabled(false);
       setEditableEmpleados();
       fechajTextField.setEnabled(false);
        
        
    }//GEN-LAST:event_empleadosInsertarButtonActionPerformed

    private void CancelarEmpleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarEmpleadosButtonActionPerformed
        setVoidText();
        setEnableAllTextFieldsEmpleados();
        desactivarEmpleadosFlechas();
        empleadosConstultarButton.setEnabled(true);
        empleadosInsertarButton.setEnabled(true);
        empleadosModificarButton.setEnabled(false);
        empleadosBorrarButton.setEnabled(false);
    }//GEN-LAST:event_CancelarEmpleadosButtonActionPerformed

    private void cancelarGestionDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarGestionDepartamentosButtonActionPerformed

        numDeTexfield.setText("");
        nomDeTexfield.setText("");    
        locTexfield.setText("");
        modificarDepartamentosButton.setEnabled(false);
        consultarDepartamentosButton.setEnabled(true);
        borrarDepartamentosButton.setEnabled(false);
        insertarDepartamentosButton.setEnabled(true);
        numDeTexfield.setEnabled(true);
        nomDeTexfield.setEnabled(true);
        locTexfield.setEnabled(true);
        primeroDepartamentosButton.setEnabled(false);
        ultimoDepartamentosButton.setEnabled(false);
        atrasDepartamentosButton.setEnabled(false);
        adelanteDepartamentosButton.setEnabled(false);
    
    }//GEN-LAST:event_cancelarGestionDepartamentosButtonActionPerformed

    private void modificarDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDepartamentosButtonActionPerformed
        opcion=2;
        consultarDepartamentosButton.setEnabled(false);
        borrarDepartamentosButton.setEnabled(false);
             
    }//GEN-LAST:event_modificarDepartamentosButtonActionPerformed

    private void insertarDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarDepartamentosButtonActionPerformed
        opcion=3;
        consultarDepartamentosButton.setEnabled(false);
        numDeTexfield.setEnabled(true);
        locTexfield.setEnabled(true);
        nomDeTexfield.setEnabled(true);
        numDeTexfield.setEditable(true);
        locTexfield.setEditable(true);
        nomDeTexfield.setEditable(true);
    }//GEN-LAST:event_insertarDepartamentosButtonActionPerformed

    private void borrarDepartamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarDepartamentosButtonActionPerformed
        opcion=4;
        nomDeTexfield.setEnabled(false);
        numDeTexfield.setEditable(false);
        locTexfield.setEditable(false);
        nomDeTexfield.setEditable(false);
        consultarDepartamentosButton.setEnabled(false);
        modificarDepartamentosButton.setEnabled(false);
        insertarDepartamentosButton.setEnabled(false);
    }//GEN-LAST:event_borrarDepartamentosButtonActionPerformed

    private void panelprincipalempleadosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelprincipalempleadosComponentShown
        Statement stat;
        try {
            stat = conexion.createStatement();
            String sql = "Select * FROM empleados";
            result = stat.executeQuery(sql);
            result.first();
            setAlltext( result);
            empNojTextField.setText(result.getString("emp_no"));
            apellidosjTextField.setText(result.getString("apellido"));
            dirjTextField.setText(result.getString("oficio"));
            oficiojTextField.setText(result.getString("dir"));
            fechajTextField.setText(result.getString("fecha_alt"));
            salariojTextField.setText(result.getString("salario"));
            comisionjTextField.setText(result.getString("comision"));
            deptNoEmpleadosjTextField.setText(result.getString("dept_no"));  
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
        aceptarButtonGestionDept.setEnabled(true);
        cancelarGestionDepartamentosButton.setEnabled(true);
        consultarDepartamentosButton.setEnabled(false);
        modificarDepartamentosButton.setEnabled(false);
        borrarDepartamentosButton.setEnabled(false);
        insertarDepartamentosButton.setEnabled(false);
        homeDepartamentosButton.setEnabled(true);
        numDeTexfield.setEditable(false);
        nomDeTexfield.setEditable(false);
        locTexfield.setEditable(false);
        
        try {
            if(result.isFirst()){
                primeroEmpleadosButton.setEnabled(false);
                atrasEmpleadosButton.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_panelprincipalempleadosComponentShown
    //Consulta de procedures e inserción en el JList
    private void MetadatosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MetadatosComponentShown
          Statement stat=null;
       
         ResultSet procedures;
        try {
            procedures = datametadata.getProcedures("empresa", "empresa", "%");
           
            DefaultListModel<String> procedurenames = new DefaultListModel<String>();
            int a=0;
            while (procedures.next()){
                String nombre = procedures.getString("PROCEDURE_NAME");
                procedurenames.add(a, nombre);
                a++;  
            }
            jListprocedures.setModel(procedurenames);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }      
    }//GEN-LAST:event_MetadatosComponentShown

    private void BorrarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTablasActionPerformed
        try {
            String borrado = "DROP TABLE IF EXISTS notas;\n" +
                    "DROP TABLE IF EXISTS alumnos;\n" +
                    "DROP TABLE IF EXISTS asignaturas;\n";
            
            Statement stard = conexion.createStatement();
            stard.execute(borrado);
            JOptionPane.showMessageDialog(this, "boradas");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No puedes borrar algo que no existe: "+ex);
        }
    }//GEN-LAST:event_BorrarTablasActionPerformed
    //
    private void creartablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creartablasActionPerformed
        try {
            String creacion = "CREATE TABLE IF NOT EXISTS alumnos(\n" +
                    "dni VARCHAR(10) NOT NULL PRIMARY KEY,\n" +
                    "apenom VARCHAR(30),\n" +
                    "direc VARCHAR(30),\n" +
                    "pobla VARCHAR(15),\n" +
                    "telef VARCHAR(10)\n" +
                    ");\n" +
                    "\n" +
                    "CREATE TABLE IF NOT EXISTS asignaturas(\n" +
                    "cod INT PRIMARY KEY,\n" +
                    "nombre VARCHAR(25)\n" +
                    ");\n" +
                    "\n" +
                    "CREATE TABLE IF NOT EXISTS notas(\n" +
                    "dni VARCHAR(10) NOT NULL,\n" +
                    "cod INT NOT NULL,\n" +
                    "nota INT,\n" +
                    "PRIMARY KEY (dni,cod)\n" +
                    ");\n" +
                    "\n" +
                    "/*Creacion de las claves ajenas*/\n" +
                    "\n" +
                    "ALTER TABLE notas ADD CONSTRAINT fk_notasalumnos FOREIGN KEY (dni) REFERENCES alumnos(dni) ON UPDATE CASCADE ON DELETE RESTRICT;\n" +
                    "ALTER TABLE notas ADD CONSTRAINT fk_notasasignaturas FOREIGN KEY (cod) REFERENCES asignaturas(cod) ON UPDATE CASCADE ON DELETE RESTRICT;\n"
                    +"commit;";;
                    
            Statement stard = conexion.createStatement();
            stard.execute(creacion);
            JOptionPane.showMessageDialog(this, "Creadas");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Ya existen, amigo: "+ ex);
        }
    }//GEN-LAST:event_creartablasActionPerformed
    // 
    private void InsertarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarDatosActionPerformed
        try {
            String insercion = "INSERT IGNORE INTO asignaturas VALUES (1,'Prog. Leng. Estr.');\n" +
                    "INSERT IGNORE INTO asignaturas VALUES (2,'Sistemas Informáticos');\n" +
                    "INSERT IGNORE INTO asignaturas VALUES (3,'Análisis');\n" +
                    "INSERT IGNORE INTO asignaturas VALUES (4,'FOL');\n" +
                    "INSERT IGNORE INTO asignaturas VALUES (5,'RET');\n" +
                    "\n" +
                    "INSERT IGNORE INTO alumnos VALUES ('12344345','Alcalde García, Elena','C/ Las Matas, 24','Madrid','917766545');\n" +
                    "INSERT IGNORE INTO alumnos VALUES ('44482421','Cerrato Vela, Luis','C/ Mina 28 3-A','Madrid','9165665445');\n" +
                    "INSERT IGNORE INTO alumnos VALUES ('56882942','Díaz Fernandez, María','C/ Luis Vives, 25','Móstoles','915577545');\n" +
                    "\n" +
                    "INSERT IGNORE INTO notas VALUES ('12344345',1,6);\n" +
                    "INSERT IGNORE INTO notas VALUES ('12344345',2,5);\n" +
                    "\n" +
                    "INSERT IGNORE INTO notas VALUES ('44482421',4,6);\n" +
                    "INSERT IGNORE INTO notas VALUES ('44482421',5,8);\n" +
                    "\n" +
                    "INSERT IGNORE INTO notas VALUES ('56882942',1,8);\n" +
                    "INSERT IGNORE INTO notas VALUES ('56882942',3,7);\n" +
                    "\n" +
                    "commit;";
                    
            Statement stard = conexion.createStatement();
            stard.execute(insercion);
            JOptionPane.showMessageDialog(this, "Datos introducidos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Todavía no hay tablas, amigo: " +ex);
        }
    }//GEN-LAST:event_InsertarDatosActionPerformed
    //
    private void VerMetadatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMetadatosActionPerformed
        Metadatos.setSelectedComponent(jPanelMetadatos);
    }//GEN-LAST:event_VerMetadatosActionPerformed

    private void irAEjecutarScriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAEjecutarScriptsActionPerformed
        Metadatos.setSelectedComponent(scripts);
    }//GEN-LAST:event_irAEjecutarScriptsActionPerformed

    private void jButtonProceduresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProceduresActionPerformed
        Metadatos.setSelectedComponent(Procedures);
    }//GEN-LAST:event_jButtonProceduresActionPerformed

    private void cargarscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarscriptActionPerformed

        FileReader fr = null;
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Selecciona un fichero sql para cargar un script");
            chooser.showOpenDialog(this);
            File script = chooser.getSelectedFile();
            fr = new FileReader(script);
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
     
            StringBuilder Script= new StringBuilder();
            String saltodelinea = System.getProperty("line.separator");
            try{
                while((linea = br.readLine()) != null){
                    Script.append(linea);
                    Script.append(saltodelinea);
                }
                fr.close();
                br.close();
                }catch (IOException ex) {
                     JOptionPane.showMessageDialog(this, "Algo está roto en el fichero");
                }
            TextareaScripts.setText(Script.toString());
            ejecutarscript.setEnabled(true);
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(this, "Posiblemente eso no era un script o el script tiene errores de sintaxis.");
            }       
    }//GEN-LAST:event_cargarscriptActionPerformed

    private void menuprincipalscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuprincipalscriptsActionPerformed
        Metadatos.setSelectedComponent(pestanamenuprincipal);
    }//GEN-LAST:event_menuprincipalscriptsActionPerformed

    private void ejecutarscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarscriptActionPerformed
        try {
            Statement statem = conexion.createStatement();
            statem.executeUpdate(TextareaScripts.getText());
            JOptionPane.showMessageDialog(this, "Script cargado");
            ejecutarscript.setEnabled(false);
            TextareaScripts.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ejecutarscriptActionPerformed

    private void jButtonProcedureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcedureActionPerformed
        CallableStatement call = null;
        try {
            Statement sta = conexion.createStatement();
            switch(jListprocedures.getSelectedIndex()){
            
                case 0:
                    String callabledatos = "{CALL datos_dep (?,?,?) }";
                    call= conexion.prepareCall(callabledatos);
                    call.setInt(1,Integer.parseInt(JOptionPane.showInputDialog("departamento")));
                    call.execute();
                    String nombred=call.getString(2);
                    String localidad=call.getString(3);
                    JOptionPane.showMessageDialog(this, "nombre de departamento:"+nombred+"\n"+
                            "localidad: "+localidad);
                    break;
                        
                case 1:
                    String callablenombre = "{?=CALL nombre_dep (?) }";
                    call= conexion.prepareCall(callablenombre);
                    call.registerOutParameter(1, Types.VARCHAR);
                    call.setInt(2,Integer.parseInt(JOptionPane.showInputDialog("departamento")));
                    call.execute();
                    String nombredep=call.getString(1);
                    JOptionPane.showMessageDialog(this, nombredep);
                    break;
                    
                case 2:
                    String callablesubida = "{call subida_sal (?,?) }";
                    call= conexion.prepareCall(callablesubida);
                    call.setInt(1,Integer.parseInt(JOptionPane.showInputDialog("departamento")));
                    call.setInt(2,Integer.parseInt(JOptionPane.showInputDialog("salario")));
                    call.executeUpdate();
                    break;
    
                default: 
                    break;
            }
            JOptionPane.showMessageDialog(this, "Hecho");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jButtonProcedureActionPerformed

    private void panelprincipalgestiondepartamentosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelprincipalgestiondepartamentosComponentShown
        
    }//GEN-LAST:event_panelprincipalgestiondepartamentosComponentShown
    //consulta la info de departamentos
    private void gestordepartamentosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_gestordepartamentosComponentShown
         Statement stat;
        try {//DEPARTAMENTOS
            stat = conexion.createStatement();
            String sql = "Select * FROM departamentos";
            result = stat.executeQuery(sql);
            result.first();
            numDeTexfield.setText(result.getString("dept_no"));
            nomDeTexfield.setText(result.getString("dnombre"));
            locTexfield.setText(result.getString("loc"));
            
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        aceptarButtonGestionDept.setEnabled(true);
        cancelarGestionDepartamentosButton.setEnabled(true);
        nomDeTexfield.setEditable(false);
        locTexfield.setEditable(false);
        
        try {
            if(result.isFirst()){
                primeroDepartamentosButton.setEnabled(false);
                atrasDepartamentosButton.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }    consultarDepartamentosButton.setEnabled(false);
        modificarDepartamentosButton.setEnabled(false);
        borrarDepartamentosButton.setEnabled(false);
        insertarDepartamentosButton.setEnabled(false);
        homeDepartamentosButton.setEnabled(true);
        numDeTexfield.setEditable(false);
        nomDeTexfield.setEditable(false);
        locTexfield.setEditable(false);
        
        try {
            if(result.isFirst()){
                primeroDepartamentosButton.setEnabled(false);
                atrasDepartamentosButton.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gestordepartamentosComponentShown
    //Consulta la info de empleados 
    private void pestanaempleadosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pestanaempleadosComponentShown
        Statement stat=null; 
        try {
            stat = conexion.createStatement();
            String sql = "Select * FROM empleados";
            result = stat.executeQuery(sql);
            result.first();
            setAlltext(result);
            activarEmpleadosFlechas();
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        aceptarEmpleadosButton.setEnabled(true);
        CancelarEmpleadosButton.setEnabled(true);
        empleadosModificarButton.setEnabled(false);
        empleadosConstultarButton.setEnabled(false);
        empleadosBorrarButton.setEnabled(false);
        empleadosInsertarButton.setEnabled(false);
        insertarDepartamentosButton.setEnabled(false);
        homeDepartamentosButton.setEnabled(true);
        empNojTextField.setEditable(false);
        apellidosjTextField.setEditable(false);
        dirjTextField.setEditable(false);
        oficiojTextField.setEditable(false);
        fechajTextField.setEditable(false);
        salariojTextField.setEditable(false);
        comisionjTextField.setEditable(false);
        
        try {
            if(result.isFirst()){
                primeroEmpleadosButton.setEnabled(false);
                atrasEmpleadosButton.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_pestanaempleadosComponentShown
    //Setea el estado de los botones cuando entramos en la panalla de scripts
    private void scriptsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_scriptsComponentShown
        cargarscript.setEnabled(true);
        ejecutarscript.setEnabled(false);
        TextareaScripts.setEditable(false);
    }//GEN-LAST:event_scriptsComponentShown
    //Consulta los metadatos para cargar las tablas
    private void jPanelMetadatosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelMetadatosComponentShown
        try{ 
          datametadata= conexion.getMetaData();
          String nombre = datametadata.getDatabaseProductName();
          String driver = datametadata.getDriverName();           
          String url = datametadata.getURL();            
          String usuario = datametadata.getUserName();
          jTableBBDD.setValueAt(nombre, 0, 0);
          jTableBBDD.setValueAt(driver, 0, 1);
          jTableBBDD.setValueAt(url, 0, 2);
          jTableBBDD.setValueAt(usuario, 0, 3);

          result = datametadata.getTables("empresa", null, "%",null );
          DefaultTableModel model =(DefaultTableModel) JtableInfoDeTablas.getModel();
          for(int i=0;result.next();i++){
              model.addRow(new Object[0]);
              JtableInfoDeTablas.setValueAt(result.getString(1), i,0);
              JtableInfoDeTablas.setValueAt(result.getString(2), i,1 );
              JtableInfoDeTablas.setValueAt(result.getString(3), i,2 );
              JtableInfoDeTablas.setValueAt(result.getString(4), i,3 );
          }
          result = datametadata.getColumns(null, "empresa", "departamentos","%" );
          DefaultTableModel modelde =(DefaultTableModel) jTableInfoDept.getModel();
          for(int i=0;result.next();i++){
              modelde.addRow(new Object[0]);
              jTableInfoDept.setValueAt(result.getString(4), i,0 );
              jTableInfoDept.setValueAt(result.getString(6), i,1 );
              jTableInfoDept.setValueAt(result.getString(7), i,2 );
              jTableInfoDept.setValueAt(result.getString(18), i,3 );
          }  
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelMetadatosComponentShown
    //Consulta las procedures de la bases de datos
    private void ProceduresComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ProceduresComponentShown
        ResultSet procedures;
        try {
            datametadata = conexion.getMetaData();
            procedures = datametadata.getProcedures("empresa", "empresa", "%");
           
            DefaultListModel<String> procedurenames = new DefaultListModel<String>();
            int a=0;
            while (procedures.next()){
                String nombre = procedures.getString("PROCEDURE_NAME");
                procedurenames.add(a, nombre);
                a++;  
            }
            jListprocedures.setModel(procedurenames);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProceduresComponentShown
    //Descativa las flechas
    private void desactivarflechas (){
    
        primeroDepartamentosButton.setEnabled(false);
        atrasDepartamentosButton.setEnabled(false);
        adelanteDepartamentosButton.setEnabled(false);
        ultimoDepartamentosButton.setEnabled(false);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarTablas;
    private javax.swing.JButton CancelarEmpleadosButton;
    private javax.swing.JButton InsertarDatos;
    private javax.swing.JTable JtableInfoDeTablas;
    private javax.swing.JTabbedPane Metadatos;
    private javax.swing.JPanel Procedures;
    private javax.swing.JTextArea TextareaScripts;
    private javax.swing.JButton VerMetadatos;
    private javax.swing.JButton aceptarButtonGestionDept;
    private javax.swing.JButton aceptarEmpleadosButton;
    private javax.swing.JButton adelanteDepartamentosButton;
    private javax.swing.JButton adelanteEmpleadosButton;
    private javax.swing.JTextField apellidosjTextField;
    private javax.swing.JButton atrasDepartamentosButton;
    private javax.swing.JButton atrasEmpleadosButton;
    private javax.swing.JButton borrarDepartamentosButton;
    private javax.swing.JButton cancelarGestionDepartamentosButton;
    private javax.swing.JButton cargarscript;
    private javax.swing.JTextField comisionjTextField;
    private javax.swing.JButton consultarDepartamentosButton;
    private javax.swing.JButton creartablas;
    private javax.swing.JButton departamentosButton;
    private javax.swing.JTextField deptNoEmpleadosjTextField;
    private javax.swing.JTextField dirjTextField;
    private javax.swing.JButton ejecutarscript;
    private javax.swing.JPanel emnuprincipalMantenimiento;
    private javax.swing.JTextField empNojTextField;
    private javax.swing.JButton empleadosBorrarButton;
    private javax.swing.JButton empleadosButton;
    private javax.swing.JButton empleadosConstultarButton;
    private javax.swing.JButton empleadosInsertarButton;
    private javax.swing.JButton empleadosModificarButton;
    private javax.swing.JTextField fechajTextField;
    private javax.swing.JPanel gestordepartamentos;
    private javax.swing.JButton homeDepartamentosButton;
    private javax.swing.JButton homeEmpleadosButton;
    private javax.swing.JButton insertarDepartamentosButton;
    private javax.swing.JButton irAEjecutarScripts;
    private javax.swing.JButton jButtonProcedure;
    private javax.swing.JButton jButtonProcedures;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListprocedures;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMetadatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableBBDD;
    private javax.swing.JTable jTableInfoDept;
    private javax.swing.JLabel loc;
    private javax.swing.JTextField locTexfield;
    private javax.swing.JButton menuprincipalscripts;
    private javax.swing.JButton modificarDepartamentosButton;
    private javax.swing.JTextField nomDeTexfield;
    private javax.swing.JLabel nomDep;
    private javax.swing.JLabel numDe;
    private javax.swing.JTextField numDeTexfield;
    private javax.swing.JTextField oficiojTextField;
    private javax.swing.JPanel panelgestiondepemp;
    private javax.swing.JPanel panelprincipalempleados;
    private javax.swing.JPanel panelprincipalgestiondepartamentos;
    private javax.swing.JPanel panelsecundariogestiondep;
    private javax.swing.JPanel panelsecundariogestiondep1;
    private javax.swing.JPanel pestanaempleados;
    private javax.swing.JPanel pestanamenuprincipal;
    private javax.swing.JButton primeroDepartamentosButton;
    private javax.swing.JButton primeroEmpleadosButton;
    private javax.swing.JTextField salariojTextField;
    private javax.swing.JPanel scripts;
    private javax.swing.JButton ultimoDepartamentosButton;
    private javax.swing.JButton ultimoEmpleadosButton;
    // End of variables declaration//GEN-END:variables
    static Connection conexion =null;
    static ResultSet result = null;
    static int opcion=0;//caso base0, consultar1, modificar2, borrar3, insertar4
    static DatabaseMetaData datametadata;

    //Ajusta los textfield a partir del ResultSet
    private void setAlltext(ResultSet result) {
        try {
            empNojTextField.setText(result.getString("emp_no"));
            apellidosjTextField.setText(result.getString("apellido"));
            dirjTextField.setText(result.getString("oficio"));
            oficiojTextField.setText(result.getString("dir"));
            fechajTextField.setText(result.getString("fecha_alt"));
            salariojTextField.setText(result.getString("salario"));
            comisionjTextField.setText(result.getString("comision"));
            deptNoEmpleadosjTextField.setText(result.getString("dept_no"));
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    //vacía las cajas de texto
    private void setVoidText() {
 
        empNojTextField.setText("");
        apellidosjTextField.setText("");
        dirjTextField.setText("");
        oficiojTextField.setText("");
        fechajTextField.setText("");
        salariojTextField.setText("");
        comisionjTextField.setText("");
        deptNoEmpleadosjTextField.setText("");
    }
    //deshabilita las flechas de empleados
    private void desactivarEmpleadosFlechas() {
        
        adelanteEmpleadosButton.setEnabled(false);
        atrasEmpleadosButton.setEnabled(false);
        primeroEmpleadosButton.setEnabled(false);
        ultimoEmpleadosButton.setEnabled(false);
    }
    //habilita las flechas de empleados
    private void activarEmpleadosFlechas() {
        
        adelanteEmpleadosButton.setEnabled(true);
        atrasEmpleadosButton.setEnabled(true);
        primeroEmpleadosButton.setEnabled(true);
        ultimoEmpleadosButton.setEnabled(true);
    }
    //habilita las cajas de texto de empleados
    private void setEnableAllTextFieldsEmpleados() {
        empNojTextField.setEnabled(true);
        apellidosjTextField.setEnabled(true);
        dirjTextField.setEnabled(true);
        oficiojTextField.setEnabled(true);
        fechajTextField.setEnabled(true);
        salariojTextField.setEnabled(true);
        comisionjTextField.setEnabled(true);
        deptNoEmpleadosjTextField.setEnabled(true);
    }
    private void setDisableAllTextFieldsEmpleados() {
        empNojTextField.setEnabled(true);
        apellidosjTextField.setEnabled(false);
        dirjTextField.setEnabled(false);
        oficiojTextField.setEnabled(false);
        fechajTextField.setEnabled(false);
        salariojTextField.setEnabled(false);
        comisionjTextField.setEnabled(false);
        deptNoEmpleadosjTextField.setEnabled(false);
    }
    //setea a editable las cajas de empleados
    private void setEditableEmpleados() {
        
        empNojTextField.setEditable(true);
        apellidosjTextField.setEditable(true);
        dirjTextField.setEditable(true);
        oficiojTextField.setEditable(true);
        fechajTextField.setEditable(true);
        salariojTextField.setEditable(true);
        comisionjTextField.setEditable(true);
        deptNoEmpleadosjTextField.setEditable(true);
    }
    //Deshabilita las cajas de empleados
    private void setNoEditableEmpleados(){
        empNojTextField.setEditable(false);
        apellidosjTextField.setEditable(false);
        dirjTextField.setEditable(false);
        oficiojTextField.setEditable(false);
        fechajTextField.setEditable(false);
        salariojTextField.setEditable(false);
        comisionjTextField.setEditable(false);
        deptNoEmpleadosjTextField.setEditable(false);
    }
}
