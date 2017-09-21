abstract class CriarPacoteFeriasBulder {
	 Ferias ferias = new Ferias();
	public Ferias getPacoteDeFerias() {
		return ferias;
	}
	abstract void comprarPassagens();
	abstract void reservarHotel();
	abstract void prepararPasseio();
}
class FeriasBrasilBuilder extends CriarPacoteFeriasBulder{
	@Override
	void comprarPassagens() {
	 ferias.setVoo(" Voo para o Brasil pela TAM para duas pessoas\n"); 	
	}
	@Override
	void reservarHotel() {
	ferias.setHotel("Seu Hotel é Gran Palace do Rio de Janeiro\n");		
	}
	@Override
	void prepararPasseio() {
	ferias.setPasseios("Existem dois passeios para o Pão de Açucar no final de semana\n");		
	}
}
class Ferias {
	private String voo;
	private String hotel;
	private String passeios;
	public String getVoo() {
		return voo;
	}
	public void setVoo(String voo) {
		this.voo = voo;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getPasseios() {
		return passeios;
	}
	public void setPasseios(String passeios) {
		this.passeios = passeios;
	}
	public String toString(){
	 return ""+voo+""+hotel+""+passeios;
	}
	@Override
	void comprarPassagens() {
		ferias.setVoo("O voo pela Italy nunca mais está reservado");		
	}
	@Override
	void reservarHotel() {
		ferias.setHotel("Hotel Pisa de 5 estrelas está reservado");		
	}
	@Override
	void prepararPasseio() {
		ferias.setPasseios("Passeio ao Coliseo está reservado");		
	}
}
public class BuilderExemplo {
	public static void main(String[] args) {
		Client c= new Client();
		//c.setBulder(new  FeriasBrasilBuilder() );
		c.setBulder(new  FeriasItaliaBuilder() );
		c.constructPacoteDeFerias();
		System.out.println( c.getPacoteFerias() );
	}
}