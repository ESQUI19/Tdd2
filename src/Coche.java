
public class Coche {

	public int velocidad;

	public void acelerar_Victoria(int aceleracion) {
		
		velocidad += aceleracion;
		
	}

	public void decelerar_Victoria(int deceleracion) {
		
		velocidad -= deceleracion;
		
		if(velocidad < 0) {
			velocidad = 0;
		}
		
	}

}
