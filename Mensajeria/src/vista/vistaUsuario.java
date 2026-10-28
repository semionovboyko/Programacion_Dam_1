package vista;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import modelo.Conexion;
import modelo.Usuario;

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;


import javax.swing.JOptionPane;
import org.eclipse.swt.widgets.Label;

public class vistaUsuario {

	protected Shell shell;
	private Text textUsuario;
	private Text textContraseña;
	private Button btnNuevoUsuario;
	private Label lblNewLabel;
	private Label lblNewLabel_1;
	public static String textoUsuario;
	


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			vistaUsuario window = new vistaUsuario();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
	    textoUsuario="";
		
		Button Enviar = new Button(shell, SWT.NONE);
		Enviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
		
			//Cargar cuenta USUARIO
				
			textoUsuario = textUsuario.getText();
			String email = textUsuario.getText();
			String contraseña = textContraseña.getText();
			
			if(Usuario.cargarUsuario(email, contraseña)== true) {
				vistaChats chat = new vistaChats();
				chat.open();
			}
			
		
			}
		});
		Enviar.setBounds(210, 120, 75, 25);
		Enviar.setText("Enviar");
		
		textUsuario = new Text(shell, SWT.BORDER);
		textUsuario.setBounds(209, 37, 76, 21);
		
		textContraseña = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		textContraseña.setBounds(209, 78, 76, 21);
		
		btnNuevoUsuario = new Button(shell, SWT.NONE);
		btnNuevoUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				vistaNuevoUsuario nuevo = new vistaNuevoUsuario(shell, 0);
				nuevo.open();
			}
		});
		btnNuevoUsuario.setBounds(335, 226, 89, 25);
		btnNuevoUsuario.setText("Nuevo usuario");
		
		lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(111, 37, 55, 15);
		lblNewLabel.setText("EMAIL");
		
		lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(91, 84, 89, 15);
		lblNewLabel_1.setText("CONTRASE\u00D1A");

	}
	
	
	

}
