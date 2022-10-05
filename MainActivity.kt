package com.iz.promedioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular:Button=findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener { CkBotonC() }

    }

    private fun CkBotonC() {

        val campoName:EditText=findViewById(R.id.edtName1)
        val campoCalif1:EditText=findViewById(R.id.txtCal1)
        val campoCalif2:EditText=findViewById(R.id.txtCal2)
        val campoCalif3:EditText=findViewById(R.id.txtCal3)
        val msgResult:TextView=findViewById(R.id.txtResultado)


        val cName:String=campoName.text.toString()
        val cCalif1:Double=campoCalif1.text.toString().toDouble()
        val cCalif2:Double=campoCalif2.text.toString().toDouble()
        val cCalif3:Double=campoCalif3.text.toString().toDouble()

        var promedio:Double=(cCalif1+cCalif2+cCalif3)/3

        Log.i("SalidaLog", "NombreLog: ${campoName.text}")
        Log.i("SalidaLog", "NombreLog: $cName")
        println("Salida bandera Promedio: " + promedio)

        var vResultado=""

        if(promedio > 3.5){
            Log.i("SalidaLog", "Aprobado: $promedio}")
            vResultado="Aprobado, $promedio"
        } else {
            Log.i("SalidaLog", "Reprobado: $promedio}")
            vResultado="Reprobado, $promedio"
        }

        msgResult.text="Hi $cName su Resultado: $vResultado"

        Toast.makeText(this, vResultado, Toast.LENGTH_LONG).show()
    }
}