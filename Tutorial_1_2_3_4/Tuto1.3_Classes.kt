// Classes
fun main() {
    // runSmartDevice()
    // runCar()
    // runCall()
    runAnimal()
    // runCarEngine()
}

fun runSmartDevice() {
    val device = SmartDevice()

    device.name = "Test"
    device.turnOn()
    device.turnOff()
}

class SmartDevice {
    public var name = "Default"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

// Classes - get / set
fun runCar() {
    var carInstance = Car()

    carInstance.speed = 2
    carInstance.level = 1

    carInstance.runCar()
}

class Car {
    var speed = 1
       // get() = field
       set(value) {
          field = 2 * value
       }

    var level = 1
	get() = field
	set(value) {
	  field = value
        }

    fun runCar() {
	println("Speed is $speed and level is $level")
    }
}

// Constructor
fun runCall() {
    val phone = Phone("Hamza", "+21222020202")

    phone.call()
}

class Phone(val name: String = "Hamza", val number: String) {
    fun call() {
	println("Calling $name - $number ....")
    }
}

// Relationship
fun runAnimal() {
    val dog = Dog("Dog")
    dog.Initial()
}
open class Animal(val name: String) {
    open fun Initial() {
        println("The animal name is $name")
    }
    fun Die() {
	println("Im dead")
    }
}

// is-a relation
class Dog(name: String) : Animal(name = name) {
    override fun Initial() {
	super.Initial()
        println("I am Dog")
	// We used Die() function from Animal class
	Die()
    }
}

// has-a relation
fun runCarEngine() {
    val engine = Engine()
    val car2 = Car2(engine)

    car2.drive()
}

class Engine {
    fun start() {
        println("Engine started")
    }
}

class Car2(val engine: Engine) {
    fun drive() {
        engine.start()
        println("Car is driving")
    }
}


// Challenge

class SmartDevice3(val name: String, val category: String, val deviceType: String) {
    fun printDeviceInfo() {
	println("Device name: $name, category $category, type: $deviceType")
    }
}

class SmartTvDevice3() {
    public var volume: Int = 0
    public var channel: Int = 1

    fun decreaseVolume() {
	volume++
	println("Volume has been decreased")
    }

    fun previousChannel() {
	channel--
	println("Channel has been changed")
    }
}

class SmartLightDevice3() {
    public var brightness: Int = 0;

    fun decreaseBrightness() {
	brightness++
	println("Brightness has been decreased")
    }
}
