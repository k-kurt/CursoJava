 class cliente {
    
    public cliente(String nombre, String n_cuenta, double saldo){

        this.nombre=nombre;
        this.n_cuenta=n_cuenta;
        this.saldo=saldo;

    }


    private String nombre;
    private String n_cuenta;
    private double saldo;

    public String getNombre() {
      return this.nombre;
    }
    public void setNombre(String value) {
      this.nombre = value;
    }

    public String getN_cuenta() {
      return this.n_cuenta;
    }
    public void setN_cuenta(String value) {
      this.n_cuenta = value;
    }

    public double getSaldo() {
      return this.saldo;
    }
    public void setSaldo(double value) {
      this.saldo = value;
    }
}
