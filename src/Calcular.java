
public class Calcular {

    int inicio;
    int finall;
    int increment;
    int actual;

    public Calcular(int inicio, int finall, int increment) {
        this.inicio = inicio;
        this.finall = finall;
        this.increment = increment;
        this.actual = inicio;
    }

    public boolean compro() {

        if ((inicio == 0) || (inicio == 1)) {
            if ((increment == 0) || (increment == 1)) {
                if (finall > inicio) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean incrementuo() {
        this.actual = +increment;
        if (this.actual >= this.finall) {
            return false;
        } else {
            return true;
        }
    }

    public void resetear() {
      this.actual = inicio; 
    }



}
