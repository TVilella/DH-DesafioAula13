fun main(){
    val adm = DigitalHouseManager()

    adm.registrarCurso("Android",1,2)
    adm.registrarCurso("iOs",2,10)

    adm.registrarProfessorTitular("Felipe", "Silva",11, "Android")
    adm.registrarProfessorTitular("Andre", "Silva", 12, "iOs")

    adm.registrarProfessorAdjunto("Lucas", "Silva",111, 10)

    adm.matricularAluno("Thiago", "Vilella",1111)
    adm.matricularAluno("Luiz", "Silva",1112)
    adm.matricularAluno("Antonio", "Silva",1113)

    adm.alocarProfessores(1,11,111)
    adm.excluirProfessor(12)
    adm.excluirCurso(2)

    adm.matricularAluno(1111,1)
    adm.matricularAluno(1112,1)
    adm.matricularAluno(1113,1)

}