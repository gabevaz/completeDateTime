package br.com.fiap.completedatetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actPaises;
    DatePicker dtpNasc;
    TimePicker tmpHoraNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] paises = {
                "Argentina",
                "Brasil",
                "Chile",
                "Dinamarca",
                "Equador",
                "Escocia",
                "França",
                "Guiana Francesa",
                "Haiti",
                "Italia",
                "India",
                "Jamaica",
                "Kwait",
                "Lituania",
                "Letonia"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);

        actPaises = findViewById(R.id.actPaises);
        actPaises.setAdapter(adapter);

        dtpNasc = findViewById(R.id.dtpNasc);

        tmpHoraNasc = findViewById(R.id.tmpHoraNasc);
    }

    public void salvar(View view) {
        int dia = dtpNasc.getDayOfMonth();
        int mes = dtpNasc.getMonth() + 1;
        int ano = dtpNasc.getYear();

        int hora = tmpHoraNasc.getCurrentHour();
        int min = tmpHoraNasc.getCurrentMinute();

        Toast.makeText(this, String.format("%s | %d/%d/%d %d:%d",actPaises.getText(), dia, mes, ano, hora, min), Toast.LENGTH_SHORT).show();




    }
}
