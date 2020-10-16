package FiboS;

import  javax.swing.JFrame ;
import  javax.swing.JOptionPane ;
import  javax.swing.JPanel ;
import  javax.swing.border.EmptyBorder ;
import  javax.swing.JButton ;
import  javax.swing.JTextField ;
import  javax.swing.JLabel ;
import  java.awt.event.ActionListener ;
import  java.awt.event.ActionEvent ;
import  java.awt.event.MouseAdapter ;
import  java.awt.event.MouseEvent ;
import  javax.swing.JTextArea ;
import  javax.swing.JList ;
import  javax.swing.AbstractListModel ;

public interface FiboInterface {
	JPanel privado contentPane ;
	private  JTextField textNumeroA;
	private  JTextField textNumeroB;
	private  JTextField txtIteraciones;
	 JLabel lblIteraciones privadas ;

	/ **
	 * Iniciar la aplicacion.
	 * /
	public  static  void  main ( String [] args ) {
		Marco de interfaz =  nueva  interfaz ();
		marco . setVisible ( verdadero );

// 		EventQueue.invokeLater (new Runnable () {
// 			public void run () {
// 				prueba {
// 				} captura (Excepción e) {
// 					e.printStackTrace ();
// 				}
// 			}
// 		});
	}
int valor1 = 0 , valor2 = 0 , suma = 0 ;
String cadena = " " ;

	/ **
	 * Crea el marco.
	 * /
	 Interfaz pública () {
		setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		setBounds ( 100 , 100 , 450 , 300 );
		contentPane =  nuevo  JPanel ();
		contentPane . setBorder ( nuevo  EmptyBorder ( 5 , 5 , 5 , 5 ));
		setContentPane (contentPane);
		contentPane . setLayout ( nulo );
		
		JButton btnCalcular =  new  JButton ( " Serie Calcular " );
		btnCalcular . addMouseListener ( new  MouseAdapter () {
			@Anular
			public  void  mouseClicked ( MouseEvent  e ) {
				
				int valor1 = Entero . parseInt (textNumeroA . getText ());
				int valor2 = Entero . parseInt (textNumeroB . getText ());
				int x = 1 ;
			int 	iteraciones =  Entero . parseInt (txtIteraciones . getText ());

	         cadena = String . valueOf (valor1) + " \ n " + String . valueOf (valor2);
	         int valor3;
	        hacer {
	           valor3 = valor1 + valor2;
	           cadena = cadena + " \ n " + String . valueOf (valor3);
	          
	            valor2 = valor3;
	            valor1 = valor2;
	            x ++ ;
	        } while (x <= iteraciones);
	        JOptionPane . showMessageDialog ( nulo , cadena);
			}
		});
		btnCalcular . addActionListener ( nuevo  ActionListener () {
			 public  void  actionPerformed ( ActionEvent  e ) {
				  

			}
		});
		btnCalcular . setBounds ( 98 , 233 , 201 , 17 );
		contentPane . agregar (btnCalcular);
		
		textNumeroA =  new  JTextField ();
		textNumeroA . setBounds ( 119 , 26 , 86 , 20 );
		contentPane . agregar (textNumeroA);
		textNumeroA . setColumns ( 10 );
		
		textNumeroB =  new  JTextField ();
		textNumeroB . setColumns ( 10 );
		textNumeroB . setBounds ( 119 , 65 , 86 , 20 );
		contentPane . agregar (textNumeroB);
		
		JLabel lblNumeroA =  new  JLabel ( " Primer número " );
		lblNumeroA . setBounds ( 23 , 28 , 86 , 17 );
		contentPane . agregar (lblNumeroA);
		
		JLabel lblNumeroB =  new  JLabel ( " Segundo número " );
		lblNumeroB . setBounds ( 22 , 68 , 87 , 17 );
		contentPane . agregar (lblNumeroB);
		
		txtIteraciones =  new  JTextField ();
		txtIteraciones . setColumns ( 10 );
		txtIteraciones . setBounds ( 130 , 109 , 86 , 20 );
		contentPane . agregar (txtIteraciones);
		
		lblIteraciones =  new  JLabel ( " Numero de iteraciones " );
		lblIteraciones . setBounds ( 10 , 110 , 123 , 18 );
		contentPane . agregar (lblIteraciones);
		
		JButton btn Salida =  nuevo  JButton ( " Salir " );
		btn Salida . addActionListener ( nuevo  ActionListener () {
			public  void  actionPerformed ( ActionEvent  e )
			{
				Sistema . salir ( 0 );
			}
		});
		btn Salida . setBounds ( 211 , 169 , 201 , 17 );
		contentPane . añadir (btn Salida);
		
		
	}
}
