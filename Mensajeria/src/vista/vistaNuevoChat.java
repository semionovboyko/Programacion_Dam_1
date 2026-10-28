package vista;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;

import modelo.Privado;
import modelo.Usuario_Privado;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class vistaNuevoChat extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text textDestino;
	
	Usuario_Privado suChatPrivado = new Usuario_Privado();
	Usuario_Privado miChatPrivado = new Usuario_Privado();

	

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public vistaNuevoChat(Shell parent, int style) {
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
		shell.setSize(365, 229);
		shell.setText(getText());
		
		vistaUsuario vistaUsu = new vistaUsuario();
		String miUsuario =vistaUsu.textoUsuario;
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
	
				
				//METODO PARA INSERTAR EN CHAT Y PRIVADO BASE DATOS LA ID DEL TECLADO 
				int numumer = Usuario_Privado.InsertarPrivado();
				System.out.println(numumer);
				
				//METODO PARA BUSCAR MI ID 
				int miId = Usuario_Privado.BuscarUsuario(miUsuario);
				//CREA UN OBJETO USUARIO_PRIVADO Y INSERTA EN USUARIO_PRIVADO BASE DATOS
				Usuario_Privado miId_usu_priv = new Usuario_Privado(miId ,numumer);
				Usuario_Privado.InsertarNuevoChatPrivado(miId_usu_priv);
				
				
				String usu = textDestino.getText();
				int suId = Usuario_Privado.BuscarUsuario(usu);
				try {
		        	
		        	if(usu.isEmpty()) {
		        		JOptionPane.showMessageDialog(null,"Campo usuario no puede ser vacio");
		        	}else {
		        		suChatPrivado = new Usuario_Privado(suId,numumer);
		        		Usuario_Privado.InsertarNuevoChatPrivado(suChatPrivado);
		        	}
				} catch (NumberFormatException ex){
		            JOptionPane.showMessageDialog(null,"Datos incorrectos");
		           
		        }
				
				shell.dispose();
			}
		});
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(274, 165, 75, 25);
		btnNewButton.setText("CREAR");
		
		textDestino = new Text(shell, SWT.BORDER);
		textDestino.setBounds(24, 81, 189, 31);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(24, 43, 196, 15);
		lblNewLabel.setText("Introduce Usuario destinatario:");

	}
}
