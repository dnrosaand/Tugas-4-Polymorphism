/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikaCanggih extends Matematika {
    int Modulus;
    double operasiModulus;
    
    void setModulus(int a, int b){
        Modulus = a % b;
    }
    void setModulus(double a, double b){
        operasiModulus = a % b;
    }
    void setModulus(int a, int b, int c){
        Modulus = a % b % c;
    }
    void setModulus(double a, double b, double c){
        operasiModulus = a % b % c;
    }
}
