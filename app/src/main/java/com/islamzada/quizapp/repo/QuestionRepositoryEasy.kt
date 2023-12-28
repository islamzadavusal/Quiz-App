package com.islamzada.quizapp.repo

import com.islamzada.quizapp.model.QuestionModel

class QuestionRepositoryEasy {
    fun getQuestions(): ArrayList<QuestionModel> {
        val questionsList = ArrayList<QuestionModel>()

        questionsList.add(QuestionModel("Kotlin ile Java arasındaki temel fark nedir?", "Kotlin null güvenliği sağlar.", "Java'da tür dönüşümü yoktur.", "Kotlin'de veri sınıfları kullanımı zorunludur.", "Java'da extension functions kullanılamaz.", "Kotlin null güvenliği sağlar."))

        questionsList.add(QuestionModel("Kotlin'de değişken tanımlamak için hangi anahtar kelimeler kullanılır?", "var, val", "variable, value", "let, const", "var, const", "var, val"))

        questionsList.add(QuestionModel("Kotlin'de 'if' ve 'else' ifadeleri nasıl kullanılır?", "if (koşul) { } else { }", "when { }", "for (item in list) { }", "try { } catch (e: Exception) { }", "if (koşul) { } else { }"))

        questionsList.add(QuestionModel("Kotlin'de bir döngü oluşturmak için kullanılan anahtar kelime nedir?", "for", "loop", "repeat", "foreach", "for"))

        questionsList.add(QuestionModel("Kotlin'de null olabilen bir değişkeni tanımlamak için hangi işaret kullanılır?", "?", "!!", "??", "//", "?"))

        questionsList.add(QuestionModel("Kotlin'de bir dizeyi bir başka türe dönüştürmek için kullanılan fonksiyon nedir?", "toString()", "convert()", "asString()", "stringify()", "toString()"))

        questionsList.add(QuestionModel("Kotlin'de bir sınıftan türemek için kullanılan anahtar kelime nedir?", "extends", "inherits", "classof", ":", ":"))

        questionsList.add(QuestionModel("Kotlin'de bir sınıfın alanlarına erişmek için hangi anahtar kelime kullanılır?", "access", "field", "this", "property", "this"))

        questionsList.add(QuestionModel("Kotlin'de bir fonksiyonu başka bir fonksiyona parametre olarak geçmek için hangi sözdizimi kullanılır?", "functionName: Type", "functionName()", "functionName::class", "::functionName", "functionName"))

        questionsList.add(QuestionModel("Kotlin'de bir döngüyü belirli bir koşula bağlı olarak çalıştırmak için kullanılan ifade nedir?", "while", "for", "loop", "repeat", "while"))

        questionsList.add(QuestionModel("Kotlin'de bir döngüyü belirli bir aralıkta çalıştırmak için kullanılan ifade nedir?", "for (i in 1..10)", "for (i = 1; i <= 10; i++)", "repeat(10)", "while (i <= 10)", "for (i in 1..10)"))

        questionsList.add(QuestionModel("Kotlin'de bir sınıfın başka bir sınıftan türetilmesini engellemek için hangi anahtar kelime kullanılır?", "sealed", "closed", "restricted", "private", "sealed"))

        questionsList.add(QuestionModel("Kotlin'de bir sınıfın bir metodu üzerinde çalışmadan önce başka bir kod bloğunu çalıştırmasını sağlamak için kullanılan blok nedir?", "init", "start", "setup", "run", "init"))

        questionsList.add(QuestionModel("Kotlin'de bir koşulun sağlanıp sağlanmadığını kontrol etmek için kullanılan ifade nedir?", "if", "check", "evaluate", "verify", "if"))

        questionsList.add(QuestionModel("Kotlin'de bir sınıfın bir nesnesini oluşturmak için kullanılan anahtar kelime nedir?", "create", "object", "instantiate", "make", "object"))

        return questionsList
    }
}
