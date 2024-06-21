//collections in Scala
object DataStructures{
  def main(args:Array[String]):Unit= {
    //LIST :
    val ls: List[Int] = List(1, 2, 3)
    val ls1: List[String] = List("aa", "bjbfj", "dnbj")
    //    println(ls1.head)
    //    println(ls1.tail)
    println("Vaue excuding first eemtn " + ls1.last)

    //    val nn=10
    //

    var list: List[Any] = List("hadoop", "spart", 2, 3, true, 'a')
    //    println(list)

    list = List('a', "jnkdfn", 34243)
    //    println(list)

    val emptyList: List[Nothing] = List()

    //ARRAY

    var arrayData = Array("Spartk", "hadoop", "Dtabricks")
    arrayData = Array("jknv", "jkn")
    //    print(arrayData)
    //    print(emptyList)

    //Prints element in NewLine

    //    arrayData.foreach(println)
    //
    //    list.foreach(println)
    //arrayData

    //    for(a<-list){
    //      println(a)}
    //    }
    //
//    var a: Array[String] = Array(1, 23, 4)
//    //  print(a)
//    println(arrayData.mkString("|"))
//
//    arrayData(0)="banana"
//    arrayData.foreach(println)

    //Empty array
    var a =new Array[Int](4) //empty array

    //2D array
    val arr_1 =Array.ofDim[Int](3,3)
//    print(arr_1)

    arr_1(0)(0)=32
    arr_1(0)(1)=2
    arr_1(0)(2)=32
    arr_1(1)(2)=90

    var flattenArray:Array[Int]=arr_1.flatten
//    println(flattenArray)

//    flattenArray.foreach(println)

    //List Declaration
    val list12=10::20::30::40::Nil
//    for (elem <- list12) {println(elem)}

    //ListBuffer

    import scala.collection.mutable.ListBuffer
    var cities=new ListBuffer[String]()
    cities+="Trivandrum"
    cities+="Kochi"
    cities+=("Mumbai","Delhi","Ahmedabad")
//    cities.foreach(println)
    cities-="Mumbai"
    println()
//    cities.foreach(println)

    cities.toArray //Type casting in scala is done by to and Array
//   println( cities.filter(_=="Trivandrum"))


//SET- IMmmutable

    val set_1:Set[Int]=Set()
//     set_1=Set(1,24,3)
//    print(set_1)

import scala.collection.mutable.Set
    val mutable=Set("Ap","orange","watermelon")
    mutable+="blue"
//    println(mutable)


    //TUPLE
    // in scala tuple is fixed size , heterogenous collection(multiple data types together),
    //Individua value starts from 1 not zero

    var Tuple_1=(1,23,"stri")

//    print(Tuple_1._3)


//Mapping  in scala

     //is collection of key-value pair wheere each key is unique and values ,It is similar o dicitonary
    //in python
    //Immutabe function

//    import scala.collection.immutable.Map
    //import  scala.collection.mutable.Map

    var colors:Map[String ,Int]=Map()
    var Mapvar1=Map("1"->"Ananda","2"->"Midhun","3"->"Adinan")
//    println(Mapvar1.contains("2"))
//    println(Mapvar1.get("2"))
//    println(Mapvar1.keys)
//    println(Mapvar1.values)


    //Declare mutable map datatype

    import scala.collection.mutable.Map

    val mutable_var=Map("hi"->"hello","then"->"now")
    mutable_var("2")="then"
    mutable_var+=("3"->"na")

    mutable_var-=("3")

//    print(mutable_var)


    //ITERATORS in Scala represent a sequence of elements that allows you to
    //traverse through collection sequentially .

    val myList =List(20,30,40,20,40,56)
    val iter =myList.iterator

    //Method of iterators to check if there is more elements (.hasNext())
    //TO retrieve an elemnt (next())
    //to remove an element(remove())
//
//    for(a<-iter){
//      println(a)
//    }

//    println(iter.next())
//    println(iter.next())

//    while (iter.hasNext){
//      println("hi "+iter.next())
//
//    }
   //LAZY INITIALIZATION
    lazy val donuts:String="Provided"

    //Lazy initialization using scala
    println(donuts*5+ " ")

    //Lazy can't be used with var

    //lazy  var donuts_1:Int=20















  }
}