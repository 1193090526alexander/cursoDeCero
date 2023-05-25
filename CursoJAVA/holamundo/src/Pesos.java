public class Pesos {
    public static void main(String[] args) {
        int pesos = 4800;
        double comision =0,valorRetencionFuente=0;
        double giroEnDolares = 1001;

         if (giroEnDolares>0 & giroEnDolares<=500){
             comision = giroEnDolares*0.075;
        }else if (giroEnDolares>501 & giroEnDolares<=2000){
             comision = giroEnDolares*0.053;
         } else if (giroEnDolares>2001 & giroEnDolares<=5000){
             comision = giroEnDolares*0.041;
         }else if (giroEnDolares>5001){
             comision = giroEnDolares*0.032;
         }if(giroEnDolares>1000){
          valorRetencionFuente = giroEnDolares*0.01;
        }
        double valorNeto = (giroEnDolares - comision - valorRetencionFuente);
        double conversionPesos = valorNeto*pesos;
        System.out.println("conversionPesos = " + conversionPesos);
        System.out.println("valorNeto en dolares= " + valorNeto);
        System.out.println("comision en dolares = " + comision);
        System.out.println("valorRetencionFuente en dolares = " + valorRetencionFuente);
    }
}
