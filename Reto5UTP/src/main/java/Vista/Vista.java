/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Compra;
import Clases.Lider;
import Clases.Proyecto;
import Controlador.CtCompra;
import Controlador.CtLider;
import Controlador.CtProyecto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aio desing
 */
public class Vista extends javax.swing.JFrame {
    
    
    CtLider ctlider;
    CtProyecto ctproyecto;
    CtCompra ctcompra;
    
    //Método para llenar el jtable de líderes con la info consultada y almacenada en el array    
    public void rellenarLideres(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        ArrayList<Object>nombreColumna = new ArrayList<>(); //array que almacena los nombres de columnas   
        ctlider = new CtLider();
        
        //Lleno la lista nombreColumnas con los nombres que necesito        
        nombreColumna.add("ID Líder");
        nombreColumna.add("Nombre");
        nombreColumna.add("Primer Apellido");
        nombreColumna.add("Ciudad Residencia");
        
        //Añado al modelo de la tabla las columnas que defini
        for(Object columna: nombreColumna){
            modelo.addColumn(columna);
        }        
        //Le paso al jtable el modelo con los datos de las columnas        
        this.tblLideres.setModel(modelo);
        
        //Creo un array para almacenar la consulta de lideres de la bd
        ArrayList<Lider> arrList = new ArrayList<>();
        arrList = ctlider.listarLideres();
                       
        //recorro el array para mandarle al modelo en las filas todo lo que hay allí
        for(Lider arr: arrList){
            Object rowData[] = {arr.getId_lider(), arr.getNombre(), arr.getPrimer_apellido(), arr.getCiudad_residencia()};
            modelo.addRow(rowData);
        }  
        
        //Le llevo a jtable "tbLideres" lo que almacene en el modelo
         tblLideres.setModel(modelo);
        
        
    }
    
    
    //Método para llenar el jtable de proyectos con la info consultada y almacenada en el array    
    public void rellenarProyectos(){
        DefaultTableModel modelop = new DefaultTableModel();
        
        ArrayList<Object>nombreColumna = new ArrayList<>(); //array que almacena los nombres de columnas   
        ctproyecto = new CtProyecto();
        
        //Lleno la lista nombreColumnas con los nombres que necesito        
        nombreColumna.add("ID Proyecto");
        nombreColumna.add("Constructora");
        nombreColumna.add("Número Habitaciones");
        nombreColumna.add("Ciudad");
        
        //Añado al modelo de la tabla las columnas que defini
        for(Object columna: nombreColumna){
            modelop.addColumn(columna);
        }        
        //Le paso al jtable el modelo con los datos de las columnas   
        this.tblProyectos.setModel(modelop);
                
        //Creo un array para almacenar la consulta de proyectos de la bd
        ArrayList<Proyecto> arrList = new ArrayList<>();
        arrList = ctproyecto.listarProyecto();
                        
        //recorro el array para mandarle al modelo en las filas todo lo que hay allí
        for(Proyecto arr: arrList){
            Object rowData[] = {arr.getId_proyecto(), arr.getConstructora(), arr.getNumero_habitaciones(), arr.getCiudad()};
            modelop.addRow(rowData);
        }  
        
        //Le llevo a jtable "tblProyectos" lo que almacene en el modelo
        tblProyectos.setModel(modelop);        
                
    }
    
    //Método para llenar el jtable de compras con la info consultada y almacenada en el array    
    public void rellenarCompras(){
        DefaultTableModel modeloc = new DefaultTableModel();
        
        ArrayList<Object>nombreColumna = new ArrayList<>(); //array que almacena los nombres de columnas   
        ctcompra = new CtCompra();
        
        //Lleno la lista nombreColumnas con los nombres que necesito        
        nombreColumna.add("ID Compra");
        nombreColumna.add("Constructora");
        nombreColumna.add("Banco Vinculado");
                
        //Añado al modelo de la tabla las columnas que defini
        for(Object columna: nombreColumna){
            modeloc.addColumn(columna);
        }        
        //Le paso al jtable el modelo con los datos de las columnas        
        this.tblCompras.setModel(modeloc);
        
        //Creo un array para almacenar la consulta de compras de la bd
        ArrayList<Compra> arrList = new ArrayList<>();
        arrList = ctcompra.listarCompra();
                       
        //recorro el array para mandarle al modelo en las filas todo lo que hay allí
        for(Compra arr: arrList){
            Object rowData[] = {arr.getId_compra(), arr.getConstructora(), arr.getBanco_vinculado()};
            modeloc.addRow(rowData);
        }  
        
        //Le llevo a jtable "tblCompras" lo que almacene en el modelo
         tblCompras.setModel(modeloc);
        
        
    }
    

    /**
     * Creates new form VistaPrincipal
     */
    public Vista() {
        initComponents();
        rellenarLideres();
        rellenarProyectos();
        rellenarCompras();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInforme1 = new javax.swing.JPanel();
        jLabelInforme1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLideres = new javax.swing.JTable();
        jPanelInforme2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        jPanelInforme3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        jLabelInforme3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reto 5 Jose Diaz / G28 UTP");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 255));

        jLabelInforme1.setBackground(new java.awt.Color(204, 204, 255));
        jLabelInforme1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelInforme1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInforme1.setText("Lideres de proyectos");

        tblLideres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLideres);

        javax.swing.GroupLayout jPanelInforme1Layout = new javax.swing.GroupLayout(jPanelInforme1);
        jPanelInforme1.setLayout(jPanelInforme1Layout);
        jPanelInforme1Layout.setHorizontalGroup(
            jPanelInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInforme1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelInforme1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInforme1Layout.setVerticalGroup(
            jPanelInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInforme1Layout.createSequentialGroup()
                .addComponent(jLabelInforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LIDERES", jPanelInforme1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Casas Campestres Zona Costera");

        tblProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProyectos);

        javax.swing.GroupLayout jPanelInforme2Layout = new javax.swing.GroupLayout(jPanelInforme2);
        jPanelInforme2.setLayout(jPanelInforme2Layout);
        jPanelInforme2Layout.setHorizontalGroup(
            jPanelInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme2Layout.createSequentialGroup()
                .addGroup(jPanelInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInforme2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInforme2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInforme2Layout.setVerticalGroup(
            jPanelInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROYECTOS", jPanelInforme2);

        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblCompras);

        jLabelInforme3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelInforme3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInforme3.setText("Compras a Homecenter");

        javax.swing.GroupLayout jPanelInforme3Layout = new javax.swing.GroupLayout(jPanelInforme3);
        jPanelInforme3.setLayout(jPanelInforme3Layout);
        jPanelInforme3Layout.setHorizontalGroup(
            jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme3Layout.createSequentialGroup()
                .addGroup(jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInforme3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInforme3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelInforme3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelInforme3Layout.setVerticalGroup(
            jPanelInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInforme3Layout.createSequentialGroup()
                .addComponent(jLabelInforme3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPRAS", jPanelInforme3);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMES MINVIVIENDA");

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\VK\\ESTUDIOS\\CICLO 2\\JAVA\\PROJECT NETBEANS\\pruebas reto5\\imagenes\\logo aio pq.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelInforme1;
    private javax.swing.JLabel jLabelInforme3;
    private javax.swing.JPanel jPanelInforme1;
    private javax.swing.JPanel jPanelInforme2;
    private javax.swing.JPanel jPanelInforme3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTable tblLideres;
    private javax.swing.JTable tblProyectos;
    // End of variables declaration//GEN-END:variables
}
