class Curso(var nome: String,
            val codigo: Int,
            var maxAlunos: Int,
            ) {


    var professorTitular: Professor? = null
    var professorAdjunto: Professor? = null

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