package Semana2_RelacoesEntreClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test; 
import org.junit.jupiter.api.Test; 
import org.junit.jupiter.api.Test; 

import org.junit.jupiter.api.Test; 

import org.junit.jupiter.api.Test; 
import org.junit.jupiter.api.Test; 
class TesteRegistroPontos
{
	@Test
	public void pontosCriarTopico()
	{
		Usuario u = new Usuario ();
		u.nome = "Laís";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos (cb);
		rp.criarUmTopico(u);
		
		assertEquals(5,u.pontos);
	}
	
	@Test
	public void pontosCriarTopicoVip()
	{
		Usuario u = new Usuario ();
		u.nome = "Laís";
		u.vip=true; 
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos (cb);
		rp.criarUmTopico(u);		
		assertEquals(25,u.pontos);
	}
	
	@Test
	public void pontosDarLike()
	{
		Usuario u = new Usuario();
		u.nome = "Laís de Paula";
			u.vip = false;
			CalculadoraBonus cb = new CalculadoraBonus();
			RegistroPontos rp = new RegistroPontos(cb);			
			rp.darUmLike(u);
			
			assertEquals(2, u.pontos);
		}
	}
	

