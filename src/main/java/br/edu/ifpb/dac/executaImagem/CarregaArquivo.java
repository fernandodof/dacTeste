/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.executaImagem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import static java.net.URLConnection.guessContentTypeFromName;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.MimetypesFileTypeMap;

/**
 *
 * @author Fernando
 */
public class CarregaArquivo {

    public static byte[] carregaArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            byte[] ramFoto = new byte[(int) arquivo.length()];
            try (FileInputStream fis = new FileInputStream(arquivo)) {
                byte[] buffer = new byte[1024 * 4];
                int bytesLidos = -1;
                int inicio = 0;
                while ((bytesLidos = fis.read(buffer)) != -1) {
                    System.arraycopy(buffer, 0, ramFoto, inicio, bytesLidos);
                    inicio += bytesLidos;
                }
            }
            return ramFoto;
        } catch (IOException e) {
            return null;
        }
    }

    public static boolean arquivoAceitavel(String caminhoArquivo) {
        List<String> tipos = Arrays.asList("image/jpeg", "image/pjpeg", "image/png", "image/bmp",
                "image/x-windows-bmp", "image/gif");
        File arquivo = new File(caminhoArquivo);
        String tipo = URLConnection.guessContentTypeFromName(arquivo.getName());
        System.out.println("Tipo: "+tipo);
        return tipos.contains(tipo);
    }

}
