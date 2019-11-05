/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Contantes
        final double MAX_PESO = 250;
        final double MIN_PESO = 0;
        final int DIAS = 7;

        //Variable
        double peso = 0;

        for (int dia = 0; dia < DIAS; dia++) {

            boolean pesoSi;
            boolean control = true;

            do {

                //boolean control = true;

                do {
                    try {
                        System.out.printf("Introduzca su peso ...: ");
                        peso = SCN.nextDouble();

                        control = false;

                    } catch (Exception e) {
                        System.out.println("Error, vuelva a intentarlo");
                    } finally {
                        SCN.nextLine();
                    }
                } while (control);

                pesoSi = peso >= 0 && peso <= 250;

                if (!pesoSi) {
                    System.out.println("Error, magnitud no válida. ");

                }
            } while (!pesoSi);

            System.out.printf(Locale.ENGLISH,
                    "Su peso en el día %d ...: %.2f Kg%n",
                    dia +1, peso);
        }
    }
}
