
public class Respeitoso implements FormatadorNome{
	private final String genero;
	
	
	public Respeitoso(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if("M".equals(genero)) {
			return "Sr. "+ sobrenome;
		}else if("F".equals(genero)) {
			return "Sra. "+ sobrenome;
		}
		return sobrenome;
	}
}
