package yuliakazch.carrental

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform