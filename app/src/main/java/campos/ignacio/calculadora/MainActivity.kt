package campos.ignacio.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //DECLARACION DE VARIABLES
    var num1:Double= 0.0
    var num2:Double = 0.0
    var op:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btn0.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "0")
        }

        this.btn1.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "1")
        }

        this.btn2.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "2")
        }

        this.btn3.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "3")
        }

        this.btn4.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "4")
        }

        this.btn5.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "5")
        }

        this.btn6.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "6")
        }

        this.btn7.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "7")
        }

        this.btn8.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "8")
        }

        this.btn9.setOnClickListener{
            val digitos= this.tvOp.text.toString()
            this.tvOp.setText("$digitos" + "9")
        }

        this.btnMas.setOnClickListener{
            num1=(Integer.parseInt(this.tvOp.text.toString())).toDouble()
            this.tvOp.setText("")
            op = 1
        }

        this.btnMenos.setOnClickListener {
            num1=(Integer.parseInt(this.tvOp.text.toString())).toDouble()
            this.tvOp.setText("")
            op = 2
        }

        this.btnMul.setOnClickListener {
            num1=(Integer.parseInt(this.tvOp.text.toString())).toDouble()
            this.tvOp.setText("")
            op = 3
        }

        this.btnDiv.setOnClickListener {
            num1=(Integer.parseInt(this.tvOp.text.toString())).toDouble()
            this.tvOp.setText("")
            op = 4
        }

        this.btnBorrar.setOnClickListener {
            this.tvOp.setText("")
            this.tvResultado.setText("")
            op = 0
        }

        this.btnRes.setOnClickListener {
            num2 = (Integer.parseInt(this.tvOp.text.toString())).toDouble()

            if (op == 1) {
                this.tvResultado.setText((num1 + num2).toString())
            } else if (op == 2) {
                this.tvResultado.setText((num1 - num2).toString())
            } else if (op == 3) {
                this.tvResultado.setText((num1 * num2).toString())
            } else if (op == 4) {
                this.tvResultado.setText((num1 / num2).toString())
            } else if (op == 0) this.tvResultado.setText(this.tvOp.text)

            op = 0
            this.tvOp.setText("0")
        }
    }
}