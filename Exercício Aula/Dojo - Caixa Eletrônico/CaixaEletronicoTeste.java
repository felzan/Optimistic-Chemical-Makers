package br.acelera;

import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTeste
{
  public CaixaEletronicoTeste() {}
  
  @Test
  public void sacarDez()
  {
    int valor = 10;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 1, 0, 0, 0};
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void sacarValorNegativo() {
    int valor = -10;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    caixaEletronico.sacar(valor);
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void sacarZero() {
    int valor = 0;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    caixaEletronico.sacar(valor);
  }
  
  @Test
  public void sacarVinte() {
    int valor = 20;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 1, 0, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarTrinta() {
    int valor = 30;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 1, 1, 0, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarQuarenta() {
    int valor = 40;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 2, 0, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarCinquenta() {
    int valor = 50;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 0, 1, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarSessenta() {
    int valor = 60;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 1, 0, 1, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarSetenta() {
    int valor = 70;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 1, 1, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarOitenta() {
    int valor = 80;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 1, 1, 1, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarNoventa() {
    int valor = 90;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 2, 1, 0 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarCem() {
    int valor = 100;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 0, 0, 1 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarCentoEDez() {
    int valor = 110;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 1, 0, 0, 1 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarCentoEVinte() {
    int valor = 120;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 1, 0, 1 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
  
  @Test
  public void sacarUMilhao() {
    int valor = 1000000;
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    int[] valorEsperado = { 0, 0, 0, 1000 };
    int[] notasRetornadas = caixaEletronico.sacar(valor);
    Assert.assertArrayEquals(valorEsperado, notasRetornadas);
  }
}