public class AsignadorDeNotas {

    public static String asignarNota(int puntuacion, int dificultad) {
        if (dificultad == 1) {
            if (puntuacion >= 70) {
                return "Bien";
            } else {
                return "Suficiente";
            }
        } else if (dificultad == 2) {
            if (puntuacion >= 70) {
                return "Notable alto";
            } else {
                return "Notable bajo";
            }
        } else if (dificultad == 3) {
            if (puntuacion >= 70 ) {
                return "Matrícula";
            } else {
                return "Sobresaliente";
            }
        }
        else {
            return "Suspenso";
        }
    }
}