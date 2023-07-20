package model;

import java.util.ArrayList;
import java.util.List;

public class ListaPaciente {

    private static final List<Paciente> lista = new ArrayList<>();
    
    public static final List<Paciente> Listar(){
        return lista;
    }
    
    public static void Adicionar(Paciente paciente){
        lista.add(paciente);
    }
    
    public static Paciente getPaciente(int id){
        return lista.get(id);
    }
    
    public static void Atualizar(int posicaoPaciente, Paciente paciente){
        lista.set(posicaoPaciente, paciente);
    }
    
}
