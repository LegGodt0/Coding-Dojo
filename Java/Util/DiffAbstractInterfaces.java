public class DiffAbstractInterfaces {
    public static void main(String[] args) {
        /*
        Sabemos que ambas definen estructuras y contratos que deben seguir otras clases, pero las diferencias son:

        INTERFACES:

        - Métodos:

        En una interfaz TODOS los métodos son abstractos por defecto, y no tienen implementación. Esto almenos hasta Java 8 donde se pueden definir métodos default (con implementación) y métodos estáticos en las interfaces.

        - Implementación:

        Las clases que implementan una interfaz deben proporcionar implementaciones para todos los métodos definidos en la interfaz (a menos que la clase sea abstracta). Una clase puede implementar múltiples interfaces, lo que permite la HERENCIA MÚLTIPLE.

        - Extensión:

        Las interfaces no pueden extender clases ni otras interfaces, solo puedne ser implementadas por clases concretas.

        - Uso:

        Las interfaces se utilizan para definir CONTRATOS que deben seguir las clases que las implementan. Esto promueve la interoperabilidad y la flexibilidad en el diseño de software.


        ABSTRACT:

        - Métodos:

        Pueden contener métodos abstractos, concretos E INCLUSO CONSTRUCTORES

        - Implementación:

        Las clases que extienden una clase abstracta DEBEN proporcionar implementaciones para todos los métodos abstractos de la clase abstracta (a menos que la subclase también sea abstracta)

        - Extensión:

        Una clase abstracta puede extender otra clase abstracta y también puede implementar interfaces. Adema´s permite una jerarquía de clases más rica encomparación con las interfaces, puesto que puede incluir tanto método abstractos como concretos.

        - Uso:

        Las clases abstractas se utilizan para modelar conceptos más concretos y específicos que las interfaces. Proporcionan una implementación parcial y permiten la reutilización del código a través de la herencia.

        EN RESUMEN:
        
        */
    }
}