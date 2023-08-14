package dataaa;

public class DataFinal {
        private int dia;
        private int mes;
        private int ano;


        public boolean dataFinal(int dia, int mes, int ano) {
            boolean dataFinal = true;
            if (dia > 0 && dia < 32 && mes >= 1 && mes <= 12 && ano > 1999 && ano < 2030) {
                System.out.println("" + dia + "/" + mes + "/" + ano + " (Data Válida)");
            } else {
                System.out.println("0");
            }

            return dataFinal;
        }
}
