import javax.swing.JOptionPane;

public class Platinum {
        
    Stock m =new Stock();
    
    int key, cantidad;
    String objeto;
    
    public Platinum(int id, String producto, int cant){
        key = id;
        objeto = producto;
        cantidad = cant;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String Objeto) {
        this.objeto = Objeto;
    }
    
    
    public void ActualizarObjeto() {
        objeto = JOptionPane.showInputDialog("Ingrese el nuevo nombre del objeto: \nObjeto anterior: " + objeto);
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad \nCantidad anterior: " + cantidad));
    }
    
    public void PedirObjeto() {
        
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
        int formula = cantidad-cant;
        
        if (formula >= 0) {
            cantidad = cantidad-cant;
            int codigo = (int)(Math.random()*((1000-0)+1))+0;
            JOptionPane.showMessageDialog(null, "El código de factura es: " + codigo);
        }
        else{
            JOptionPane.showMessageDialog(null, "Cantidad Insuficiente");
        }
    }
    
}
