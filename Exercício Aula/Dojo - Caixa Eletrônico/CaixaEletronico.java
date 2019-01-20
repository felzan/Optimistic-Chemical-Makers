package br.acelera;

public class CaixaEletronico {
  public CaixaEletronico() {}
  
  public int[] sacar(int valor) {
    if (valor > 1) {
      int[] notas = new int[4];
      
      while (valor > 0) {
        if (valor >= 100) {
          notas[3] += 1;
          valor -= 100;
        } else if (valor >= 50) {
          notas[2] += 1;
          valor -= 50;
        } else if (valor >= 20) {
          notas[1] += 1;
          valor -= 20;
        } else {
          notas[0] += 1;
          valor -= 10;
        }
      }
      
      return notas;
    }
    throw new IllegalArgumentException();
  }
}