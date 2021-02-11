import kotlinx.serialization.*
import kotlinx.serialization.json.*



fun main() {
    val json = JsonCreator()
    val responce = json.GetChangedDictionaryItems()
    println(responce)

}

fun sendGet() {
    val url = URL("https://my-json-server.typicode.com/typicode/demo")

    with(url.openConnection() as HttpURLConnection) {
        requestMethod = "GET"  // optional default is GET

        println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

        inputStream.bufferedReader().use {
            it.lines().forEach { line ->
                println(line)
            }
        }
    }
}
