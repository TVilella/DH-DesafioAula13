class ProfessorTitular(nome:String,
                       sobrenome:String,
                       codigoTitular:Int,
                       tempoDeCasa: Float,
                       var especialidade: String)

    : Professor(nome, sobrenome, codigoTitular, tempoDeCasa) {
}