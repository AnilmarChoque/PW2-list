import java.util.List;

public class ListagemUsuario {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setID(1);
		u1.setNome("Roberto");
		u1.setPontuacao(10);
		u1.setModerador(true);
		
		Usuario u2  = new Usuario();
		u2.setID(2);
		u2.setNome("Geremias");
		u2.setPontuacao(7);
		u2.setModerador(true);
		
		Usuario u3 = new Usuario();
		u3.setID(3);
		u3.setNome("lindo");
		u3.setPontuacao(9);
		u3.setModerador(true);
	
		Usuario u4 = new Usuario();
		u4.setID(4);
		u4.setNome("ednaldo pereira");
		u4.setPontuacao(4);
		u4.setModerador(true);
	
		Usuario u5 = new Usuario();
		u5.setID(5);
		u5.setNome("alberto");
		u5.setPontuacao(6);
		u5.setModerador(true);
		
		List<Usuario> lista = List.of(u1, u2, u3, u4, u5);
		
		System.out.println("Quantidade:" + lista.size());
		
		lista.forEach(e -> {
			System.out.println("Id: " + e.getID());
			System.out.println("Nome: " + e.getNome());
			System.out.println("Pontuação: " + e.getPontuacao());
			System.out.println("Moderador? " + e.getModerador());
		});
	}
	

}
