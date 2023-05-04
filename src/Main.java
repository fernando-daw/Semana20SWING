import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

                JFrame ventana = new JFrame();
                ventana.setBounds(0,0,1600,900);
                ventana.setTitle("Swing en JAVA");
                ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                //Elementos de la parte superior
                JLabel etiqueta = new JLabel();
                etiqueta.setText("Probando la libreria Swing en JAVA");
                etiqueta.setBounds(640,15,1600,40);

                //Menu Superior
                JMenuBar menuarriba=new JMenuBar();
                menuarriba.setBounds(0,50,1550,20);
                menuarriba.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

                //Botones menu
                JMenu archivo = new JMenu();
                archivo.setText("Archivo");
                archivo.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
                JMenu Acciones = new JMenu();
                Acciones.setText("Acciones");
                Acciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
                JMenu Ayuda = new JMenu();
                Ayuda.setText("Ayuda");
                Ayuda.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

                //Botones de la parte central
                JButton boton1 = new JButton();
                boton1.setLabel("Nueva Liga");
                boton1.setBounds(100,150,150,50);
                boton1.setBackground(Color.LIGHT_GRAY);
                boton1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

                JButton boton2 = new JButton();
                boton2.setLabel("Jugar Liga");
                boton2.setBounds(100,250,150,50);
                boton2.setBackground(Color.LIGHT_GRAY);
                boton2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));


                JButton boton3 = new JButton();
                boton3.setLabel("Siguiente Jornada");
                boton3.setBounds(100,350,150,50);
                boton3.setEnabled(false);
                boton3.setBackground(Color.LIGHT_GRAY);
                boton3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

                JButton boton4 = new JButton();
                boton4.setLabel("Simulacion Completa");
                boton4.setBounds(100,450,150,50);
                boton4.setEnabled(false);
                boton4.setBackground(Color.LIGHT_GRAY);
                boton4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

                JButton boton5 = new JButton();
                boton5.setLabel("Salir");
                boton5.setBounds(100,550,150,50);
                boton5.setBackground(Color.LIGHT_GRAY);
                boton5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

                //cerrar ventana con el ultimo boton
                boton5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame cerrar = (JFrame) SwingUtilities.getWindowAncestor(boton5);
                        cerrar.dispose();
                    }
                });

                //tabla central

                String[] columnas = {"Posicion","Nombre","Victorias","Empates","Derrotas","Puntos"};
                String[][] equipos={{"1","Alerta","4","0","0","12"},
                        {"2","Tebra","3","1","0","10"},
                        {"3","Rapido de Pontequieto","2","1","1","7"},
                        {"4","Mas Tula","1","2","1","5"},
                        {"5","Boca Juniors","0","1","3","1"},
                };

                JTable tabla =new JTable(equipos,columnas);
                tabla.setBounds(325,200,1100,350);
                JTableHeader partesuperior = tabla.getTableHeader();
                tabla.setBounds(310,150,1000,50);

                //Centrar los elementos de las tablas
                DefaultTableCellRenderer centrartabla = new DefaultTableCellRenderer();
                centrartabla.setHorizontalAlignment(JLabel.CENTER);
                //centramos los elementos de la tabla con un bucle
                for (int i=0;i<tabla.getColumnCount();i++){
                    tabla.getColumnModel().getColumn(i).setCellRenderer(centrartabla);
                }

                //Quitamos el layot por defecto
                ventana.setLayout(null);

                //Agrego todos los elementos a la ventana
                ventana.add(etiqueta);
                ventana.add(menuarriba);
                ventana.add(archivo);
                ventana.add(Acciones);
                ventana.add(Ayuda);
                ventana.add(boton1);
                ventana.add(boton2);
                ventana.add(boton3);
                ventana.add(boton4);
                ventana.add(boton5);
                ventana.add(tabla);
                ventana.add(centrartabla);

                menuarriba.add(archivo);
                menuarriba.add(Acciones);
                menuarriba.add(Ayuda);

                ventana.setResizable(false);
                ventana.setVisible(true);
            }

        }