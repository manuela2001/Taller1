/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Manuela Gomez
 */
public class Controlador {
    Casilla [][] casillas;
    
    public Controlador (int f, int c){
        //almacenes=singleton.getInstancia.getalmacenes
        this.casillas = new Casilla [f][c];
        initCasillas();
    }
    private void initCasillas(){
        for(int i=0; i<casillas.length; i++){
            for (int j=0; j<casillas[i].length; j++){
                casillas[i][j] = new Casilla();
                
            }
            
        }
        agregarBomba();//singleton que escriba el almacen}
        //singleton que lo lea
    }
    private void agregarBomba(){
        int filas= (int)(Math.random()*casillas.length);
        int columnas = (int)(Math.random()*casillas[0].length);
        casillas[filas][columnas].setEstado(Casilla.BOMBA);// se setean las caracteristicas el estado y luego se escribe
    }
    
    public Casilla obtenerPosicion(int f, int c){
        return casillas [f][c];
        
            
        }
    }
//Almacen[][] almacenes;
//    LSE<Cliente> clientes;
//
//    public ControladorAlmacen() {
//        almacenes = Singleton.getINSTANCIA().getAlmacenes();
//        clientes = Singleton.getINSTANCIA().getClientes();
//        initAlmacenes();
//    }
//
//    private void initAlmacenes() {
//        if(almacenes[0][0] == null){
//        for (int i = 0; i < almacenes.length; i++) {
//            for (int j = 0; j < almacenes[i].length; j++) {
//                almacenes[i][j] = new Almacen();
//            }
//        }
//                Singleton.getINSTANCIA().escribirAlmacen();
//            }else{
//            Singleton.getINSTANCIA().leerAlmacen();
//        }
//    }
//
//    public void ocuparAlmacen(Almacen almacen, Cliente cliente, String usuario, String contrasenia) {
//        almacen.setCliente(cliente);
//        almacen.setContrasenia(contrasenia);
//        almacen.setUsuario(usuario);
//        almacen.setEstado(Almacen.OCUPADO);
//        Singleton.getINSTANCIA().escribirAlmacen();
//
//    }
//
//    public Almacen obtenerAlmacen(int fila, int columna) {
//        return almacenes[fila][columna];
//    }
//
//    public Cliente buscarCliente(String cedula) {
//        for (int i = 0; i < clientes.size(); i++) {
//            if (clientes.get(i).getCedula().equals(cedula)) {
//                return clientes.get(i);
//            }
//        }
//        return null;
//    }
//
//    public void deshabilitarAlmacen(Almacen almacen, String motivo) {
//        almacen.setEstado(Almacen.DESHABILITADO);
//        almacen.setMotivo(motivo);
//        Singleton.getINSTANCIA().escribirAlmacen();
//    }
//    
//    public void habilitarAlmacen(Almacen almacen) {
//        almacen.setEstado(Almacen.DISPONIBLE);
//        Singleton.getINSTANCIA().escribirAlmacen();
//    }
//}
