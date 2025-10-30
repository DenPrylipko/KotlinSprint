package org.example.lesson2

fun main() {

    val employeesQuantity: Int = 50
    val employeesSalary: Int = 30000

    val internsQuantity: Int = 30
    val internsSalary: Int = 20000

    val laborCostsOfEmployees: Int = employeesQuantity * employeesSalary
    val laborCostsOfInterns: Int = internsQuantity * internsSalary

    val sumLaborCosts: Int = laborCostsOfEmployees + laborCostsOfInterns
    val averageSalary: Int = (laborCostsOfEmployees + laborCostsOfInterns) / (employeesQuantity + internsQuantity)

    println(sumLaborCosts)
    println(averageSalary)





}