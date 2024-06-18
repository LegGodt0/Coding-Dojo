public class This {
    public static void main(String[] args) {
        
        /*
        Como fue mencionado anteriormente, "this" hace referencia al objeto actual dentro del contexto de la isntancia del método o constructor. El objeto actual es el simple objeto que su constructor o método ha sido llamado.

        POR EJEMPLO:

        class Person {
            private int age;
            private String name;
            public Person(int ageParam, String nameParam) {
                this.age = ageParam;
                this.name = nameParam;
            }
        }

        es lo mismo que:
        
        class Person {
            private int age;
            private String name;
            public Person(int ageParam, String nameParam) {
                age = ageParam;
                name = nameParam;
            }
        }

        Ambos códigos hacen lo mismo. Hay un caso en que se DEBE utilizar this, que es cuando los parámetros del método tienen el mismo nombre que los atributos de la clase (como se mencionó anteriormente)

        Otro uso para this, es cundo se hace una sobrecarga en el constructor. 

        SUPER CLASES:

        Esto son básicamente heredaciones, sabemos que todos los objetos son descendientes de la clase Object (la cual es una súper clase), ya que está en la cima de la jerarquía de clases. Los métodos más comunes utilizados de la clase Object son:

        - .getClass(): Devuelve un objeto de tipo Class que representa la clase actual del objeto.
        - .equals(): Compara dos objetos y devuelve un boolean.
        - .toString(): Devuelve una cadena en representación del objeto. Si lo desea, puede sobreescribir este método.

        

        */
    }
}
