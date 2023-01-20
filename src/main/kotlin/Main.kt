fun main() {
    print(solution("fdsAs", "dzdw"))
}

fun solution(filename1: String, filename2: String): Boolean {
    return filename1 < filename2 && filename1.lowercase() < filename2.lowercase()
}
