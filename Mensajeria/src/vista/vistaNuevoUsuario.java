package vista;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import modelo.Usuario;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class vistaNuevoUsuario extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text textEmail;
	private Text textPass;
	private Text textEstado;
	private Text textApodo;
	private Button btnNewButton;
	
	Usuario usu = new Usuario();

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public vistaNuevoUsuario(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
		
		
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(450, 300);
		shell.setText(getText());
		
		textEmail = new Text(shell, SWT.BORDER);
		textEmail.setBounds(227, 48, 76, 21);
		
		textPass = new Text(shell, SWT.BORDER);
		textPass.setBounds(227, 103, 76, 21);
		
		textEstado = new Text(shell, SWT.BORDER);
		textEstado.setBounds(227, 155, 76, 21);
		
		textApodo = new Text(shell, SWT.BORDER);
		textApodo.setBounds(227, 210, 76, 21);
		
		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				
				//Crear nuevo USUARIO	
				usu= nuevoUsuario();
				Usuario.InsertarDatosUsuario(usu);
				
				shell.dispose();
				
				
			}
		});
		btnNewButton.setBounds(359, 236, 75, 25);
		btnNewButton.setText("ENVIAR");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(124, 54, 55, 15);
		lblNewLabel.setText("Email");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(124, 109, 66, 15);
		lblNewLabel_1.setText("contrase\u00F1a");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(124, 161, 55, 15);
		lblNewLabel_2.setText("estado");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(124, 216, 55, 15);
		lblNewLabel_3.setText("apodo");

	}
	
	private Usuario nuevoUsuario(){
        
		String email = textEmail.getText();
		String password = textPass.getText(); 
		String estado = textEstado.getText();
		String apodo = textApodo.getText();
		
		Usuario usu = null;
		try {
        	
        	if( email.isEmpty() && password.isEmpty()) {
        		return usu;
        	}else {
        		
        		if(estado.isEmpty()) 
        			estado = null;
        		 if(apodo.isEmpty()) 
        			apodo = null;
        		
        			
        		usu = new Usuario(email,password,estado,apodo);
    			return usu;  
        		
        	}
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Datos incorrectos");
            return usu;
        }
    }
}
