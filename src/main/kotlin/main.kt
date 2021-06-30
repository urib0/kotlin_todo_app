import component.*

fun main() {
//    var mode: modes = modes.DEFAULT
    var mode = modeControl()

    println("hello")

    while (true) {
        when (mode.isMode()) {
            modes.DEFAULT -> {
                printMenu()
                mode.mode = mode.getMode(readLine())
            }
            modes.CREATE -> {
                printCreateMenu()
                mode.mode = modes.DEFAULT
            }
            modes.WRITE -> {
                printWriteMenu()
                mode.mode = modes.DEFAULT
            }
            modes.DELITE -> {
                printDeleteMenu()
                mode.mode = modes.DEFAULT
            }
            modes.EXIT -> {
                printExitMenu()
                break
            }
        }
    }
}

enum class modes {
    DEFAULT, CREATE, WRITE, DELITE, EXIT
}

class modeControl() {
    var mode: modes = modes.DEFAULT

    fun isMode() = mode

    fun getMode(str: String?): modes {
        return when (str) {
            "c" -> modes.CREATE
            "w" -> modes.WRITE
            "d" -> modes.DELITE
            else -> modes.EXIT
        }
    }
}

fun modeCreate() {

}