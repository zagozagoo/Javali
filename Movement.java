public enum Movement
{
  FAST(20), SLOW(10);
  private int velocidade;

  Movement (int velocidadeparametro)
  {
    this.velocidade = velocidadeparametro;
  }

  public int getVelocidade()
  {
    return this.velocidade;
  }
}