import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_al_crear_un_coche_su_velocidad_es_cero() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	void test_al_acelerar_un_coche_su_velocidad_es_aumenta() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_Victoria(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void test_al_decelerar_un_coche_su_velocidad_es_disminuye() {
		//se crea un objeto Coche
		Coche nuevoCoche = new Coche();
		
		//le asigna una velocidad en este punto
		nuevoCoche.velocidad = 50;
		
		//decelera la velocidad del coche en 20
		nuevoCoche.decelerar_Victoria(20);
		
		//se espera que la velocidad final sea de 30
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		
		//el coche tiene una velocidad de 50 y se decrementa en 80 (resultado -30)
		nuevoCoche.decelerar_Victoria(80);
		
		//se espera que la velocidad final sea de 0
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}

}
