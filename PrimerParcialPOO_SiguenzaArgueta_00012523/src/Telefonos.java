public class Telefonos extends electronicos{

    private String SIM;
    private String Sistema;

    public Telefonos() {
        this.SIM = null;
        Sistema = null;
    }

    public Telefonos(int id, String marca, String modelo, String SIM, String sistema) {
        super(id, marca, modelo);
        this.SIM = SIM;
        Sistema = sistema;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public void setSistema(String sistema) {
        Sistema = sistema;
    }

    public String getSIM() {
        return SIM;
    }

    public String getSistema() {
        return Sistema;
    }

    @Override
    public void datosArticulo(String c1, String c2){
        setSistema(c1);
        setSIM(c2);
    }
    @Override
    public void MostarDatosArticulos(){
        System.out.println("Sistema operativo: " + getSistema());
        System.out.println("Tipo de SIM: " + getSIM());
    }
}
