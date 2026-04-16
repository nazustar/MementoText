package src;

import java.util.Scanner;

public class App {

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
        
        while (true) {
            new App().menu();
            menu = Integer.parseInt(sc.nextLine());

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
                    history.save(editor.saveText());
                    System.out.println("El texto ha sido guardado correctamente.");
                    break;

                case 4:
                    editor.undoMemento(history.undo());
                    System.out.println("Se deshizo el cambio.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Se ha ingresado una opción no válida.");
            }
        }
    }
}