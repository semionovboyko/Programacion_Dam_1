package vista;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import modelo.Grupo;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class vistaNuevoGrupo {

	protected Shell shell;
	private Text text;
	private Button btnCrearGrupo;
	
	Grupo nuevo;
	public static int keychat;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			vistaNuevoGrupo window = new vistaNuevoGrupo();
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
		shell.setSize(386, 143);
		shell.setText("SWT Application");
		
		Label lblNombreGrupo = new Label(shell, SWT.NONE);
		lblNombreGrupo.setBounds(25, 24, 120, 15);
		lblNombreGrupo.setText("Nombre Grupo: ");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(164, 24, 174, 21);
		
		btnCrearGrupo = new Button(shell, SWT.NONE);
		btnCrearGrupo.setText("Crear Grupo");
		btnCrearGrupo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String nombreGrupo = text.getText();
			    nuevo = new Grupo(nombreGrupo,0);
			    keychat = nuevo.InsertarDatosGrupo(nuevo);
				
				vistaMensajeGrupo mensajeGrupo = new vistaMensajeGrupo();
				mensajeGrupo.open();
				shell.close();
			}
		});
		btnCrearGrupo.setBounds(262, 69, 75, 25);

	}
}
