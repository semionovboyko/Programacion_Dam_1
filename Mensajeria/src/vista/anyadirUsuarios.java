package vista;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import modelo.ListaUsuarios;
import modelo.Usuario_Grupo;
import modelo.Usuario_Privado;

import org.eclipse.swt.widgets.Button;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Label;

public class anyadirUsuarios {

	protected Shell shell;
	
	public static ArrayList<String> lista;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			anyadirUsuarios window = new anyadirUsuarios();
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
		shell.setSize(233, 304);
		shell.setText("SWT Application");
		
	vistaUsuario vistaUsu = new vistaUsuario();
		
		ListaUsuarios lu = new ListaUsuarios();
		String miUsu = vistaUsu.textoUsuario;
		lu = ListaUsuarios.BuscarUsuarios(miUsu);
			
		List list = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		list.setBounds(32, 36, 153, 165);
		    
		Label lblUsuarios = new Label(shell, SWT.NONE);
		lblUsuarios.setBounds(83, 10, 45, 15);
		lblUsuarios.setText("Usuarios");
			
		for (int i = 0; i < lu.longitud(); i++) {
			list.add(lu.BuscarUsuarioId(lu.getUsuarios_Privado(i).getId_usuario()));
				
		}
		
		list.addSelectionListener((SelectionListener) new SelectionListener() {
			
		      public void widgetSelected(SelectionEvent event) {
		    	ListaUsuarios lu = new ListaUsuarios();
		  	    String miUsu = vistaUsu.textoUsuario;
		  	    lu = ListaUsuarios.BuscarMisPrivados(miUsu);
		  		vistaMensajePrivado mensaje = new vistaMensajePrivado();
		  	 
		        int[] selectedItems = list.getSelectionIndices();
		        

		        int pos = 0;
		        for (int i = 0; i <selectedItems.length; i++)
		        		 pos = selectedItems[i] ;
		        	for (int j = pos; j < lu.longitud();) {
		        	 lista.add(String.valueOf(lu.getUsuarios_Privado(j).getId_usuario()));
		        	}
		        
		      }
		      public void widgetDefaultSelected(SelectionEvent event) {
		          int[] selectedItems = list.getSelectionIndices();
		          String outString = "";
		          for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++)
		            outString += selectedItems[loopIndex] + " ";
		      
		        }
		      
		 });
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Usuario_Grupo grupo = new Usuario_Grupo();
				grupo.InsertarNuevoChatPrivado(lista,18);
			}
		});
		btnNewButton.setBounds(32, 226, 153, 25);
		btnNewButton.setText("A\u00F1adir");
		
	
	

	}

}
