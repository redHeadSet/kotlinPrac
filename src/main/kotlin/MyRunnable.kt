class Car(val power : Int){
    companion object Factory{
        var cars = mutableListOf<Car>()

        fun makeCar(power: Int):Car {
            var car = Car(power)
            cars.add(car)
            return car
        }
    }
}