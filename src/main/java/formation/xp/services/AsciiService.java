package formation.xp.services;
import java.io.IOException;
import java.net.URI;
import java.io.*;
import java.net.*;
public class AsciiService {
    public void getAsciiFromString(String string, String font) throws IOException, InterruptedException {
        StringBuilder result = new StringBuilder();
        String urlToRead = String.format("http://artii.herokuapp.com/make?text=%s&font=%s", string.replace(" ", "+"), font);
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
            result.append("\n");
        }
        rd.close();
        System.out.print(result);

    }

    public  void getHeader() {
        System.out.println("\u001B[35m");
        System.out.println("__________              .__  .__              ____  ___ __                                ________ _______  _______  _______   \n" +
                "\\______   \\ ______  _  _|  | |__| ____    ____\\   \\/  //  |________   ____   _____   ____ \\_____  \\\\   _  \\ \\   _  \\ \\   _  \\  \n" +
                " |    |  _//  _ \\ \\/ \\/ /  | |  |/    \\  / ___\\\\     /\\   __\\_  __ \\_/ __ \\ /     \\_/ __ \\  _(__  </  /_\\  \\/  /_\\  \\/  /_\\  \\ \n" +
                " |    |   (  <_> )     /|  |_|  |   |  \\/ /_/  >     \\ |  |  |  | \\/\\  ___/|  Y Y  \\  ___/ /       \\  \\_/   \\  \\_/   \\  \\_/   \\\n" +
                " |______  /\\____/ \\/\\_/ |____/__|___|  /\\___  /___/\\  \\|__|  |__|    \\___  >__|_|  /\\___  >______  /\\_____  /\\_____  /\\_____  /\n" +
                "        \\/                           \\//_____/      \\_/                  \\/      \\/     \\/       \\/       \\/       \\/       \\/ ");
        System.out.println("                                                                                   \n" +
                "                                                                           &%#/**,.  .                                                                         \n" +
                "                                                             *,.        %&%#(//*,....                                                                        \n" +
                "                                                           %(/*,....      %%%%#//**,...      ./*,...                                                           \n" +
                "                                              (/*,,,      &%((*,..,.     %%%%#(/,,...     #(/*,....      .,,.                                              \n" +
                "                                   (*,    %#(*,....   ,&%#((/*,.,     #%%%#(/**,...     ##((/*,,...    (/*,.   .                                           \n" +
                "                                 %#/*,..,.  &%(//,,,.,   .%%#(/*,,..,.    .%###(/**,,..    (#((/*,...   /#(/**,...   ,*.,..                                  \n" +
                "                                 %#(*,,,  %#(/**,,,,    %%#(/***,,,.     %###(/*,,..    ((((((/**,,..   /((/**,,..  (/*,....                                 \n" +
                "                                 %#(/*,,,,  %##/**,,,.    %%#%/**,,,,,     @@@@@&&&&%%    (#/#((/**,,..   .((/**,...  ((/*,,.,.                                \n" +
                "                                 /%(/***,.  /%#//*,*,     ,%&%##(,,,,,     #@@@@&&&&%%    (/(((//,,..    ((/**,*..  ((/*,,,,                                 \n" +
                "                                 %%#(/,   .@@@&&&%/      @@@&&&&%(,.     ###(*,...    .(/%@@&&&&&&     (((/**,.   (/*,,,                                 \n" +
                "                                  @@@&&&(    @@@&&&&       ##(/**,,.        ##(/*,,..      %%#%#((///(     #&&&&&%%    ###((/*                                 \n" +
                "                                  #((/**     ##(/**,       ##(/*,,.         @@@&&&%#(      &&%((/*,...      (/*,,..    &&&%%%/                                 \n" +
                "                                  @@@@&%.    @@@&&&%       @@&&&%%%,.      .@@@&&&&%%      ///@&&&&&&%      ((/*,..    /(*,...                                 \n" +
                "                                 ,&%%%##.   /@@@@&&%      ,@@&&&%%#      #%#(/*,,,,      %@&&&&%%%      &&&&&&%    %&&%%%/                                 \n" +
                "                                 %(((/,*,   %((//**,.     %((/*,....,      %(/**,.         (((/*,..        /,.. .    (/*,,,*                                 \n" +
                "                                %#(((/***. %#((//*,*,    ##(//*,....,.    %#//*,..        *(/*,..   .    /*,..   .  .**,.  .                                 \n" +
                "                               %##((((/**,%#(((///,*,,  ##((//*,, ...,.  %#(/*,,..       /**//*,...       /*,,..      /*,..   .                                \n" +
                "                              %##(((((/**%#(((((//***,,%##((//***.,..., ##((/*,,..      /**(/*,,,..     .//*,,..   . ./,,..   ..                               \n" +
                "                             %##(((((((/%##((((((//***%####((//**,.,..,%#((//*,,...    . /(/**,,,...   . .**,.........,,....  ...                              \n" +
                "                            (%#((((((#(%%((((((((////(%###(((///**,,..#%#((//*,*,..       (/**,,,...   ...,,,,.........,,........,                             \n" +
                "                            %##(((((###%#(((((((((((#%###((((/(//*,,,*%##((//***,..   ...../**,,,,.........,,,..........,,........,                            \n" +
                "                           .%##((((###%%#(((#(((####%%###(((((///****%%#((((/**,,,.........,**,,,,,.........,,..........,*,,......,                            \n" +
                "                           .%##(((###%%%#((#(#((###%%%####((((((///*%%##(((//**,,,,.........***,,,,.........*,,,,........,,,,,,...,                            \n" +
                "                           .########%%%##((((######%%%#####(((((((/(%####((//***,,,,........****,,,,,.......,,,,,.,....,,*,,,,,,,,,                            \n" +
                "                            #######%%%%##((((#(##%#%%%###(#(((#(####%####((///***,,,,,..,...,//*,,*,*.......,,,,,,,,,,.,,*,,,,,,,,,                            \n" +
                "                            #######%%%###((((##########(((((((#((((#######((///****,,,...,.../***,*,,,,,....,*,,,,,,,,,,,**,,,,,,,,                            \n" +
                "                             ####%%%%%###((((%##%%#####(((((#(#(#((#####(#((///****,,,,..,.../***,,,,,,,....**,,,,,,,,,,,**,,,,,,,                             \n" +
                "                             ,##%%%%%%%#########%%%###%#((#%######(#(#(((#((///****,,,,......*****,,,,,,,...**,,,,,,,,,,***,,,,,,                              \n" +
                "                              #%%%%%%%%########%%%%##(###(((#((((((#(((((((////*****,,,.....,/****,,,,,,,..,***,,,,,,,,****,,,,,.                              \n" +
                "                               %%&&&&%%#######%%%%%##((###########(((((((((////****,,,,,....******,,,,,,,,,****,,,,,,,,***,,,,,,                               \n" +
                "                               .@@@@@@&. ###%%%%%%%#(##(#########(((((((((/////*****,,,,,,..******,,,,,,,,,****,,,,,,,,/***,,,,                                \n" +
                "                                         /%%%%&&%%%% .#######%###(((((/(/(/////*****,,,,,..,******,,,,,,,,****,,,,,,,                                          \n" +
                "                                          @@@@@@&&   (##########((/((/////////****,,,,,,./*****,,,,,,,, *,,,,,,,                                           \n" +
                "                                                       %###%%%%%##(( /(///////*****,,,,,,,*/******,,,,,,    ,((//*,                                            \n" +
                "                                                       ,&%%%%%%##(/.  (//////*******,,,,,. //****,,,,,,.                                                       \n" +
                "                                                         @@&&%%%%#,   /////*******,,,,,   #(*,,,,,,                                                        \n" +
                "                                                                       (///********,,,,,                                                                       \n" +
                "                                                                        (///******,,,,,                                                                        \n" +
                "                                                                        ,(////*****,,,,                                                                        \n" +
                "                                                                         ##//****,,,,*                                                                         \n" +
                "                                                                            .//((/,");
        System.out.println("\u001B[0m");
    }

    public static void getKeels(int number){
            number = number -1;
            for (int i=0; i<number+1; i++) {
                System.out.print("            **,..   ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("            ((*..   ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("            /(*,,   ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("            .%%#,   ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("             /,.    ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("            ,(/..   ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("            **. .   ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("           ***.  .  ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("          ,/*,..  . ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("          *//*,.... ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("          *//*,,... ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("          ****,,... ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("          ,***,,..  ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("           ***,,..  ");
            }
            System.out.print("\n");
            for (int i=0; i<number+1; i++) {
                System.out.print("            **,,,   ");
            }
            System.out.print("\n");
        }

    public static void main(String[] args) throws IOException, InterruptedException {
        AsciiService asciiService = new AsciiService();
        asciiService.getKeels(4);

    }
}
