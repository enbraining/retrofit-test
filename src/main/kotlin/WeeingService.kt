import retrofit2.Call
import retrofit2.http.GET

interface WeeingService {
    @GET("api/health")
    fun checkHealth(): Call<HealthResponse>;
}