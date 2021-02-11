
import kotlinx.serialization.*
import kotlinx.serialization.json.*


val format = Json { prettyPrint = true }

@Serializable
data class Params(val ObjectUIN: String, val ChangeDate: String,val UserName: String, val Password:String)


@Serializable
data class MyModel(val id: Int, val jsonRpc: String="2.0", val method: String,val params: Params,  val version: Int)

class JsonCreator {

    private fun CreateTestJson(): String{
        val params = Params("34343", "11.02.2021", "Yana", "erererds323223")
        val test = MyModel(1, "2.0", "GetChangedDictionaryItems", params,  1 )
        return Json.encodeToString(test)
    }

    fun GetChangedDictionaryItems(): String {
        return  CreateTestJson()
    }
}