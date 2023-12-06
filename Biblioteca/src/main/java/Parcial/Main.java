package Parcial;

import com.google.gson.Gson;
import spark.Spark;

public class Main {
    public static void main(String[] args) {
        
        Spark.port(4567); 

        // Endpoint para obtener información de un libro por título en formato JSON
        Spark.get("/libro/:titulo", (req, res) -> {
            String titulo = req.params(":titulo");
            
            // Ejemplo de respuesta en formato JSON
           Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", "1943");
            res.type("application/json");
            return new Gson().toJson(libro);
        });

        // Endpoint para prestar un libro en formato JSON
        Spark.post("/prestar/:identificador", (req, res) -> {
            String identificador = req.params(":identificador");
            
            // Ejemplo de respuesta en formato JSON
            Copia copia = new Copia(identificador, "Prestado");
            res.type("application/json");
            return new Gson().toJson(copia);
        });

        // Endpoint para devolver un libro en formato JSON
        Spark.post("/devolver/:identificador", (req, res) -> {
            String identificador = req.params(":identificador");
            
            // Ejemplo de respuesta en formato JSON
            Copia copia = new Copia(identificador, "Disponible");
            res.type("application/json");
            return new Gson().toJson(copia);
        });

        // Endpoint para obtener multas de un lector en formato JSON
        Spark.get("/multas/:lector", (req, res) -> {
            
            // Ejemplo de respuesta en formato JSON
            Multa multa = new Multa("Motivo Ejemplo", 10.0, "01/01/2023");
            res.type("application/json");
            return new Gson().toJson(multa);
        });

        // Para detener la aplicación Spark
        Spark.stop();
    }
}
