/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author llara11
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static int cantidadPares(JTable tabla1) {
        int nf, nc, aux, cont = 0;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void pares(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (aux % 2 == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraC(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void diagonalPrincipal(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraH(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == (nf - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static void diagonalSecundaria(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf - 1 - i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularSuperior(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i <= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void triangularInferior(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i >= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void transpuesta(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);

                tabla2.setValueAt(aux, j, i);

            }
        }
    }

    public static void letraA(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || nc - 1 == j || nf / 2 == i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void letraZ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf - 1 - i == j || i == 0 || nf - 1 == i) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || nc / 2 == j) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraV(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == i / 2 || nf - 1 - i / 2 == j) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraE(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf / 2 || nf - 1 == i || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraF(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == 0 || (i == nf / 2 && i / j >= 1)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraP(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf / 2 || j == 0 || (j == nc - 1 && j / i >= 2)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraI(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nc / 2 || i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraN(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j || j == 0 | j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraY(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2 && j <= i || (i + j == nf - 1 && i <= j) || (i == j && i + j <= nf)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

    public static void letraX(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf - 1 - i == j || i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static String recorridoHaciaArriba(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaArriba(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i <= nf; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoUno(JTable tabla1) {
        int[][] m = pasoDeDatos(tabla1);
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j < nc; j++) {
            if (j % 2 == 0) {
                aux = aux + Helper.recorridoHaciaArriba(m, j);
            } else {
                aux = aux + Helper.recorridoHaciaAbajo(m, j);
            }
        }
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String recorridoHaciaIzquierda(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = nc - 1; j >= 0; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaIzquierda(int[][] m, int i, int in, int fin) {

        String aux = "";
        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = 0; j <= nc; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i, int in, int fin) {

        String aux = "";
        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoDos(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            if (i % 2 == 0) {
                aux = aux + recorridoHaciaIzquierda(m, i);
            } else {
                aux = aux + recorridoHaciaDerecha(m, i);
            }

        }
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String mostrar(int[][] m) {
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                aux = aux + m[i][j] + " ";

            }
            aux = aux + "\n";
        }
        return aux;
    }

    public static String recorridoDiagonalPrincipalAbajo(int[][] m) {
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }

    public static String recorridoDiagonalPrincipalAbajo(int[][] m, int in, int fin) {
        String aux = "";
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }

    public static String recorridoDiagonalPrincipalArriba(int[][] m) {
        String aux = "";
        int nf = m.length;
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }
    public static String recorridoDiagonalPrincipalArriba(int[][] m, int in,int fin) {
        String aux = "";
        int nf = m.length;
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }
    public static String recorridoDiagonalSegundariaAbajo(int[][] m) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
        for (int i = 0; i <= nf-1; i++) {
            aux = aux + m[i][nc-1-i] + ", ";
        }
        return aux;
    }
    public static String recorridoDiagonalSegundariaAbajo(int[][] m,int in , int fin) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][nc-1-i] + ", ";
        }
        return aux;
    }
    public static String recorridoDiagonalSegundariaArriba(int[][] m) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
        for (int i = nf-1; i >= 0; i--) {
            aux = aux + m[i][nc-1-i] + ", ";
        }
        return aux;
    }
    public static String recorridoDiagonalSegundariaArriba(int[][] m,int in ,int fin) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][nc-1-i] + ", ";
        }
        return aux;
    }
    public static String recorrido3(JTable tabla1){
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";
        aux = aux + Helper.recorridoDiagonalPrincipalAbajo(m,0,nf/2);
        aux = aux + Helper.recorridoDiagonalSegundariaAbajo(m,nf/2+1,nf-1);
        aux = aux + Helper.recorridoHaciaDerecha(m,nf-1,1,nf-1);
        aux = aux + Helper.recorridoDiagonalPrincipalArriba(m,nf-2,nf/2);
        aux = aux + Helper.recorridoDiagonalSegundariaArriba(m,nf/2-1,0);
        aux = aux + Helper.recorridoHaciaIzquierda(m,0,nc-2,0);
        return aux;
    }
}
