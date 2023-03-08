package blue_mall;
import blue_mall.Vendedores.ModificarUser;
import blue_mall.Vendedores.CrearVendedor;
import blue_mall.Clientes.ModificarCliente;
import blue_mall.Clientes.CrearCliente;
import blue_mall.Sucursales.ModificarSucursal;
import blue_mall.Sucursales.CrearSucursal;
import blue_mall.Productos.ModificarProducto;
import blue_mall.Productos.CrearProducto;
import blue_mall.POO.Clientes;
import blue_mall.POO.Vendedores;
import blue_mall.POO.Productos;
import blue_mall.POO.Sucursales;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class AdminUser extends javax.swing.JFrame {

    LinkedList<Vendedores> listaVendedores = Vendedores.lista;
    LinkedList<Clientes> lista_clientes = Clientes.lista_clientes;
    LinkedList<Productos> lista_productos = Productos.lista_productos;
    LinkedList<Sucursales> lista_sucursales = Sucursales.lista_sucursales;

    public AdminUser() {
        initComponents();
        Mostrar_Tabla_Vendedores();
        Mostrar_Tabla_Clientes();
        Mostrar_Tabla_Productos();
        Mostrar_Tabla_Sucursales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        scroll5 = new javax.swing.JScrollPane();
        sucursales = new javax.swing.JTable();
        btn_crear_sucursales = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        btn_actualizar_sucursales = new javax.swing.JButton();
        btn_eliminar_sucursales = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        scroll4 = new javax.swing.JScrollPane();
        productos = new javax.swing.JTable();
        btn_crear_producto = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        btn_actualizar_producto = new javax.swing.JButton();
        btn_eliminar_producto = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        scroll3 = new javax.swing.JScrollPane();
        clientes = new javax.swing.JTable();
        btn_crear_cliente = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        btn_actualizar_cliente = new javax.swing.JButton();
        btn_eliminar_cliente = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_crear_vendedor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_actualizar_vendedor = new javax.swing.JButton();
        btn_eliminar_vendedores = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 221, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 179, 203)));

        jTabbedPane1.setBackground(new java.awt.Color(120, 179, 203));

        jPanel2.setBackground(new java.awt.Color(176, 227, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 178, 188)));

        jPanel10.setBackground(new java.awt.Color(176, 227, 230));

        scroll5.setBackground(new java.awt.Color(255, 255, 255));
        scroll5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll5.setViewportView(sucursales);

        btn_crear_sucursales.setBackground(new java.awt.Color(201, 201, 201));
        btn_crear_sucursales.setText("Crear");
        btn_crear_sucursales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_crear_sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_sucursalesActionPerformed(evt);
            }
        });

        jButton28.setText("Carga Masiva");
        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_actualizar_sucursales.setText("Actualizar");
        btn_actualizar_sucursales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar_sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_sucursalesActionPerformed(evt);
            }
        });

        btn_eliminar_sucursales.setText("Eliminar");
        btn_eliminar_sucursales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar_sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_sucursalesActionPerformed(evt);
            }
        });

        jButton31.setText("Exportar listado a PDF");
        jButton31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btn_crear_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btn_actualizar_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_crear_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_actualizar_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addComponent(scroll5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sucursales", jPanel2);

        jPanel3.setBackground(new java.awt.Color(176, 227, 230));

        jPanel9.setBackground(new java.awt.Color(176, 227, 230));

        scroll4.setBackground(new java.awt.Color(255, 255, 255));
        scroll4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll4.setViewportView(productos);

        btn_crear_producto.setBackground(new java.awt.Color(201, 201, 201));
        btn_crear_producto.setText("Crear");
        btn_crear_producto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_crear_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_productoActionPerformed(evt);
            }
        });

        jButton23.setText("Carga Masiva");
        jButton23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_actualizar_producto.setText("Actualizar");
        btn_actualizar_producto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_productoActionPerformed(evt);
            }
        });

        btn_eliminar_producto.setText("Eliminar");
        btn_eliminar_producto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_productoActionPerformed(evt);
            }
        });

        jButton26.setText("Exportar listado a PDF");
        jButton26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_crear_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_actualizar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_crear_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_actualizar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addComponent(scroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Productos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(176, 227, 230));

        jPanel8.setBackground(new java.awt.Color(176, 227, 230));

        scroll3.setBackground(new java.awt.Color(255, 255, 255));
        scroll3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll3.setViewportView(clientes);

        btn_crear_cliente.setBackground(new java.awt.Color(201, 201, 201));
        btn_crear_cliente.setText("Crear");
        btn_crear_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_crear_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_clienteActionPerformed(evt);
            }
        });

        jButton18.setText("Carga Masiva");
        jButton18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_actualizar_cliente.setText("Actualizar");
        btn_actualizar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_clienteActionPerformed(evt);
            }
        });

        btn_eliminar_cliente.setText("Eliminar");
        btn_eliminar_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_clienteActionPerformed(evt);
            }
        });

        jButton21.setText("Exportar listado a PDF");
        jButton21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn_crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn_actualizar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_actualizar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addComponent(scroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clientes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(176, 227, 230));

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll.setViewportView(tabla);

        btn_crear_vendedor.setBackground(new java.awt.Color(201, 201, 201));
        btn_crear_vendedor.setText("Crear");
        btn_crear_vendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_crear_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_vendedorActionPerformed(evt);
            }
        });

        jButton2.setText("Carga Masiva");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_actualizar_vendedor.setText("Actualizar");
        btn_actualizar_vendedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_vendedorActionPerformed(evt);
            }
        });

        btn_eliminar_vendedores.setText("Eliminar");
        btn_eliminar_vendedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar_vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_vendedoresActionPerformed(evt);
            }
        });

        jButton5.setText("Exportar listado a PDF");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crear_vendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_vendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_eliminar_vendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_crear_vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminar_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar_vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vendedores", jPanel5);

        btn_cerrar_sesion.setBackground(new java.awt.Color(229, 112, 107));
        btn_cerrar_sesion.setText("Cerrar sesión");
        btn_cerrar_sesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(229, 112, 107), new java.awt.Color(229, 112, 107), new java.awt.Color(229, 112, 107), new java.awt.Color(229, 112, 107)));
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_cerrar_sesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*
    Funcion de los botones para vendedores
    */
    private void btn_crear_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_vendedorActionPerformed
        CrearVendedor mostrar = new CrearVendedor();
        mostrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_crear_vendedorActionPerformed

    private void btn_actualizar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_vendedorActionPerformed
        if (tabla.getSelectedRow() >= 0){
            ModificarUser md = new ModificarUser();
            md.mostrar(tabla.getSelectedRow());
            md.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un usuario.");
        }
    }//GEN-LAST:event_btn_actualizar_vendedorActionPerformed

    
    /*
    Boton para cerrar sesion
    */
    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    
    /*
    Funcion de los botones para clientes
    */
    private void btn_crear_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_clienteActionPerformed
        CrearCliente cv = new CrearCliente();
        cv.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_crear_clienteActionPerformed

    private void btn_actualizar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_clienteActionPerformed
        if (clientes.getSelectedRow() >= 0){
            ModificarCliente mc = new ModificarCliente();
            mc.mostrar(clientes.getSelectedRow());
            mc.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un usuario.");
        }
    }//GEN-LAST:event_btn_actualizar_clienteActionPerformed

    
    /*
    Funcion de los botones para productos
    */
    private void btn_crear_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_productoActionPerformed
        CrearProducto cr = new CrearProducto();
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_crear_productoActionPerformed

    private void btn_actualizar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_productoActionPerformed
        if (productos.getSelectedRow() >= 0){
            ModificarProducto mp = new ModificarProducto();
            mp.mostrar(productos.getSelectedRow());
            mp.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un usuario.");
        }
    }//GEN-LAST:event_btn_actualizar_productoActionPerformed

    
    /*
    Funcion de los botones para sucursales
    */
    private void btn_crear_sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_sucursalesActionPerformed
        CrearSucursal cs = new CrearSucursal();
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_crear_sucursalesActionPerformed

    private void btn_actualizar_sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_sucursalesActionPerformed
        if (sucursales.getSelectedRow() >= 0){
            ModificarSucursal ms = new ModificarSucursal();
            ms.mostrar(sucursales.getSelectedRow());
            ms.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un usuario.");
        }
    }//GEN-LAST:event_btn_actualizar_sucursalesActionPerformed

    
    /*
    Funcion de los botones de eliminacion
    */
    private void btn_eliminar_vendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_vendedoresActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            Vendedores.lista.remove(tabla.getSelectedRow());
            AdminUser ad = new AdminUser();
            ad.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un usuario.");
        }
    }//GEN-LAST:event_btn_eliminar_vendedoresActionPerformed

    private void btn_eliminar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_clienteActionPerformed
        if (clientes.getSelectedRow() >= 0) {
            Clientes.lista_clientes.remove(clientes.getSelectedRow());
            AdminUser ad = new AdminUser();
            ad.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un cliente.");
        }
    }//GEN-LAST:event_btn_eliminar_clienteActionPerformed

    private void btn_eliminar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_productoActionPerformed
        if (productos.getSelectedRow() >= 0) {
            Productos.lista_productos.remove(productos.getSelectedRow());
            AdminUser ad = new AdminUser();
            ad.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar un producto.");
        }
    }//GEN-LAST:event_btn_eliminar_productoActionPerformed

    private void btn_eliminar_sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_sucursalesActionPerformed
        if (sucursales.getSelectedRow() >= 0) {
            Sucursales.lista_sucursales.remove(sucursales.getSelectedRow());
            AdminUser ad = new AdminUser();
            ad.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar una sucursal.");
        }
    }//GEN-LAST:event_btn_eliminar_sucursalesActionPerformed

    public void Mostrar_Tabla_Vendedores(){
        String columnas[] = {"Codigo", "Nombre", "Caja", "Ventas", "Genero"};
        DefaultTableModel tablita = new DefaultTableModel(null, columnas);
        
        for (Vendedores sp : Vendedores.lista){
            Object filas[] = new Object[5];
            filas[0] = sp.getCodigo();
            filas[1] = sp.getNombre();
            filas[2] = sp.getCaja();
            filas[3] = sp.getVentas();
            filas [4] = sp.getGenero();
            tablita.addRow(filas);
        }
        tabla.setModel(tablita);
    }
    
    public void Mostrar_Tabla_Clientes(){
        String columnas[] = {"Codigo", "Nombre", "NIT", "Correo", "Genero"};
        DefaultTableModel tablita_clientes = new DefaultTableModel(null, columnas);
        
        for (Clientes sp : Clientes.lista_clientes){
            Object filas[] = new Object[5];
            filas[0] = sp.getCodigo();
            filas[1] = sp.getNombre();
            filas[2] = sp.getNit();
            filas[3] = sp.getCorreo();
            filas [4] = sp.getGenero();
            tablita_clientes.addRow(filas);
        }
        clientes.setModel(tablita_clientes);
    }
    
    public void Mostrar_Tabla_Productos (){
        String columnas[] = {"Codigo", "Nombre", "Descripción", "Cantidad", "Precio"};
        DefaultTableModel tablita_productos = new DefaultTableModel(null, columnas);
        
        for (Productos sp : Productos.lista_productos){
            Object filas[] = new Object[5];
            filas[0] = sp.getCodigo();
            filas[1] = sp.getNombre();
            filas[2] = sp.getDescripcion();
            filas[3] = sp.getCantidad();
            filas [4] = sp.getPrecio();
            tablita_productos.addRow(filas);
        }
        productos.setModel(tablita_productos);
    }
    
    public void Mostrar_Tabla_Sucursales(){
        String columnas[] = {"Codigo", "Nombre", "Direccion", "Correo", "Telefono"};
        DefaultTableModel tablita_sucursales = new DefaultTableModel(null, columnas);
        
        for (Sucursales sp : Sucursales.lista_sucursales){
            Object filas[] = new Object[5];
            filas[0] = sp.getCodigo();
            filas[1] = sp.getNombre();
            filas[2] = sp.getDireccion();
            filas[3] = sp.getCorreo();
            filas [4] = sp.getTelefono();
            tablita_sucursales.addRow(filas);
        }
        sucursales.setModel(tablita_sucursales);
    }
    
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
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_cliente;
    private javax.swing.JButton btn_actualizar_producto;
    private javax.swing.JButton btn_actualizar_sucursales;
    private javax.swing.JButton btn_actualizar_vendedor;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_crear_cliente;
    private javax.swing.JButton btn_crear_producto;
    private javax.swing.JButton btn_crear_sucursales;
    private javax.swing.JButton btn_crear_vendedor;
    private javax.swing.JButton btn_eliminar_cliente;
    private javax.swing.JButton btn_eliminar_producto;
    private javax.swing.JButton btn_eliminar_sucursales;
    private javax.swing.JButton btn_eliminar_vendedores;
    private javax.swing.JTable clientes;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable productos;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JScrollPane scroll5;
    private javax.swing.JTable sucursales;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
