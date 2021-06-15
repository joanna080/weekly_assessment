class myClassOne{
    constructor(name: String, age: Int){
    println("My name is ${name}")
    println("I am  ${age} years old")
    }
}


class myClassTwo{
    constructor(school: String){
        println("The name of my school is ${school}")
    }

}


class myClassThree{
    constructor(state: String){
        println("I am from ${state}")
    }

}


class myClassFour{
    constructor(food: String){
        println("I ate ${food}")
    }

}


class myClassFive{
    constructor(love: String){
        println("I love ${love}")
    }

}


fun main(){
    var firstObj1: myClassOne = myClassOne("Fair",24)
    var firstObj2: myClassOne = myClassOne("Jose", 26)
    var firstObj3: myClassOne = myClassOne("Sonia", 28)
    var firstObj4: myClassOne = myClassOne("Teji", 21)
    var firstObj5: myClassOne = myClassOne("Eteh", 27)


    println()
    println()
    var secondObj1: myClassTwo = myClassTwo("University of Lagos, Lagos state")
    var secondObj2: myClassTwo = myClassTwo("University of Delta, Delta state")
    var secondObj3: myClassTwo = myClassTwo("University of Port Harcout, River state")
    var secondObj4: myClassTwo = myClassTwo("Delta State University, Abaraka")
    var secondObj5: myClassTwo = myClassTwo("Petroleum Training Institute, Effurum")


    println()
    println()
    var thirdObj1: myClassThree = myClassThree("Delta State")
    var thirdObj2: myClassThree = myClassThree("Edo State")
    var thirdObj3: myClassThree = myClassThree("River State")
    var thirdObj4: myClassThree = myClassThree("Imo State")
    var thirdObj5: myClassThree = myClassThree("Cross River")


    println()
    println()
    var fouthObj1: myClassFour = myClassFour("Yam and egg")
    var fouthObj2: myClassFour = myClassFour("Beans and plantain")
    var fouthObj3: myClassFour = myClassFour("Eba and Egusi soup")
    var fouthObj4: myClassFour = myClassFour("Rice and chicken")
    var fouthObj5: myClassFour = myClassFour("Bread and butter")


    println()
    println()
    var fifthObj1: myClassFive = myClassFive("reading")
    var fifthObj2: myClassFive = myClassFive("skipping")
    var fifthObj3: myClassFive = myClassFive("playing chess")
    var fifthObj4: myClassFive = myClassFive("watching handball")
    var fifthObj5: myClassFive = myClassFive("coding")

}
