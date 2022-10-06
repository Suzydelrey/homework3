package com.example.kotlin

package com.example.kotlin
fun main() {
    Exercise(3.2,6.0,"*")
    Exercise(3.8,34.0,"/")
    Exercise(8.1,7.0,"-")
    Exercise(9.4,2.8)
}
fun Exercise(dub1:Double , dub2: Double , str:String="+"){
    when(str){
        "-"-> println("the Total of this mathematical operation is :${dub1-dub2}")
        "*"-> println ("the Total of this mathematical operation is: ${dub1*dub2}")
        "/"-> if(dub1>dub2)
            println("the Total of this mathematical operation is :${dub1/dub2}")
        else println("the Total of this mathematical operation is: ${dub2/dub1}")
        "+"-> println ("the Total of this mathematical operation is :${dub1+dub2}")
        else-> println("invalid arithmetic operation ,please try again")
    }} {
}