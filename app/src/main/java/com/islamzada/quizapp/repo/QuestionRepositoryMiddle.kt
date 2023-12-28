package com.islamzada.quizapp.repo

import com.islamzada.quizapp.model.QuestionModel

class QuestionRepositoryMiddle  {
    fun getQuestions(): ArrayList<QuestionModel> {
        val questionsList = ArrayList<QuestionModel>()

        questionsList.add(QuestionModel("Kotlin'de extension functions nedir ve nasıl oluşturulur?", "Var olan bir sınıfa yeni bir fonksiyon eklemek için kullanılır.", "Yalnızca interfaceler üzerinde çalışır.", "Sınıflara direkt olarak eklenemez, sadece extension interfaces üzerinde kullanılır.", "Sadece abstract sınıflar üzerinde kullanılabilir.", "Var olan bir sınıfa yeni bir fonksiyon eklemek için kullanılır."))

        questionsList.add(QuestionModel("Kotlin'de 'let' fonksiyonu ne işe yarar?", "null olmayan bir nesneyi blok içinde işlemek için kullanılır.", "Bir nesnenin özelliklerine erişim sağlar.", "Değişkenin türünü belirlemek için kullanılır.", "Fonksiyonların çalışma süresini ölçmek için kullanılır.", "null olmayan bir nesneyi blok içinde işlemek için kullanılır."))

        questionsList.add(QuestionModel("Kotlin'de 'sealed class' nedir?", "Bir sınıfın başka sınıflardan türetilmesini engellemek için kullanılır.", "Bir sınıfın tüm üyelerine açık olan sınıf.", "Bir sınıfın yalnızca bir nesnesini oluşturulmasına izin veren sınıf.", "Bir sınıfın tüm üyelerinin kapalı (private) olduğu sınıf.", "Bir sınıfın başka sınıflardan türetilmesini engellemek için kullanılır."))

        questionsList.add(QuestionModel("Kotlin'de 'coroutine' nedir?", "Asenkron programlamayı kolaylaştırmak için kullanılan hafif bir thread.", "Bir sınıfın içindeki tüm fonksiyonları işaretleyen özel bir tür.", "Birden fazla veri tipini destekleyen bir sınıf.", "Bir döngü içindeki işlemleri optimize etmek için kullanılan bir yapı.", "Asenkron programlamayı kolaylaştırmak için kullanılan hafif bir thread."))

        questionsList.add(QuestionModel("Kotlin'de 'Smart Cast' nedir?", "Bir nesnenin tipini kontrol etmeden tür dönüşümü yapabilme yeteneği.", "Bir sınıfın tüm üyelerine erişim sağlayan özel bir anahtar kelime.", "Bir sınıfın tüm üyelerinin erişimini sınırlayan özel bir anahtar kelime.", "Bir sınıfın nesnesini oluşturan özel bir fonksiyon.", "Bir nesnenin tipini kontrol etmeden tür dönüşümü yapabilme yeteneği."))

        questionsList.add(QuestionModel("Kotlin'de 'delegated properties' nedir?", "Bir sınıfın içindeki tüm özelliklere erişimi sağlayan yapı.", "Bir sınıfın başka bir sınıftan türemesini sağlayan özel bir anahtar kelime.", "Bir özelliğin değerini başka bir sınıfa delegasyon yapma yeteneği.", "Bir sınıfın tüm üyelerinin erişimini sınırlayan özel bir anahtar kelime.", "Bir özelliğin değerini başka bir sınıfa delegasyon yapma yeteneği."))

        questionsList.add(QuestionModel("Kotlin'de 'Companion Object' nedir?", "Bir sınıfın özelliklerine erişim sağlayan özel bir nesne.", "Bir sınıfın örneklenmesine gerek olmayan özelliklerini içeren nesne.", "Bir sınıfın başka bir sınıftan türemesini sağlayan özel bir anahtar kelime.", "Bir sınıfın tüm üyelerinin kapalı (private) olduğu sınıf.", "Bir sınıfın örneklenmesine gerek olmayan özelliklerini içeren nesne."))

        questionsList.add(QuestionModel("Kotlin'de 'Lambda Expressions' nedir?", "Bir sınıfın tüm üyelerinin kapalı (private) olduğu sınıf.", "Bir sınıfın içindeki tüm özelliklere erişimi sağlayan yapı.", "Fonksiyonları daha kısa ve anlamlı bir şekilde ifade etmeye yarayan ifadeler.", "Birden fazla veri tipini destekleyen bir sınıf.", "Fonksiyonları daha kısa ve anlamlı bir şekilde ifade etmeye yarayan ifadeler."))

        questionsList.add(QuestionModel("Kotlin'de 'Nullable Types' nedir?", "Null değeri alabilen veri tiplerini temsil eder.", "Bir sınıfın tüm üyelerine erişim sağlayan özel bir anahtar kelime.", "Bir sınıfın başka bir sınıftan türemesini sağlayan özel bir anahtar kelime.", "Bir özelliğin değerini başka bir sınıfa delegasyon yapma yeteneği.", "Null değeri alabilen veri tiplerini temsil eder."))

        questionsList.add(QuestionModel("Kotlin'de 'Higher-Order Functions' nedir?", "Diğer fonksiyonları parametre olarak alan veya döndüren fonksiyonlar.", "Bir sınıfın örneklenmesine gerek olmayan özelliklerini içeren nesne.", "Bir sınıfın içindeki tüm özelliklere erişimi sağlayan yapı.", "Bir sınıfın başka bir sınıftan türemesini sağlayan özel bir anahtar kelime.", "Diğer fonksiyonları parametre olarak alan veya döndüren fonksiyonlar."))

        questionsList.add(QuestionModel("Kotlin'de 'Range Expressions' nedir?", "Belirli bir aralıktaki değerleri temsil eden ifadeler.", "Bir sınıfın tüm üyelerinin kapalı (private) olduğu sınıf.", "Bir özelliğin değerini başka bir sınıfa delegasyon yapma yeteneği.", "Bir sınıfın içindeki tüm özelliklere erişimi sağlayan yapı.", "Belirli bir aralıktaki değerleri temsil eden ifadeler."))

        questionsList.add(QuestionModel("Kotlin'de 'Infix Functions' nedir?", "Bir sınıfın tüm üyelerine erişim sağlayan özel bir anahtar kelime.", "Fonksiyonları daha kısa ve anlamlı bir şekilde ifade etmeye yarayan ifadeler.", "Bir özelliğin değerini başka bir sınıfa delegasyon yapma yeteneği.", "Operatör gibi kullanılabilen özel bir fonksiyon.", "Operatör gibi kullanılabilen özel bir fonksiyon."))

        questionsList.add(QuestionModel("Kotlin'de 'Type Aliases' nedir?", "Veri tiplerine alternatif isimler verme yeteneği.", "Bir sınıfın özelliklerine erişim sağlayan özel bir nesne.", "Bir sınıfın başka bir sınıftan türemesini sağlayan özel bir anahtar kelime.", "Bir sınıfın tüm üyelerinin kapalı (private) olduğu sınıf.", "Veri tiplerine alternatif isimler verme yeteneği."))

        questionsList.add(QuestionModel("Kotlin'de 'Data Classes' ile 'Enum Classes' arasındaki fark nedir?", "Data Classes, veri depolamak için kullanılırken, Enum Classes, belirli bir kümeyi temsil etmek için kullanılır.", "Data Classes, yalnızca string değerleri içerebilirken, Enum Classes farklı türlerdeki değerleri içerebilir.", "Data Classes, sadece sabit değerleri içerebilirken, Enum Classes veri depolamak için kullanılır.", "Data Classes, sadece belirli bir kümeyi temsil etmek için kullanılırken, Enum Classes veri depolamak için kullanılır.", "Data Classes, veri depolamak için kullanılırken, Enum Classes, belirli bir kümeyi temsil etmek için kullanılır."))

        questionsList.add(QuestionModel("Kotlin'de 'lateinit' anahtar kelimesi nedir?", "Bir değişkenin sonradan başlatılacağını belirten anahtar kelime.", "Bir değişkenin sadece bir kez başlatılmasını sağlayan anahtar kelime.", "Bir değişkenin hiç başlatılmadan kullanılmasını sağlayan anahtar kelime.", "Bir değişkenin değerinin sonradan değiştirilebileceğini belirten anahtar kelime.", "Bir değişkenin sonradan başlatılacağını belirten anahtar kelime."))

        questionsList.add(QuestionModel("Kotlin'de 'Default Arguments' nedir?", "Fonksiyonlara varsayılan değerler sağlama yeteneği.", "Bir sınıfın tüm üyelerine erişim sağlayan özel bir anahtar kelime.", "Fonksiyonların yalnızca belirli bir sırayla çağrılmasına izin veren yapı.", "Fonksiyonlara yalnızca belirli bir sıradaki argümanlarla çağrılma yeteneği.", "Fonksiyonlara varsayılan değerler sağlama yeteneği."))

        return questionsList
    }
}