import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Examen implements ActionListener{

int puntos;

Frame f1, f2, f3, f4, f5, f6, f7, f8, f9, f10;
Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
Label t, x, z, y, w, v, m, k, g, q, n, tx, tx1, tx2, tx3, tx4, tx5, tx6, tx7;
Choice a, b, c, d, rs, f;
TextField ta, ta1, ta2, ta3, ta4;
JPasswordField ta5;

public Examen(){

puntos=0;

f1=new Frame("Parte 1");
f2=new Frame("Parte 2");
f3=new Frame("Respuestas");
f4=new Frame("Menu");
f5=new Frame("Config. Maestro");
f6=new Frame("Maestros");
f7=new Frame("Opciones");
f8=new Frame("Eliminar");
f9=new Frame("Modificar");
f10=new Frame("Reporte de Calif.");


b1=new Button("Parte 2 --->");
b2=new Button("Respuestas ^^");
b3=new Button("Salir u.u");
b4=new Button("Alumnos");
b5=new Button("Maestros");
b6=new Button("Agregar");
b7=new Button("Regresar");
b8=new Button("Acceder");
b9=new Button("Cancelar");
b10=new Button("Agregar PR");
b11=new Button("Eliminar");
b12=new Button("Modificar");
b13=new Button("Reporte de calif.");



t=new Label("1.- Que es mas seguro? auto, avion o barco?");
x=new Label("2.- Que fue primero? el huevo o la gallina?");
z=new Label("3.- Haz visto caer la lluvia?");
y=new Label("1.- Circulo o Cuadrado?");
w=new Label("2.- Te caes o te levantas?");
v=new Label("3.- Frio o Caliente?");
m=new Label("Selecciona segun corresponda tu criterio");
k=new Label("1(p1)= Avion, 2(p1)= Gallina, 3(p1)= si, 1(p2)= Circulo, 2(p2)= Te levantas, 3(p2)= Caliente");
g=new Label("");
q=new Label("");
n=new Label("");
tx=new Label("Pnts Totales: " + puntos);
tx1=new Label("MENU");
tx2=new Label("Pregunta");
tx3=new Label("Respuesta");
tx4=new Label("Respuesta");
tx5=new Label("Respuesta");
tx6=new Label("Usuario");
tx7=new Label("Contraseña");


a=new Choice();
b=new Choice();
c=new Choice();
d=new Choice();
rs=new Choice();
f=new Choice();

ta=new TextField();
ta1=new TextField();
ta2=new TextField();
ta3=new TextField();
ta4=new TextField();


ta5=new JPasswordField();


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);



f1.setLayout(new GridLayout(3,2));
f2.setLayout(new FlowLayout());
f2.add(b2);
f3.setLayout(new FlowLayout());
f3.add(b3);
f4.setLayout(new FlowLayout());
f4.add(tx1);
f4.add(b4);
f4.add(b5);
f5.setLayout(new GridLayout(3,2));
f5.add(tx2);
f5.add(ta);
f5.add(tx3);
f5.add(ta1);
f5.add(tx4);
f5.add(ta2);
f5.add(tx5);
f5.add(ta3);
f5.add(b6);
f5.add(b7);
f6.setLayout(new GridLayout(3,2));
f6.add(tx6);
f6.add(ta4);
f6.add(tx7);
f6.add(ta5);
f6.add(b8);
f6.add(b9);
f7.setLayout(new FlowLayout());
f7.add(b10);
f7.add(b11);
f7.add(b12);
f7.add(b13);



f1.add(m);
f1.add(g);
f1.add(n);
f1.add(q);
f1.add(t);
f1.add(a);
a.add("Avion");
a.add("Carro");
a.add("Barco");
f1.add(x);
f1.add(b);
b.add("El Huevo");
b.add("La Gallina");
f1.add(z);
f1.add(c);
c.add("Si, claro");
c.add("Nunca");
f1.add(b1);

f2.add(y);
f2.add(d);
d.add("Circulo");
d.add("Cuadrado");
f2.add(w);
f2.add(rs);
rs.add("Te Caes");
rs.add("Te Levantas");
f2.add(v);
f2.add(f);
f.add("Frio");
f.add("Caliente");

//Agregar ta4 ta5 tx6 y tx7 a f6, crear boton para acceder

f3.add(tx);

//f1.setSize(800, 600);
f1.pack();
f4.pack(); // crear condicion para aparecer
f5.pack(); // crear condicion para aparecer
f6.pack();
f7.pack();
f4.setVisible(true);
// cambio para ventana de menu f1.setVisible(true);
//f2.setSize(400, 400);
f2.pack();
f3.setSize(400, 600);
}

public void actionPerformed(ActionEvent e){

String pass;

if(e.getActionCommand() == "Alumnos")
f1.setVisible(true);

else if(e.getActionCommand() == "Maestros")
f6.setVisible(true);

else if(e.getActionCommand() == "Acceder"){
if(ta4.getText().compareToIgnoreCase("profe") == 0){
pass= new String(ta5.getPassword());
if(pass.compareTo("Escuela12") == 0)
f7.setVisible(true);
}
 }

else if(e.getActionCommand() == "Agregar PR")
f5.setVisible(true);

else if(e.getActionCommand() == "Eliminar")
f8.setVisible(true);

else if(e.getActionCommand() == "Modificar")
f9.setVisible(true);

else if(e.getActionCommand() == "Reporte de Calif.")
f10.setVisible(true);


else if(e.getActionCommand() == "Cancelar")
f4.setVisible(true);

else if(e.getActionCommand() == "Regresar")
f7.setVisible(true);

else if(e.getActionCommand() == "Parte 2 --->")
f2.setVisible(true);

else
if(e.getSource().equals(b2)){

if(a.getSelectedItem() == "Avion")
puntos++;
if(b.getSelectedItem() == "La Gallina")
puntos++;
if(c.getSelectedItem() == "Si, claro")
puntos++;

if(d.getSelectedItem() == "Circulo")
puntos++;
if(rs.getSelectedItem() == "Te Levantas")
puntos++;
if(f.getSelectedItem() == "Caliente")
puntos++;

tx.setText(tx.getText() + puntos);
f3.setVisible(true);

}

else System.exit(0);

}

public static void main(String args[]){
Examen Exa=new Examen();
}

}


