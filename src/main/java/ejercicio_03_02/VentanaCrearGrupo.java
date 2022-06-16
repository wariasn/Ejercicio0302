/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03_02;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class VentanaCrearGrupo extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> jComboBox1;
       
    public VentanaCrearGrupo(String title) throws HeadlessException {
        super(title);
        this.setSize(700,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(14,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.iniciarChecks();
        this.iniciarCombo();
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6)); 
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13)); 
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Académico: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus/Extensión: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Código de Proyecto: "));
        this.jLabelList.add(new JLabel("Asignatura: "));
        this.jLabelList.add(new JLabel("Nombre de grupo: "));
        this.jLabelList.add(new JLabel("Cupos por Grupo: "));
        this.jLabelList.add(new JLabel("Autorización calificación sobre 100: "));
        this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo: "));
        this.jLabelList.add(new JLabel("Oferta para estudiantes: "));
        this.jLabelList.add(new JLabel("Aplica Cambio de Grupo: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4)); 
        this.jPanelList.get(5).add(this.jLabelList.get(5)); 
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10)); 
        this.jPanelList.get(11).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jLabelList.get(12));
        
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField("2022 - 2022"));
        this.jTextFieldList.add(new JTextField("MATRIZ CUENCA"));
        this.jTextFieldList.add(new JTextField("EL VECINO"));
        this.jTextFieldList.add(new JTextField("PRESENCIAL"));
        this.jTextFieldList.add(new JTextField("ELECTRONICA"));
        this.jTextFieldList.add(new JTextField("ELECTRONICA [REDISEÑO]-NUEVA O REDISEÑO"));
        this.jTextFieldList.add(new JTextField("G-CA-IEA-001 PROYECTOS"));
        this.jTextFieldList.add(new JTextField("GRUPO-1"));
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(7).setColumns(30);
        this.jTextFieldList.get(8).setColumns(5);
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(5));
        this.jPanelList.get(6).add(this.jTextFieldList.get(6));
        this.jPanelList.get(7).add(this.jTextFieldList.get(7));
        this.jPanelList.get(8).add(this.jTextFieldList.get(8));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
        
        this.jPanelList.get(13).add(this.jButtonList.get(0));
        this.jPanelList.get(13).add(this.jButtonList.get(1));    
    }
    
    public void iniciarCombo(){
        this.jComboBox1=new ArrayList<>();
        this.jComboBox1.add(new JComboBox());
        this.jComboBox1.add(new JComboBox());
        this.jComboBox1.add(new JComboBox());
        
        this.jComboBox1.get(0).addItem("NO");
        this.jComboBox1.get(0).addItem("SI");
        
        this.jComboBox1.get(1).addItem("Jornadas disponibles");
        this.jComboBox1.get(1).addItem("Matutina");
        this.jComboBox1.get(1).addItem("Vespertina");
        this.jComboBox1.get(1).addItem("Nocturna");
        
        this.jComboBox1.get(2).addItem("SI");
        this.jComboBox1.get(2).addItem("NO");
        
        this.jPanelList.get(9).add(this.jComboBox1.get(0));
        this.jPanelList.get(10).add(this.jComboBox1.get(1));
        this.jPanelList.get(12).add(this.jComboBox1.get(2));
    }
    
    public void iniciarChecks(){
        this.jCheckboxList = new ArrayList<>();
        this.jCheckboxList.add(new JCheckBox("Nuevos"));
        
        this.jPanelList.get(11).add(this.jCheckboxList.get(0));
    }
}
