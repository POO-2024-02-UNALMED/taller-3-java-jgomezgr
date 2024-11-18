package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	public static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	public Marca getMarca(){
        return this.marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int canal){
        if (this.estado == true && 1 <= canal && canal <= 120){
            this.canal = canal;
        }
    }
    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int volumen){
    	if(this.estado == true && 0 <= volumen && volumen <= 7)
            this.volumen = volumen;
    }
    public Control getControl(){
        return this.control;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public static int getNumTV () {
    	return TV.numTV;
    }
    public static void setNumTV (int nuevonumTV) {
    	TV.numTV = nuevonumTV;
    }
    public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
    }
    public boolean getEstado() {
		return this.estado;
	}
    public void canalUp() {
        if(this.estado == true && this.canal < 120){
		this.canal++;
        }
	}
	public void canalDown() {
		if(this.estado == true && this.canal > 1){
		this.canal--;
        };
	}
    public void volumenUp() {
        if(this.estado == true && this.volumen < 7){
		this.volumen++;
        }
	}
	public void volumenDown() {
		if(this.estado == true && this.volumen > 0){
            this.volumen--;
            }
	}
}