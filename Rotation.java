public enum Rotation
{
  LEFT15(15), LEFT30(30), RIGHT15(-15), RIGHT30(-30);
  private int angulo;

  Rotation(int anguloparametro)
  {
    this.angulo = anguloparametro;
  }

  public int getAngulo()
  {
    return this.angulo;
  }
}

