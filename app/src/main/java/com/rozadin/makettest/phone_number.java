package com.rozadin.makettest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class phone_number extends AppCompatActivity {
    private static Boolean flag = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        flag = getIntent().getExtras().getBoolean("tenant or owner");
    }

    @Override
    protected void onResume() {
        super.onResume();
        ((EditText) findViewById(R.id.phone_number)).setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN &&
                        (i == KeyEvent.KEYCODE_ENTER)) {
                    EditText editText = (EditText) findViewById(R.id.phone_number);
                    {
                        //Проверки номера телефона на ликвидность
                    }
                    while (!onPostPhoneNumber(editText.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Отправка данных на сервер",Toast.LENGTH_SHORT);
                    Toast.makeText(getApplicationContext(),"смс с кодом придет в течение 3 минут",Toast.LENGTH_LONG);
                    return true;
                }
                return false;
            }
        });
    }

    /**Метод для отправления номера телефона на сервер
     * @param phone_number
     * @return отправилось ли сообщение на сервер
     */
    private boolean onPostPhoneNumber(String phone_number)
    {
        return true;
    }

    public void onClickPhoneConfirmation(View view) {
        String phone_number = ((EditText)findViewById(R.id.phone_number)).getText().toString();
        String phone_cod = ((EditText)findViewById(R.id.phone_cod)).getText().toString();
        if(!onPostPhoneCod(phone_number,phone_cod))
        {
            Toast.makeText(getApplicationContext(),"Неверный код",Toast.LENGTH_LONG);
        }
        else
        {
            if(flag)
            {
                Intent intent = new Intent(this,ArendatorMain.class);
                startActivity(intent);
                this.finish();
            }
            else
            {
                Intent intent = new Intent(this,Sobstvennik_main.class);
                startActivity(intent);
                this.finish();
            }
        }
    }

    /**Метод для проверки код из смс по номеру телефона,
     * все данные отправляются на сервер и там проверяются
     * @param phone_number номер телефона
     * @param phone_cod код из смс
     * @return верный ли код
     */
    private boolean onPostPhoneCod(String phone_number, String phone_cod)
    {
        return true;
    }
}
