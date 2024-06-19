public class Interfaces {
    public static void main(String[] args) {
        
        /*
        Las interfaces surgen de la necesidad de que varios objetos puedan interactuar con algo de la misma manera. No es una clase, es similar a escribirla. La clase describe los atributos y acciones de un objeto. Una interfaz establece acciones o comportamientos que tienen que ser implementados en la clase.

        Una interfaz no puede especificar ninguna implementación (solo su "interfaz"). Esto significa que solo puede especificar métodos, no implementarlos.

        En resumen la interfaz es un grupo de métodos relacionados con cuerpos vacíos.

        ¿En qué se parecen?

        - Una interfaz puede contener cualquier cantidad de métodos
        - Una interfaz es escrita en un archivo .java, y debe coincidir el nombre de la interfaz y el del archivo
        - El bytecode de una interfaz aparece en .class
        - La interfaz usa paquetes, y su correspondiente bytecode debe estar en una estructura del directorio que coincida con el nombre del paquete

        ¿En qué se diferencian?

        - No se puede instanciar una interfaz (osea que no es como objetos cuando se pone Interfaz interfaz = new Interfaz())
        - Una interfaz no contiene constructores
        - Una interfaz no puede contener campos de instancia (llamar a otras). El único campo que puede aparecer en una interfaz tiene que ser declarado con ambas palabras: static y final.
        - Una interfaz no es extendida por una clase, es implementada por una clase
        - Una interfaz puede extener de múltiples interfaz, una clase solo puede extender de una clase, pero puede ser implementada por múltiples interfaz.

        MÉTODO DE INTERFAZ

        Existen 3 métodos de interfaz: default, static y abstract.

        1.- Los métodos DEFAULT permiten crear métodos por defecto que no necesitan implementación
        2.- Los métodos STATIC son métodos principales de una interfaz. También son implementados en el nivel de interfaz y son llamados dentro de esta, no en la clase. Por lo tanto no puede sobre escribir un método de interfaz STATIC. Solo pude llamarlos desde la interfaz donde fueron declarados.
        3.- Abstract son métodos que son declarados sin implementación.

        Los métodos predeterminados son declarados con al palabra default, y los estáticos con static. Los abstract son implícitos y no incluye un tipo de método.

        - Abstract es el tipo de método implícito, sin declaración ni static ni default.
        - Public es el modificador de acceso implícito.

        Una interfaz puede contener constantes declaradas tanto como (ejemplo, statc final class variables). Todos los valores de constantes definidos en una interfaz son implícitamente public, static y final. Por lo tanto, es libre de omitir estos modificadores.

        */

        public interface OperateBicycle {
            // Una constante que es public, static y final
            double myConstant = 3.0;
            
            //El metodo predeterminado no necesita implementación.
            default void sayHello() {
                System.out.println("Hola a todos.");
            }
            
            //El método static que no necesita implementación.
            static void staticMethod() {
                System.out.println("Hola desde el metodo static de la interfaz.");
            }
            void speedUp(int increment);
            void applyBrakes(int decrement);
        }
        
        /*
        ¿Cómo se implementa una interfaz?

        Debemos utilizar la palabra clave "implements" en la definición de nuestra clase. Sin embargo hay una regla. Una clase que es implementada por una interfaz debe implementar todos los métodos que están definidos en la interfaz además de los default y static. (Osea que debemos declararlos y asignarlos todos)
        */

        class Bicycle implements OperateBicycle {        
            private int speed;
            public Bicycle() {
                speed = 0;
            }
            //Un método static que llama al método static de la interfaz
            public static void staticMethod() {
                OperateBicycle.staticMethod();
            }
            // implementando speedUp
            public void speedUp(int increment) {
                speed += increment;
            }
            // implementando applyBrakes
            public void applyBrakes(int decrement) {
                speed -= decrement;
            }
            public int getSpeed() {
                return speed;
            }
        }
        
        
    }
    
}
