class Curso(var nome: String,
            val codigo: Int,
            var professorTitular: ProfessorTitular,
            var professorAdjunto: ProfessorAdjunto,
            var maxAluno: Int,
            var listaDeAlunos: List<Aluno>) {

    fun adicionarUmAluno(umAluno: Aluno): Boolean{}
    fun excluirAluno(umAluno: Aluno):Boolean{}
}