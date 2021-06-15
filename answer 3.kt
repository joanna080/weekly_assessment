fun main(){
    for(b in 10..30){
        if(b in 10..20){
            if(b % 2 == 0){
                println(b)
            }
        }
        if (b in 20..30){
            if(b % 2 == 1){
                println(b)
            }
        }
    }
}
