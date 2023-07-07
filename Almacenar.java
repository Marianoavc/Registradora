
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Almacenar extends javax.swing.JFrame {

    //STOCKFINAL
    public Almacenar() {
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image Store.jpeg"))); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(122, 99, 255));
        jProgressBar1.setForeground(new java.awt.Color(122, 99, 255));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnPedido)
                        .addGap(89, 89, 89)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnVer)
                        .addGap(142, 142, 142)
                        .addComponent(btnEditar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void quickSort(List<Producto> lista, int low, int high) {
    if (low < high) {
        int pi = partition(lista, low, high);
        quickSort(lista, low, pi - 1);
        quickSort(lista, pi + 1, high);
    }
}

    private int partition(List<Producto> lista, int low, int high) {
        Producto pivot = lista.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (lista.get(j).getObjeto().compareTo(pivot.getObjeto()) <= 0) {
                i++;
                Producto temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        Producto temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(high));
        lista.set(high, temp);

        return i + 1;
    }
    
    private void mergeSort(Producto[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(Producto[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Producto[] leftArr = new Producto[n1];
        Producto[] rightArr = new Producto[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].getCantidad() > rightArr[j].getCantidad()) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    private void heapSort(List<Producto> lista){
        int primerEl = (lista.size()-1) / 2;
        for (int i = primerEl; i >= 0; i--) {
            ajustarMonton(lista, i, lista.size());}
        for (int i = (lista.size()-1); i > 0; i--) {
            intercambiar(lista,0, i);
            ajustarMonton(lista, 0, i);
        }
    }
    private void intercambiar(List<Producto> lista, int i, int j) {
        Producto aux = lista.get(i);
        lista.set(i,lista.get(j));
        lista.set(j,aux);
    }
    private void ajustarMonton(List<Producto> lista, int raiz, int tamanioMonton) {
        int hijoIzquierdo = 2 * raiz + 1;
        if (hijoIzquierdo < tamanioMonton) {
            int hijoDerecho = 2 * raiz + 2;
            if (hijoDerecho < tamanioMonton) {
                if (lista.get(hijoDerecho).getCantidad() > lista.get(hijoIzquierdo).getCantidad()) {
                    hijoIzquierdo = hijoDerecho;
                }
            }
            if (lista.get(hijoIzquierdo).getCantidad() > lista.get(raiz).getCantidad()) {
                intercambiar(lista, raiz, hijoIzquierdo);
                ajustarMonton(lista, hijoIzquierdo, tamanioMonton);
            }
        }
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
    Hashtable<Integer, Producto> productos = new Hashtable<>();
    int contador=1;
    String texto = "";
    String texto_inicial = "Los elementos de laboratorio son: \n\n";
    
    
    
    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        productos.put(contador, new Producto(contador, txtProducto.getText(), Integer.parseInt(txtCantidad.getText())));       
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
            //Mostrar productos según su ingreso
            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {
                Producto tempElementosLab = (Producto) productos.get(e.nextElement());
                texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";
            }

            // BOTONOS DE ORDENAMIENTO
            
            JButton boton1 = new JButton("Ordenar alfabeticamente");
            JButton boton2 = new JButton("Mayor cantidad");
            JButton boton3 = new JButton("Menor cantidad");

            boton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    List<Producto> listaProductos = new ArrayList<>(productos.values());

                // Aplicamos Quicksort para ordenar la lista de productos según su nombre
                quickSort(listaProductos, 0, listaProductos.size() - 1);

                // Generamos el texto con los elementos ordenados
                texto = "";
                for (Producto tempElementosLab : listaProductos) {
                    texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";
                }

                JOptionPane.showMessageDialog(null, texto_inicial + texto + "\n");

                }
            });

            boton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Producto[] elementos = productos.values().toArray(new Producto[0]);

                // Aplicar Mergesort para ordenar el arreglo según el de mayor cantidad
                mergeSort(elementos, 0, elementos.length - 1);

                // Generar el texto con los elementos ordenados 
                texto = "";
                for (Producto tempElementosLab : elementos) {
                    texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";
                }

                JOptionPane.showMessageDialog(null, texto_inicial + texto + "\n");
                }
            });
            boton3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    List<Producto> listaProductos = new ArrayList<>(productos.values());
                    // Ordenar con el algoritmo HeapSort según el de menor cantidad
                    heapSort(listaProductos);
                    texto = "";
                    for (Producto tempElementosLab : listaProductos) {
                        texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, texto_inicial + texto + "\n");
                }
            });

            // Crear un array de opciones que incluya los botones personalizados
            Object[] opciones = {boton1, boton2, boton3};

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
         //ESTRUCTURA DE DATOS PILAS
        //SE IMPLEMENTÓ BÚSQUEDA CON PILAS
        if (!productos.isEmpty()) {
        Enumeration e = productos.keys();
        texto = "";

        while (e.hasMoreElements()) {
            Producto tempElementosLab = (Producto) productos.get(e.nextElement());
            texto += "- ID: " + tempElementosLab.getKey() + "\n- Objeto: " + tempElementosLab.getObjeto() + "  x" + tempElementosLab.getCantidad() + "\n\n";
        }

        int id_actualizar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Digite el ID del elemento que desea Actualizar:"));

        // Algoritmo de búsqueda con pilas
        Stack<Integer> pila = new Stack<>();
        Enumeration enumeration = productos.keys();
        while (enumeration.hasMoreElements()) {
            pila.push((Integer) enumeration.nextElement());
        }

        boolean encontrado = false;
        while (!pila.isEmpty()) {
            int id = pila.pop();
            if (id == id_actualizar) {
                Producto tempElementosLab = (Producto) productos.get(id);
                try {
                    tempElementosLab.ActualizarObjeto();
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser un Número Entero, vuelve a intentar.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
        }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // ESTRUCTURA DE DATOS LISTAS SIMPLEMENTE ENLAZADAS
        //SE UTILIZÓ LISTA SIMPLEMENTE ENLAZADAS
       if (!productos.isEmpty()) {
        Enumeration e = productos.keys();
        texto = "";

        while (e.hasMoreElements()) {
            Producto tempElementosLab = (Producto) productos.get(e.nextElement());
            texto += "- ID: " + tempElementosLab.getKey() + "\n- Objeto: " + tempElementosLab.getObjeto() + "\n\n";
        }

        int id_eliminar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Ingrese el ID del elemento que desea Eliminar:"));

        // Algoritmo de búsqueda y eliminación con lista enlazada
        LinkedList<Integer> listaEnlazada = new LinkedList<>();
        Enumeration enumeration = productos.keys();
        while (enumeration.hasMoreElements()) {
            listaEnlazada.add((Integer) enumeration.nextElement());
        }

        boolean encontrado = false;
        Iterator<Integer> iterator = listaEnlazada.iterator();
        while (iterator.hasNext()) {
            int id = iterator.next();
            if (id == id_eliminar) {
                iterator.remove();
                productos.remove(id);
                JOptionPane.showMessageDialog(null, "Objeto eliminado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
        }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        // ESTRUCTURA DE DATOS COLAS
        //SE IMPLEMENTÓ BÚSQUEDA CON COLAS
        if (!productos.isEmpty()) {
        Enumeration e = productos.keys();
        texto = "";

        while (e.hasMoreElements()) {
            Producto tempElementosLab = (Producto) productos.get(e.nextElement());
            texto += "- ID: " + tempElementosLab.getKey() + "\n- Objeto: " + tempElementosLab.getObjeto() + "  x" + tempElementosLab.getCantidad() + "\n\n";
        }

        int id_actualizar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Digite el ID del elemento que desea pedir:"));

        // Algoritmo de búsqueda con colas
        Queue<Integer> cola = new LinkedList<>();
        Enumeration enumeration = productos.keys();
        while (enumeration.hasMoreElements()) {
            cola.offer((Integer) enumeration.nextElement());
        }

        boolean encontrado = false;
        while (!cola.isEmpty()) {
            int id = cola.poll();
            if (id == id_actualizar) {
                Producto tempElementosLab = (Producto) productos.get(id);
                try {
                    tempElementosLab.PedirObjeto();
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser un Número Entero, vuelve a intentar.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
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
            java.util.logging.Logger.getLogger(Almacenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacenar().setVisible(true);
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
