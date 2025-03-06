package org.example.candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        analisarCandidato(2000.0);
        analisarCandidato(2500.0);
        analisarCandidato(100.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido)
            System.out.println("Ligar para o candidato");
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardado resultado dos demais candidatos");
        }
    }
}