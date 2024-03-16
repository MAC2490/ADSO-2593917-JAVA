public class Taller2{
    public static void main(String [] args){
        int dias;
        dias = (int)(Math.random()*31);
        if (dias<31){
            System.out.print(dias);
        }
        boolean buscando = true; 
        while (buscando==true){
            int meses = (int)(Math.random()*12);
            if (meses<=12){
                System.out.print(meses);
                buscando = false;
            }
        }
        boolean buscar = true;
        while (buscar==true){
            int anos = (int)(Math.random()*9999);
            if (anos>=1000 && anos<=9000){
                System.out.print(anos);
                buscar = false;
            }
        }
    }
}