// App start

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    someDifferentFunction(circle) // Prints: The updated circle diameter is 10.0
    someDifferentFunction(rectangle) // prints: This is not a circle!
}

// Calling functions

fun someFunctionName(shape: Shape) {
    print(shape.name) // Prints the name of a concrete Shape object to the console
}

fun someDifferentFunction(shape: Shape) {
    if (shape is Circle) {
        val doubleTheRadius = shape.radius * 2
        println("The updated circle diameter is $doubleTheRadius")
    } else {
        println("This is not a circle!")
    }
}

// Contracts

interface Shape {
    val name: String
    fun area(): Double
    fun perimeter(): Double
}

interface Drawable {
    fun draw()
}

interface Resizable {
    fun resize(factor: Double)
}


interface AdvancedShape : Shape, Drawable, Resizable

// Implementation details

class Circle(val radius: Double) : Shape {
    override val name: String = "Circle"

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape {
    override val name: String = "Rectangle"

    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class AdvancedCircle(val radius: Double) : AdvancedShape {
    override val name: String = "Circle"

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun draw() {
        println("Drawing a $name with radius $radius.")
    }

    override fun resize(factor: Double) {
        val newRadius = radius * factor
        println("Resizing the $name to a new radius of $newRadius.")
    }
}

