package ExResolvidos.Dollar;

public class ConversorDollar {

        public static double IOF = 0.06;

        public static double dollarToReal(double valor, double preçoDollar){
            return valor * preçoDollar * (1.0 + IOF);
        }
}
