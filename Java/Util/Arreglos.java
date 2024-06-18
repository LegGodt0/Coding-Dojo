public class Arreglos {
    public static void main(String[] args){
        /*
        Declaración, inicialización y adición de valores en pasos separados:

            int[] myArray; //Declaración
            myArray = new int[5]; // Inicialización
            myArray[0] = 4; // agregar valor
            myArray[1] = 8; // agregar valor
            myArray[2] = 8; // agregar valor
            myArray[3] = 5; // agregar valor
            myArray[4] = 9; // agregar valor

        Todo de una vez:

            int[] myArray = {4, 8, 8, 5, 9};

        NOTA: TODOS ESTOS TIENEN UN VALOR FIJO
        */

        int[] myArray = {4, 8, 8, 5, 9};

        /*
        ¿Cómo hacer un arreglo sin tamaño fijo? Con el módulo util, que nos provee un ArrayList:

            import java.util.ArrayList;
            ArrayList<Integer> myArray = new ArrayList<Integer>();

        ¿Qué es este asunto de <Integer>? Esto es parte de lo que llamamos generics, y lo que necesita saber es que esto le dice a nuestro ArrayList el tipo de
        datos aceptables que puede contener. Si no lo incluimos (¡Inclúyelo siempre!), podíamos haber agregado cualquier dato a nuestro ArrayList como cadenas,
        enteros, y todo tipo de cosas. Generics ayuda a evitar que nuestro compilador y nosotros, cometamos errores que aparezcan en tiempo de ejecución.
        Lo más importante que debe saber acerca de generics, ahora mismo, es que usted debería usarlos.
        */

        import java.util.ArrayList;
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        myArray.add(10);
        int num = myArray.get(0);

        /*
        ¿Qué pasa si quiere agregar elementos de que son de diferente tipo? Bueno, todos los objects son heredados de la clase Object.
        Por lo tanto, podemos tener nuestro generics como un objeto y agregar diferentes tipos de objeto. Por ejemplo:
            import java.util.ArrayList;
            ArrayList<Object> list = new ArrayList<Object>();
            list.add(10);
            list.add("Hola");
            list.add(new ArrayList<Integer>());
            list.add(new Double(12.0)); //Agregando un Double con valor 12.0
            System.out.println(list); // [10, "Hola", [], 12.0]
         */
    }
}