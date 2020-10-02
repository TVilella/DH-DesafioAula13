class Curso(var nome: String,
            val codigo: Int,
            var professorTitular: ProfessorTitular,
            var professorAdjunto: ProfessorAdjunto,
            var maxAlunos: Int,
            ) {
    var listaDeAlunos = arrayListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if (listaDeAlunos.size == maxAlunos) return false
        listaDeAlunos.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeAlunos.remove(umAluno)
    }
}