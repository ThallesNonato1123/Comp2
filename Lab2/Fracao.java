import java.util.Objects;

import static java.lang.Math.abs;

/**
 * Representa uma fração de forma explícita, guardando numerador e denominador inteiros.
 * Frações equivalentes (matematicamente) devem ser consideradas equals().
 */
public class Fracao {

    int numerador;
    int denominador;
    boolean sinal;
    float resultado;

    public Fracao(int numerador, int denominador) {

        if (denominador == 0) {
            throw new ArithmeticException("Denominador não pode ser zero!!");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fracao fracao = (Fracao) o;
        return this.getValorNumerico() == fracao.getValorNumerico();
    }

    /**
     * Retorna o sinal da fração.
     *
     * @return true, se for positiva ou nula (zero);
     * false, se for negativa.
     */
    public boolean getSinal() {
        this.sinal = this.numerador * this.denominador >= 0;
        return this.sinal;
    }

    /**
     * Retorna o (valor absoluto do) numerador desta fração, ou seja, sempre não-negativo
     *
     * @return o numerador
     */
    public int getNumerador() {
        return abs(numerador);  // ToDo: IMPLEMENT ME!!!!
    }

    /**
     * Retorna o (valor absoluto do) denominador desta fração, ou seja, sempre positivo
     *
     * @return o numerador
     */

    public int getDenominador() {
        return abs(denominador);
    }

    /**
     * Retorna o valor numérico da fração (com o sinal correto).
     *
     * @return um float, com o valor na melhor precisão possível
     * Ex.: -1/3 vai retornar 0.33333333
     */
    public float getValorNumerico() {
        float a;
        float b;
        a = numerador;
        b = denominador;
        resultado = a / b;
        return resultado;  // ToDo: IMPLEMENT ME!!!!
    }

    /**
     * Retorna uma fração equivalente à esta fração,
     * e que não pode mais ser simplificada (irredutível).
     *
     * @return um outro objeto Fracao, se esta fração for redutível;
     * esta própria fração (this), se ela já for irredutível
     */
    public Fracao getFracaoGeratriz() {
        int mdc = AritmeticaUtils.mdc(numerador, denominador);
        if (mdc != 1)
            return new Fracao(numerador / mdc, denominador / mdc);
        return this;
    }

    @Override
    public String toString() {
        if(getNumerador() == 0)
            return "" + 0;

        if(getDenominador() == 1 && getSinal())
            return "" + getNumerador();

        if(getDenominador() == 1 && !getSinal())
            return "-" + getNumerador();

        if (getSinal()) {
            return getNumerador() + "/" + getDenominador();
        }return "-" + getNumerador() + "/" + getDenominador();

    }
}