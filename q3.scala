object Question03{
    def calculateTakehomeSalary(normalHours: Int, oTHours: Int,taxRate: Double) : Double ={
        var salary = normalHours * 250 + oTHours * 80
        var tax = salary * taxRate
        var takehomeSalary=salary - tax
           takehomeSalary
    } 

    def main(args: Array[String]) : Unit ={
        var normalHours=40
        var oTHours=30
        var taxRate=0.12
        var takehomeSalary=calculateTakehomeSalary(normalHours, oTHours, taxRate)
        println("Take Home salary = Rs." + takehomeSalary)
    }
}