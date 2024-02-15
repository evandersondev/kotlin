package br.com.evandersondev

import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    var yesterday = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("14/02/2024"))
    var yesterdayTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("14/02/2024 17:00"))
    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
    var yesterdayDate = simpleDateFormat.parse("14/02/2024")

    println(yesterday)
    println(yesterdayTime)
    println(yesterdayDate)

    println(DateTimeFormatter.ofPattern("yyyyMMdd").format(yesterday))
    println(DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(yesterdayTime))

    val simpleDateFormat2 = SimpleDateFormat("yyyyMMdd")
    println(simpleDateFormat2.format(yesterdayDate))


    // ======================================================================================
    yesterday = yesterday.plusDays(3)
    yesterdayTime = yesterdayTime.plusDays(3)
    println(yesterday)
    println(yesterdayTime)
    yesterdayDate = Date(yesterdayDate.toInstant().plus(3, ChronoUnit.DAYS).toEpochMilli())
    println(yesterdayDate)

    println(yesterday.isAfter(yesterdayTime.toLocalDate()))
    println(yesterdayTime.isAfter(yesterday.atStartOfDay()))
    println(date.after(yesterdayDate))

    // ======================================================================================
    println(yesterday.dayOfWeek == DayOfWeek.SATURDAY)
}