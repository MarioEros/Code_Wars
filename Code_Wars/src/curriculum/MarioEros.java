package curriculum;

import java.util.Date;

/**
 *
 * @author MaerioErosRodrigu
 */
public class MarioEros {

    public String apellidosNombre = "Rodriguez Espinosa Mario Eros";
    public Email fechaNacimiento = new Email.parsEmail("erosazul@gmail.com");
    public String localidad = "Valladolid";
    
    private Date cursos(Curso curso){
        switch(curso){
            case "Curso de administrador de redes informáticas": return 11-2011;
            case "Curso de nivel básico de prevención de riesgos laborales": return 11-2011;
            case "Curso básico de emergencias": return 11-2008;
            case "Curso básico de peón especialista en extinción de incendios forestales": return 10-2008;
                
        }
    }
        
}
