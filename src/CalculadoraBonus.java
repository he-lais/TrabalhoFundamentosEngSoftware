package Semana2_RelacoesEntreClasses;

// CLASSE PARA CALCULAR UM BONUS PARA USUÁRIO VIP
public class CalculadoraBonus
{
	public int bonusDoDia = 1;
	
	public int bonus (Usuario u)
	{
		int multiplicador = bonusDoDia;		
			if (u.vip)
				multiplicador *= 5;
			return multiplicador;
	}
			
}
