package vista;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;

import java.awt.Container;
import java.awt.Event;
import java.util.ArrayList;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Text;

import modelo.ListaGrupos;
import modelo.ListaUsuarios;
import modelo.Usuario_Grupo;
import modelo.Usuario_Privado;


import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.ScrollBar;

public class vistaChats {

	protected Shell shell;
	public static String enviarMensaje;
	public static String idEnviarMensaje;
	
	public static String nombregrupo;
	public static String idEnviarGrupo;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			vistaChats window = new vistaChats();
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
		shell.setVisible(false);

		shell.setSize(396, 339);
		shell.setText("SWT Application");
		
		vistaUsuario vistaUsu = new vistaUsuario();

	    ListaUsuarios lu = new ListaUsuarios();
	    String miUsu = vistaUsu.textoUsuario;
	    lu = ListaUsuarios.BuscarMisPrivados(miUsu);
		
	    List list = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
	    list.setBounds(23, 55, 164, 110);
	    
		
		for (int i = 0; i < lu.longitud(); i++) {
			list.add(Usuario_Privado.BuscarUsuarioPorId(lu.getUsuarios_Privado(i).getId_usuario()));
		}
		
		List list1 = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		list1.setBounds(23, 171, 164, 96);
		
		ListaGrupos lg = new ListaGrupos();
		lg = ListaGrupos.BuscarMisGrupos(miUsu);
	
		for (int i = 0; i < lg.longitud(); i++) {
			  list1.add(lg.getUsuario_Grupo(i).getNombre_grupo());
			  
		}
		

		list.addSelectionListener((SelectionListener) new SelectionListener() {
		
		      public void widgetSelected(SelectionEvent event) {
		        String miUsu = vistaUsu.textoUsuario;
		    	  
		    	ListaUsuarios lu = new ListaUsuarios();
		  	    lu = ListaUsuarios.BuscarMisPrivados(miUsu);
		  		vistaMensajePrivado mensaje = new vistaMensajePrivado();
		  
		  	 
		        int[] selectedItems = list.getSelectionIndices();
		    
		        
		        int pos = 0;
		        for (int i = 0; i <selectedItems.length; i++) {
		        		 pos = selectedItems[i] ;
		        	for (int j = pos; j < lu.longitud();) {
		        	 enviarMensaje =String.valueOf(lu.getUsuarios_Privado(j).getId_usuario());
		        	 idEnviarMensaje = String.valueOf(lu.getUsuarios_Privado(j).getId_privado());
		        	 mensaje.open();
					 break;
		        	}
		        
		        }
		      }
		      public void widgetDefaultSelected(SelectionEvent event) {
		          int[] selectedItems = list.getSelectionIndices();
		          String outString = "";
		          for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++)
		            outString += selectedItems[loopIndex] + " ";
		      
		        }
		      
		 });
		
		list1.addSelectionListener((SelectionListener) new SelectionListener() {
			
		      public void widgetSelected(SelectionEvent event) {
		        String miUsu = vistaUsu.textoUsuario;

		  		ListaGrupos lg = new ListaGrupos();
				lg = ListaGrupos.BuscarMisGrupos(miUsu);
		  		vistaMensajeGrupo mensajeGrupo = new vistaMensajeGrupo();
		  	 
		        int[] selectedItems = list1.getSelectionIndices();
		    
		        
		        int pos = 0;
		        for (int i = 0; i <selectedItems.length; i++) {
		        		 pos = selectedItems[i] ;
		        
		        	for (int h = pos; h < lg.longitud();) {
			          nombregrupo =String.valueOf(lg.getUsuario_Grupo(h).getNombre_grupo());
			          idEnviarGrupo = String.valueOf(lg.getUsuario_Grupo(h).getId_grupo());
					  mensajeGrupo.open();
					  break;
			        }
		        }
		      }
		      public void widgetDefaultSelected(SelectionEvent event) {
		          int[] selectedItems = list.getSelectionIndices();
		          String outString = "";
		          for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++)
		            outString += selectedItems[loopIndex] + " ";
		      
		        }
		      
		 });
		
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(147, 10, 55, 15);
		lblNewLabel.setText(vistaUsu.textoUsuario);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setBounds(247, 242, 96, 25);
		btnNewButton_1.setText("Eliminar");
		
		Button btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				vistaNuevoChat newChat = new vistaNuevoChat(shell, 0);
				newChat.open();
			}
		});
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_4.setBounds(247, 126, 96, 39);
		btnNewButton_4.setText("New Chat");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				vistaNuevoGrupo grupo = new vistaNuevoGrupo();
				grupo.open();
			}
		});
		btnNewButton.setBounds(247, 172, 96, 44);
		btnNewButton.setText("New Grupo");
		
		
	}
}
	

