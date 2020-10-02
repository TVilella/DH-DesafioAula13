class DigitalHouseManager() {
    private var listaDeAlunos = arrayListOf<Aluno>()
    private var listaDeProfessores = arrayListOf<Professor>()
    private var listaDeCursos = arrayListOf<Curso>()
    private var listaDeMatriculas = arrayListOf<Matricula>()

    fun registrarCurso(nome:String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        listaDeCursos.add(Curso(nome,codigoCurso,quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int){
        for(i in 0..listaDeCursos.size-1){
            if(codigoCurso == listaDeCursos[i].codigo){
                listaDeCursos.removeAt(i)
                break
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        listaDeProfessores.add(ProfessorAdjunto(nome,sobrenome,codigoProfessor,0.0F,quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        listaDeProfessores.add(ProfessorTitular(nome,sobrenome,codigoProfessor,0.0F,especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int){
        for(i in 0..listaDeCursos.size-1){
            if(codigoProfessor == listaDeProfessores[i].codigo){
                listaDeProfessores.removeAt(i)
                break
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        listaDeAlunos.add(Aluno(nome,sobrenome,codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var indexCurso = -1
        for(i in 0..listaDeCursos.size-1){
            if(codigoCurso == listaDeCursos[i].codigo) {
                indexCurso = i
                break
            }
        }

        var indexAluno = -1
        for(i in 0..listaDeAlunos.size-1){
            if(codigoAluno == listaDeAlunos[i].codigo) {
                indexAluno = i
                break
            }
        }

        if(listaDeCursos[indexCurso].adicionarUmAluno(listaDeAlunos[indexAluno])){
            listaDeMatriculas.add(Matricula(listaDeAlunos[indexAluno],listaDeCursos[indexCurso]))
            println("Matrícula foi realizada")
        }else{
            println("Não foi possível realizar a matrícula porque não há vagas")
        }

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        var indexTitular = -1
        for(i in 0..listaDeProfessores.size-1){
            if(codigoProfessorTitular == listaDeProfessores[i].codigo) {
                indexTitular = i
                break
            }
        }

        var indexAdjunto = -1
        for(i in 0..listaDeProfessores.size-1){
            if(codigoProfessorAdjunto == listaDeProfessores[i].codigo) {
                indexAdjunto = i
                break
            }
        }

        for(i in 0..listaDeCursos.size-1){
            if(codigoCurso == listaDeCursos[i].codigo) {
                listaDeCursos[i].professorTitular = listaDeProfessores[indexTitular]
                listaDeCursos[i].professorAdjunto = listaDeProfessores[indexAdjunto]
                break
            }
        }

    }

}