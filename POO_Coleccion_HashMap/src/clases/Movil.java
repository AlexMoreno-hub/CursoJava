package clases;

public class Movil {

		private  int imei;
		private int memoria;
		private String marca;
		private int tamanoPantalla;
		
			
		public Movil() {
			super();
		}

		public Movil(int imei, int memoria, String marca, int tamanoPantalla) {
			super();
			this.imei = imei;
			this.memoria = memoria;
			this.marca = marca;
			this.tamanoPantalla = tamanoPantalla;
		}
		
		public int getImei() {
			return imei;
		}

		public void setImei(int imei) {
			this.imei = imei;
		}
		
		public int getMemoria() {
			return memoria;
		}
		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getTamanoPantalla() {
			return tamanoPantalla;
		}
		public void setTamanoPantalla(int tamanoPantalla) {
			this.tamanoPantalla = tamanoPantalla;
		}
		
		

		@Override
		public String toString() {
			return "Movil [imei=" + imei + ", memoria=" + memoria + ", marca=" + marca + ", tamanoPantalla="
					+ tamanoPantalla + "]";
		}

		public void aumentarMemoria() {
			this.memoria++;
		}
		
	}


