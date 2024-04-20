public class Computadoras extends electronicos{
    private String cpu;
    private String Ram;

    public Computadoras() {
        cpu=null;
        Ram=null;
    }

    public Computadoras(int id, String marca, String modelo, String cpu, String ram) {
        super(id, marca, modelo);
        this.cpu = cpu;
        Ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return Ram;
    }
    @Override
    public void datosArticulo(String c1, String c2){
        setCpu(c1);
        setRam(c2);
    }
    @Override
    public void MostarDatosArticulos(){
        System.out.println("CPU: " + getCpu());
        System.out.println("RAM: " + getRam());
    }
}
