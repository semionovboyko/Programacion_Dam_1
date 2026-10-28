package vista;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

import modelo.Conexion;
import modelo.ListaMensajes;
import modelo.Sms;
import modelo.Usuario_Privado;
import modelo.Usuario_Sms_Chat;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class vistaMensajeGrupo {

	protected Shell shell;
	private Text text;
	
	Sms newsms;
	Usuario_Sms_Chat ususmschat;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			vistaMensajeGrupo window = new vistaMensajeGrupo();
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
		shell.setSize(449, 304);
		shell.setText("SWT Application");
		
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(20, 16, 122, 15);
		lblNewLabel.setText("Nombre Grupo");
		
		
		
		vistaUsuario vistaUsu = new vistaUsuario();
		Usuario_Privado privado = new Usuario_Privado();
		
		String id = vistaChats.idEnviarGrupo;
		int id_usu =  privado.BuscarUsuario(vistaUsu.textoUsuario);
				
		String nomgrup = vistaChats.nombregrupo;
		lblNewLabel.setText(nomgrup);
		
		///
		int idchat = Integer.parseInt(id);
		ListaMensajes lu = new ListaMensajes();
	    lu = ListaMensajes.BuscarMisSms(idchat);
		
	    List list = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
	    list.setBounds(23, 53, 401, 171);
		
		for (int i = 0; i < lu.longitud(); i++) {
			int suId = privado.BuscarUsuario(vistaUsu.textoUsuario);
			String  otroUsu = privado.BuscarUsuarioPorId(lu.getSms(i).getId_usuario());
			if(lu.getSms(i).getId_usuario() == suId) {
				list.add("                    Mio ");
				list.add(lu.getSms(i).getFecha()+ " \n\n " +lu.getSms(i).getContenido());
				list.add("  ");
			}else {
				list.add("        "+otroUsu+"         ");
				list.add(lu.getSms(i).getFecha()+ " \n\n " +lu.getSms(i).getContenido());
				list.add("  ");
			}
		}
		
		//
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					
				String cont = text.getText();
				newsms = new Sms(null,cont,null,0);
				
				Usuario_Sms_Chat.InsertarMensaje(newsms);
				int key = Usuario_Sms_Chat.InsertarMensaje(newsms);

				int id_chat = Integer.parseInt(id);
			
				ususmschat = new Usuario_Sms_Chat(id_usu,key,id_chat);
				Usuario_Sms_Chat.InsertarUsu_sms_chat(ususmschat);
		
			}
		});
		btnNewButton.setBounds(335, 230, 89, 25);
		btnNewButton.setText("Enviar Sms");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(20, 232, 297, 21);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				anyadirUsuarios anyadir = new anyadirUsuarios();
				anyadir.open();
				}
		});
		btnNewButton_1.setBounds(227, 10, 101, 27);
		btnNewButton_1.setText("A\u00F1adir usuario");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.setBounds(335, 9, 87, 28);
		btnNewButton_2.setText("Borrar usuario");
		

	}
}
