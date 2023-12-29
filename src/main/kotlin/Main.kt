import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun main() {
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8081/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: WeeingService = retrofit.create(WeeingService::class.java)

    var success = service.checkHealth()

    print(success.execute().body())
}
