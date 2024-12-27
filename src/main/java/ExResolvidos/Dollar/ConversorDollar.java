package ExResolvidos.Dollar;

public class ConversorDollar { // nome da class inteira para ser chamada

        public static double IOF = 0.06; // uma das variaveis utilizadas extatica

        public static double dollarToReal(double valor, double preçoDollar){ // calculo utilizado, com os dois parametros
            return valor * preçoDollar * (1.0 + IOF); // sem o nome void, obrigatorio o return
        }
}
