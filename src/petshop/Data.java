package petshop;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
class Data {
    
    String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");
    
    public void le_hora()
    {
        Date horaAtual = new Date();
        hora = horaformatada.format(horaAtual);
        
    }
    
    
    
    public void le_data(){
        
      Date data=new Date();  
        mes=""+data.getMonth();
        dia=""+data.getDate();
        ano=""+(1900+data.getYear());
        
        
        switch(data.getMonth()){
            
            case 0: mes="Janeiro";break;
            case 1: mes="Fevereiro";break;
            case 2: mes="Março";break;
            case 3: mes="Abril";break;
            case 4: mes="Maio";break;
            case 5: mes="Junho";break;
            case 6: mes="Julho";break;
            case 7: mes="Agosto";break;
            case 8: mes="Setembro";break;
            case 9: mes="Outubro";break;
            case 10: mes="Novembro";break;
            case 11: mes="Dezembro";break;

                                  
        }
    }
    
    
}
