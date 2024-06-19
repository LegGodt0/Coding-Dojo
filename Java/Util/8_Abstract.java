public class Abstract {
    
    public static void main(String[] args) {
        
        /*
        Las clases abstractas son similiares a las interfaces. No pueden ser instanciadas. Las clases abstractas no poseen campos static ni final ni por defecto, esto conlleva a que no son constantes las variables globales. Los métodos pueden ser public protected o private.

        ¿Por qué abstracta?

        Se usa para proporcionar una ESTRUCTURA BASE que otras clases pueden extender y especializar. Podríamos decir que: 

        * En cuanto a clases abstractas y su extensión:

        - Una clase abstracta es como un esqueleto. Define métodos y propiedades que las hijas deben implementar pero no se puede instanciar directamente
        - Esto significa que una clase abstracta sirve como una plantilla incompleta que espera ser completada por clases hijas

        * Prevención de ambigüedad:

        - Imagina que tienes a "Mammal", esta define las características generales de los mamíferos (como perro o gato), pero estos tienen comportamientos únicos y por lo tanto son más específicos.

        - La clase "Mammal" podría ser abstracta para asegurar que no se pueda crear un objeto "Mammal" genérico, ya que sería demasiado general e incompleto para representar cualquier mamífero específico.

        - De esta manera se evita la ambigüedad, ya que se OBLIGA a que las clases sean más específicas y definan concretamente cómo se comportan y qué datos tienen.

        * USO en sistemas más grandes:

        - Usar clases abstractas ayuda a organizar y estructurar el código de manera más clara
        - Permite definir comportamientos generales en las clases abstractas y luego especializar esos comportamientos en las clases hijas según sea necesario.
        - También promueve la reutlización de código al establecer una jerarquía de clases bien definida.

        EN RESUMEN: las clases abstractas son útilez para proporcionar una base común y estructurada, estas puden ser heredadas para completas con implementaciones específicas. Esto no solo organiza el código de manera efectivo, sino que también asegura que las clases sean utilizadas de manera coherente y específica dentro del diseño del programa.

        Nota: Se hará una archivo aparte para definir las diferencias entre Interfaces y Abstract.
        */

    }
}
