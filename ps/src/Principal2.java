

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JButton;



/**
 * Ejemplo de SwingWorker con una barra de progreso.
 * El SwingWorker hilo cuenta hasta 10 con esperas de un segundo en 
 * y actualiza  barra de progreso.
 * 
 * 
 * 
 */
public class Principal2 {

    /**
     * @param args
     */
    JLabel etiqueta;
    JProgressBar barraProgreso;
    JDialog dialogoProgreso;
    
    public static void main(String[] args) {
        new Principal2();
    }

    /**
     * Muestra una ventana con una etiqueta, un dialogo con un progress bar y
     * lanza un SwingWorker. Cierra la ventana de progreso cuando termina el
     * worker.
     */
    public Principal2() {
        // La ventana principal, con una etiqueta que pondr� "Hecho" cuando
        // termine el SwingWorker.
        JFrame ventanaPrincipal = new JFrame();
        JPanel panel = new JPanel();
        
        JButton start = new JButton("Start");
        etiqueta = new JLabel("Sin hacer");
        panel.setLayout(new BorderLayout());
        
        panel.add(etiqueta, BorderLayout.CENTER);
        panel.add(start, BorderLayout.SOUTH);
        
        ventanaPrincipal.getContentPane().add(panel);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//método cerrar ventana
        ventanaPrincipal.pack(); // establezco tamaño más pequeño posible
        ventanaPrincipal.setLocationRelativeTo(null);//coloca ventana en centro
        ventanaPrincipal.setVisible(true);//hace el JFrame visible

        // Una ventana con la barra de progreso
        barraProgreso = new JProgressBar(0, 100);
        dialogoProgreso = new JDialog(ventanaPrincipal, "progreso");
        dialogoProgreso.getContentPane().add(barraProgreso);
        dialogoProgreso.pack(); //medidas pequeñas
        dialogoProgreso.setLocationRelativeTo(null); //ubicación centro

        
        start.addActionListener(new ActionListener(){
            
        public void actionPerformed(ActionEvent e){
                activar();
            }
         });
    }
    
    public void activar(){
         // Hacemos visible la barra de progreso y lanzamos
        // el SwingWorker.
        dialogoProgreso.setVisible(true);
        Worker2 worker = new Worker2(etiqueta, barraProgreso);
        worker.execute();
        // w.execute() devuelve el control inmediatamente, por lo que
        // no debemos ocultar la barra de progreso aqui

        // Mostramos el resultado y ocultamos la barra de progreso.
        try {
            // Esta llamada se queda bloqueada hasta que termine
            // el SwingWorker. Debemos ocultar la barra de progreso
            // inmediatamente despu�s.
            System.out.println("El resultado es " + worker.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }//

        dialogoProgreso.setVisible(false);
    }
}
