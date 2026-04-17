package src;

import java.util.Scanner;

public class App {

    // Menu definiton.  
    public void menu() {
        System.out.println("-----MENU PRINCIPAL-----");
        System.out.println("1. Escribir texto");
        System.out.println("2. Ver texto actual");
        System.out.println("3. Guardar texto");
        System.out.println("4. Deshacer cambios");
        System.out.println("5. Salir");
        System.out.print("Ingrese un número: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        History history = new History();

        int menu;

        App app = new App();
        
        while (true) {
            app.menu();

            // Try catch for integer validation.
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.print("Ingrese el texto: ");
                    String text = sc.nextLine();
                    editor.setContent(text);
                    break;

                case 2:
                    System.out.println("Texto actual: " + editor.getContent());
                    break;

                case 3:
                    if (!editor.getContent().isEmpty()) {
                        history.save(editor.saveText());
                        System.out.println("El texto ha sido guardado correctamente.");
                    } else {
                        System.out.println("No hay texto para guardar.");
                    }
                    break;

                case 4:
                    Memento m = history.undo();
                    editor.undoMemento(m);
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Se ha ingresado una opción no válida.");
            }
        }
    }
}