
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Stock extends javax.swing.JFrame {


    public Stock() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_recortado.png"))); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(122, 99, 255));
        jProgressBar1.setForeground(new java.awt.Color(122, 99, 255));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR STOCK");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANTIDAD");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE PRODUCTO");

        txtProducto.setBackground(new java.awt.Color(204, 204, 255));
        txtProducto.setForeground(new java.awt.Color(102, 102, 102));
        txtProducto.setText("Ingrese el nombre del producto");
        txtProducto.setBorder(null);
        txtProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProductoMousePressed(evt);
            }
        });
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        btnIngresar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(204, 204, 255));
        txtCantidad.setForeground(new java.awt.Color(102, 102, 102));
        txtCantidad.setText("Ej: 1, 2, 3");
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnVer.setText("VER STOCK");
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR STOCK");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR STOCK");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPedido.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnPedido.setText("REALIZAR PEDIDO");
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnPedido)
                        .addGap(89, 89, 89)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(182, 182, 182)
                                .addComponent(jLabel3))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCantidad)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnVer)
                        .addGap(142, 142, 142)
                        .addComponent(btnEditar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVer)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnPedido))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void quickSort(List<Platinum> lista, int low, int high) {
    if (low < high) {
        int pi = partition(lista, low, high);
        quickSort(lista, low, pi - 1);
        quickSort(lista, pi + 1, high);
    }
}

    private int partition(List<Platinum> lista, int low, int high) {
        Platinum pivot = lista.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (lista.get(j).getObjeto().compareTo(pivot.getObjeto()) <= 0) {
                i++;
                Platinum temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        Platinum temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(high));
        lista.set(high, temp);

        return i + 1;
    }
    private void txtProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoMousePressed

        if (txtProducto.getText().equals("Ingrese el nombre del producto")) {
            txtProducto.setText("");
            txtProducto.setForeground(Color.WHITE);
        }

        if (txtCantidad.getText().isEmpty()) {
            txtCantidad.setText("Ej: 1, 2, 3");
            txtCantidad.setForeground(Color.GRAY);

        }

    }//GEN-LAST:event_txtProductoMousePressed
    Hashtable<Integer, Platinum> productos = new Hashtable<Integer, Platinum>();
    int contador=1;
    String texto = "";
    String texto_inicial = "Los elementos de laboratorio son: \n\n";
    
    
    
    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        productos.put(contador, new Platinum(contador, txtProducto.getText(), Integer.parseInt(txtCantidad.getText())));       
        contador++;
        
        
        txtProducto.setText("Ingrese el nombre del producto");
        txtProducto.setForeground(Color.GRAY);
        
        txtCantidad.setText("Ej: 1, 2, 3");
        txtCantidad.setForeground(Color.GRAY);
        JOptionPane.showMessageDialog(null, "Producto Ingresado con éxito ");

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    txtProducto.setText("Ingrese el nombre del producto");
    txtProducto.setForeground(Color.GRAY);

    txtCantidad.setText("Ej: 1, 2, 3");
    txtCantidad.setForeground(Color.GRAY);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if (txtCantidad.getText().equals("Ej: 1, 2, 3")) {
            txtCantidad.setText("");
            txtCantidad.setForeground(Color.WHITE);
        }

        if (txtProducto.getText().isEmpty()) {
            txtProducto.setText("Ingrese el nombre del producto");
            txtProducto.setForeground(Color.GRAY);

        }

    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (!productos.isEmpty()) {
    Enumeration e = productos.keys();
    texto = "";

    while (e.hasMoreElements()) {
        Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
        texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";
    }

    // Crear los botones personalizados
    JButton boton1 = new JButton("ascendente");
    JButton boton2 = new JButton("descendente");

    // Agregar funcionalidad a los botones
    boton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            List<Platinum> listaProductos = new ArrayList<>(productos.values());

        // Aplicamos Quicksort para ordenar la lista de productos por el atributo txtProducto
        quickSort(listaProductos, 0, listaProductos.size() - 1);

        // Generamos el texto con los elementos ordenados
        texto = "";
        for (Platinum tempElementosLab : listaProductos) {
            texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";
        }

        JOptionPane.showMessageDialog(null, texto_inicial + texto + "\n");
            
        }
    });

    boton2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Lógica o acciones que se ejecutarán al presionar el botón 2
            // Puedes agregar aquí el código que deseas ejecutar
        }
    });

    // Crear un array de opciones que incluya los botones personalizados
    Object[] opciones = {boton1, boton2};

    JOptionPane pane = new JOptionPane(texto_inicial + texto + "\n", JOptionPane.INFORMATION_MESSAGE);
    pane.setOptions(opciones);
    JDialog dialog = pane.createDialog(null, "Opciones de ordenamiento");

    // Mostrar el diálogo
    dialog.setVisible(true);
} else {
    JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
}

    }//GEN-LAST:event_btnVerActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- ID: " + tempElementosLab.getKey()+ "\n- Objeto: " + tempElementosLab.getObjeto() + "  x" + tempElementosLab.getCantidad() + "\n\n";

            }

            int id_actualizar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Digite el ID del elemento que desea Actualizar:"));
            if (productos.containsKey(id_actualizar)) {

                Platinum tempElementosLab = (Platinum) productos.get(id_actualizar);

                try {

                    tempElementosLab.ActualizarObjeto();

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser un Número Entero, vuelve a intentar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- ID: " + tempElementosLab.getKey()+ "\n- Objeto: " + tempElementosLab.getObjeto() + "\n\n";

            }

            int id_eliminar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Ingrese el ID del elemento que desea Eliminar:"));
            if (productos.containsKey(id_eliminar)) {

                productos.remove(id_eliminar);
                JOptionPane.showMessageDialog(null, "Objeto eliminado con éxito.");

            } else {
                JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- ID: " + tempElementosLab.getKey()+ "\n- Objeto: " + tempElementosLab.getObjeto() + "  x" + tempElementosLab.getCantidad() + "\n\n";

            }

            int id_actualizar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Digite el ID del elemento que desea pedir:"));
            if (productos.containsKey(id_actualizar)) {

                Platinum tempElementosLab = (Platinum) productos.get(id_actualizar);

                try {

                    tempElementosLab.PedirObjeto();

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser un Número Entero, vuelve a intentar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
