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

/**
 *
 * @author Fernando
 */
public class Executor {

    public static byte[] carregaArquivo(String nomeArquivo) {
        try {
            URL url = Executor.class.getResource(nomeArquivo);
            File arquivo = new File(url.toURI());
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
        } catch (URISyntaxException | IOException e) {
            return null;
        }
    }
    
}
