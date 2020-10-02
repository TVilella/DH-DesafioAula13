class ProfessorAdjunto(nome:String,
                       sobrenome:String,
                       codigoAdjunto:Int,
                       tempoDeCasa: Float,
                       var horasMonitoria: Float)

    : Professor(nome, sobrenome,codigoAdjunto, tempoDeCasa) {
}