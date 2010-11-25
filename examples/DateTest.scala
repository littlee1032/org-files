object DateTest {
    def main(args: Array[String]) {
        val singleDay1 = new Date(2010, 11, 11)
	val singleDay2 = new Date(2011, 11, 11)

	println(singleDay1 < singleDay2)
	println(singleDay1 <= singleDay2)
	println(singleDay1 > singleDay2)
	println(singleDay1 >= singleDay2)
	println(singleDay1 == singleDay2)

	println(singleDay1 < 1)
    }
}
