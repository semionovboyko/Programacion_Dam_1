package vista;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

import modelo.ListaMensajes;
import modelo.ListaUsuarios;
import modelo.Sms;
import modelo.Usuario_Privado;
import modelo.Usuario_Sms_Chat;

import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class vistaMensajePrivado {

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
			vistaMensajePrivado window = new vistaMensajePrivado();
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
		

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setText("USUARIO");
		lblNewLabel.setBounds(186, 10, 55, 15);
		
		Usuario_Privado privado = new Usuario_Privado();
		String usus = privado.BuscarUsuarioPorId(Integer.parseInt(vistaChats.enviarMensaje));
		
		String usu = vistaChats.enviarMensaje;
		lblNewLabel.setText(usus);
		
		String id = vistaChats.idEnviarMensaje;
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
			
				String cont = text.getText();
				newsms = new Sms(null,cont,null,0);
				
				Usuario_Sms_Chat.InsertarMensaje(newsms);
				int key = Usuario_Sms_Chat.InsertarMensaje(newsms);
				
				int id_usu = Integer.parseInt(usu);
			
				int id_chat = Integer.parseInt(id);
				
				ususmschat = new Usuario_Sms_Chat(id_usu,key,id_chat);
				Usuario_Sms_Chat.InsertarUsu_sms_chat(ususmschat);
				
	
				
			}
		});
		btnNewButton.setBounds(335, 210, 89, 39);
		btnNewButton.setText("Enviar Sms");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(23, 226, 283, 21);
		
	
		ListaMensajes lu = new ListaMensajes();
		int id_usuario = Integer.parseInt(vistaChats.idEnviarMensaje);
	    lu = ListaMensajes.BuscarMisSms(id_usuario);
		
	    List list = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
	    list.setBounds(23, 44, 401, 145);
		
		for (int i = 0; i < lu.longitud(); i++) {
			int suId = Integer.parseInt(vistaChats.enviarMensaje);
			if(lu.getSms(i).getId_usuario() == suId) {
				list.add("                    Mio ");
				list.add(lu.getSms(i).getFecha()+ " \n\n " +lu.getSms(i).getContenido());
				list.add("  ");
			}else {
				list.add("                "+ usus+" ");
				list.add(lu.getSms(i).getFecha()+ " \n\n " +lu.getSms(i).getContenido());
				list.add("  ");
			}
		}
	}
	
	

}
