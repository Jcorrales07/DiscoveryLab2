public class Animal {
    //Atributos
    private String nombreCientifico;
    private String nombreComun;
    private String habitat;
    private String alimentacion;
    private String descripAnimal;
    private String disGeo;
    private int vida;

    //Constructores
    public Animal() {}

    public Animal(String nombreCientifico, String nombreComun, String habitat,
           String alimentacion, String descripAnimal, String disGeo, int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripAnimal = descripAnimal;
        this.disGeo = disGeo;
        this.vida = vida;
    }

    //Getters y Setters
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDescripAnimal() {
        return descripAnimal;
    }

    public void setDescripAnimal(String descripAnimal) {
        this.descripAnimal = descripAnimal;
    }

    public String getDisGeo() {
        return disGeo;
    }

    public void setDisGeo(String disGeo) {
        this.disGeo = disGeo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //Metodo ToString para desplegar informacion
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("nombreCientifico ='").append(this.nombreCientifico).append('\'');
        sb.append(", nombreComun ='").append(this.nombreComun).append('\'');
        sb.append(", habitat ='").append(this.habitat).append('\'');
        sb.append(", alimentacion ='").append(this.alimentacion).append('\'');
        sb.append(", descripAnimal ='").append(this.descripAnimal).append('\'');
        sb.append(", disGeo ='").append(this.disGeo).append('\'');
        sb.append(", vida = ").append(this.vida);
        sb.append("}");
        return sb.toString();
    }
}
