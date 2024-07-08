package com.akirachix.enwalletapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.enwalletapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayExpenses()

    }
    fun displayExpenses(){
       var expense1 = Expenses("1 JUly 2024", "Salary", 40000)
        var expense2 = Expenses("2 July 2024", "Dividends", 2400)
        var expense3 = Expenses("4 JUly 2024", "Rent", 16000)

        val expenseList = listOf(expense2,expense1,expense3)
        val adapterExpense = ExpenseAdapter(expenseList)
        binding.rvExpenses.adapter = adapterExpense

    }
}