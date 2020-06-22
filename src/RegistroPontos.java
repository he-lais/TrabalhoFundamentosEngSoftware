package Semana2_RelacoesEntreClasses;

public class RegistroPontos
{
	private CalculadoraBonus cb;
	
	public RegistroPontos(CalculadoraBonus cb)
	{
		this.cb = cb;
	}
	
	//USUARIO VIP, RECEBEU COMENTARIO, GANHA 3 PONTOS
	public void fazerUmComentario(Usuario u)
	{
		u.pontos += 3 * cb.bonus(u);
	}
	
	public void criarUmTopico(Usuario u)
	{
		u.pontos += 5 * cb.bonus(u);
	}
	
	public void darUmLike(Usuario u)
	{
		u.pontos += 1 * cb.bonus(u);
	
	}
}