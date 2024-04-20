public abstract class electronicos {
    protected int id;
    protected String Marca;
    protected String Modelo;
    protected int cantidad;

    public static int contador = 0;

    public int generarId(){
        return contador++;
    }

    electronicos(){
        id= generarId();
        Marca=null;
        Modelo=null;
    }

    public int getId() {
        return id;
    }

    public String getMarca(){
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }


    electronicos(int id, String marca, String modelo){
        this.id = id;
        this.Marca= marca;
        this.Modelo = modelo;
    }

        public void setMarca(String marca){
            this.Marca = marca;
        }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean IngresarMarca(String marca){
        if(marca != null){
            setMarca(marca);

            return true;
        }
        else{
            return false;
        }
    }
    public boolean IngresarModelo(String modelo){
        if(modelo != null){
            setMarca(modelo);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean Productos(int cantidad){
        if(cantidad > 0){

            cantidad += cantidad;
            return true;
        }
        else{
            return false;
        }
    }


    public abstract  void datosArticulo(String c1, String c2);
    public abstract void MostarDatosArticulos();

}
