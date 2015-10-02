package com.jspider.twitter;




import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	 Button loginbutton,forgetpassword,signupbutton;
	    EditText usernameedittext,passwordedittext;
	    
	   String stUsername = "user1";
	   String stPassword = "1234";
	   String entUsername;
	   String entpassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		loginbutton = (Button)findViewById(R.id.button1);
        forgetpassword = (Button) findViewById(R.id.button3);
        signupbutton = (Button) findViewById(R.id.button2);
        usernameedittext = (EditText)findViewById(R.id.editText1);
        passwordedittext = (EditText) findViewById(R.id.editText2);
        loginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				entUsername = usernameedittext.getText().toString();
				entpassword = passwordedittext.getText().toString();
				
				if(stUsername.equalsIgnoreCase(entUsername)&& stPassword.equals(entpassword))
				{
					Toast.makeText(MainActivity.this,"Login successfull",Toast.LENGTH_SHORT).show();
					Log.d("[DEBUG]","Login successfull");
				}
				
				else
				{
					Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();

					Log.d("[DEBUG]","Login failed");
				}
			}
        }
				
			
		
				
			);
        
        
        signupbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				
				Log.d("[DEBUG]","clicked on sign up button");
				
			}
		});
        
    }

	public void login(View v1)
	{
		entUsername = usernameedittext.getText().toString();
		entpassword = passwordedittext.getText().toString();
		
		if(stUsername.equalsIgnoreCase(entUsername)&& stPassword.equals(entpassword))
		{
			Toast.makeText(MainActivity.this,"Login successfull",Toast.LENGTH_SHORT).show();
			Log.d("[DEBUG]","Login successfull");
		}
		
		else
		{
			Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();

			Log.d("[DEBUG]","Login failed");

		}
	}

	
		
	}


	
	
	
	
	
	
	
	
	
	
        
	




