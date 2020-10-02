class ProfessorAdjunto(nome:String,
                       sobrenome:String,
                       codigoAdjunto:Int,
                       tempoDeCasa: Float,
                       var horasMonitoria: Int)

    : Professor(nome, sobrenome,codigoAdjunto, tempoDeCasa) {
}