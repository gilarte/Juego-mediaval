import Interfaces.IVistas;
import jdk.internal.foreign.Utils;

public class Vistas implements IVistas {
    public void MainMenu() {
        public static void inicio;( {
            Utils.print("\n" +
                    "████████╗██╗░░██╗███████╗  ██████╗░███████╗░█████╗░░█████╗░███╗░░██╗░██████╗░██╗░░░██╗███████╗░██████╗████████╗\n" +
                    "╚══██╔══╝██║░░██║██╔════╝  ██╔══██╗██╔════╝██╔══██╗██╔══██╗████╗░██║██╔═══██╗██║░░░██║██╔════╝██╔════╝╚══██╔══╝\n" +
                    "░░░██║░░░███████║█████╗░░  ██████╔╝█████╗░░██║░░╚═╝██║░░██║██╔██╗██║██║██╗██║██║░░░██║█████╗░░╚█████╗░░░░██║░░░\n" +
                    "░░░██║░░░██╔══██║██╔══╝░░  ██╔══██╗██╔══╝░░██║░░██╗██║░░██║██║╚████║╚██████╔╝██║░░░██║██╔══╝░░░╚═══██╗░░░██║░░░\n" +
                    "░░░██║░░░██║░░██║███████╗  ██║░░██║███████╗╚█████╔╝╚█████╔╝██║░╚███║░╚═██╔═╝░╚██████╔╝███████╗██████╔╝░░░██║░░░\n" +
                    "░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚═╝░░╚═╝╚══════╝░╚════╝░░╚════╝░╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚══════╝╚═════╝░░░░╚═╝░░░");


            Utils.print("\n"+
                            "╱╭╮╱╱╭━━┳━╮╱╭┳━━┳━━━┳━━┳━━━┳━━━╮╭━━━┳━━━┳━━━┳━━┳━━━┳━╮╱╭╮\n"+
                            "╭╯┃╱╱╰┫┣┫┃╰╮┃┣┫┣┫╭━╮┣┫┣┫╭━╮┃╭━╮┃┃╭━╮┃╭━━┫╭━╮┣┫┣┫╭━╮┃┃╰╮┃┃\n"+
                            "╰╮┃╱╱╱┃┃┃╭╮╰╯┃┃┃┃┃╱╰╯┃┃┃┃╱┃┃╰━╯┃┃╰━━┫╰━━┫╰━━╮┃┃┃┃╱┃┃╭╮╰╯┃\n"+
                            "╱┃┃╱╱╱┃┃┃┃╰╮┃┃┃┃┃┃╱╭╮┃┃┃╰━╯┃╭╮╭╯╰━━╮┃╭━━┻━━╮┃┃┃┃┃╱┃┃┃╰╮┃┃\n"+
                            "╭╯╰┳╮╭┫┣┫┃╱┃┃┣┫┣┫╰━╯┣┫┣┫╭━╮┃┃┃╰╮┃╰━╯┃╰━━┫╰━╯┣┫┣┫╰━╯┃┃╱┃┃┃\n"+
                            "╰━━┻╯╰━━┻╯╱╰━┻━━┻━━━┻━━┻╯╱╰┻╯╰━╯╰━━━┻━━━┻━━━┻━━┻━━━┻╯╱╰━╯");
            Utils.print("\n" +
                            "╭━━━╮╭━━━┳━━━┳━━━┳━━━┳━━━╮╭━━━┳━━━┳━━━┳━━┳━━━┳━╮╱╭╮\n" +
                            "┃╭━╮┃┃╭━╮┃╭━╮┃╭━━┫╭━╮┃╭━╮┃┃╭━╮┃╭━━┫╭━╮┣┫┣┫╭━╮┃┃╰╮┃┃\n" +
                            "╰╯╭╯┃┃┃╱╰┫╰━╯┃╰━━┫┃╱┃┃╰━╯┃┃╰━━┫╰━━┫╰━━╮┃┃┃┃╱┃┃╭╮╰╯┃\n" +
                            "╭━╯╭╯┃┃╱╭┫╭╮╭┫╭━━┫╰━╯┃╭╮╭╯╰━━╮┃╭━━┻━━╮┃┃┃┃┃╱┃┃┃╰╮┃┃\n" +
                            "┃┃╰━┳┫╰━╯┃┃┃╰┫╰━━┫╭━╮┃┃┃╰╮┃╰━╯┃╰━━┫╰━╯┣┫┣┫╰━╯┃┃╱┃┃┃\n" +
                            "╰━━━┻┻━━━┻╯╰━┻━━━┻╯╱╰┻╯╰━╯╰━━━┻━━━┻━━━┻━━┻━━━┻╯╱╰━╯");
            Utils.print("\n" +
                            "╭━━━╮╭━━╮╭━━━┳━━━┳━━━┳━━━┳━━━╮╭╮╱╭┳━━━┳╮╱╭┳━━━┳━━━┳━━┳━━━╮\n" +
                            "┃╭━╮┃┃╭╮┃┃╭━╮┃╭━╮┃╭━╮┃╭━╮┃╭━╮┃┃┃╱┃┃╭━╮┃┃╱┃┃╭━╮┃╭━╮┣┫┣┫╭━╮┃\n" +
                            "╰╯╭╯┃┃╰╯╰┫┃╱┃┃╰━╯┃╰━╯┃┃╱┃┃╰━╯┃┃┃╱┃┃╰━━┫┃╱┃┃┃╱┃┃╰━╯┃┃┃┃┃╱┃┃\n" +
                            "╭╮╰╮┃┃╭━╮┃┃╱┃┃╭╮╭┫╭╮╭┫╰━╯┃╭╮╭╯┃┃╱┃┣━━╮┃┃╱┃┃╰━╯┃╭╮╭╯┃┃┃┃╱┃┃\n" +
                            "┃╰━╯┣┫╰━╯┃╰━╯┃┃┃╰┫┃┃╰┫╭━╮┃┃┃╰╮┃╰━╯┃╰━╯┃╰━╯┃╭━╮┃┃┃╰┳┫┣┫╰━╯┃\n" +
                            "╰━━━┻┻━━━┻━━━┻╯╰━┻╯╰━┻╯╱╰┻╯╰━╯╰━━━┻━━━┻━━━┻╯╱╰┻╯╰━┻━━┻━━━╯");
            Utils.print("\n" +
                            "╭╮╱╭╮╭━━┳━╮╱╭┳━━┳━━━┳━━┳━━━┳━━━╮╭━━━┳━━━┳━━━┳━━━━┳━━┳━━━┳━━━╮\n" +
                            "┃┃╱┃┃╰┫┣┫┃╰╮┃┣┫┣┫╭━╮┣┫┣┫╭━╮┃╭━╮┃┃╭━╮┃╭━╮┃╭━╮┃╭╮╭╮┣┫┣┻╮╭╮┃╭━╮┃\n" +
                            "┃╰━╯┃╱┃┃┃╭╮╰╯┃┃┃┃┃╱╰╯┃┃┃┃╱┃┃╰━╯┃┃╰━╯┃┃╱┃┃╰━╯┣╯┃┃╰╯┃┃╱┃┃┃┃┃╱┃┃\n" +
                            "╰━━╮┃╱┃┃┃┃╰╮┃┃┃┃┃┃╱╭╮┃┃┃╰━╯┃╭╮╭╯┃╭━━┫╰━╯┃╭╮╭╯╱┃┃╱╱┃┃╱┃┃┃┃╰━╯┃\n" +
                            "╱╱╱┃┣┳┫┣┫┃╱┃┃┣┫┣┫╰━╯┣┫┣┫╭━╮┃┃┃╰╮┃┃╱╱┃╭━╮┃┃┃╰╮╱┃┃╱╭┫┣┳╯╰╯┃╭━╮┃\n" +
                            "╱╱╱╰┻┻━━┻╯╱╰━┻━━┻━━━┻━━┻╯╱╰┻╯╰━╯╰╯╱╱╰╯╱╰┻╯╰━╯╱╰╯╱╰━━┻━━━┻╯╱╰╯");
            Utils.print("\n" +
                            "╭━━━╮╭━━━┳━━━┳━╮╭━┳━━╮╭━━┳━━━┳━━━╮╭╮╱╭┳━━━┳╮╱╭┳━━━┳━━━┳━━┳━━━╮\n" +
                            "┃╭━━╯┃╭━╮┃╭━╮┃┃╰╯┃┃╭╮┃╰┫┣┫╭━╮┃╭━╮┃┃┃╱┃┃╭━╮┃┃╱┃┃╭━╮┃╭━╮┣┫┣┫╭━╮┃\n" +
                            "┃╰━━╮┃┃╱╰┫┃╱┃┃╭╮╭╮┃╰╯╰╮┃┃┃┃╱┃┃╰━╯┃┃┃╱┃┃╰━━┫┃╱┃┃┃╱┃┃╰━╯┃┃┃┃┃╱┃┃\n" +
                            "╰━━╮┃┃┃╱╭┫╰━╯┃┃┃┃┃┃╭━╮┃┃┃┃╰━╯┃╭╮╭╯┃┃╱┃┣━━╮┃┃╱┃┃╰━╯┃╭╮╭╯┃┃┃┃╱┃┃\n" +
                            "╭━━╯┣┫╰━╯┃╭━╮┃┃┃┃┃┃╰━╯┣┫┣┫╭━╮┃┃┃╰╮┃╰━╯┃╰━╯┃╰━╯┃╭━╮┃┃┃╰┳┫┣┫╰━╯┃\n" +
                            "╰━━━┻┻━━━┻╯╱╰┻╯╰╯╰┻━━━┻━━┻╯╱╰┻╯╰━╯╰━━━┻━━━┻━━━┻╯╱╰┻╯╰━┻━━┻━━━╯");
            Utils.print("\n" +
                            "╭━━━╮╭━━━┳━━━┳╮╱╱╭━━┳━━━╮\n" +
                            "┃╭━━╯┃╭━╮┃╭━╮┃┃╱╱╰┫┣┫╭━╮┃\n" +
                            "┃╰━━╮┃╰━━┫┃╱┃┃┃╱╱╱┃┃┃╰━╯┃\n" +
                            "┃╭━╮┃╰━━╮┃╰━╯┃┃╱╭╮┃┃┃╭╮╭╯\n" +
                            "┃╰━╯┣┫╰━╯┃╭━╮┃╰━╯┣┫┣┫┃┃╰╮\n" +
                            "╰━━━┻┻━━━┻╯╱╰┻━━━┻━━┻╯╰━╯");

        }
    }

    public void UserMenu() {

    }
}
